//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.20 at 11:25:06 PM EDT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Patient DaVita Specific information
 * 
 * <p>Java class for PatientInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PatientInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ishospice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="anticipateddavitafdod" type="{http://www.davita.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="actualdavitafdod" type="{http://www.davita.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="hospicestartdate" type="{http://www.davita.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="homelocationphyfirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homelocationphylastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatientInformation", propOrder = {
    "ishospice",
    "anticipateddavitafdod",
    "actualdavitafdod",
    "hospicestartdate",
    "homelocationphyfirstname",
    "homelocationphylastname"
})
@XmlRootElement(name = "PatientInformation")
public class PatientInformation
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Boolean ishospice;
    protected TimeInterval anticipateddavitafdod;
    protected TimeInterval actualdavitafdod;
    protected TimeInterval hospicestartdate;
    protected String homelocationphyfirstname;
    protected String homelocationphylastname;

    /**
     * Gets the value of the ishospice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIshospice() {
        return ishospice;
    }

    /**
     * Sets the value of the ishospice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIshospice(Boolean value) {
        this.ishospice = value;
    }

    /**
     * Gets the value of the anticipateddavitafdod property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getAnticipateddavitafdod() {
        return anticipateddavitafdod;
    }

    /**
     * Sets the value of the anticipateddavitafdod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setAnticipateddavitafdod(TimeInterval value) {
        this.anticipateddavitafdod = value;
    }

    /**
     * Gets the value of the actualdavitafdod property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getActualdavitafdod() {
        return actualdavitafdod;
    }

    /**
     * Sets the value of the actualdavitafdod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setActualdavitafdod(TimeInterval value) {
        this.actualdavitafdod = value;
    }

    /**
     * Gets the value of the hospicestartdate property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getHospicestartdate() {
        return hospicestartdate;
    }

    /**
     * Sets the value of the hospicestartdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setHospicestartdate(TimeInterval value) {
        this.hospicestartdate = value;
    }

    /**
     * Gets the value of the homelocationphyfirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomelocationphyfirstname() {
        return homelocationphyfirstname;
    }

    /**
     * Sets the value of the homelocationphyfirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomelocationphyfirstname(String value) {
        this.homelocationphyfirstname = value;
    }

    /**
     * Gets the value of the homelocationphylastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomelocationphylastname() {
        return homelocationphylastname;
    }

    /**
     * Sets the value of the homelocationphylastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomelocationphylastname(String value) {
        this.homelocationphylastname = value;
    }

}
