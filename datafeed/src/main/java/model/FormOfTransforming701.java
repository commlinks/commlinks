
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
 *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}FieldCommonAttributes"/>
 *       &lt;attribute name="Influx" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Fusion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Division" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Separation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChangeLegalForm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TransferringProperty" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ConversionOfBulgarianEuropeanCompanyIntoBulgarianPLC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ConversionOfBulgarianPLCIntoBulgarianEuropeanCompany" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "FormOfTransforming701", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
public class FormOfTransforming701 {

    @XmlAttribute(name = "Influx")
    protected String influx;
    @XmlAttribute(name = "Fusion")
    protected String fusion;
    @XmlAttribute(name = "Division")
    protected String division;
    @XmlAttribute(name = "Separation")
    protected String separation;
    @XmlAttribute(name = "ChangeLegalForm")
    protected String changeLegalForm;
    @XmlAttribute(name = "TransferringProperty")
    protected String transferringProperty;
    @XmlAttribute(name = "ConversionOfBulgarianEuropeanCompanyIntoBulgarianPLC")
    protected String conversionOfBulgarianEuropeanCompanyIntoBulgarianPLC;
    @XmlAttribute(name = "ConversionOfBulgarianPLCIntoBulgarianEuropeanCompany")
    protected String conversionOfBulgarianPLCIntoBulgarianEuropeanCompany;
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
     * Gets the value of the influx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInflux() {
        return influx;
    }

    /**
     * Sets the value of the influx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInflux(String value) {
        this.influx = value;
    }

    /**
     * Gets the value of the fusion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFusion() {
        return fusion;
    }

    /**
     * Sets the value of the fusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFusion(String value) {
        this.fusion = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the separation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparation() {
        return separation;
    }

    /**
     * Sets the value of the separation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparation(String value) {
        this.separation = value;
    }

    /**
     * Gets the value of the changeLegalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeLegalForm() {
        return changeLegalForm;
    }

    /**
     * Sets the value of the changeLegalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeLegalForm(String value) {
        this.changeLegalForm = value;
    }

    /**
     * Gets the value of the transferringProperty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferringProperty() {
        return transferringProperty;
    }

    /**
     * Sets the value of the transferringProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferringProperty(String value) {
        this.transferringProperty = value;
    }

    /**
     * Gets the value of the conversionOfBulgarianEuropeanCompanyIntoBulgarianPLC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionOfBulgarianEuropeanCompanyIntoBulgarianPLC() {
        return conversionOfBulgarianEuropeanCompanyIntoBulgarianPLC;
    }

    /**
     * Sets the value of the conversionOfBulgarianEuropeanCompanyIntoBulgarianPLC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionOfBulgarianEuropeanCompanyIntoBulgarianPLC(String value) {
        this.conversionOfBulgarianEuropeanCompanyIntoBulgarianPLC = value;
    }

    /**
     * Gets the value of the conversionOfBulgarianPLCIntoBulgarianEuropeanCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionOfBulgarianPLCIntoBulgarianEuropeanCompany() {
        return conversionOfBulgarianPLCIntoBulgarianEuropeanCompany;
    }

    /**
     * Sets the value of the conversionOfBulgarianPLCIntoBulgarianEuropeanCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionOfBulgarianPLCIntoBulgarianEuropeanCompany(String value) {
        this.conversionOfBulgarianPLCIntoBulgarianEuropeanCompany = value;
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

}
