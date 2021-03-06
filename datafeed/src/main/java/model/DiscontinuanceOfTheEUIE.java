
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}FieldCommonAttributes"/>
 *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *       &lt;attribute name="StopOfLiquidation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ContinuationOfActivity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BeginOfLiquidation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StopEUIE" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "DiscontinuanceOfTheEUIE", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
public class DiscontinuanceOfTheEUIE {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "StopOfLiquidation")
    protected String stopOfLiquidation;
    @XmlAttribute(name = "ContinuationOfActivity")
    protected String continuationOfActivity;
    @XmlAttribute(name = "BeginOfLiquidation")
    protected String beginOfLiquidation;
    @XmlAttribute(name = "StopEUIE")
    protected String stopEUIE;
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
     * Gets the value of the stopOfLiquidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopOfLiquidation() {
        return stopOfLiquidation;
    }

    /**
     * Sets the value of the stopOfLiquidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopOfLiquidation(String value) {
        this.stopOfLiquidation = value;
    }

    /**
     * Gets the value of the continuationOfActivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinuationOfActivity() {
        return continuationOfActivity;
    }

    /**
     * Sets the value of the continuationOfActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinuationOfActivity(String value) {
        this.continuationOfActivity = value;
    }

    /**
     * Gets the value of the beginOfLiquidation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginOfLiquidation() {
        return beginOfLiquidation;
    }

    /**
     * Sets the value of the beginOfLiquidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginOfLiquidation(String value) {
        this.beginOfLiquidation = value;
    }

    /**
     * Gets the value of the stopEUIE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopEUIE() {
        return stopEUIE;
    }

    /**
     * Sets the value of the stopEUIE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopEUIE(String value) {
        this.stopEUIE = value;
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
