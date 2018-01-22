package bg.bozho;

import org.neo4j.graphdb.RelationshipType;

public enum EntityRelationship implements RelationshipType {
    OWNS, MANAGES, IS_IN_BOARD_OF_DIRECTORS_OF, HAS_ADDRESS, HAS_CORRESPONDENCE_ADDRESS, IS_TRANSFERRED_TO, IS_ACQUIRED, EXECUTED_CONTRACT, WAS_AGENT
}
