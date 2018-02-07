
package model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EuropeanEconomicInterestRepresenterTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EuropeanEconomicInterestRepresenterTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Liquidator"/>
 *     &lt;enumeration value="Trustee"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EuropeanEconomicInterestRepresenterTypes", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
@XmlEnum
public enum EuropeanEconomicInterestRepresenterTypes {


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
     *             Заинтересовано лице
     *           
     * 
     */
    @XmlEnumValue("Regular")
    REGULAR("Regular"),

    /**
     * 
     *             Ликвидатор
     *           
     * 
     */
    @XmlEnumValue("Liquidator")
    LIQUIDATOR("Liquidator"),

    /**
     * 
     *             Синдик
     *           
     * 
     */
    @XmlEnumValue("Trustee")
    TRUSTEE("Trustee");
    private final String value;

    EuropeanEconomicInterestRepresenterTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EuropeanEconomicInterestRepresenterTypes fromValue(String v) {
        for (EuropeanEconomicInterestRepresenterTypes c: EuropeanEconomicInterestRepresenterTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
