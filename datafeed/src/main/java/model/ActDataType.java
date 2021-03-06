
package model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ActSeqID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CourtSeqID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CaseSeqID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CaseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CaseYear" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ActNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BankruptcyCourt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Merit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FieldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Execution" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ImmediateExecution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProclaimMetod" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ComplaintTerm" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActDataType", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", propOrder = {

})
public class ActDataType {

    @XmlElement(name = "ActSeqID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String actSeqID;
    @XmlElement(name = "CourtSeqID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String courtSeqID;
    @XmlElement(name = "CaseSeqID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String caseSeqID;
    @XmlElement(name = "CaseNumber", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String caseNumber;
    @XmlElement(name = "CaseYear", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String caseYear;
    @XmlElement(name = "ActDate", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String actDate;
    @XmlElement(name = "ActNumber", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", required = true)
    protected String actNumber;
    @XmlElement(name = "Type", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected ActDataType.Type type;
    @XmlElement(name = "BankruptcyCourt", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected ActDataType.BankruptcyCourt bankruptcyCourt;
    @XmlElement(name = "Merit", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected ActDataType.Merit merit;
    @XmlElement(name = "Execution", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected ActDataType.Execution execution;
    @XmlElement(name = "ProclaimMetod", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
    protected ActDataType.ProclaimMetod proclaimMetod;
    @XmlElementRef(name = "ComplaintTerm", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> complaintTerm;

    /**
     * Gets the value of the actSeqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActSeqID() {
        return actSeqID;
    }

    /**
     * Sets the value of the actSeqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActSeqID(String value) {
        this.actSeqID = value;
    }

    /**
     * Gets the value of the courtSeqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtSeqID() {
        return courtSeqID;
    }

    /**
     * Sets the value of the courtSeqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtSeqID(String value) {
        this.courtSeqID = value;
    }

    /**
     * Gets the value of the caseSeqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseSeqID() {
        return caseSeqID;
    }

    /**
     * Sets the value of the caseSeqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseSeqID(String value) {
        this.caseSeqID = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNumber(String value) {
        this.caseNumber = value;
    }

    /**
     * Gets the value of the caseYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseYear() {
        return caseYear;
    }

    /**
     * Sets the value of the caseYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseYear(String value) {
        this.caseYear = value;
    }

    /**
     * Gets the value of the actDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActDate() {
        return actDate;
    }

    /**
     * Sets the value of the actDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActDate(String value) {
        this.actDate = value;
    }

    /**
     * Gets the value of the actNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActNumber() {
        return actNumber;
    }

    /**
     * Sets the value of the actNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActNumber(String value) {
        this.actNumber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ActDataType.Type }
     *     
     */
    public ActDataType.Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActDataType.Type }
     *     
     */
    public void setType(ActDataType.Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the bankruptcyCourt property.
     * 
     * @return
     *     possible object is
     *     {@link ActDataType.BankruptcyCourt }
     *     
     */
    public ActDataType.BankruptcyCourt getBankruptcyCourt() {
        return bankruptcyCourt;
    }

    /**
     * Sets the value of the bankruptcyCourt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActDataType.BankruptcyCourt }
     *     
     */
    public void setBankruptcyCourt(ActDataType.BankruptcyCourt value) {
        this.bankruptcyCourt = value;
    }

    /**
     * Gets the value of the merit property.
     * 
     * @return
     *     possible object is
     *     {@link ActDataType.Merit }
     *     
     */
    public ActDataType.Merit getMerit() {
        return merit;
    }

    /**
     * Sets the value of the merit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActDataType.Merit }
     *     
     */
    public void setMerit(ActDataType.Merit value) {
        this.merit = value;
    }

    /**
     * Gets the value of the execution property.
     * 
     * @return
     *     possible object is
     *     {@link ActDataType.Execution }
     *     
     */
    public ActDataType.Execution getExecution() {
        return execution;
    }

    /**
     * Sets the value of the execution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActDataType.Execution }
     *     
     */
    public void setExecution(ActDataType.Execution value) {
        this.execution = value;
    }

    /**
     * Gets the value of the proclaimMetod property.
     * 
     * @return
     *     possible object is
     *     {@link ActDataType.ProclaimMetod }
     *     
     */
    public ActDataType.ProclaimMetod getProclaimMetod() {
        return proclaimMetod;
    }

    /**
     * Sets the value of the proclaimMetod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActDataType.ProclaimMetod }
     *     
     */
    public void setProclaimMetod(ActDataType.ProclaimMetod value) {
        this.proclaimMetod = value;
    }

    /**
     * Gets the value of the complaintTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getComplaintTerm() {
        return complaintTerm;
    }

    /**
     * Sets the value of the complaintTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setComplaintTerm(JAXBElement<Object> value) {
        this.complaintTerm = value;
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
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "code",
        "name"
    })
    public static class BankruptcyCourt {

        @XmlElement(name = "Code", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String code;
        @XmlElement(name = "Name", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String name;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

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
     *         &lt;element name="ImmediateExecution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "immediateExecution",
        "effectiveDate"
    })
    public static class Execution {

        @XmlElement(name = "ImmediateExecution", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String immediateExecution;
        @XmlElementRef(name = "EffectiveDate", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", type = JAXBElement.class, required = false)
        protected JAXBElement<String> effectiveDate;

        /**
         * Gets the value of the immediateExecution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImmediateExecution() {
            return immediateExecution;
        }

        /**
         * Sets the value of the immediateExecution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImmediateExecution(String value) {
            this.immediateExecution = value;
        }

        /**
         * Gets the value of the effectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * Sets the value of the effectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setEffectiveDate(JAXBElement<String> value) {
            this.effectiveDate = value;
        }

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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FieldID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "id",
        "fieldID"
    })
    public static class Merit {

        @XmlElement(name = "ID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String id;
        @XmlElementRef(name = "FieldID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields", type = JAXBElement.class, required = false)
        protected JAXBElement<String> fieldID;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the fieldID property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getFieldID() {
            return fieldID;
        }

        /**
         * Sets the value of the fieldID property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setFieldID(JAXBElement<String> value) {
            this.fieldID = value;
        }

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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "id",
        "name"
    })
    public static class ProclaimMetod {

        @XmlElement(name = "ID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String id;
        @XmlElement(name = "Name", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String name;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "id",
        "name"
    })
    public static class Type {

        @XmlElement(name = "ID", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String id;
        @XmlElement(name = "Name", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
        protected String name;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
