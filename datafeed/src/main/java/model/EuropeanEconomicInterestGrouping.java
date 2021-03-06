
package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForeignCompanyData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CompanyData" type="{http://www.registryagency.bg/schemas/deedv2/Fields}ForeignCompanyBaseData" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EUIEAddempted" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RepresentersWayOfManagement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *                 &lt;attribute name="jointly" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="severally" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="otherWay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PowerOfLiquidators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PowerOfTrustees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EuropeanEconomicInterestRepresenter" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RepresenterType" type="{http://www.registryagency.bg/schemas/deedv2/Fields}EuropeanEconomicInterestRepresenterTypes"/>
 *                   &lt;element name="RepresenterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}FieldCommonAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "foreignCompanyData",
    "euieAddempted",
    "representersWayOfManagement",
    "powerOfLiquidators",
    "powerOfTrustees",
    "europeanEconomicInterestRepresenter"
})
@XmlRootElement(name = "EuropeanEconomicInterestGrouping", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
public class EuropeanEconomicInterestGrouping {

    @XmlElement(name = "ForeignCompanyData", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected EuropeanEconomicInterestGrouping.ForeignCompanyData foreignCompanyData;
    @XmlElement(name = "EUIEAddempted", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected EuropeanEconomicInterestGrouping.EUIEAddempted euieAddempted;
    @XmlElement(name = "RepresentersWayOfManagement", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected EuropeanEconomicInterestGrouping.RepresentersWayOfManagement representersWayOfManagement;
    @XmlElement(name = "PowerOfLiquidators", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected EuropeanEconomicInterestGrouping.PowerOfLiquidators powerOfLiquidators;
    @XmlElement(name = "PowerOfTrustees", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected EuropeanEconomicInterestGrouping.PowerOfTrustees powerOfTrustees;
    @XmlElement(name = "EuropeanEconomicInterestRepresenter", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected List<EuropeanEconomicInterestGrouping.EuropeanEconomicInterestRepresenter> europeanEconomicInterestRepresenter;
    @XmlAttribute(name = "FieldIdent", required = true)
    protected String fieldIdent;
    @XmlAttribute(name = "FieldOperation", required = true)
    protected FieldOperation fieldOperation;
    @XmlAttribute(name = "FieldEntryNumber", required = true)
    protected String fieldEntryNumber;
    @XmlAttribute(name = "FieldActionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fieldActionDate;

    /**
     * Gets the value of the foreignCompanyData property.
     * 
     * @return
     *     possible object is
     *     {@link EuropeanEconomicInterestGrouping.ForeignCompanyData }
     *     
     */
    public EuropeanEconomicInterestGrouping.ForeignCompanyData getForeignCompanyData() {
        return foreignCompanyData;
    }

    /**
     * Sets the value of the foreignCompanyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuropeanEconomicInterestGrouping.ForeignCompanyData }
     *     
     */
    public void setForeignCompanyData(EuropeanEconomicInterestGrouping.ForeignCompanyData value) {
        this.foreignCompanyData = value;
    }

    /**
     * Gets the value of the euieAddempted property.
     * 
     * @return
     *     possible object is
     *     {@link EuropeanEconomicInterestGrouping.EUIEAddempted }
     *     
     */
    public EuropeanEconomicInterestGrouping.EUIEAddempted getEUIEAddempted() {
        return euieAddempted;
    }

    /**
     * Sets the value of the euieAddempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuropeanEconomicInterestGrouping.EUIEAddempted }
     *     
     */
    public void setEUIEAddempted(EuropeanEconomicInterestGrouping.EUIEAddempted value) {
        this.euieAddempted = value;
    }

    /**
     * Gets the value of the representersWayOfManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EuropeanEconomicInterestGrouping.RepresentersWayOfManagement }
     *     
     */
    public EuropeanEconomicInterestGrouping.RepresentersWayOfManagement getRepresentersWayOfManagement() {
        return representersWayOfManagement;
    }

    /**
     * Sets the value of the representersWayOfManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuropeanEconomicInterestGrouping.RepresentersWayOfManagement }
     *     
     */
    public void setRepresentersWayOfManagement(EuropeanEconomicInterestGrouping.RepresentersWayOfManagement value) {
        this.representersWayOfManagement = value;
    }

    /**
     * Gets the value of the powerOfLiquidators property.
     * 
     * @return
     *     possible object is
     *     {@link EuropeanEconomicInterestGrouping.PowerOfLiquidators }
     *     
     */
    public EuropeanEconomicInterestGrouping.PowerOfLiquidators getPowerOfLiquidators() {
        return powerOfLiquidators;
    }

    /**
     * Sets the value of the powerOfLiquidators property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuropeanEconomicInterestGrouping.PowerOfLiquidators }
     *     
     */
    public void setPowerOfLiquidators(EuropeanEconomicInterestGrouping.PowerOfLiquidators value) {
        this.powerOfLiquidators = value;
    }

    /**
     * Gets the value of the powerOfTrustees property.
     * 
     * @return
     *     possible object is
     *     {@link EuropeanEconomicInterestGrouping.PowerOfTrustees }
     *     
     */
    public EuropeanEconomicInterestGrouping.PowerOfTrustees getPowerOfTrustees() {
        return powerOfTrustees;
    }

    /**
     * Sets the value of the powerOfTrustees property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuropeanEconomicInterestGrouping.PowerOfTrustees }
     *     
     */
    public void setPowerOfTrustees(EuropeanEconomicInterestGrouping.PowerOfTrustees value) {
        this.powerOfTrustees = value;
    }

    /**
     * Gets the value of the europeanEconomicInterestRepresenter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the europeanEconomicInterestRepresenter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEuropeanEconomicInterestRepresenter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EuropeanEconomicInterestGrouping.EuropeanEconomicInterestRepresenter }
     * 
     * 
     */
    public List<EuropeanEconomicInterestGrouping.EuropeanEconomicInterestRepresenter> getEuropeanEconomicInterestRepresenter() {
        if (europeanEconomicInterestRepresenter == null) {
            europeanEconomicInterestRepresenter = new ArrayList<EuropeanEconomicInterestGrouping.EuropeanEconomicInterestRepresenter>();
        }
        return this.europeanEconomicInterestRepresenter;
    }

    /**
     * Gets the value of the fieldIdent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldIdent() {
        return fieldIdent;
    }

    /**
     * Sets the value of the fieldIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldIdent(String value) {
        this.fieldIdent = value;
    }

    /**
     * Gets the value of the fieldOperation property.
     * 
     * @return
     *     possible object is
     *     {@link FieldOperation }
     *     
     */
    public FieldOperation getFieldOperation() {
        return fieldOperation;
    }

    /**
     * Sets the value of the fieldOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldOperation }
     *     
     */
    public void setFieldOperation(FieldOperation value) {
        this.fieldOperation = value;
    }

    /**
     * Gets the value of the fieldEntryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldEntryNumber() {
        return fieldEntryNumber;
    }

    /**
     * Sets the value of the fieldEntryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldEntryNumber(String value) {
        this.fieldEntryNumber = value;
    }

    /**
     * Gets the value of the fieldActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFieldActionDate() {
        return fieldActionDate;
    }

    /**
     * Sets the value of the fieldActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFieldActionDate(XMLGregorianCalendar value) {
        this.fieldActionDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class EUIEAddempted {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the recordID property.
         * 
         */
        public int getRecordID() {
            return recordID;
        }

        /**
         * Sets the value of the recordID property.
         * 
         */
        public void setRecordID(int value) {
            this.recordID = value;
        }

        /**
         * Gets the value of the groupID property.
         * 
         */
        public int getGroupID() {
            return groupID;
        }

        /**
         * Sets the value of the groupID property.
         * 
         */
        public void setGroupID(int value) {
            this.groupID = value;
        }

        /**
         * Gets the value of the recordIncomingNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecordIncomingNumber() {
            return recordIncomingNumber;
        }

        /**
         * Sets the value of the recordIncomingNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordIncomingNumber(String value) {
            this.recordIncomingNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RepresenterType" type="{http://www.registryagency.bg/schemas/deedv2/Fields}EuropeanEconomicInterestRepresenterTypes"/>
     *         &lt;element name="RepresenterName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "representerType",
        "representerName"
    })
    public static class EuropeanEconomicInterestRepresenter {

        @XmlElement(name = "RepresenterType", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        @XmlSchemaType(name = "string")
        protected EuropeanEconomicInterestRepresenterTypes representerType;
        @XmlElement(name = "RepresenterName", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected String representerName;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the representerType property.
         * 
         * @return
         *     possible object is
         *     {@link EuropeanEconomicInterestRepresenterTypes }
         *     
         */
        public EuropeanEconomicInterestRepresenterTypes getRepresenterType() {
            return representerType;
        }

        /**
         * Sets the value of the representerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link EuropeanEconomicInterestRepresenterTypes }
         *     
         */
        public void setRepresenterType(EuropeanEconomicInterestRepresenterTypes value) {
            this.representerType = value;
        }

        /**
         * Gets the value of the representerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRepresenterName() {
            return representerName;
        }

        /**
         * Sets the value of the representerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRepresenterName(String value) {
            this.representerName = value;
        }

        /**
         * Gets the value of the recordID property.
         * 
         */
        public int getRecordID() {
            return recordID;
        }

        /**
         * Sets the value of the recordID property.
         * 
         */
        public void setRecordID(int value) {
            this.recordID = value;
        }

        /**
         * Gets the value of the groupID property.
         * 
         */
        public int getGroupID() {
            return groupID;
        }

        /**
         * Sets the value of the groupID property.
         * 
         */
        public void setGroupID(int value) {
            this.groupID = value;
        }

        /**
         * Gets the value of the recordIncomingNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecordIncomingNumber() {
            return recordIncomingNumber;
        }

        /**
         * Sets the value of the recordIncomingNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordIncomingNumber(String value) {
            this.recordIncomingNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CompanyData" type="{http://www.registryagency.bg/schemas/deedv2/Fields}ForeignCompanyBaseData" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "companyData"
    })
    public static class ForeignCompanyData {

        @XmlElement(name = "CompanyData", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected ForeignCompanyBaseData companyData;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the companyData property.
         * 
         * @return
         *     possible object is
         *     {@link ForeignCompanyBaseData }
         *     
         */
        public ForeignCompanyBaseData getCompanyData() {
            return companyData;
        }

        /**
         * Sets the value of the companyData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ForeignCompanyBaseData }
         *     
         */
        public void setCompanyData(ForeignCompanyBaseData value) {
            this.companyData = value;
        }

        /**
         * Gets the value of the recordID property.
         * 
         */
        public int getRecordID() {
            return recordID;
        }

        /**
         * Sets the value of the recordID property.
         * 
         */
        public void setRecordID(int value) {
            this.recordID = value;
        }

        /**
         * Gets the value of the groupID property.
         * 
         */
        public int getGroupID() {
            return groupID;
        }

        /**
         * Sets the value of the groupID property.
         * 
         */
        public void setGroupID(int value) {
            this.groupID = value;
        }

        /**
         * Gets the value of the recordIncomingNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecordIncomingNumber() {
            return recordIncomingNumber;
        }

        /**
         * Sets the value of the recordIncomingNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordIncomingNumber(String value) {
            this.recordIncomingNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PowerOfLiquidators {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the recordID property.
         * 
         */
        public int getRecordID() {
            return recordID;
        }

        /**
         * Sets the value of the recordID property.
         * 
         */
        public void setRecordID(int value) {
            this.recordID = value;
        }

        /**
         * Gets the value of the groupID property.
         * 
         */
        public int getGroupID() {
            return groupID;
        }

        /**
         * Sets the value of the groupID property.
         * 
         */
        public void setGroupID(int value) {
            this.groupID = value;
        }

        /**
         * Gets the value of the recordIncomingNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecordIncomingNumber() {
            return recordIncomingNumber;
        }

        /**
         * Sets the value of the recordIncomingNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordIncomingNumber(String value) {
            this.recordIncomingNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PowerOfTrustees {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the recordID property.
         * 
         */
        public int getRecordID() {
            return recordID;
        }

        /**
         * Sets the value of the recordID property.
         * 
         */
        public void setRecordID(int value) {
            this.recordID = value;
        }

        /**
         * Gets the value of the groupID property.
         * 
         */
        public int getGroupID() {
            return groupID;
        }

        /**
         * Sets the value of the groupID property.
         * 
         */
        public void setGroupID(int value) {
            this.groupID = value;
        }

        /**
         * Gets the value of the recordIncomingNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecordIncomingNumber() {
            return recordIncomingNumber;
        }

        /**
         * Sets the value of the recordIncomingNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordIncomingNumber(String value) {
            this.recordIncomingNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
     *       &lt;attribute name="jointly" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="severally" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="otherWay" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RepresentersWayOfManagement {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "jointly")
        protected String jointly;
        @XmlAttribute(name = "severally")
        protected String severally;
        @XmlAttribute(name = "otherWay")
        protected String otherWay;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the jointly property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJointly() {
            return jointly;
        }

        /**
         * Sets the value of the jointly property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJointly(String value) {
            this.jointly = value;
        }

        /**
         * Gets the value of the severally property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeverally() {
            return severally;
        }

        /**
         * Sets the value of the severally property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeverally(String value) {
            this.severally = value;
        }

        /**
         * Gets the value of the otherWay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherWay() {
            return otherWay;
        }

        /**
         * Sets the value of the otherWay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherWay(String value) {
            this.otherWay = value;
        }

        /**
         * Gets the value of the recordID property.
         * 
         */
        public int getRecordID() {
            return recordID;
        }

        /**
         * Sets the value of the recordID property.
         * 
         */
        public void setRecordID(int value) {
            this.recordID = value;
        }

        /**
         * Gets the value of the groupID property.
         * 
         */
        public int getGroupID() {
            return groupID;
        }

        /**
         * Sets the value of the groupID property.
         * 
         */
        public void setGroupID(int value) {
            this.groupID = value;
        }

        /**
         * Gets the value of the recordIncomingNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecordIncomingNumber() {
            return recordIncomingNumber;
        }

        /**
         * Sets the value of the recordIncomingNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecordIncomingNumber(String value) {
            this.recordIncomingNumber = value;
        }

    }

}
