
package model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeedStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeedStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="L"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeedStatusType", namespace = "http://www.registryagency.bg/schemas/deedv2")
@XmlEnum
public enum DeedStatusType {


    /**
     * 
     * 						Нова
     * 					
     * 
     */
    N,

    /**
     * 
     * 						Пререгистрирана фирма по Булстат
     * 					
     * 
     */
    E,

    /**
     * 
     * 						Нова партида затворена
     * 					
     * 
     */
    C,

    /**
     * 
     * 						Пререгистрирана фирма по Булстат затворена
     * 					
     * 
     */
    L;

    public String value() {
        return name();
    }

    public static DeedStatusType fromValue(String v) {
        return valueOf(v);
    }

}
