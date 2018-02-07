
package model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Erase"/>
 *     &lt;enumeration value="Current"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldOperation", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
@XmlEnum
public enum FieldOperation {


    /**
     * 
     *             Полето е добавено или по него е направена промяна.
     *           
     * 
     */
    @XmlEnumValue("Add")
    ADD("Add"),

    /**
     * 
     *             Полето е изтрито.
     *           
     * 
     */
    @XmlEnumValue("Erase")
    ERASE("Erase"),

    /**
     * 
     *             Полето е непроменено.
     *           
     * 
     */
    @XmlEnumValue("Current")
    CURRENT("Current");
    private final String value;

    FieldOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FieldOperation fromValue(String v) {
        for (FieldOperation c: FieldOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
