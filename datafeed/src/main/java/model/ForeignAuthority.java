
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignAuthority complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignAuthority">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompetentAuthorityForRegistration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignAuthority", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", propOrder = {
    "competentAuthorityForRegistration",
    "registrationNumber"
})
@XmlSeeAlso({
    ForeignCompanyBaseData.class
})
public class ForeignAuthority {

    @XmlElement(name = "CompetentAuthorityForRegistration", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String competentAuthorityForRegistration;
    @XmlElement(name = "RegistrationNumber", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String registrationNumber;

    /**
     * Gets the value of the competentAuthorityForRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetentAuthorityForRegistration() {
        return competentAuthorityForRegistration;
    }

    /**
     * Sets the value of the competentAuthorityForRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetentAuthorityForRegistration(String value) {
        this.competentAuthorityForRegistration = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

}
