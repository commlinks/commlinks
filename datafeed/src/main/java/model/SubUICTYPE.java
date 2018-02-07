
package model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubUICTYPE.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubUICTYPE">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MainCircumstances"/>
 *     &lt;enumeration value="B1_Procura"/>
 *     &lt;enumeration value="B2_Branch"/>
 *     &lt;enumeration value="B3_Pledge_DD"/>
 *     &lt;enumeration value="B4_Pledge_TP"/>
 *     &lt;enumeration value="B5_Distraint_DD"/>
 *     &lt;enumeration value="B6_Liquidation"/>
 *     &lt;enumeration value="B7_ActualOwner"/>
 *     &lt;enumeration value="V1_Transfer"/>
 *     &lt;enumeration value="V2_Conversion"/>
 *     &lt;enumeration value="V3_Reorganization_K"/>
 *     &lt;enumeration value="Bankruptcy"/>
 *     &lt;enumeration value="Notes"/>
 *     &lt;enumeration value="G1_ActAnnouncement"/>
 *     &lt;enumeration value="AdditionalCircumstances"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubUICTYPE", namespace = "http://www.registryagency.bg/schemas/deedv2")
@XmlEnum
public enum SubUICTYPE {


    /**
     * 
     * 						������� �����
     * 					
     * 
     */
    @XmlEnumValue("MainCircumstances")
    MAIN_CIRCUMSTANCES("MainCircumstances"),

    /**
     * 
     * 						�������
     * 					
     * 
     */
    @XmlEnumValue("B1_Procura")
    B_1_PROCURA("B1_Procura"),

    /**
     * 
     * 						�������
     * 					
     * 
     */
    @XmlEnumValue("B2_Branch")
    B_2_BRANCH("B2_Branch"),

    /**
     * 
     * 						����� �� ���������� ���
     * 					
     * 
     */
    @XmlEnumValue("B3_Pledge_DD")
    B_3_PLEDGE_DD("B3_Pledge_DD"),

    /**
     * 
     * 						����� �� ��������� �����������
     * 					
     * 
     */
    @XmlEnumValue("B4_Pledge_TP")
    B_4_PLEDGE_TP("B4_Pledge_TP"),

    /**
     * 
     * 						����� ����� ���������� ���
     * 					
     * 
     */
    @XmlEnumValue("B5_Distraint_DD")
    B_5_DISTRAINT_DD("B5_Distraint_DD"),

    /**
     * 
     * 						����������
     * 					
     * 
     */
    @XmlEnumValue("B6_Liquidation")
    B_6_LIQUIDATION("B6_Liquidation"),

    /**
     * 
     *             ������������ �����������
     *           
     * 
     */
    @XmlEnumValue("B7_ActualOwner")
    B_7_ACTUAL_OWNER("B7_ActualOwner"),

    /**
     * 
     * 						�����������
     * 					
     * 
     */
    @XmlEnumValue("V1_Transfer")
    V_1_TRANSFER("V1_Transfer"),

    /**
     * 
     * 						�������������
     * 					
     * 
     */
    @XmlEnumValue("V2_Conversion")
    V_2_CONVERSION("V2_Conversion"),

    /**
     * 
     * 						�������������
     * 					
     * 
     */
    @XmlEnumValue("V3_Reorganization_K")
    V_3_REORGANIZATION_K("V3_Reorganization_K"),

    /**
     * 
     * 						���������������
     * 					
     * 
     */
    @XmlEnumValue("Bankruptcy")
    BANKRUPTCY("Bankruptcy"),

    /**
     * 
     * 						���������
     * 					
     * 
     */
    @XmlEnumValue("Notes")
    NOTES("Notes"),

    /**
     * 
     * 						������� ������
     * 					
     * 
     */
    @XmlEnumValue("G1_ActAnnouncement")
    G_1_ACT_ANNOUNCEMENT("G1_ActAnnouncement"),

    /**
     * 
     * 						��������� ������� �� �������
     * 					
     * 
     */
    @XmlEnumValue("AdditionalCircumstances")
    ADDITIONAL_CIRCUMSTANCES("AdditionalCircumstances");
    private final String value;

    SubUICTYPE(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubUICTYPE fromValue(String v) {
        for (SubUICTYPE c: SubUICTYPE.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
