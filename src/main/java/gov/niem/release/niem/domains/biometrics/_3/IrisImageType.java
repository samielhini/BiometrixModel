//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 01:23:32 AM EDT 
//


package gov.niem.release.niem.domains.biometrics._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for a Type-17 iris image record
 * 
 * <p>Java class for IrisImageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IrisImageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://release.niem.gov/niem/domains/biometrics/3.0/}ImageType">
 *       &lt;sequence>
 *         &lt;element ref="{http://release.niem.gov/niem/domains/biometrics/3.0/}IrisEyePositionCode" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/domains/biometrics/3.0/}IrisMissingCode" minOccurs="0"/>
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
@XmlType(name = "IrisImageType", propOrder = {
    "irisEyePositionCode",
    "irisMissingCode"
})
public class IrisImageType
    extends ImageType
{

    @XmlElement(name = "IrisEyePositionCode", nillable = true)
    protected EyePositionCodeType irisEyePositionCode;
    @XmlElement(name = "IrisMissingCode", nillable = true)
    protected IrisMissingCodeType irisMissingCode;

    /**
     * Gets the value of the irisEyePositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link EyePositionCodeType }
     *     
     */
    public EyePositionCodeType getIrisEyePositionCode() {
        return irisEyePositionCode;
    }

    /**
     * Sets the value of the irisEyePositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EyePositionCodeType }
     *     
     */
    public void setIrisEyePositionCode(EyePositionCodeType value) {
        this.irisEyePositionCode = value;
    }

    /**
     * Gets the value of the irisMissingCode property.
     * 
     * @return
     *     possible object is
     *     {@link IrisMissingCodeType }
     *     
     */
    public IrisMissingCodeType getIrisMissingCode() {
        return irisMissingCode;
    }

    /**
     * Sets the value of the irisMissingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IrisMissingCodeType }
     *     
     */
    public void setIrisMissingCode(IrisMissingCodeType value) {
        this.irisMissingCode = value;
    }

}