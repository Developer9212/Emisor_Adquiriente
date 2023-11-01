
package com.fenoreste_alestra.ws_client_tdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para loadBalanceResponse complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="loadBalanceResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="authorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}double"/&amp;gt;
 *         &amp;lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadBalanceResponse", propOrder = {
    "authorization",
    "balance",
    "code",
    "currentBalance",
    "description"
})
public class LoadBalanceResponse {

    protected String authorization;
    protected double balance;
    protected int code;
    protected double currentBalance;
    protected String description;

    /**
     * Obtiene el valor de la propiedad authorization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorization() {
        return authorization;
    }

    /**
     * Define el valor de la propiedad authorization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorization(String value) {
        this.authorization = value;
    }

    /**
     * Obtiene el valor de la propiedad balance.
     * 
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Define el valor de la propiedad balance.
     * 
     */
    public void setBalance(double value) {
        this.balance = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad currentBalance.
     * 
     */
    public double getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Define el valor de la propiedad currentBalance.
     * 
     */
    public void setCurrentBalance(double value) {
        this.currentBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
