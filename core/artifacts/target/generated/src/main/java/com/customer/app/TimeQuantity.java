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
 * This class represents an amount of time, such as 10 minutes, 3.2 seconds, etc. This class is structurally identical to a Physical Quantity, although the units of measure are by definition time units (e.g., hours), rather than physical units (e.g., kilograms).
 * 
 * <p>Java class for TimeQuantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unit" type="{http://www.davita.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.davita.com}Real" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeQuantity", propOrder = {
    "unit",
    "value"
})
@XmlRootElement(name = "TimeQuantity")
public class TimeQuantity
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code unit;
    protected Real value;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setUnit(Code value) {
        this.unit = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Real }
     *     
     */
    public Real getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Real }
     *     
     */
    public void setValue(Real value) {
        this.value = value;
    }

}
