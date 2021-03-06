
package model;

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
 *         &lt;element name="CompanyControl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BulstatDeed">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Deed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CourtCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}FieldCommonAttributes"/>
 *       &lt;attribute name="uic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsNew" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "companyControl",
    "bulstatDeed"
})
@XmlRootElement(name = "UIC", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
public class UIC {

    @XmlElement(name = "CompanyControl", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String companyControl;
    @XmlElement(name = "BulstatDeed", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected UIC.BulstatDeed bulstatDeed;
    @XmlAttribute(name = "uic")
    protected String uic;
    @XmlAttribute(name = "IsNew")
    protected String isNew;
    @XmlAttribute(name = "RecordID", required = true)
    protected int recordID;
    @XmlAttribute(name = "GroupID", required = true)
    protected int groupID;
    @XmlAttribute(name = "RecordIncomingNumber", required = true)
    protected String recordIncomingNumber;
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
     * Gets the value of the companyControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyControl() {
        return companyControl;
    }

    /**
     * Sets the value of the companyControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyControl(String value) {
        this.companyControl = value;
    }

    /**
     * Gets the value of the bulstatDeed property.
     * 
     * @return
     *     possible object is
     *     {@link UIC.BulstatDeed }
     *     
     */
    public UIC.BulstatDeed getBulstatDeed() {
        return bulstatDeed;
    }

    /**
     * Sets the value of the bulstatDeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link UIC.BulstatDeed }
     *     
     */
    public void setBulstatDeed(UIC.BulstatDeed value) {
        this.bulstatDeed = value;
    }

    /**
     * Gets the value of the uic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUic() {
        return uic;
    }

    /**
     * Sets the value of the uic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUic(String value) {
        this.uic = value;
    }

    /**
     * Gets the value of the isNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNew() {
        return isNew;
    }

    /**
     * Sets the value of the isNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNew(String value) {
        this.isNew = value;
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
     *         &lt;element name="Deed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CourtCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "deed",
        "year",
        "courtCode"
    })
    public static class BulstatDeed {

        @XmlElement(name = "Deed", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected String deed;
        @XmlElement(name = "Year", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected String year;
        @XmlElement(name = "CourtCode", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
        protected String courtCode;

        /**
         * Gets the value of the deed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeed() {
            return deed;
        }

        /**
         * Sets the value of the deed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeed(String value) {
            this.deed = value;
        }

        /**
         * Gets the value of the year property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYear(String value) {
            this.year = value;
        }

        /**
         * Gets the value of the courtCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCourtCode() {
            return courtCode;
        }

        /**
         * Sets the value of the courtCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCourtCode(String value) {
            this.courtCode = value;
        }

    }

}
