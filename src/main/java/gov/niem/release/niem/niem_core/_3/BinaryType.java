//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 01:23:32 AM EDT 
//


package gov.niem.release.niem.niem_core._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import gov.niem.release.niem.proxy.xsd._3.Base64Binary;
import gov.niem.release.niem.structures._3.ObjectType;


/**
 * A data type for a digital representation of an object encoded in a binary format.
 * 
 * <p>Java class for BinaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://release.niem.gov/niem/structures/3.0/}ObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://release.niem.gov/niem/niem-core/3.0/}BinaryObject" minOccurs="0"/>
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
@XmlType(name = "BinaryType", propOrder = {
    "binaryObject"
})
@XmlSeeAlso({
    ImageType.class
})
public class BinaryType
    extends ObjectType
{

    @XmlElementRef(name = "BinaryObject", namespace = "http://release.niem.gov/niem/niem-core/3.0/", type = JAXBElement.class, required = false)
    protected JAXBElement<?> binaryObject;

    /**
     * Gets the value of the binaryObject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Base64Binary }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<?> getBinaryObject() {
        return binaryObject;
    }

    /**
     * Sets the value of the binaryObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Base64Binary }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setBinaryObject(JAXBElement<?> value) {
        this.binaryObject = value;
    }

}