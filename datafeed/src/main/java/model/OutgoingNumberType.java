
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutgoingNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutgoingNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncomingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OutgoingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutgoingNumberType", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", propOrder = {
    "incomingNumber",
    "outgoingDate",
    "docNumber"
})
public class OutgoingNumberType {

    @XmlElement(name = "IncomingNumber", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String incomingNumber;
    @XmlElement(name = "OutgoingDate", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outgoingDate;
    @XmlElement(name = "DocNumber", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true, type = Integer.class, nillable = true)
    protected Integer docNumber;

    /**
     * Gets the value of the incomingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingNumber() {
        return incomingNumber;
    }

    /**
     * Sets the value of the incomingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingNumber(String value) {
        this.incomingNumber = value;
    }

    /**
     * Gets the value of the outgoingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutgoingDate() {
        return outgoingDate;
    }

    /**
     * Sets the value of the outgoingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutgoingDate(XMLGregorianCalendar value) {
        this.outgoingDate = value;
    }

    /**
     * Gets the value of the docNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDocNumber() {
        return docNumber;
    }

    /**
     * Sets the value of the docNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDocNumber(Integer value) {
        this.docNumber = value;
    }

}
