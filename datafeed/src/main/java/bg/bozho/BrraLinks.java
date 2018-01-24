package bg.bozho;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

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
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.schema.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bg.bozho.model.AcquisitionEnterprises;
import bg.bozho.model.AcquisitionEnterprises.AcquisitionEnterprise;
import bg.bozho.model.ActualOwners;
import bg.bozho.model.ActualOwners.ActualOwner;
import bg.bozho.model.AddressType;
import bg.bozho.model.BoardOfDirectors;
import bg.bozho.model.BoardOfDirectors.Director;
import bg.bozho.model.DeedType;
import bg.bozho.model.Managers;
import bg.bozho.model.Managers.Manager;
import bg.bozho.model.PersonType;
import bg.bozho.model.Seat;
import bg.bozho.model.SeatForCorrespondence;
import bg.bozho.model.SoleCapitalOwner;
import bg.bozho.model.SubDeedType;
import bg.bozho.model.TransferringEnterprise;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import com.google.common.io.BaseEncoding;

public class BrraLinks {

    private static final DateTimeFormatter DF = DateTimeFormatter.ofPattern("yyyyMMdd");
    
    private static final Logger logger = LoggerFactory.getLogger(BrraLinks.class);
    
    private static ToStringStyle NO_PREFIX_STYLE = new NoPrefixToStringStyle();
    
    private static final String NAME = "name";
    private static final String DATE = "date";

    public static void main(String[] args) throws Exception {
        Options opts = new Options();
        opts.addOption("db", true, "Path to default.graphdb");
        opts.addOption("cr", true, "Path to commercial register root");
        opts.addOption("aop", true, "Path to tenders csv");
        opts.addOption("comdos", true, "Path to ComDos csv");
        
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(opts, args);
        
        String dbPath = cmd.getOptionValue("db");
        String commercialRegisterFilesDir = cmd.getOptionValue("cr");
        String aopFile = cmd.getOptionValue("aop");
        String comdosFile = cmd.getOptionValue("comdos");
        
        GraphDatabaseService graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(new File(dbPath));
        registerShutdownHook(graphDb);

        if (commercialRegisterFilesDir != null) {
            persistCommercialRegister(graphDb, commercialRegisterFilesDir);
        }
        if (aopFile != null) {
            persistAop(graphDb, aopFile);
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

    private static void persistAop(GraphDatabaseService graphDb, String aopFile) {
        try {
            CSVParser parser = CSVParser.parse(new File(aopFile), Charsets.UTF_8, CSVFormat.DEFAULT);
            for (CSVRecord record : parser.getRecords()) {
                String uic = record.get(18);
                try (Transaction tx = graphDb.beginTx()) {
                    Node companyNode = getOrCreateNode(NodeType.COMPANY, uic, graphDb);
                    Node contract = getOrCreateNode(NodeType.CONTRACT, record.get(0), graphDb);
                    contract.setProperty("price", record.get(20));
                    contract.setProperty("institution", record.get(7));
                    contract.setProperty("title", record.get(14));
                    
                    companyNode.createRelationshipTo(contract, EntityRelationship.EXECUTED_CONTRACT);
                    
                    tx.success();
                }
            }
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
                    if (nodeType == NodeType.PERSON || nodeType == NodeType.PERMANENT_FOREIGNER || nodeType == NodeType.FOREIGNER) {
                        schema.indexFor(nodeType).on(NAME).create(); //make names searchable
                    }
                }
            }
            tx.success();
        }
        
        final QName qName = new QName("http://www.registryagency.bg/schemas/deedv2", "Deed");

        List<Path> files = Files.walk(Paths.get(commercialRegisterFilesDir))
                .filter(Files::isRegularFile)
                .sorted((a, b) -> LocalDate.parse(a.getFileName().toString().replace("_1", "").replace(".xml", ""), DF)
                        .compareTo(LocalDate.parse(b.getFileName().toString().replace("_1", "").replace(".xml", ""), DF)))
                .collect(Collectors.toList());
        
        //System.out.println(files);
        int total = files.size();
        int i = 0;
        for (Path file : files) {
            i++;
            System.out.printf("Processing file %d of %d: %s\n", i, total, file);
            double percentage = (double) i / total;
            logger.info("Reading " + file + " (" + percentage + ")");
            
            InputStream inputStream = new FileInputStream(file.toFile());
    
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
                        persistToGraph(deed, graphDb);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    xmlEventReader.next();
                }
    
            }
        }
    }

    private static void persistToGraph(DeedType deed, GraphDatabaseService graphDb) {
        try (Transaction tx = graphDb.beginTx()) {
            Node companyNode = getOrCreateNode(NodeType.COMPANY, deed.getUIC(), graphDb);

            companyNode.setProperty(NAME, deed.getCompanyName());
            companyNode.setProperty("legalForm", deed.getLegalForm());
            companyNode.setProperty("status", deed.getDeedStatus().toString());

            for (SubDeedType subDeed : deed.getSubDeed()) {
                
                for (AcquisitionEnterprises enterprises : subDeed.getAcquisitionEnterprises()) {
                    for (AcquisitionEnterprise enterprise : enterprises.getAcquisitionEnterprise()) {

                    }
                }

                for (TransferringEnterprise enterprise : subDeed.getTransferringEnterprise()) {
                    enterprise.getSubject();
                }

                for (BoardOfDirectors board : subDeed.getBoardOfDirectors()) {
                    for (Director director : board.getDirector()) {
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
                    for (ActualOwner owner : owners.getActualOwner()) {
                        NodeType nodeType = NodeType.findByKey(owner.getPerson().getIndentType());
                        Node ownerNode = getOrCreateNode(nodeType, getPersonIdentifier(nodeType, owner.getPerson()), graphDb);
                        if (ownerNode != null) {
                            ownerNode.setProperty(NAME, owner.getPerson().getName());
                            Relationship r = ownerNode.createRelationshipTo(companyNode, EntityRelationship.OWNS);
                            r.setProperty(DATE, owners.getFieldActionDate().toXMLFormat());
                            //TODO?
                            //Node addressNode = getOrCreateNode(NodeType.ADDRESS, owner.getAddress(), graphDb)
                        }
                    }
                }
                
                for (SoleCapitalOwner owner : subDeed.getSoleCapitalOwner()) {
                    NodeType nodeType = NodeType.findByKey(owner.getSubject().getIndentType());
                    Node ownerNode = getOrCreateNode(nodeType, getPersonIdentifier(nodeType, owner.getSubject()), graphDb);
                    if (ownerNode != null) {
                        ownerNode.setProperty(NAME, owner.getSubject().getName());
                        Relationship r = ownerNode.createRelationshipTo(companyNode, EntityRelationship.OWNS);
                        r.setProperty(DATE, owner.getFieldActionDate().toXMLFormat());
                    }
                }
                
                for (Managers managers : subDeed.getManagers()) {
                    for (Manager manager : managers.getManager()) {
                        NodeType nodeType = NodeType.findByKey(manager.getPerson().getIndentType());
                        Node managerNode = getOrCreateNode(nodeType, getPersonIdentifier(nodeType, manager.getPerson()), graphDb);
                        
                        if (managerNode != null) {
                            managerNode.setProperty(NAME, manager.getPerson().getName());
                            Relationship r = managerNode.createRelationshipTo(companyNode, EntityRelationship.MANAGES);
                            r.setProperty(DATE, managers.getFieldActionDate().toXMLFormat());
                        }
                    }
                }
                
                for (Seat seat : subDeed.getSeat()) {
                    Node addressNode = getOrCreateNode(NodeType.ADDRESS, getAddressHash(seat.getAddress()), graphDb);
                    if (addressNode != null) {
                        String addressDetails = reflectionToString(seat.getAddress());
                        addressNode.setProperty("addressDetails", addressDetails);
                        Relationship r = companyNode.createRelationshipTo(addressNode, EntityRelationship.HAS_ADDRESS);
                        r.setProperty(DATE, seat.getFieldActionDate().toXMLFormat());
                    }
                }
                
                
                for (SeatForCorrespondence seat : subDeed.getSeatForCorrespondence()) {
                    Node addressNode = getOrCreateNode(NodeType.ADDRESS, getAddressHash(seat.getAddress()), graphDb);
                    if (addressNode != null) {
                        addressNode.setProperty("addressDetails", reflectionToString(seat.getAddress()));
                        Relationship r = companyNode.createRelationshipTo(addressNode, EntityRelationship.HAS_CORRESPONDENCE_ADDRESS);
                        r.setProperty(DATE, seat.getFieldActionDate().toXMLFormat());
                    }
                }
            }

            tx.success();
        }

    }

    private static String getPersonIdentifier(NodeType nodeType, PersonType subject) {
        if (nodeType == NodeType.FOREIGNER) {
            return subject.getIndent() + ":" + subject.getName();
        } else {
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
        if (StringUtils.isBlank(id) || nodeType == null) {
            return null;
        }
        Node node = graphDb.findNode(nodeType, nodeType.getKeyName(), id);
        if (node == null) {
            node = graphDb.createNode(nodeType);
            node.setProperty(nodeType.getKeyName(), id);
        }
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
