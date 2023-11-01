
package com.fenoreste_alestra.ws_client_tdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para transaction complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="transaction"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="acceptorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="authorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="availableBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="conceptDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="respCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="respCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="trxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="trxDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transaction", propOrder = {
    "acceptorName",
    "amount",
    "authorization",
    "availableBalance",
    "conceptDescription",
    "pan",
    "respCode",
    "respCodeDescription",
    "transactionDate",
    "trxCode",
    "trxDescription"
})
public class TransactionDto {

    protected String acceptorName;
    protected String amount;
    protected String authorization;
    protected String availableBalance;
    protected String conceptDescription;
    protected String pan;
    protected String respCode;
    protected String respCodeDescription;
    protected String transactionDate;
    protected String trxCode;
    protected String trxDescription;

    /**
     * Obtiene el valor de la propiedad acceptorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptorName() {
        return acceptorName;
    }

    /**
     * Define el valor de la propiedad acceptorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptorName(String value) {
        this.acceptorName = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

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
     * Obtiene el valor de la propiedad availableBalance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Define el valor de la propiedad availableBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableBalance(String value) {
        this.availableBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptDescription() {
        return conceptDescription;
    }

    /**
     * Define el valor de la propiedad conceptDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptDescription(String value) {
        this.conceptDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad pan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Define el valor de la propiedad pan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Obtiene el valor de la propiedad respCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespCode() {
        return respCode;
    }

    /**
     * Define el valor de la propiedad respCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespCode(String value) {
        this.respCode = value;
    }

    /**
     * Obtiene el valor de la propiedad respCodeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespCodeDescription() {
        return respCodeDescription;
    }

    /**
     * Define el valor de la propiedad respCodeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespCodeDescription(String value) {
        this.respCodeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Define el valor de la propiedad transactionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad trxCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxCode() {
        return trxCode;
    }

    /**
     * Define el valor de la propiedad trxCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxCode(String value) {
        this.trxCode = value;
    }

    /**
     * Obtiene el valor de la propiedad trxDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxDescription() {
        return trxDescription;
    }

    /**
     * Define el valor de la propiedad trxDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxDescription(String value) {
        this.trxDescription = value;
    }
}
