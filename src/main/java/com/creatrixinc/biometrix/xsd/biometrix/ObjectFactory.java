//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 01:23:32 AM EDT 
//


package com.creatrixinc.biometrix.xsd.biometrix;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.creatrixinc.biometrix.xsd.biometrix package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BiometrixResponses_QNAME = new QName("http://www.creatrixinc.com/biometrix/xsd/biometrix", "BiometrixResponses");
    private final static QName _BiometrixResponse_QNAME = new QName("http://www.creatrixinc.com/biometrix/xsd/biometrix", "BiometrixResponse");
    private final static QName _BiometrixRequest_QNAME = new QName("http://www.creatrixinc.com/biometrix/xsd/biometrix", "BiometrixRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.creatrixinc.biometrix.xsd.biometrix
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BiometrixResponsesType }
     * 
     */
    public BiometrixResponsesType createBiometrixResponsesType() {
        return new BiometrixResponsesType();
    }

    /**
     * Create an instance of {@link BiometrixResponseType }
     * 
     */
    public BiometrixResponseType createBiometrixResponseType() {
        return new BiometrixResponseType();
    }

    /**
     * Create an instance of {@link BiometrixRequestType }
     * 
     */
    public BiometrixRequestType createBiometrixRequestType() {
        return new BiometrixRequestType();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link IdentificationType }
     * 
     */
    public IdentificationType createIdentificationType() {
        return new IdentificationType();
    }

    /**
     * Create an instance of {@link HeightMeasureType }
     * 
     */
    public HeightMeasureType createHeightMeasureType() {
        return new HeightMeasureType();
    }

    /**
     * Create an instance of {@link WeightMeasureType }
     * 
     */
    public WeightMeasureType createWeightMeasureType() {
        return new WeightMeasureType();
    }

    /**
     * Create an instance of {@link FingerprintImageType }
     * 
     */
    public FingerprintImageType createFingerprintImageType() {
        return new FingerprintImageType();
    }

    /**
     * Create an instance of {@link PersonNameTextType }
     * 
     */
    public PersonNameTextType createPersonNameTextType() {
        return new PersonNameTextType();
    }

    /**
     * Create an instance of {@link FingerprintType }
     * 
     */
    public FingerprintType createFingerprintType() {
        return new FingerprintType();
    }

    /**
     * Create an instance of {@link CommandExecutionStatus }
     * 
     */
    public CommandExecutionStatus createCommandExecutionStatus() {
        return new CommandExecutionStatus();
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link BiometrixResponsesType.RequestId }
     * 
     */
    public BiometrixResponsesType.RequestId createBiometrixResponsesTypeRequestId() {
        return new BiometrixResponsesType.RequestId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometrixResponsesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creatrixinc.com/biometrix/xsd/biometrix", name = "BiometrixResponses")
    public JAXBElement<BiometrixResponsesType> createBiometrixResponses(BiometrixResponsesType value) {
        return new JAXBElement<BiometrixResponsesType>(_BiometrixResponses_QNAME, BiometrixResponsesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometrixResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creatrixinc.com/biometrix/xsd/biometrix", name = "BiometrixResponse")
    public JAXBElement<BiometrixResponseType> createBiometrixResponse(BiometrixResponseType value) {
        return new JAXBElement<BiometrixResponseType>(_BiometrixResponse_QNAME, BiometrixResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BiometrixRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.creatrixinc.com/biometrix/xsd/biometrix", name = "BiometrixRequest")
    public JAXBElement<BiometrixRequestType> createBiometrixRequest(BiometrixRequestType value) {
        return new JAXBElement<BiometrixRequestType>(_BiometrixRequest_QNAME, BiometrixRequestType.class, null, value);
    }

}
