
package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncomingPackageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncomingPackageInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Documents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Document" type="{http://www.registryagency.bg/schemas/deedv2}DocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="IncomingNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IncomingGuid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PackageType" use="required" type="{http://www.registryagency.bg/schemas/deedv2}PackageType" />
 *       &lt;attribute name="LeadingApp" use="required" type="{http://www.registryagency.bg/schemas/deedv2}AppEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomingPackageInfoType", namespace = "http://www.registryagency.bg/schemas/deedv2", propOrder = {
    "documents"
})
public class IncomingPackageInfoType {

    @XmlElement(name = "Documents", namespace = "http://www.registryagency.bg/schemas/deedv2")
    protected IncomingPackageInfoType.Documents documents;
    @XmlAttribute(name = "IncomingNumber", required = true)
    protected String incomingNumber;
    @XmlAttribute(name = "IncomingGuid", required = true)
    protected String incomingGuid;
    @XmlAttribute(name = "PackageType", required = true)
    protected PackageType packageType;
    @XmlAttribute(name = "LeadingApp", required = true)
    protected AppEnum leadingApp;

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link IncomingPackageInfoType.Documents }
     *     
     */
    public IncomingPackageInfoType.Documents getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomingPackageInfoType.Documents }
     *     
     */
    public void setDocuments(IncomingPackageInfoType.Documents value) {
        this.documents = value;
    }

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
     * Gets the value of the incomingGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingGuid() {
        return incomingGuid;
    }

    /**
     * Sets the value of the incomingGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingGuid(String value) {
        this.incomingGuid = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackageType(PackageType value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the leadingApp property.
     * 
     * @return
     *     possible object is
     *     {@link AppEnum }
     *     
     */
    public AppEnum getLeadingApp() {
        return leadingApp;
    }

    /**
     * Sets the value of the leadingApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppEnum }
     *     
     */
    public void setLeadingApp(AppEnum value) {
        this.leadingApp = value;
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
     *         &lt;element name="Document" type="{http://www.registryagency.bg/schemas/deedv2}DocumentType" maxOccurs="unbounded" minOccurs="0"/>
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
        "document"
    })
    public static class Documents {

        @XmlElement(name = "Document", namespace = "http://www.registryagency.bg/schemas/deedv2")
        protected List<DocumentType> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentType }
         * 
         * 
         */
        public List<DocumentType> getDocument() {
            if (document == null) {
                document = new ArrayList<DocumentType>();
            }
            return this.document;
        }

    }

}
