//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 01:23:32 AM EDT 
//


package com.creatrixinc.biometrix.xsd.biometrix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiometrixRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiometrixRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClientId" type="{http://www.creatrixinc.com/biometrix/xsd/biometrix}IdentificationType"/>
 *         &lt;element name="RequestId" type="{http://www.creatrixinc.com/biometrix/xsd/biometrix}IdentificationType"/>
 *         &lt;element name="CommandId" type="{http://www.creatrixinc.com/biometrix/xsd/biometrix}IdentificationType" minOccurs="0"/>
 *         &lt;element name="CommandType" type="{http://www.creatrixinc.com/biometrix/xsd/biometrix}CommandTypes"/>
 *         &lt;element ref="{http://www.creatrixinc.com/biometrix/xsd/biometrix}Person"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BiometrixRequestType", propOrder = {
    "clientId",
    "requestId",
    "commandId",
    "commandType",
    "person"
})
public class BiometrixRequestType {

    @XmlElement(name = "ClientId", required = true)
    protected IdentificationType clientId;
    @XmlElement(name = "RequestId", required = true)
    protected IdentificationType requestId;
    @XmlElement(name = "CommandId")
    protected IdentificationType commandId;
    @XmlElement(name = "CommandType", required = true)
    @XmlSchemaType(name = "string")
    protected CommandTypes commandType;
    @XmlElement(name = "Person", required = true)
    protected Person person;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setClientId(IdentificationType value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setRequestId(IdentificationType value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the commandId property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType }
     *     
     */
    public IdentificationType getCommandId() {
        return commandId;
    }

    /**
     * Sets the value of the commandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType }
     *     
     */
    public void setCommandId(IdentificationType value) {
        this.commandId = value;
    }

    /**
     * Gets the value of the commandType property.
     * 
     * @return
     *     possible object is
     *     {@link CommandTypes }
     *     
     */
    public CommandTypes getCommandType() {
        return commandType;
    }

    /**
     * Sets the value of the commandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommandTypes }
     *     
     */
    public void setCommandType(CommandTypes value) {
        this.commandType = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
