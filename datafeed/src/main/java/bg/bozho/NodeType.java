package bg.bozho;

import org.neo4j.graphdb.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum NodeType implements Label {
    
    COMPANY("UIC"), PERSON("EGN"), ADDRESS("hash"), FOREIGNER("BirthDate"), PERMANENT_FOREIGNER("LNCH"), CONTRACT(
            "contractId"), AGENT_ASSIGNMENT("agent");

    private static final Logger logger = LoggerFactory.getLogger(NodeType.class);
    
    private final String keyName;
    
    private NodeType(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyName() {
        return keyName;
    }

    public static NodeType findByKey(String key) {
        for (NodeType nodeType : NodeType.values()) {
            if (nodeType.getKeyName().equals(key)) {
                return nodeType;
            }
        }
        if (!key.equals("Undefined")) {
            logger.info("Could not find type with key " + key);
        }
        return null;
    }
}
