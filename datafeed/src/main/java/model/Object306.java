
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}FieldCommonAttributes"/>
 *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *       &lt;attribute name="ForGivingAmount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ForGive" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ForDoingActivity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ForNotDoingActivity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Object306", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
public class Object306 {

    @XmlAttribute(name = "ForGivingAmount")
    protected String forGivingAmount;
    @XmlAttribute(name = "ForGive")
    protected String forGive;
    @XmlAttribute(name = "ForDoingActivity")
    protected String forDoingActivity;
    @XmlAttribute(name = "ForNotDoingActivity")
    protected String forNotDoingActivity;
    @XmlAttribute(name = "FieldIdent", required = true)
    protected String fieldIdent;
    @XmlAttribute(name = "FieldOperation", required = true)
    protected FieldOperation fieldOperation;
    @XmlAttribute(name = "FieldEntryNumber", required = true)
    protected String fieldEntryNumber;
    @XmlAttribute(name = "FieldActionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fieldActionDate;
    @XmlAttribute(name = "RecordID", required = true)
    protected int recordID;
    @XmlAttribute(name = "GroupID", required = true)
    protected int groupID;
    @XmlAttribute(name = "RecordIncomingNumber", required = true)
    protected String recordIncomingNumber;

    /**
     * Gets the value of the forGivingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForGivingAmount() {
        return forGivingAmount;
    }

    /**
     * Sets the value of the forGivingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForGivingAmount(String value) {
        this.forGivingAmount = value;
    }

    /**
     * Gets the value of the forGive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForGive() {
        return forGive;
    }

    /**
     * Sets the value of the forGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForGive(String value) {
        this.forGive = value;
    }

    /**
     * Gets the value of the forDoingActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForDoingActivity() {
        return forDoingActivity;
    }

    /**
     * Sets the value of the forDoingActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForDoingActivity(String value) {
        this.forDoingActivity = value;
    }

    /**
     * Gets the value of the forNotDoingActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForNotDoingActivity() {
        return forNotDoingActivity;
    }

    /**
     * Sets the value of the forNotDoingActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForNotDoingActivity(String value) {
        this.forNotDoingActivity = value;
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
