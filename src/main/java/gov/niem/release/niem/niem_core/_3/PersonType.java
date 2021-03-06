//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 01:23:32 AM EDT 
//


package gov.niem.release.niem.niem_core._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import gov.niem.release.niem.codes.iso_3166_1._3.CountryAlpha2CodeType;
import gov.niem.release.niem.structures._3.ObjectType;


/**
 * A data type for a human being.
 * 
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://release.niem.gov/niem/structures/3.0/}ObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/3.0/}PersonBirthDate" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/3.0/}PersonCitizenship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/3.0/}PersonEyeColor" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/3.0/}PersonHairColor" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/3.0/}PersonHeightMeasure" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/3.0/}PersonName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/3.0/}PersonSex" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/3.0/}PersonSSNIdentification" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/3.0/}PersonWeightMeasure" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='urn:us:gov:ic:ntk urn:us:gov:ic:ism'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PersonType", propOrder = {
    "personBirthDate",
    "personCitizenship",
    "personEyeColor",
    "personHairColor",
    "personHeightMeasure",
    "personName",
    "personSex",
    "personSSNIdentification",
    "personWeightMeasure"
})
public class PersonType
    extends ObjectType
{

    @XmlElement(name = "PersonBirthDate", nillable = true)
    protected DateType personBirthDate;
    @XmlElementRef(name = "PersonCitizenship", namespace = "http://release.niem.gov/niem/niem-core/3.0/", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> personCitizenship;
    @XmlElement(name = "PersonEyeColor")
    protected Object personEyeColor;
    @XmlElement(name = "PersonHairColor")
    protected Object personHairColor;
    @XmlElement(name = "PersonHeightMeasure", nillable = true)
    protected MeasureType personHeightMeasure;
    @XmlElement(name = "PersonName", nillable = true)
    protected List<PersonNameType> personName;
    @XmlElement(name = "PersonSex")
    protected Object personSex;
    @XmlElement(name = "PersonSSNIdentification", nillable = true)
    protected IdentificationType personSSNIdentification;
    @XmlElement(name = "PersonWeightMeasure", nillable = true)
    protected MeasureType personWeightMeasure;

    /**
     * Gets the value of the personBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getPersonBirthDate() {
        return personBirthDate;
    }

    /**
     * Sets the value of the personBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setPersonBirthDate(DateType value) {
        this.personBirthDate = value;
    }

    /**
     * Gets the value of the personCitizenship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personCitizenship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonCitizenship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CountryAlpha2CodeType }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPersonCitizenship() {
        if (personCitizenship == null) {
            personCitizenship = new ArrayList<JAXBElement<?>>();
        }
        return this.personCitizenship;
    }

    /**
     * Gets the value of the personEyeColor property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPersonEyeColor() {
        return personEyeColor;
    }

    /**
     * Sets the value of the personEyeColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPersonEyeColor(Object value) {
        this.personEyeColor = value;
    }

    /**
     * Gets the value of the personHairColor property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPersonHairColor() {
        return personHairColor;
    }

    /**
     * Sets the value of the personHairColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPersonHairColor(Object value) {
        this.personHairColor = value;
    }

    /**
     * Gets the value of the personHeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPersonHeightMeasure() {
        return personHeightMeasure;
    }

    /**
     * Sets the value of the personHeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPersonHeightMeasure(MeasureType value) {
        this.personHeightMeasure = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameType }
     * 
     * 
     */
    public List<PersonNameType> getPersonName() {
        if (personName == null) {
            personName = new ArrayList<PersonNameType>();
        }
        return this.personName;
    }

    /**
     * Gets the value of the personSex property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPersonSex() {
        return personSex;
    }

    /**
     * Sets the value of the personSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPersonSex(Object value) {
        this.personSex = value;
    }

    /**
     * Gets the value of the personSSNIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getPersonSSNIdentification() {
        return personSSNIdentification;
    }

    /**
     * Sets the value of the personSSNIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setPersonSSNIdentification(IdentificationType value) {
        this.personSSNIdentification = value;
    }

    /**
     * Gets the value of the personWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPersonWeightMeasure() {
        return personWeightMeasure;
    }

    /**
     * Sets the value of the personWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPersonWeightMeasure(MeasureType value) {
        this.personWeightMeasure = value;
    }

}
