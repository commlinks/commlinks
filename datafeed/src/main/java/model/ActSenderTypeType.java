
package model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActSenderTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActSenderTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Officially"/>
 *     &lt;enumeration value="PublicProsecutor"/>
 *     &lt;enumeration value="InterestedPerson"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActSenderTypeType", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
@XmlEnum
public enum ActSenderTypeType {


    /**
     * 
     *             Неопределено
     *           
     * 
     */
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),

    /**
     * 
     *             Служебно
     *           
     * 
     */
    @XmlEnumValue("Officially")
    OFFICIALLY("Officially"),

    /**
     * 
     *             По искане на прокурор
     *           
     * 
     */
    @XmlEnumValue("PublicProsecutor")
    PUBLIC_PROSECUTOR("PublicProsecutor"),

    /**
     * 
     *             По искане на заинтересовано лице
     *           
     * 
     */
    @XmlEnumValue("InterestedPerson")
    INTERESTED_PERSON("InterestedPerson");
    private final String value;

    ActSenderTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActSenderTypeType fromValue(String v) {
        for (ActSenderTypeType c: ActSenderTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
