
package model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncomingPackageInfo" type="{http://www.registryagency.bg/schemas/deedv2}IncomingPackageInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubDeed" type="{http://www.registryagency.bg/schemas/deedv2}SubDeedType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DeedStatus" use="required" type="{http://www.registryagency.bg/schemas/deedv2}DeedStatusType" />
 *       &lt;attribute name="CompanyName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GUID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UIC" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LegalForm" use="required" type="{http://www.registryagency.bg/schemas/deedv2}LegalFormType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeedType", namespace = "http://www.registryagency.bg/schemas/deedv2", propOrder = {
    "incomingPackageInfo",
    "subDeed"
})
public class DeedType {

    @XmlElement(name = "IncomingPackageInfo", namespace = "http://www.registryagency.bg/schemas/deedv2")
    protected List<IncomingPackageInfoType> incomingPackageInfo;
    @XmlElement(name = "SubDeed", namespace = "http://www.registryagency.bg/schemas/deedv2")
    protected List<SubDeedType> subDeed;
    @XmlAttribute(name = "DeedStatus", required = true)
    protected DeedStatusType deedStatus;
    @XmlAttribute(name = "CompanyName", required = true)
    protected String companyName;
    @XmlAttribute(name = "GUID", required = true)
    protected String guid;
    @XmlAttribute(name = "UIC", required = true)
    protected String uic;
    @XmlAttribute(name = "LegalForm", required = true)
    protected String legalForm;

    /**
     * Gets the value of the incomingPackageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomingPackageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomingPackageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncomingPackageInfoType }
     * 
     * 
     */
    public List<IncomingPackageInfoType> getIncomingPackageInfo() {
        if (incomingPackageInfo == null) {
            incomingPackageInfo = new ArrayList<IncomingPackageInfoType>();
        }
        return this.incomingPackageInfo;
    }

    /**
     * Gets the value of the subDeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subDeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubDeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubDeedType }
     * 
     * 
     */
    public List<SubDeedType> getSubDeed() {
        if (subDeed == null) {
            subDeed = new ArrayList<SubDeedType>();
        }
        return this.subDeed;
    }

    /**
     * Gets the value of the deedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DeedStatusType }
     *     
     */
    public DeedStatusType getDeedStatus() {
        return deedStatus;
    }

    /**
     * Sets the value of the deedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeedStatusType }
     *     
     */
    public void setDeedStatus(DeedStatusType value) {
        this.deedStatus = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the uic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIC() {
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
    public void setUIC(String value) {
        this.uic = value;
    }

    /**
     * Gets the value of the legalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalForm() {
        return legalForm;
    }

    /**
     * Sets the value of the legalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalForm(String value) {
        this.legalForm = value;
    }

}
