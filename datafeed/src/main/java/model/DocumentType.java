
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="DocGuid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DocumentURL" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ApplicationType" use="required" type="{http://www.registryagency.bg/schemas/deedv2}AppEnum" />
 *       &lt;attribute name="Description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", namespace = "http://www.registryagency.bg/schemas/deedv2", propOrder = {
    "value"
})
public class DocumentType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "DocGuid", required = true)
    protected String docGuid;
    @XmlAttribute(name = "DocumentURL", required = true)
    protected String documentURL;
    @XmlAttribute(name = "ApplicationType", required = true)
    protected AppEnum applicationType;
    @XmlAttribute(name = "Description", required = true)
    protected String description;

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
     * Gets the value of the docGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocGuid() {
        return docGuid;
    }

    /**
     * Sets the value of the docGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocGuid(String value) {
        this.docGuid = value;
    }

    /**
     * Gets the value of the documentURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentURL() {
        return documentURL;
    }

    /**
     * Sets the value of the documentURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentURL(String value) {
        this.documentURL = value;
    }

    /**
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link AppEnum }
     *     
     */
    public AppEnum getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEnum }
     *     
     */
    public void setApplicationType(AppEnum value) {
        this.applicationType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
