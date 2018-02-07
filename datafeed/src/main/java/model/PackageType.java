
package model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="New"/>
 *     &lt;enumeration value="ForChange"/>
 *     &lt;enumeration value="Preregistration"/>
 *     &lt;enumeration value="Transformation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackageType", namespace = "http://www.registryagency.bg/schemas/deedv2")
@XmlEnum
public enum PackageType {


    /**
     * 
     * 									   Пакета е подаден за първоначална регистрация.
     * 								   
     * 
     */
    @XmlEnumValue("New")
    NEW("New"),

    /**
     * 
     * 									   Пакета е подаден за промяна.
     * 								   
     * 
     */
    @XmlEnumValue("ForChange")
    FOR_CHANGE("ForChange"),

    /**
     * 
     * 									   Пререгистрация.
     * 								   
     * 
     */
    @XmlEnumValue("Preregistration")
    PREREGISTRATION("Preregistration"),
    @XmlEnumValue("Transformation")
    TRANSFORMATION("Transformation");
    private final String value;

    PackageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PackageType fromValue(String v) {
        for (PackageType c: PackageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
