
package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="ShareTransfer" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OldOwner" type="{http://www.registryagency.bg/schemas/deedv2/Fields}SubjectType" minOccurs="0"/>
 *                   &lt;element name="NewOwner" type="{http://www.registryagency.bg/schemas/deedv2/Fields}SubjectType" minOccurs="0"/>
 *                   &lt;element name="ShareAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OldOwnerCountryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="OldOwnerCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="NewOwnerCountryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="NewOwnerCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "shareTransfer"
})
@XmlRootElement(name = "ShareTransfers", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
public class ShareTransfers {

    @XmlElement(name = "ShareTransfer", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected List<ShareTransfers.ShareTransfer> shareTransfer;
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
     * Gets the value of the shareTransfer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareTransfer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareTransfer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareTransfers.ShareTransfer }
     * 
     * 
     */
    public List<ShareTransfers.ShareTransfer> getShareTransfer() {
        if (shareTransfer == null) {
            shareTransfer = new ArrayList<ShareTransfers.ShareTransfer>();
        }
        return this.shareTransfer;
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
     *         &lt;element name="OldOwner" type="{http://www.registryagency.bg/schemas/deedv2/Fields}SubjectType" minOccurs="0"/>
     *         &lt;element name="NewOwner" type="{http://www.registryagency.bg/schemas/deedv2/Fields}SubjectType" minOccurs="0"/>
     *         &lt;element name="ShareAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OldOwnerCountryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="OldOwnerCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="NewOwnerCountryID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="NewOwnerCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "oldOwner",
        "newOwner",
        "shareAmount",
        "date",
        "oldOwnerCountryID",
        "oldOwnerCountryName",
        "newOwnerCountryID",
        "newOwnerCountryName"
    })
    public static class ShareTransfer {

        @XmlElement(name = "OldOwner", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected SubjectType oldOwner;
        @XmlElement(name = "NewOwner", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected SubjectType newOwner;
        @XmlElement(name = "ShareAmount", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String shareAmount;
        @XmlElement(name = "Date", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String date;
        @XmlElementRef(name = "OldOwnerCountryID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> oldOwnerCountryID;
        @XmlElement(name = "OldOwnerCountryName", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String oldOwnerCountryName;
        @XmlElementRef(name = "NewOwnerCountryID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", type = JAXBElement.class, required = false)
        protected JAXBElement<Long> newOwnerCountryID;
        @XmlElement(name = "NewOwnerCountryName", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String newOwnerCountryName;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the oldOwner property.
         * 
         * @return
         *     possible object is
         *     {@link SubjectType }
         *     
         */
        public SubjectType getOldOwner() {
            return oldOwner;
        }

        /**
         * Sets the value of the oldOwner property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubjectType }
         *     
         */
        public void setOldOwner(SubjectType value) {
            this.oldOwner = value;
        }

        /**
         * Gets the value of the newOwner property.
         * 
         * @return
         *     possible object is
         *     {@link SubjectType }
         *     
         */
        public SubjectType getNewOwner() {
            return newOwner;
        }

        /**
         * Sets the value of the newOwner property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubjectType }
         *     
         */
        public void setNewOwner(SubjectType value) {
            this.newOwner = value;
        }

        /**
         * Gets the value of the shareAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareAmount() {
            return shareAmount;
        }

        /**
         * Sets the value of the shareAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareAmount(String value) {
            this.shareAmount = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDate(String value) {
            this.date = value;
        }

        /**
         * Gets the value of the oldOwnerCountryID property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getOldOwnerCountryID() {
            return oldOwnerCountryID;
        }

        /**
         * Sets the value of the oldOwnerCountryID property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setOldOwnerCountryID(JAXBElement<Long> value) {
            this.oldOwnerCountryID = value;
        }

        /**
         * Gets the value of the oldOwnerCountryName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOldOwnerCountryName() {
            return oldOwnerCountryName;
        }

        /**
         * Sets the value of the oldOwnerCountryName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOldOwnerCountryName(String value) {
            this.oldOwnerCountryName = value;
        }

        /**
         * Gets the value of the newOwnerCountryID property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public JAXBElement<Long> getNewOwnerCountryID() {
            return newOwnerCountryID;
        }

        /**
         * Sets the value of the newOwnerCountryID property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Long }{@code >}
         *     
         */
        public void setNewOwnerCountryID(JAXBElement<Long> value) {
            this.newOwnerCountryID = value;
        }

        /**
         * Gets the value of the newOwnerCountryName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNewOwnerCountryName() {
            return newOwnerCountryName;
        }

        /**
         * Sets the value of the newOwnerCountryName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNewOwnerCountryName(String value) {
            this.newOwnerCountryName = value;
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
