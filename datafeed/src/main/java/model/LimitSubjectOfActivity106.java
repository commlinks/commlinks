
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
 *         &lt;element name="LimitInsuaranceActivity106" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *                 &lt;attribute name="insuaranceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="forbiddanceOfNewContracts" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="forbiddanceToExtendContracts" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="forbiddanceToWidenContracts" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="fobiddenTill" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "limitInsuaranceActivity106"
})
@XmlRootElement(name = "LimitSubjectOfActivity106", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
public class LimitSubjectOfActivity106 {

    @XmlElement(name = "LimitInsuaranceActivity106", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected List<LimitSubjectOfActivity106 .LimitInsuaranceActivity106> limitInsuaranceActivity106;
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
     * Gets the value of the limitInsuaranceActivity106 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitInsuaranceActivity106 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitInsuaranceActivity106().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitSubjectOfActivity106 .LimitInsuaranceActivity106 }
     * 
     * 
     */
    public List<LimitSubjectOfActivity106 .LimitInsuaranceActivity106> getLimitInsuaranceActivity106() {
        if (limitInsuaranceActivity106 == null) {
            limitInsuaranceActivity106 = new ArrayList<LimitSubjectOfActivity106 .LimitInsuaranceActivity106>();
        }
        return this.limitInsuaranceActivity106;
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
     *       &lt;attribute name="insuaranceType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="forbiddanceOfNewContracts" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="forbiddanceToExtendContracts" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="forbiddanceToWidenContracts" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="fobiddenTill" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LimitInsuaranceActivity106 {

        @XmlAttribute(name = "insuaranceType")
        protected String insuaranceType;
        @XmlAttribute(name = "forbiddanceOfNewContracts")
        protected String forbiddanceOfNewContracts;
        @XmlAttribute(name = "forbiddanceToExtendContracts")
        protected String forbiddanceToExtendContracts;
        @XmlAttribute(name = "forbiddanceToWidenContracts")
        protected String forbiddanceToWidenContracts;
        @XmlAttribute(name = "fobiddenTill")
        protected String fobiddenTill;
        @XmlAttribute(name = "RecordID", required = true)
        protected int recordID;
        @XmlAttribute(name = "GroupID", required = true)
        protected int groupID;
        @XmlAttribute(name = "RecordIncomingNumber", required = true)
        protected String recordIncomingNumber;

        /**
         * Gets the value of the insuaranceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsuaranceType() {
            return insuaranceType;
        }

        /**
         * Sets the value of the insuaranceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsuaranceType(String value) {
            this.insuaranceType = value;
        }

        /**
         * Gets the value of the forbiddanceOfNewContracts property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForbiddanceOfNewContracts() {
            return forbiddanceOfNewContracts;
        }

        /**
         * Sets the value of the forbiddanceOfNewContracts property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForbiddanceOfNewContracts(String value) {
            this.forbiddanceOfNewContracts = value;
        }

        /**
         * Gets the value of the forbiddanceToExtendContracts property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForbiddanceToExtendContracts() {
            return forbiddanceToExtendContracts;
        }

        /**
         * Sets the value of the forbiddanceToExtendContracts property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForbiddanceToExtendContracts(String value) {
            this.forbiddanceToExtendContracts = value;
        }

        /**
         * Gets the value of the forbiddanceToWidenContracts property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getForbiddanceToWidenContracts() {
            return forbiddanceToWidenContracts;
        }

        /**
         * Sets the value of the forbiddanceToWidenContracts property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setForbiddanceToWidenContracts(String value) {
            this.forbiddanceToWidenContracts = value;
        }

        /**
         * Gets the value of the fobiddenTill property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFobiddenTill() {
            return fobiddenTill;
        }

        /**
         * Sets the value of the fobiddenTill property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFobiddenTill(String value) {
            this.fobiddenTill = value;
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
