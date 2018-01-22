//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.09 at 04:34:28 PM EEST 
//


package bg.bozho.model;

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
@XmlType(name = "ActSenderTypeType")
@XmlEnum
public enum ActSenderTypeType {


    /**
     * 
     *             \u041d\u0435\u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043e
     *           
     * 
     */
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),

    /**
     * 
     *             \u0421\u043b\u0443\u0436\u0435\u0431\u043d\u043e
     *           
     * 
     */
    @XmlEnumValue("Officially")
    OFFICIALLY("Officially"),

    /**
     * 
     *             \u041f\u043e \u0438\u0441\u043a\u0430\u043d\u0435 \u043d\u0430 \u043f\u0440\u043e\u043a\u0443\u0440\u043e\u0440
     *           
     * 
     */
    @XmlEnumValue("PublicProsecutor")
    PUBLIC_PROSECUTOR("PublicProsecutor"),

    /**
     * 
     *             \u041f\u043e \u0438\u0441\u043a\u0430\u043d\u0435 \u043d\u0430 \u0437\u0430\u0438\u043d\u0442\u0435\u0440\u0435\u0441\u043e\u0432\u0430\u043d\u043e \u043b\u0438\u0446\u0435
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