package bg.bozho;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import com.google.common.io.BaseEncoding;
import model.*;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.neo4j.graphdb.*;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.schema.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;


public class BrraLinks {

    private static final DateTimeFormatter DF = DateTimeFormatter.ofPattern("yyyyMMdd");
    
    private static final Logger logger = LoggerFactory.getLogger(BrraLinks.class);
    
    private static ToStringStyle NO_PREFIX_STYLE = new NoPrefixToStringStyle();
    
    private static final String NAME = "name";
    private static final String DATE = "date";
    private static final String DETAILS = "addressDetails";

    public static void main(String[] args) throws Exception {
        Options opts = new Options();
        opts.addOption("db", true, "Path to default.graphdb");
        opts.addOption("cr", true, "Path to commercial register root");
        opts.addOption("aop", true, "Path to tenders csv");
        opts.addOption("newformat", true, "AOP format changed for contracts2016.csv (and later)");
        opts.addOption("comdos", true, "Path to ComDos csv");
        
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(opts, args);
        
        String dbPath = cmd.getOptionValue("db");
        String commercialRegisterFilesDir = cmd.getOptionValue("cr");
        String aopFile = cmd.getOptionValue("aop");
        String newFormat = cmd.getOptionValue("newformat");
        String comdosFile = cmd.getOptionValue("comdos");
        
        GraphDatabaseService graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(new File(dbPath));
        registerShutdownHook(graphDb);

        if (commercialRegisterFilesDir != null) {
            persistCommercialRegister(graphDb, commercialRegisterFilesDir);
        }
        if (aopFile != null) {
            persistAop(graphDb, aopFile, newFormat);
        }
        if (comdosFile != null) {
            persistAgents(graphDb, comdosFile);
        }
    }

    private static void persistAgents(GraphDatabaseService graphDb, String comdosFile) {
        try {
            CSVParser parser = CSVParser.parse(new File(comdosFile), Charsets.UTF_8, CSVFormat.DEFAULT);
            for (CSVRecord record : parser.getRecords()) {
                boolean wasMember = !record.get(7).equals("Неустановена принадлежност");
                if (wasMember) {
                    try (Transaction tx = graphDb.beginTx()) {
                        String fullName = record.get(0) + " " + record.get(1) + " " + record.get(2);
                        Node agentNode = getOrCreateNode(NodeType.AGENT_ASSIGNMENT, fullName, graphDb);
                        Node person = findPersonByName(fullName, graphDb);
                        if (person != null) { 
                            agentNode.setProperty("institution", record.get(6));
                            agentNode.setProperty("birth", record.get(4));

                            person.createRelationshipTo(agentNode, EntityRelationship.WAS_AGENT);
                        }
                        
                        tx.success();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Node findPersonByName(String fullName, GraphDatabaseService graphDb) {
        Result result = graphDb.execute("match (n:PERSON) where n.name = '" + fullName.toUpperCase() + "' return n");
        if (result.hasNext()) {
            Object egn = result.next().get(NodeType.PERSON.getKeyName());
            if (egn != null) {
                Node node = graphDb.findNode(NodeType.PERSON, NodeType.PERSON.getKeyName(), egn);
                return node;
            }
        }
        return null;
    }

    private static void persistAop(GraphDatabaseService graphDb, String aopFile, String newformat) {

        File csvFile = new File(aopFile);
        logger.info("Size [{}] kb", csvFile.length()/1024);

        try {
            CSVParser parser = CSVParser.parse(csvFile, Charsets.UTF_8, CSVFormat.DEFAULT);

            List<CSVRecord> records = parser.getRecords();
            int total = records.size();
            int i = 0;
            long startTime = System.currentTimeMillis();
            for (CSVRecord record : records) {
                if(i==0) {//skip title row
                    i++;
                    continue;
                }
                /*
            0            "   ",
            1            "ID на документ",
            2            "ПУБЛИКУВАН НА",
            3            "ТИП ДОКУМЕНТ",
            4            "ID на поръчката",
            5            "ID на възложителя",
            6            "ЕИК на възложителя",
            7            "ВЪЗЛОЖИТЕЛ",
            8            "ПРЕДМЕТ на поръчката",
            9            "ОБЕКТ",
           10            "ПОД EU ПРАГОВЕ",
           11            "EU ФИНАНСИРАНЕ",
           12            "ОТНОСНО ФИНАНСИРАНЕТО",
           13            "УЧАСТНИЦИ",
           14            "ПРЕДМЕТ на договора",
           15            "ДОГОВОР НОМЕР",
           16            "ДОГОВОР ДАТА",
           17            "ID на изпълнителя",
           18            "ЕИК",
           19            "ИЗПЪЛНИТЕЛ",
           20            "СТОЙНОСТ ПРИ СКЛЮЧВАНЕ",
           21            "ВАЛУТА"
         */
                try (Transaction tx = graphDb.beginTx()) {

                    try{

                        if(StringUtils.isBlank(newformat)) {

                            if(StringUtils.isEmpty(record.get(18))) {
                                logger.info("Missing EIK: {}\n{}", record.get(18), record);
                            }

                            String uic = record.get(18);
                            Node companyNode = getOrCreateNode(NodeType.COMPANY, uic, graphDb);
                            Node contract = getOrCreateNode(NodeType.CONTRACT, record.get(0), graphDb);
                            contract.setProperty("price", record.get(20));
                            contract.setProperty("currency", record.get(21));
                            contract.setProperty("principal_eik", record.get(6));
                            contract.setProperty("principal", record.get(7));
                            contract.setProperty("title", record.get(14));

                            if(StringUtils.isEmpty(record.get(6))) {
                                logger.info("Missing principal_eik: {}\n{}", record.get(6), record);
                            }
                            if(StringUtils.isEmpty(record.get(7))) {
                                logger.info("Missing principal: {}\n{}", record.get(7), record);
                            }
                            if(StringUtils.isEmpty(record.get(14))) {
                                if(!StringUtils.isEmpty(record.get(8))) contract.setProperty("title", record.get(8));
                                else if(!StringUtils.isEmpty(record.get(9))) contract.setProperty("title", record.get(9));
                                else logger.info("Missing Title: {}\n{}", record.get(14), record);
                            }
                            if(StringUtils.isEmpty(record.get(20))) {
                                logger.info("Missing Price: {}\n{}", record.get(20), record);
                            }
                            if(StringUtils.isEmpty(record.get(21))) {
                                logger.info("Missing currency: {}\n{}", record.get(21), record);
                            }

                            companyNode.createRelationshipTo(contract, EntityRelationship.EXECUTED_CONTRACT);
                        } else {
/*
            0	"   ",
            1	"ID на документ",
            2	"ПУБЛИКУВАН НА",
            3	"ID на поръчката",
            4	"УНП",
            5	"ЕИК на възложителя",
            6	"ВЪЗЛОЖИТЕЛ",
            7	"ПРЕДМЕТ на поръчката",
            8	"ОБЕКТ",
            9	"EU ФИНАНСИРАНЕ",
            10	"ОТНОСНО ФИНАНСИРАНЕТО",
            11	"БРОЙ ОФЕРТИ",
            12	"S51.ID",
            13	"ПРЕДМЕТ на договора",
            14	"ДОГОВОР НОМЕР",
            15	"ДОГОВОР ДАТА",
            16	"ЕИК на изпълнителя",
            17	"ИЗПЪЛНИТЕЛ",
            18	"СТОЙНОСТ при сключване",
            19	"ВАЛУТА"
*/

                            if(StringUtils.isEmpty(record.get(16))) {
                                logger.info("Missing EIK: {}\n{}", record.get(16), record);
                            }

                            String uic = record.get(16);
                            Node companyNode = getOrCreateNode(NodeType.COMPANY, uic, graphDb);
                            Node contract = getOrCreateNode(NodeType.CONTRACT, record.get(0), graphDb);

                            contract.setProperty("price", record.get(18));
                            contract.setProperty("currency", record.get(19));
                            contract.setProperty("principal", record.get(6));
                            contract.setProperty("principal_eik", record.get(5));
                            contract.setProperty("title", record.get(13));

                            if(StringUtils.isEmpty(record.get(6))) {
                                logger.info("Missing principal: {}\n{}", record.get(6), record);
                            }
                            if(StringUtils.isEmpty(record.get(5))) {
                                logger.info("Missing principal_eik: {}\n{}", record.get(5), record);
                            }
                            if(StringUtils.isEmpty(record.get(13))) {
                                if(!StringUtils.isEmpty(record.get(7))) contract.setProperty("title", record.get(7));
                                else if(!StringUtils.isEmpty(record.get(8))) contract.setProperty("title", record.get(8));
                                else logger.info("Missing Title: {}\n{}", record.get(13), record);
                            }
                            if(StringUtils.isEmpty(record.get(18))) {
                                logger.info("Missing Price: {}\n{}", record.get(18), record);
                            }
                            if(StringUtils.isEmpty(record.get(19))) {
                                logger.info("Missing currency: {}\n{}", record.get(19), record);
                            }

                            companyNode.createRelationshipTo(contract, EntityRelationship.EXECUTED_CONTRACT);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        logger.error(e.getMessage());
                        i++;
                        continue;
                    }
                    tx.success();
                } catch(NullPointerException e) {
                    //skip
                    logger.info("NPE; skip record");
                    i++;
                    continue;
                }
                logger.info("Persisted [{} of {}] {} % for {} min", ++i, total, String.format("%.2f", (double) i*100/total),
                        String.format("%.2f", ((double)(System.currentTimeMillis()-startTime)/(60*1000))));
            }

            logger.info("\nDONE [{} of {}] {} % for {} min", i, total, String.format("%.2f", (double) i*100/total),
                    String.format("%.2f", ((double)(System.currentTimeMillis()-startTime)/(60*1000))));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void persistCommercialRegister(GraphDatabaseService graphDb, String commercialRegisterFilesDir)
            throws IOException, FileNotFoundException, FactoryConfigurationError, XMLStreamException,
            JAXBException {
        
        try (Transaction tx = graphDb.beginTx()) {
            Schema schema = graphDb.schema();
            for (NodeType nodeType : NodeType.values()) {
                if (!schema.getIndexes(nodeType).iterator().hasNext()) {
                    schema.indexFor(nodeType).on(nodeType.getKeyName()).create();
                    if (nodeType == NodeType.COMPANY || nodeType == NodeType.PERSON || nodeType == NodeType.PERMANENT_FOREIGNER || nodeType == NodeType.FOREIGNER) {
                        schema.indexFor(nodeType).on(NAME).create(); //make names searchable
                    }
                }
            }
            tx.success();
        }
        
        final QName qName = new QName("http://www.registryagency.bg/schemas/deedv2", "Deed");

        List<Path> files = Files.walk(Paths.get(commercialRegisterFilesDir))
                .filter(Files::isRegularFile)
                .sorted((a, b) -> LocalDate.parse(a.getFileName().toString().replace(".xml", ""), DF)
                        .compareTo(LocalDate.parse(b.getFileName().toString().replace(".xml", ""), DF)))
                .collect(Collectors.toList());

        int total = files.size();
        logger.info("Files loaded: {}\n\n{}", total, files);
        int i = 0;
        long processStartTime = System.currentTimeMillis();
        long startTime;
        for (Path file : files) {
            i++;
            startTime = System.currentTimeMillis();
            File xmlFile = file.toFile();
            logger.info("\n------------>\nRunning {} min. [{} of {}] {} % \n{}\nSize [{}] kb",
                    String.format("%.2f", ((double)(System.currentTimeMillis()-processStartTime)/(60*1000))),
                    i, total, String.format("%.2f", (double) i*100/total), file, xmlFile.length()/1024);
            InputStream inputStream = new FileInputStream(xmlFile);
    
            // create xml event reader for input stream
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(inputStream);
    
            // initialize jaxb
            JAXBContext context = JAXBContext.newInstance(DeedType.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
    
            XMLEvent e = null;
    
            // loop though the xml stream
            while ((e = xmlEventReader.peek()) != null) {
    
                // check the event is a Document start element
                if (e.isStartElement() && ((StartElement) e).getName().equals(qName)) {
                    // unmarshall the document
                    DeedType deed = unmarshaller.unmarshal(xmlEventReader, DeedType.class).getValue();
                    try {
//                        logger.info("persistToGraph: deed\n" + deed);
                        persistToGraph(deed, graphDb);
                    } catch (Exception ex) {
                        logger.info("Exception: " + ex.getMessage());
                        ex.printStackTrace();
                    }
                } else {
                    xmlEventReader.next();
                }
    
            }
            logger.info("File processed in {} sec.", String.format("%.2f", (double)(System.currentTimeMillis() - startTime)/1000));
        }
        logger.info("\n------------>\nDONE in {} min.",
                String.format("%.2f", ((double)(System.currentTimeMillis()-processStartTime)/(60*1000))));
    }

    private static void persistToGraph(DeedType deed, GraphDatabaseService graphDb) {
        try (Transaction tx = graphDb.beginTx()) {
            Node companyNode = getOrCreateNode(NodeType.COMPANY, deed.getUIC(), graphDb);

            companyNode.setProperty(NAME, deed.getCompanyName());
            companyNode.setProperty("legalForm", deed.getLegalForm());
            companyNode.setProperty("status", deed.getDeedStatus().toString());

            for (SubDeedType subDeed : deed.getSubDeed()) {
/*
                for (AcquisitionEnterprises enterprises : subDeed.getAcquisitionEnterprises()) {
                    for (AcquisitionEnterprises.AcquisitionEnterprise enterprise : enterprises.getAcquisitionEnterprise()) {

                    }
                }
*/

                for (TransferringEnterprise enterprise : subDeed.getTransferringEnterprise()) {
                    enterprise.getSubject();
                }

                for (BoardOfDirectors board : subDeed.getBoardOfDirectors()) {
                    for (BoardOfDirectors.Director director : board.getDirector()) {
                        NodeType nodeType = NodeType.findByKey(director.getSubject().getIndentType());
                        if (nodeType != null) {
                            Node directorNode = getOrCreateNode(nodeType, getPersonIdentifier(nodeType, director.getSubject()), graphDb);
                            if (directorNode != null) {
                                directorNode.setProperty(NAME, director.getSubject().getName());
                                Relationship r = directorNode.createRelationshipTo(companyNode, EntityRelationship.IS_IN_BOARD_OF_DIRECTORS_OF);
                                r.setProperty(DATE, board.getFieldActionDate().toXMLFormat());
                            }
                        }
                    }
                }
                
                for (ActualOwners owners : subDeed.getActualOwners()) {
//                    logger.info("ActualOwners " + owners);
                    for (ActualOwners.ActualOwner owner : owners.getActualOwner()) {
                        NodeType nodeType = NodeType.findByKey(owner.getPerson().getIndentType());
                        Node ownerNode = getOrCreateNode(nodeType, getPersonIdentifier(nodeType, owner.getPerson()), graphDb);
                        if (ownerNode != null) {
                            ownerNode.setProperty(NAME, owner.getPerson().getName());
                            Relationship r = ownerNode.createRelationshipTo(companyNode, EntityRelationship.OWNS);
                            r.setProperty(DATE, owners.getFieldActionDate().toXMLFormat());
                            //TODO?
                            Node addressNode = getOrCreateNode(NodeType.ADDRESS, getAddressHash(owner.getAddress()), graphDb);
                            addressNode.setProperty(DETAILS, owner.getAddress().toString());
                            Relationship addrr = ownerNode.createRelationshipTo(addressNode, EntityRelationship.HAS_ADDRESS);
                        }
                    }
                }
                
                for (SoleCapitalOwner owner : subDeed.getSoleCapitalOwner()) {
//                    logger.info("SoleCapitalOwner " + owner);
                    NodeType nodeType = NodeType.findByKey(owner.getSubject().getIndentType());
                    Node ownerNode;

                    if(nodeType == null) {
                        String id;
                        if(owner.getSubject().getIndent() != null) {
                            id = owner.getSubject().getIndent();
                            if(owner.getSubject().getIndent().length() < 15) nodeType = NodeType.COMPANY;
                            else  nodeType = NodeType.PERSON;
                            if(owner.getSubject().getName() != null) id += ":" + owner.getSubject().getName();
                        }
                        else if(owner.getSubject().getName() != null) {
                            id = owner.getSubject().getName();
                            if(owner.getSubject().getIsForeignTraderText()==1) nodeType = NodeType.COMPANY;
                            else nodeType = NodeType.PERSON;
                        }
                        else {
                            continue;
                        }
                        ownerNode = getOrCreateNode(nodeType, id, graphDb);
                    }
                    else if(nodeType == NodeType.COMPANY) {
                        String id;
                        if(owner.getSubject().getIndent() != null) id = owner.getSubject().getIndent();
                            else if(owner.getSubject().getName() != null) id = owner.getSubject().getName();
                            else continue;
                        ownerNode = getOrCreateNode(nodeType, id, graphDb);
                    } else {
                        ownerNode = getOrCreateNode(nodeType, getPersonIdentifier(nodeType, owner.getSubject()), graphDb);
                    }

                    if (ownerNode != null) {
                        ownerNode.setProperty(NAME, owner.getSubject().getName());
                        Relationship r = ownerNode.createRelationshipTo(companyNode, EntityRelationship.OWNS);
                        r.setProperty(DATE, owner.getFieldActionDate().toXMLFormat());
                    }
                }
                
                for (Managers managers : subDeed.getManagers()) {
//                    logger.info("Managers " + managers);
                    for (Managers.Manager manager : managers.getManager()) {
                        NodeType nodeType = NodeType.findByKey(manager.getPerson().getIndentType());
                        Node managerNode;

                        if(nodeType == null) {
                            String id;
                            if(manager.getPerson().getIndent() != null) {
                                id = manager.getPerson().getIndent();
                                if(manager.getPerson().getIndent().length() < 15) nodeType = NodeType.COMPANY;
                                else  nodeType = NodeType.PERSON;
                            }
                            else if(manager.getPerson().getName() != null) {
                                id = manager.getPerson().getName();
                                nodeType = NodeType.PERSON;
                            }
                            else {
                                continue;
                            }
                            managerNode = getOrCreateNode(nodeType, id, graphDb);
                        }
                        else {
                            managerNode = getOrCreateNode(nodeType, getPersonIdentifier(nodeType, manager.getPerson()), graphDb);
                        }

                        if (managerNode != null) {
                            managerNode.setProperty(NAME, manager.getPerson().getName());
                            Relationship r = managerNode.createRelationshipTo(companyNode, EntityRelationship.MANAGES);
                            r.setProperty(DATE, managers.getFieldActionDate().toXMLFormat());
                        }
                    }
                }
                
                for (Seat seat : subDeed.getSeat()) {
//                    logger.info("Seat " + seat);
                    Node addressNode = getOrCreateNode(NodeType.ADDRESS, getAddressHash(seat.getAddress()), graphDb);
                    if (addressNode != null) {
                        String addressDetails = reflectionToString(seat.getAddress());
                        addressNode.setProperty(DETAILS, addressDetails);
                        Relationship r = companyNode.createRelationshipTo(addressNode, EntityRelationship.HAS_ADDRESS);
                        r.setProperty(DATE, seat.getFieldActionDate().toXMLFormat());
                    }
                }
                
                
                for (SeatForCorrespondence seat : subDeed.getSeatForCorrespondence()) {
//                    logger.info("SeatForCorrespondence " + seat);
                    Node addressNode = getOrCreateNode(NodeType.ADDRESS, getAddressHash(seat.getAddress()), graphDb);
                    if (addressNode != null) {
                        addressNode.setProperty(DETAILS, reflectionToString(seat.getAddress()));
                        Relationship r = companyNode.createRelationshipTo(addressNode, EntityRelationship.HAS_CORRESPONDENCE_ADDRESS);
                        r.setProperty(DATE, seat.getFieldActionDate().toXMLFormat());
                    }
                }
            }

//            logger.info("TX success " + tx.toString());
            tx.success();
        }

    }

    private static String getPersonIdentifier(NodeType nodeType, PersonType subject) {
//        logger.info("NodeType: {} PersonType: {} IndentType: {} Indent: {}, Name: {}",
//                nodeType, subject, subject.getIndentType(), subject.getIndent(), subject.getName());

        if(StringUtils.isBlank(subject.getIndent()) && (!StringUtils.isBlank(subject.getName()))) {
                return StringUtils.containsWhitespace(subject.getName()) ? subject.getName() : null;
        }
        if (nodeType == NodeType.FOREIGNER) {
            return subject.getIndent() + ":" + subject.getName();
        }
        else {
            return subject.getIndent();
        }
    }

    private static String getAddressHash(AddressType address) {
        return BaseEncoding.base64().encode(
                Hashing.md5().hashString(reflectionToString(address), Charsets.UTF_8).asBytes());
    }
    private static String reflectionToString(AddressType address) {
        return ToStringBuilder.reflectionToString(address, NO_PREFIX_STYLE);
    }

    private static Node getOrCreateNode(NodeType nodeType, String id, GraphDatabaseService graphDb) {
        if (nodeType == null || StringUtils.isBlank(id)) {
            logger.info("Empty ID: {} or nodeType: {} ", id, nodeType);
            return null;
        }
        if (nodeType == NodeType.FOREIGNER || nodeType == NodeType.PERMANENT_FOREIGNER) {
            nodeType = NodeType.PERSON;
        }
        Node node = graphDb.findNode(nodeType, nodeType.getKeyName(), id);
        if (node == null) {
            node = graphDb.createNode(nodeType);
            node.setProperty(nodeType.getKeyName(), id);
        }
//        logger.info("Node created " + node);
        return node;
    }

    private static void registerShutdownHook(final GraphDatabaseService graphDb) {
        // Registers a shutdown hook for the Neo4j instance so that it
        // shuts down nicely when the VM exits (even if you "Ctrl-C" the
        // running application).
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                graphDb.shutdown();
            }
        });
    }
    
    private static class NoPrefixToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1L;

        /**
         * <p>Constructor.</p>
         *
         * <p>Use the static constant rather than instantiating.</p>
         */
        NoPrefixToStringStyle() {
            super();
            this.setUseClassName(false);
            this.setUseIdentityHashCode(false);
            this.setUseFieldNames(true);
            this.setContentStart("");
            this.setContentEnd("");
        }

        /**
         * <p>Ensure <code>Singleton</ode> after serialization.</p>
         * @return the singleton
         */
        private Object readResolve() {
            return NO_PREFIX_STYLE;
        }
    }
}
