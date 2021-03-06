
package model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="A1"/>
 *     &lt;enumeration value="A2"/>
 *     &lt;enumeration value="A3"/>
 *     &lt;enumeration value="A4"/>
 *     &lt;enumeration value="A5"/>
 *     &lt;enumeration value="A6"/>
 *     &lt;enumeration value="A7"/>
 *     &lt;enumeration value="A8"/>
 *     &lt;enumeration value="A9"/>
 *     &lt;enumeration value="A10"/>
 *     &lt;enumeration value="A11"/>
 *     &lt;enumeration value="A12"/>
 *     &lt;enumeration value="A13"/>
 *     &lt;enumeration value="A14"/>
 *     &lt;enumeration value="B1"/>
 *     &lt;enumeration value="B2"/>
 *     &lt;enumeration value="B3"/>
 *     &lt;enumeration value="B4"/>
 *     &lt;enumeration value="B5"/>
 *     &lt;enumeration value="B6"/>
 *     &lt;enumeration value="B7"/>
 *     &lt;enumeration value="V1"/>
 *     &lt;enumeration value="V21"/>
 *     &lt;enumeration value="V22"/>
 *     &lt;enumeration value="V23"/>
 *     &lt;enumeration value="V24"/>
 *     &lt;enumeration value="V31"/>
 *     &lt;enumeration value="V32"/>
 *     &lt;enumeration value="V33"/>
 *     &lt;enumeration value="G1"/>
 *     &lt;enumeration value="G2"/>
 *     &lt;enumeration value="E1"/>
 *     &lt;enumeration value="J1"/>
 *     &lt;enumeration value="CourtAct"/>
 *     &lt;enumeration value="BankruptcyAct"/>
 *     &lt;enumeration value="RequestForCorrection"/>
 *     &lt;enumeration value="InternalRequestForCorrection"/>
 *     &lt;enumeration value="LiquidatorsAgreement"/>
 *     &lt;enumeration value="CourtBranchReg"/>
 *     &lt;enumeration value="OfficialUASRegistration"/>
 *     &lt;enumeration value="AppointingChangeRequest"/>
 *     &lt;enumeration value="AppointingDeclaration"/>
 *     &lt;enumeration value="AppointingRequestForCorrection"/>
 *     &lt;enumeration value="AnnouncementFromOtherRegister"/>
 *     &lt;enumeration value="NotificationOfLackOfMeans"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppEnum", namespace = "http://www.registryagency.bg/schemas/deedv2")
@XmlEnum
public enum AppEnum {

    AA("AA"),
    @XmlEnumValue("A1")
    A_1("A1"),
    @XmlEnumValue("A2")
    A_2("A2"),
    @XmlEnumValue("A3")
    A_3("A3"),
    @XmlEnumValue("A4")
    A_4("A4"),
    @XmlEnumValue("A5")
    A_5("A5"),
    @XmlEnumValue("A6")
    A_6("A6"),
    @XmlEnumValue("A7")
    A_7("A7"),
    @XmlEnumValue("A8")
    A_8("A8"),
    @XmlEnumValue("A9")
    A_9("A9"),
    @XmlEnumValue("A10")
    A_10("A10"),
    @XmlEnumValue("A11")
    A_11("A11"),
    @XmlEnumValue("A12")
    A_12("A12"),
    @XmlEnumValue("A13")
    A_13("A13"),
    @XmlEnumValue("A14")
    A_14("A14"),
    @XmlEnumValue("B1")
    B_1("B1"),
    @XmlEnumValue("B2")
    B_2("B2"),
    @XmlEnumValue("B3")
    B_3("B3"),
    @XmlEnumValue("B4")
    B_4("B4"),
    @XmlEnumValue("B5")
    B_5("B5"),
    @XmlEnumValue("B6")
    B_6("B6"),
    @XmlEnumValue("B7")
    B_7("B7"),
    @XmlEnumValue("V1")
    V_1("V1"),
    @XmlEnumValue("V21")
    V_21("V21"),
    @XmlEnumValue("V22")
    V_22("V22"),
    @XmlEnumValue("V23")
    V_23("V23"),
    @XmlEnumValue("V24")
    V_24("V24"),
    @XmlEnumValue("V31")
    V_31("V31"),
    @XmlEnumValue("V32")
    V_32("V32"),
    @XmlEnumValue("V33")
    V_33("V33"),
    @XmlEnumValue("G1")
    G_1("G1"),
    @XmlEnumValue("G2")
    G_2("G2"),
    @XmlEnumValue("E1")
    E_1("E1"),
    @XmlEnumValue("J1")
    J_1("J1"),
    @XmlEnumValue("CourtAct")
    COURT_ACT("CourtAct"),
    @XmlEnumValue("BankruptcyAct")
    BANKRUPTCY_ACT("BankruptcyAct"),
    @XmlEnumValue("RequestForCorrection")
    REQUEST_FOR_CORRECTION("RequestForCorrection"),
    @XmlEnumValue("InternalRequestForCorrection")
    INTERNAL_REQUEST_FOR_CORRECTION("InternalRequestForCorrection"),
    @XmlEnumValue("LiquidatorsAgreement")
    LIQUIDATORS_AGREEMENT("LiquidatorsAgreement"),
    @XmlEnumValue("CourtBranchReg")
    COURT_BRANCH_REG("CourtBranchReg"),
    @XmlEnumValue("OfficialUASRegistration")
    OFFICIAL_UAS_REGISTRATION("OfficialUASRegistration"),
    @XmlEnumValue("AppointingChangeRequest")
    APPOINTING_CHANGE_REQUEST("AppointingChangeRequest"),
    @XmlEnumValue("AppointingDeclaration")
    APPOINTING_DECLARATION("AppointingDeclaration"),
    @XmlEnumValue("AppointingRequestForCorrection")
    APPOINTING_REQUEST_FOR_CORRECTION("AppointingRequestForCorrection"),
    @XmlEnumValue("AnnouncementFromOtherRegister")
    ANNOUNCEMENT_FROM_OTHER_REGISTER("AnnouncementFromOtherRegister"),
    @XmlEnumValue("NotificationOfLackOfMeans")
    NOTIFICATION_OF_LACK_OF_MEANS("NotificationOfLackOfMeans");
    private final String value;

    AppEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppEnum fromValue(String v) {
        for (AppEnum c: AppEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
