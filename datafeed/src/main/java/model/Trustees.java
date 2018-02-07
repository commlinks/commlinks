
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
 *         &lt;element name="Trustee" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.registryagency.bg/schemas/deedv2/Fields}Person"/>
 *                   &lt;element ref="{http://www.registryagency.bg/schemas/deedv2/Fields}Address"/>
 *                   &lt;element ref="{http://www.registryagency.bg/schemas/deedv2/Fields}Contacts"/>
 *                   &lt;element name="Status">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="BPS_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.registryagency.bg/schemas/deedv2/Fields}ActData"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *                 &lt;attribute name="InductionDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AcquittanseDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="WarrantyFund" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "trustee"
})
@XmlRootElement(name = "Trustees", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
public class Trustees {

    @XmlElement(name = "Trustee", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected List<Trustees.Trustee> trustee;
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
     * Gets the value of the trustee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrustee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Trustees.Trustee }
     * 
     * 
     */
    public List<Trustees.Trustee> getTrustee() {
        if (trustee == null) {
            trustee = new ArrayList<Trustees.Trustee>();
        }
        return this.trustee;
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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.registryagency.bg/schemas/deedv2/Fields}Person"/>
     *         &lt;element ref="{http://www.registryagency.bg/schemas/deedv2/Fields}Address"/>
     *         &lt;element ref="{http://www.registryagency.bg/schemas/deedv2/Fields}Contacts"/>
     *         &lt;element name="Status">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="BPS_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.registryagency.bg/schemas/deedv2/Fields}ActData"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
     *       &lt;attribute name="InductionDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AcquittanseDate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="WarrantyFund" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "person",
        "address",
        "contacts",
        "status",
        "actData"
    })
    public static class Trustee {

        @XmlElement(name = "Person", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected PersonType person;
        @XmlElement(name = "Address", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected AddressType address;
        @XmlElement(name = "Contacts", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected ContactsType contacts;
        @XmlElement(name = "Status", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected Trustees.Trustee.Status status;
        @XmlElement(name = "ActData", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected ActDataType actData;
        @XmlAttribute(name = "InductionDate")
        protected String inductionDate;
        @XmlAttribute(name = "AcquittanseDate")
        protected String acquittanseDate;
        @XmlAttribute(name = "WarrantyFund")
        protected String warrantyFund;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link PersonType }
         *     
         */
        public PersonType getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link PersonType }
         *     
         */
        public void setPerson(PersonType value) {
            this.person = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link AddressType }
         *     
         */
        public AddressType getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressType }
         *     
         */
        public void setAddress(AddressType value) {
            this.address = value;
        }

        /**
         * Gets the value of the contacts property.
         * 
         * @return
         *     possible object is
         *     {@link ContactsType }
         *     
         */
        public ContactsType getContacts() {
            return contacts;
        }

        /**
         * Sets the value of the contacts property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactsType }
         *     
         */
        public void setContacts(ContactsType value) {
            this.contacts = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link Trustees.Trustee.Status }
         *     
         */
        public Trustees.Trustee.Status getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link Trustees.Trustee.Status }
         *     
         */
        public void setStatus(Trustees.Trustee.Status value) {
            this.status = value;
        }

        /**
         * Gets the value of the actData property.
         * 
         * @return
         *     possible object is
         *     {@link ActDataType }
         *     
         */
        public ActDataType getActData() {
            return actData;
        }

        /**
         * Sets the value of the actData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActDataType }
         *     
         */
        public void setActData(ActDataType value) {
            this.actData = value;
        }

        /**
         * Gets the value of the inductionDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInductionDate() {
            return inductionDate;
        }

        /**
         * Sets the value of the inductionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInductionDate(String value) {
            this.inductionDate = value;
        }

        /**
         * Gets the value of the acquittanseDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcquittanseDate() {
            return acquittanseDate;
        }

        /**
         * Sets the value of the acquittanseDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcquittanseDate(String value) {
            this.acquittanseDate = value;
        }

        /**
         * Gets the value of the warrantyFund property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWarrantyFund() {
            return warrantyFund;
        }

        /**
         * Sets the value of the warrantyFund property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWarrantyFund(String value) {
            this.warrantyFund = value;
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
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="BPS_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "id",
            "name",
            "bpsid"
        })
        public static class Status {

            @XmlElement(name = "ID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
            protected String id;
            @XmlElement(name = "Name", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
            protected String name;
            @XmlElement(name = "BPS_ID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true, nillable = true)
            protected String bpsid;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setID(String value) {
                this.id = value;
            }

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
             * Gets the value of the bpsid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBPSID() {
                return bpsid;
            }

            /**
             * Sets the value of the bpsid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBPSID(String value) {
                this.bpsid = value;
            }

        }

    }

}