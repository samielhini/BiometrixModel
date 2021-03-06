//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 01:23:32 AM EDT 
//


package gov.niem.release.niem.niem_core._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import gov.niem.release.niem.codes.iso_3166_1._3.CountryAlpha2CodeType;
import gov.niem.release.niem.codes.unece_rec20._3.LengthCodeType;
import gov.niem.release.niem.codes.unece_rec20._3.MassCodeType;
import gov.niem.release.niem.proxy.xsd._3.Base64Binary;
import gov.niem.release.niem.proxy.xsd._3.DateTime;
import gov.niem.release.niem.proxy.xsd._3.String;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.niem.release.niem.niem_core._3 package. 
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

    private final static QName _MeasureUnit_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "MeasureUnit");
    private final static QName _DateRepresentation_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "DateRepresentation");
    private final static QName _PersonSSNIdentification_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonSSNIdentification");
    private final static QName _MeasureValue_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "MeasureValue");
    private final static QName _Base64BinaryObject_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "Base64BinaryObject");
    private final static QName _PersonCitizenship_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonCitizenship");
    private final static QName _PersonCitizenshipISO3166Alpha2Code_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonCitizenshipISO3166Alpha2Code");
    private final static QName _PersonEyeColor_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonEyeColor");
    private final static QName _MeasureValueText_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "MeasureValueText");
    private final static QName _PersonMiddleName_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonMiddleName");
    private final static QName _PersonWeightMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonWeightMeasure");
    private final static QName _DateTime_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "DateTime");
    private final static QName _PersonHairColor_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonHairColor");
    private final static QName _PersonMaidenName_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonMaidenName");
    private final static QName _PersonSex_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonSex");
    private final static QName _LengthUnitCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "LengthUnitCode");
    private final static QName _PersonName_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonName");
    private final static QName _WeightUnitCode_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "WeightUnitCode");
    private final static QName _PersonHeightMeasure_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonHeightMeasure");
    private final static QName _IdentificationID_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "IdentificationID");
    private final static QName _BinaryObject_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "BinaryObject");
    private final static QName _PersonBirthDate_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonBirthDate");
    private final static QName _PersonGivenName_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonGivenName");
    private final static QName _PersonSurName_QNAME = new QName("http://release.niem.gov/niem/niem-core/3.0/", "PersonSurName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.niem.release.niem.niem_core._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonNameType }
     * 
     */
    public PersonNameType createPersonNameType() {
        return new PersonNameType();
    }

    /**
     * Create an instance of {@link IdentificationType }
     * 
     */
    public IdentificationType createIdentificationType() {
        return new IdentificationType();
    }

    /**
     * Create an instance of {@link PersonNameTextType }
     * 
     */
    public PersonNameTextType createPersonNameTextType() {
        return new PersonNameTextType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link DateType }
     * 
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Create an instance of {@link BinaryType }
     * 
     */
    public BinaryType createBinaryType() {
        return new BinaryType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link ProperNameTextType }
     * 
     */
    public ProperNameTextType createProperNameTextType() {
        return new ProperNameTextType();
    }

    /**
     * Create an instance of {@link ImageType }
     * 
     */
    public ImageType createImageType() {
        return new ImageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "MeasureUnit")
    public JAXBElement<Object> createMeasureUnit(Object value) {
        return new JAXBElement<Object>(_MeasureUnit_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "DateRepresentation")
    public JAXBElement<Object> createDateRepresentation(Object value) {
        return new JAXBElement<Object>(_DateRepresentation_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonSSNIdentification")
    public JAXBElement<IdentificationType> createPersonSSNIdentification(IdentificationType value) {
        return new JAXBElement<IdentificationType>(_PersonSSNIdentification_QNAME, IdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "MeasureValue")
    public JAXBElement<Object> createMeasureValue(Object value) {
        return new JAXBElement<Object>(_MeasureValue_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64Binary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "Base64BinaryObject", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/3.0/", substitutionHeadName = "BinaryObject")
    public JAXBElement<Base64Binary> createBase64BinaryObject(Base64Binary value) {
        return new JAXBElement<Base64Binary>(_Base64BinaryObject_QNAME, Base64Binary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonCitizenship")
    public JAXBElement<Object> createPersonCitizenship(Object value) {
        return new JAXBElement<Object>(_PersonCitizenship_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryAlpha2CodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonCitizenshipISO3166Alpha2Code", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/3.0/", substitutionHeadName = "PersonCitizenship")
    public JAXBElement<CountryAlpha2CodeType> createPersonCitizenshipISO3166Alpha2Code(CountryAlpha2CodeType value) {
        return new JAXBElement<CountryAlpha2CodeType>(_PersonCitizenshipISO3166Alpha2Code_QNAME, CountryAlpha2CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonEyeColor")
    public JAXBElement<Object> createPersonEyeColor(Object value) {
        return new JAXBElement<Object>(_PersonEyeColor_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "MeasureValueText", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/3.0/", substitutionHeadName = "MeasureValue")
    public JAXBElement<TextType> createMeasureValueText(TextType value) {
        return new JAXBElement<TextType>(_MeasureValueText_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonMiddleName")
    public JAXBElement<PersonNameTextType> createPersonMiddleName(PersonNameTextType value) {
        return new JAXBElement<PersonNameTextType>(_PersonMiddleName_QNAME, PersonNameTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonWeightMeasure")
    public JAXBElement<MeasureType> createPersonWeightMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_PersonWeightMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "DateTime", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/3.0/", substitutionHeadName = "DateRepresentation")
    public JAXBElement<DateTime> createDateTime(DateTime value) {
        return new JAXBElement<DateTime>(_DateTime_QNAME, DateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonHairColor")
    public JAXBElement<Object> createPersonHairColor(Object value) {
        return new JAXBElement<Object>(_PersonHairColor_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonMaidenName")
    public JAXBElement<PersonNameTextType> createPersonMaidenName(PersonNameTextType value) {
        return new JAXBElement<PersonNameTextType>(_PersonMaidenName_QNAME, PersonNameTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonSex")
    public JAXBElement<Object> createPersonSex(Object value) {
        return new JAXBElement<Object>(_PersonSex_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "LengthUnitCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/3.0/", substitutionHeadName = "MeasureUnit")
    public JAXBElement<LengthCodeType> createLengthUnitCode(LengthCodeType value) {
        return new JAXBElement<LengthCodeType>(_LengthUnitCode_QNAME, LengthCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonName")
    public JAXBElement<PersonNameType> createPersonName(PersonNameType value) {
        return new JAXBElement<PersonNameType>(_PersonName_QNAME, PersonNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MassCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "WeightUnitCode", substitutionHeadNamespace = "http://release.niem.gov/niem/niem-core/3.0/", substitutionHeadName = "MeasureUnit")
    public JAXBElement<MassCodeType> createWeightUnitCode(MassCodeType value) {
        return new JAXBElement<MassCodeType>(_WeightUnitCode_QNAME, MassCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonHeightMeasure")
    public JAXBElement<MeasureType> createPersonHeightMeasure(MeasureType value) {
        return new JAXBElement<MeasureType>(_PersonHeightMeasure_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "IdentificationID")
    public JAXBElement<String> createIdentificationID(String value) {
        return new JAXBElement<String>(_IdentificationID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "BinaryObject")
    public JAXBElement<Object> createBinaryObject(Object value) {
        return new JAXBElement<Object>(_BinaryObject_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonBirthDate")
    public JAXBElement<DateType> createPersonBirthDate(DateType value) {
        return new JAXBElement<DateType>(_PersonBirthDate_QNAME, DateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonGivenName")
    public JAXBElement<PersonNameTextType> createPersonGivenName(PersonNameTextType value) {
        return new JAXBElement<PersonNameTextType>(_PersonGivenName_QNAME, PersonNameTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonNameTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://release.niem.gov/niem/niem-core/3.0/", name = "PersonSurName")
    public JAXBElement<PersonNameTextType> createPersonSurName(PersonNameTextType value) {
        return new JAXBElement<PersonNameTextType>(_PersonSurName_QNAME, PersonNameTextType.class, null, value);
    }

}
