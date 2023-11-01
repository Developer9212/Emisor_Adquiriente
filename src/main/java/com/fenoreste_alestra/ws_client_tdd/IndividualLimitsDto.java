
package com.fenoreste_alestra.ws_client_tdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;



/**
 * &lt;p&gt;Clase Java para limitCard complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="limitCard"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="maxBuysAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="maxBuysNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="maxWithdrawalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="maxWithdrawalAmountInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="maxWithdrawalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="maxWithdrawalNumberInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "limitCard", propOrder = {
    "maxBuysAmount",
    "maxBuysNumber",
    "maxWithdrawalAmount",
    "maxWithdrawalAmountInt",
    "maxWithdrawalNumber",
    "maxWithdrawalNumberInt"
})
public class IndividualLimitsDto {

    protected String maxBuysAmount;
    protected String maxBuysNumber;
    protected String maxWithdrawalAmount;
    protected String maxWithdrawalAmountInt;
    protected String maxWithdrawalNumber;
    protected String maxWithdrawalNumberInt;

    /**
     * Obtiene el valor de la propiedad maxBuysAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxBuysAmount() {
        return maxBuysAmount;
    }

    /**
     * Define el valor de la propiedad maxBuysAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxBuysAmount(String value) {
        this.maxBuysAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad maxBuysNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxBuysNumber() {
        return maxBuysNumber;
    }

    /**
     * Define el valor de la propiedad maxBuysNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxBuysNumber(String value) {
        this.maxBuysNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad maxWithdrawalAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    /**
     * Define el valor de la propiedad maxWithdrawalAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWithdrawalAmount(String value) {
        this.maxWithdrawalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad maxWithdrawalAmountInt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWithdrawalAmountInt() {
        return maxWithdrawalAmountInt;
    }

    /**
     * Define el valor de la propiedad maxWithdrawalAmountInt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWithdrawalAmountInt(String value) {
        this.maxWithdrawalAmountInt = value;
    }

    /**
     * Obtiene el valor de la propiedad maxWithdrawalNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWithdrawalNumber() {
        return maxWithdrawalNumber;
    }

    /**
     * Define el valor de la propiedad maxWithdrawalNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWithdrawalNumber(String value) {
        this.maxWithdrawalNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad maxWithdrawalNumberInt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWithdrawalNumberInt() {
        return maxWithdrawalNumberInt;
    }

    /**
     * Define el valor de la propiedad maxWithdrawalNumberInt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWithdrawalNumberInt(String value) {
        this.maxWithdrawalNumberInt = value;
    }
}