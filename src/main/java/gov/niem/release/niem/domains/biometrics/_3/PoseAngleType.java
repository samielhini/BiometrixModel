//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 01:23:32 AM EDT 
//


package gov.niem.release.niem.domains.biometrics._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.niem.release.niem.proxy.xsd._3.Integer;
import gov.niem.release.niem.proxy.xsd._3.NonNegativeInteger;
import gov.niem.release.niem.structures._3.ObjectType;


/**
 * A data type for a set of angular offsets of a subject from a full face or a profile, for a determined 3D pose
 * 
 * <p>Java class for PoseAngleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoseAngleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://release.niem.gov/niem/structures/3.0/}ObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://release.niem.gov/niem/domains/biometrics/3.0/}PosePitchAngleMeasure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/domains/biometrics/3.0/}PosePitchUncertaintyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/domains/biometrics/3.0/}PoseRollAngleMeasure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/domains/biometrics/3.0/}PoseRollUncertaintyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/domains/biometrics/3.0/}PoseYawAngleMeasure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/domains/biometrics/3.0/}PoseYawUncertaintyValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://release.niem.gov/niem/domains/biometrics/3.0/}PoseAngleAugmentationPoint" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PoseAngleType", propOrder = {
    "posePitchAngleMeasure",
    "posePitchUncertaintyValue",
    "poseRollAngleMeasure",
    "poseRollUncertaintyValue",
    "poseYawAngleMeasure",
    "poseYawUncertaintyValue",
    "poseAngleAugmentationPoint"
})
public class PoseAngleType
    extends ObjectType
{

    @XmlElement(name = "PosePitchAngleMeasure", nillable = true)
    protected List<Integer> posePitchAngleMeasure;
    @XmlElement(name = "PosePitchUncertaintyValue", nillable = true)
    protected List<NonNegativeInteger> posePitchUncertaintyValue;
    @XmlElement(name = "PoseRollAngleMeasure", nillable = true)
    protected List<Integer> poseRollAngleMeasure;
    @XmlElement(name = "PoseRollUncertaintyValue", nillable = true)
    protected List<NonNegativeInteger> poseRollUncertaintyValue;
    @XmlElement(name = "PoseYawAngleMeasure", nillable = true)
    protected List<Integer> poseYawAngleMeasure;
    @XmlElement(name = "PoseYawUncertaintyValue", nillable = true)
    protected List<NonNegativeInteger> poseYawUncertaintyValue;
    @XmlElement(name = "PoseAngleAugmentationPoint")
    protected List<Object> poseAngleAugmentationPoint;

    /**
     * Gets the value of the posePitchAngleMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posePitchAngleMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosePitchAngleMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPosePitchAngleMeasure() {
        if (posePitchAngleMeasure == null) {
            posePitchAngleMeasure = new ArrayList<Integer>();
        }
        return this.posePitchAngleMeasure;
    }

    /**
     * Gets the value of the posePitchUncertaintyValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posePitchUncertaintyValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosePitchUncertaintyValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonNegativeInteger }
     * 
     * 
     */
    public List<NonNegativeInteger> getPosePitchUncertaintyValue() {
        if (posePitchUncertaintyValue == null) {
            posePitchUncertaintyValue = new ArrayList<NonNegativeInteger>();
        }
        return this.posePitchUncertaintyValue;
    }

    /**
     * Gets the value of the poseRollAngleMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poseRollAngleMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoseRollAngleMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPoseRollAngleMeasure() {
        if (poseRollAngleMeasure == null) {
            poseRollAngleMeasure = new ArrayList<Integer>();
        }
        return this.poseRollAngleMeasure;
    }

    /**
     * Gets the value of the poseRollUncertaintyValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poseRollUncertaintyValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoseRollUncertaintyValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonNegativeInteger }
     * 
     * 
     */
    public List<NonNegativeInteger> getPoseRollUncertaintyValue() {
        if (poseRollUncertaintyValue == null) {
            poseRollUncertaintyValue = new ArrayList<NonNegativeInteger>();
        }
        return this.poseRollUncertaintyValue;
    }

    /**
     * Gets the value of the poseYawAngleMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poseYawAngleMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoseYawAngleMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPoseYawAngleMeasure() {
        if (poseYawAngleMeasure == null) {
            poseYawAngleMeasure = new ArrayList<Integer>();
        }
        return this.poseYawAngleMeasure;
    }

    /**
     * Gets the value of the poseYawUncertaintyValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poseYawUncertaintyValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoseYawUncertaintyValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonNegativeInteger }
     * 
     * 
     */
    public List<NonNegativeInteger> getPoseYawUncertaintyValue() {
        if (poseYawUncertaintyValue == null) {
            poseYawUncertaintyValue = new ArrayList<NonNegativeInteger>();
        }
        return this.poseYawUncertaintyValue;
    }

    /**
     * Gets the value of the poseAngleAugmentationPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poseAngleAugmentationPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoseAngleAugmentationPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPoseAngleAugmentationPoint() {
        if (poseAngleAugmentationPoint == null) {
            poseAngleAugmentationPoint = new ArrayList<Object>();
        }
        return this.poseAngleAugmentationPoint;
    }

}
