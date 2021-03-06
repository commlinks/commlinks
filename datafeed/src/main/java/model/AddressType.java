
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsForeign" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DistrictID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DistrictEkatte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Municipalityid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MunicipalityEkatte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Municipality" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SettlementID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SettlementEKATTE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Settlement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AreaID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AreaEkatte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PostCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ForeignPlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HousingEstate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StreetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Block" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Entrance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Floor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Apartment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", propOrder = {
    "countryID",
    "countryCode",
    "country",
    "isForeign",
    "districtID",
    "districtEkatte",
    "district",
    "municipalityid",
    "municipalityEkatte",
    "municipality",
    "settlementID",
    "settlementEKATTE",
    "settlement",
    "areaID",
    "area",
    "areaEkatte",
    "postCode",
    "foreignPlace",
    "housingEstate",
    "street",
    "streetNumber",
    "block",
    "entrance",
    "floor",
    "apartment"
})
public class AddressType {

    @XmlElement(name = "CountryID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true, nillable = true)
    protected String countryID;
    @XmlElement(name = "CountryCode", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String countryCode;
    @XmlElement(name = "Country", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String country;
    @XmlElement(name = "IsForeign", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String isForeign;
    @XmlElement(name = "DistrictID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true, nillable = true)
    protected String districtID;
    @XmlElement(name = "DistrictEkatte", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String districtEkatte;
    @XmlElement(name = "District", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String district;
    @XmlElement(name = "Municipalityid", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true, nillable = true)
    protected String municipalityid;
    @XmlElement(name = "MunicipalityEkatte", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String municipalityEkatte;
    @XmlElement(name = "Municipality", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String municipality;
    @XmlElement(name = "SettlementID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true, nillable = true)
    protected String settlementID;
    @XmlElement(name = "SettlementEKATTE", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String settlementEKATTE;
    @XmlElement(name = "Settlement", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String settlement;
    @XmlElement(name = "AreaID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true, nillable = true)
    protected String areaID;
    @XmlElement(name = "Area", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String area;
    @XmlElement(name = "AreaEkatte", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String areaEkatte;
    @XmlElement(name = "PostCode", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String postCode;
    @XmlElement(name = "ForeignPlace", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String foreignPlace;
    @XmlElement(name = "HousingEstate", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String housingEstate;
    @XmlElement(name = "Street", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String street;
    @XmlElement(name = "StreetNumber", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String streetNumber;
    @XmlElement(name = "Block", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String block;
    @XmlElement(name = "Entrance", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String entrance;
    @XmlElement(name = "Floor", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String floor;
    @XmlElement(name = "Apartment", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String apartment;

    /**
     * Gets the value of the countryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryID(String value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the isForeign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsForeign() {
        return isForeign;
    }

    /**
     * Sets the value of the isForeign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsForeign(String value) {
        this.isForeign = value;
    }

    /**
     * Gets the value of the districtID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictID() {
        return districtID;
    }

    /**
     * Sets the value of the districtID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictID(String value) {
        this.districtID = value;
    }

    /**
     * Gets the value of the districtEkatte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictEkatte() {
        return districtEkatte;
    }

    /**
     * Sets the value of the districtEkatte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictEkatte(String value) {
        this.districtEkatte = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the municipalityid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityid() {
        return municipalityid;
    }

    /**
     * Sets the value of the municipalityid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityid(String value) {
        this.municipalityid = value;
    }

    /**
     * Gets the value of the municipalityEkatte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityEkatte() {
        return municipalityEkatte;
    }

    /**
     * Sets the value of the municipalityEkatte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityEkatte(String value) {
        this.municipalityEkatte = value;
    }

    /**
     * Gets the value of the municipality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * Sets the value of the municipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipality(String value) {
        this.municipality = value;
    }

    /**
     * Gets the value of the settlementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementID() {
        return settlementID;
    }

    /**
     * Sets the value of the settlementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementID(String value) {
        this.settlementID = value;
    }

    /**
     * Gets the value of the settlementEKATTE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementEKATTE() {
        return settlementEKATTE;
    }

    /**
     * Sets the value of the settlementEKATTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementEKATTE(String value) {
        this.settlementEKATTE = value;
    }

    /**
     * Gets the value of the settlement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlement() {
        return settlement;
    }

    /**
     * Sets the value of the settlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlement(String value) {
        this.settlement = value;
    }

    /**
     * Gets the value of the areaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaID() {
        return areaID;
    }

    /**
     * Sets the value of the areaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaID(String value) {
        this.areaID = value;
    }

    /**
     * Gets the value of the area property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the areaEkatte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaEkatte() {
        return areaEkatte;
    }

    /**
     * Sets the value of the areaEkatte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaEkatte(String value) {
        this.areaEkatte = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the foreignPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignPlace() {
        return foreignPlace;
    }

    /**
     * Sets the value of the foreignPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignPlace(String value) {
        this.foreignPlace = value;
    }

    /**
     * Gets the value of the housingEstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousingEstate() {
        return housingEstate;
    }

    /**
     * Sets the value of the housingEstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousingEstate(String value) {
        this.housingEstate = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the streetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the value of the streetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNumber(String value) {
        this.streetNumber = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlock(String value) {
        this.block = value;
    }

    /**
     * Gets the value of the entrance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrance() {
        return entrance;
    }

    /**
     * Sets the value of the entrance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrance(String value) {
        this.entrance = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
    }

    /**
     * Gets the value of the apartment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartment(String value) {
        this.apartment = value;
    }

    @Override
    public String toString() {
        return "AddressType{" +
                "countryCode='" + countryCode + '\'' +
                ", country='" + country + '\'' +
                ", district='" + district + '\'' +
                ", municipalityid='" + municipalityid + '\'' +
                ", settlement='" + settlement + '\'' +
                ", area='" + area + '\'' +
                ", postCode='" + postCode + '\'' +
                ", foreignPlace='" + foreignPlace + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", block='" + block + '\'' +
                ", entrance='" + entrance + '\'' +
                ", floor='" + floor + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
