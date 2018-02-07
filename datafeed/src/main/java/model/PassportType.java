
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PassportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IssuedFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassportType", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", propOrder = {
    "number",
    "issueDate",
    "issuedFrom"
})
public class PassportType {

    @XmlElement(name = "Number", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String number;
    @XmlElement(name = "IssueDate", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String issueDate;
    @XmlElement(name = "IssuedFrom", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String issuedFrom;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the issuedFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedFrom() {
        return issuedFrom;
    }

    /**
     * Sets the value of the issuedFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedFrom(String value) {
        this.issuedFrom = value;
    }

}