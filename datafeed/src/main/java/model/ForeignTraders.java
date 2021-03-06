
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
 *         &lt;element name="ForeignTraderRegistration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="LegalForm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Register" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EntryNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ForeignTraderCountry" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *                 &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IsEUCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OtherCountr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ForeignTrader" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ForeignTraderWayOfRepresentation" minOccurs="0">
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
 *         &lt;element name="AddemptionOfForeignTrader" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *                 &lt;attribute name="CheckedText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ForeignTradeStaticMambers" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
    "foreignTraderRegistration",
    "foreignTraderCountry",
    "foreignTrader",
    "foreignTraderWayOfRepresentation",
    "addemptionOfForeignTrader",
    "foreignTradeStaticMambers"
})
@XmlRootElement(name = "ForeignTraders", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
public class ForeignTraders {

    @XmlElement(name = "ForeignTraderRegistration", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected ForeignTraders.ForeignTraderRegistration foreignTraderRegistration;
    @XmlElement(name = "ForeignTraderCountry", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected ForeignTraders.ForeignTraderCountry foreignTraderCountry;
    @XmlElement(name = "ForeignTrader", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected List<ForeignTraders.ForeignTrader> foreignTrader;
    @XmlElement(name = "ForeignTraderWayOfRepresentation", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected ForeignTraders.ForeignTraderWayOfRepresentation foreignTraderWayOfRepresentation;
    @XmlElement(name = "AddemptionOfForeignTrader", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected ForeignTraders.AddemptionOfForeignTrader addemptionOfForeignTrader;
    @XmlElement(name = "ForeignTradeStaticMambers", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected List<ForeignTraders.ForeignTradeStaticMambers> foreignTradeStaticMambers;
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
     * Gets the value of the foreignTraderRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignTraders.ForeignTraderRegistration }
     *     
     */
    public ForeignTraders.ForeignTraderRegistration getForeignTraderRegistration() {
        return foreignTraderRegistration;
    }

    /**
     * Sets the value of the foreignTraderRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignTraders.ForeignTraderRegistration }
     *     
     */
    public void setForeignTraderRegistration(ForeignTraders.ForeignTraderRegistration value) {
        this.foreignTraderRegistration = value;
    }

    /**
     * Gets the value of the foreignTraderCountry property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignTraders.ForeignTraderCountry }
     *     
     */
    public ForeignTraders.ForeignTraderCountry getForeignTraderCountry() {
        return foreignTraderCountry;
    }

    /**
     * Sets the value of the foreignTraderCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignTraders.ForeignTraderCountry }
     *     
     */
    public void setForeignTraderCountry(ForeignTraders.ForeignTraderCountry value) {
        this.foreignTraderCountry = value;
    }

    /**
     * Gets the value of the foreignTrader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foreignTrader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeignTrader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignTraders.ForeignTrader }
     * 
     * 
     */
    public List<ForeignTraders.ForeignTrader> getForeignTrader() {
        if (foreignTrader == null) {
            foreignTrader = new ArrayList<ForeignTraders.ForeignTrader>();
        }
        return this.foreignTrader;
    }

    /**
     * Gets the value of the foreignTraderWayOfRepresentation property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignTraders.ForeignTraderWayOfRepresentation }
     *     
     */
    public ForeignTraders.ForeignTraderWayOfRepresentation getForeignTraderWayOfRepresentation() {
        return foreignTraderWayOfRepresentation;
    }

    /**
     * Sets the value of the foreignTraderWayOfRepresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignTraders.ForeignTraderWayOfRepresentation }
     *     
     */
    public void setForeignTraderWayOfRepresentation(ForeignTraders.ForeignTraderWayOfRepresentation value) {
        this.foreignTraderWayOfRepresentation = value;
    }

    /**
     * Gets the value of the addemptionOfForeignTrader property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignTraders.AddemptionOfForeignTrader }
     *     
     */
    public ForeignTraders.AddemptionOfForeignTrader getAddemptionOfForeignTrader() {
        return addemptionOfForeignTrader;
    }

    /**
     * Sets the value of the addemptionOfForeignTrader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignTraders.AddemptionOfForeignTrader }
     *     
     */
    public void setAddemptionOfForeignTrader(ForeignTraders.AddemptionOfForeignTrader value) {
        this.addemptionOfForeignTrader = value;
    }

    /**
     * Gets the value of the foreignTradeStaticMambers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foreignTradeStaticMambers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeignTradeStaticMambers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignTraders.ForeignTradeStaticMambers }
     * 
     * 
     */
    public List<ForeignTraders.ForeignTradeStaticMambers> getForeignTradeStaticMambers() {
        if (foreignTradeStaticMambers == null) {
            foreignTradeStaticMambers = new ArrayList<ForeignTraders.ForeignTradeStaticMambers>();
        }
        return this.foreignTradeStaticMambers;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
     *       &lt;attribute name="CheckedText" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AddemptionOfForeignTrader {

        @XmlAttribute(name = "CheckedText")
        protected String checkedText;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the checkedText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCheckedText() {
            return checkedText;
        }

        /**
         * Sets the value of the checkedText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCheckedText(String value) {
            this.checkedText = value;
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
     *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForeignTradeStaticMambers {

        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

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
    public static class ForeignTrader {

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
     *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
     *       &lt;attribute name="Country" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IsEUCountry" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OtherCountr" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForeignTraderCountry {

        @XmlAttribute(name = "Country")
        protected String country;
        @XmlAttribute(name = "IsEUCountry")
        protected String isEUCountry;
        @XmlAttribute(name = "OtherCountr")
        protected String otherCountr;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

        /**
         * Gets the value of the isEUCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsEUCountry() {
            return isEUCountry;
        }

        /**
         * Sets the value of the isEUCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsEUCountry(String value) {
            this.isEUCountry = value;
        }

        /**
         * Gets the value of the otherCountr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherCountr() {
            return otherCountr;
        }

        /**
         * Sets the value of the otherCountr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherCountr(String value) {
            this.otherCountr = value;
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
     *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="LegalForm" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Register" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EntryNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ForeignTraderRegistration {

        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "LegalForm")
        protected String legalForm;
        @XmlAttribute(name = "Register")
        protected String register;
        @XmlAttribute(name = "EntryNumber")
        protected String entryNumber;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the legalForm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegalForm() {
            return legalForm;
        }

        /**
         * Sets the value of the legalForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegalForm(String value) {
            this.legalForm = value;
        }

        /**
         * Gets the value of the register property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegister() {
            return register;
        }

        /**
         * Sets the value of the register property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegister(String value) {
            this.register = value;
        }

        /**
         * Gets the value of the entryNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntryNumber() {
            return entryNumber;
        }

        /**
         * Sets the value of the entryNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntryNumber(String value) {
            this.entryNumber = value;
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
    public static class ForeignTraderWayOfRepresentation {

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
