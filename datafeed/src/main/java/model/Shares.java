
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
 *         &lt;element name="CredentialsForDifferentTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpecialConditionsForTransfer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Share" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NominalValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "credentialsForDifferentTypes",
    "specialConditionsForTransfer",
    "share"
})
@XmlRootElement(name = "Shares", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
public class Shares {

    @XmlElement(name = "CredentialsForDifferentTypes", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected Shares.CredentialsForDifferentTypes credentialsForDifferentTypes;
    @XmlElement(name = "SpecialConditionsForTransfer", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected Shares.SpecialConditionsForTransfer specialConditionsForTransfer;
    @XmlElement(name = "Share", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected List<Shares.Share> share;
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
     * Gets the value of the credentialsForDifferentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Shares.CredentialsForDifferentTypes }
     *     
     */
    public Shares.CredentialsForDifferentTypes getCredentialsForDifferentTypes() {
        return credentialsForDifferentTypes;
    }

    /**
     * Sets the value of the credentialsForDifferentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shares.CredentialsForDifferentTypes }
     *     
     */
    public void setCredentialsForDifferentTypes(Shares.CredentialsForDifferentTypes value) {
        this.credentialsForDifferentTypes = value;
    }

    /**
     * Gets the value of the specialConditionsForTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link Shares.SpecialConditionsForTransfer }
     *     
     */
    public Shares.SpecialConditionsForTransfer getSpecialConditionsForTransfer() {
        return specialConditionsForTransfer;
    }

    /**
     * Sets the value of the specialConditionsForTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shares.SpecialConditionsForTransfer }
     *     
     */
    public void setSpecialConditionsForTransfer(Shares.SpecialConditionsForTransfer value) {
        this.specialConditionsForTransfer = value;
    }

    /**
     * Gets the value of the share property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the share property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shares.Share }
     * 
     * 
     */
    public List<Shares.Share> getShare() {
        if (share == null) {
            share = new ArrayList<Shares.Share>();
        }
        return this.share;
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
    public static class CredentialsForDifferentTypes {

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
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NominalValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "type",
        "count",
        "nominalValue"
    })
    public static class Share {

        @XmlElement(name = "Type", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected String type;
        @XmlElement(name = "Count", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected String count;
        @XmlElement(name = "NominalValue", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected String nominalValue;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCount(String value) {
            this.count = value;
        }

        /**
         * Gets the value of the nominalValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNominalValue() {
            return nominalValue;
        }

        /**
         * Sets the value of the nominalValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNominalValue(String value) {
            this.nominalValue = value;
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
    public static class SpecialConditionsForTransfer {

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

}
