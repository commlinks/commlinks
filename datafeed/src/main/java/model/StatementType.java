
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.registryagency.bg/schemas/deedv2/Fields}RecordCommonAttributes"/>
 *       &lt;attribute name="ActModeText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ActModeValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ActID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ActDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ActYear" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ActWithErasedPersonalData" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementType", namespace = "http://www.registryagency.bg/schemas/deedv2/Fields")
@XmlSeeAlso({
    model.StatementsX.StatementX.class,
    model.StatementsY.StatementY.class,
    model.StatementsZ.StatementZ.class,
    model.StatementsT.StatementT.class,
    model.StatementsU.StatementU.class,
    model.StatementsV.StatementV.class,
    model.StatementsW.StatementW.class,
    model.StatementsP.StatementP.class,
    model.StatementsQ.StatementQ.class,
    model.StatementsR.StatementR.class,
    model.StatementsS.StatementS.class,
    model.StatementsL.StatementL.class,
    model.StatementsM.StatementM.class,
    model.StatementsN.StatementN.class,
    model.StatementsO.StatementO.class,
    model.StatementsH.StatementH.class,
    model.StatementsI.StatementI.class,
    model.StatementsJ.StatementJ.class,
    model.StatementsK.StatementK.class,
    model.StatementsD.StatementD.class,
    model.StatementsE.StatementE.class,
    model.StatementsF.StatementF.class,
    model.StatementsG.StatementG.class,
    model.StatementsA.StatementA.class,
    model.StatementsB.StatementB.class,
    model.StatementsC.StatementC.class,
    model.StatementsAH.StatementAH.class,
    model.StatementsAG.StatementAG.class,
    model.StatementsAF.StatementAF.class,
    model.StatementsAE.StatementAE.class,
    model.StatementsAL.StatementAL.class,
    model.StatementsAK.StatementAK.class,
    model.StatementsAJ.StatementAJ.class,
    model.StatementsAI.StatementAI.class,
    model.StatementsAD.StatementAD.class,
    model.StatementsAC.StatementAC.class,
    model.StatementsAB.StatementAB.class,
    model.StatementsAA.StatementAA.class,
    model.StatementsAM.StatementAM.class
})
public class StatementType {

    @XmlAttribute(name = "ActModeText")
    protected String actModeText;
    @XmlAttribute(name = "ActModeValue")
    protected String actModeValue;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "ActID")
    protected String actID;
    @XmlAttribute(name = "ActDate")
    protected String actDate;
    @XmlAttribute(name = "ActYear")
    protected String actYear;
    @XmlAttribute(name = "ActWithErasedPersonalData")
    protected String actWithErasedPersonalData;
    @XmlAttribute(name = "RecordID", required = true)
    protected int recordID;
    @XmlAttribute(name = "GroupID", required = true)
    protected int groupID;
    @XmlAttribute(name = "RecordIncomingNumber", required = true)
    protected String recordIncomingNumber;

    /**
     * Gets the value of the actModeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActModeText() {
        return actModeText;
    }

    /**
     * Sets the value of the actModeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActModeText(String value) {
        this.actModeText = value;
    }

    /**
     * Gets the value of the actModeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActModeValue() {
        return actModeValue;
    }

    /**
     * Sets the value of the actModeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActModeValue(String value) {
        this.actModeValue = value;
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

    /**
     * Gets the value of the actID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActID() {
        return actID;
    }

    /**
     * Sets the value of the actID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActID(String value) {
        this.actID = value;
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
     * Gets the value of the actYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActYear() {
        return actYear;
    }

    /**
     * Sets the value of the actYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActYear(String value) {
        this.actYear = value;
    }

    /**
     * Gets the value of the actWithErasedPersonalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActWithErasedPersonalData() {
        return actWithErasedPersonalData;
    }

    /**
     * Sets the value of the actWithErasedPersonalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActWithErasedPersonalData(String value) {
        this.actWithErasedPersonalData = value;
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
