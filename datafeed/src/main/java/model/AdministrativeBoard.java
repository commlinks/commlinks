
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
 *         &lt;element name="AdministrativeBoardMandate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.registryagency.bg/schemas/deedv2/Fields>MandateType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdministrativeBody" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.registryagency.bg/schemas/deedv2/Fields}Subject"/>
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
    "administrativeBoardMandate",
    "administrativeBody"
})
@XmlRootElement(name = "AdministrativeBoard", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
public class AdministrativeBoard {

    @XmlElement(name = "AdministrativeBoardMandate", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected AdministrativeBoard.AdministrativeBoardMandate administrativeBoardMandate;
    @XmlElement(name = "AdministrativeBody", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected List<AdministrativeBoard.AdministrativeBody> administrativeBody;
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
     * Gets the value of the administrativeBoardMandate property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeBoard.AdministrativeBoardMandate }
     *     
     */
    public AdministrativeBoard.AdministrativeBoardMandate getAdministrativeBoardMandate() {
        return administrativeBoardMandate;
    }

    /**
     * Sets the value of the administrativeBoardMandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeBoard.AdministrativeBoardMandate }
     *     
     */
    public void setAdministrativeBoardMandate(AdministrativeBoard.AdministrativeBoardMandate value) {
        this.administrativeBoardMandate = value;
    }

    /**
     * Gets the value of the administrativeBody property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrativeBody property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrativeBody().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdministrativeBoard.AdministrativeBody }
     * 
     * 
     */
    public List<AdministrativeBoard.AdministrativeBody> getAdministrativeBody() {
        if (administrativeBody == null) {
            administrativeBody = new ArrayList<AdministrativeBoard.AdministrativeBody>();
        }
        return this.administrativeBody;
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
     *     &lt;extension base="&lt;http://www.registryagency.bg/schemas/deedv2/Fields>MandateType">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdministrativeBoardMandate
        extends MandateType
    {


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
     *         &lt;element ref="{http://www.registryagency.bg/schemas/deedv2/Fields}Subject"/>
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
        "subject"
    })
    public static class AdministrativeBody {

        @XmlElement(name = "Subject", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected SubjectType subject;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the subject property.
         * 
         * @return
         *     possible object is
         *     {@link SubjectType }
         *     
         */
        public SubjectType getSubject() {
            return subject;
        }

        /**
         * Sets the value of the subject property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubjectType }
         *     
         */
        public void setSubject(SubjectType value) {
            this.subject = value;
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
