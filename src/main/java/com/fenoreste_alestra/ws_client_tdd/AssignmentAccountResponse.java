
package com.fenoreste_alestra.ws_client_tdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para assignmentAccountResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="assignmentAccountResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="authorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignmentAccountResponse", propOrder = {
    "authorization",
    "clabe",
    "clientName",
    "code",
    "currentTime",
    "description",
    "issueDate",
    "noCliente",
    "noCuenta"
})
public class AssignmentAccountResponse {

    protected String authorization;
    @XmlElement(name = "CLABE")
    protected String clabe;
    protected String clientName;
    protected int code;
    protected String currentTime;
    protected String description;
    protected String issueDate;
    protected String noCliente;
    protected String noCuenta;

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
     * Obtiene el valor de la propiedad clabe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLABE() {
        return clabe;
    }

    /**
     * Define el valor de la propiedad clabe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLABE(String value) {
        this.clabe = value;
    }

    /**
     * Obtiene el valor de la propiedad clientName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Define el valor de la propiedad clientName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
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
     * Obtiene el valor de la propiedad currentTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTime() {
        return currentTime;
    }

    /**
     * Define el valor de la propiedad currentTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTime(String value) {
        this.currentTime = value;
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

    /**
     * Obtiene el valor de la propiedad issuDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Define el valor de la propiedad issuDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad noCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCliente() {
        return noCliente;
    }

    /**
     * Define el valor de la propiedad noCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCliente(String value) {
        this.noCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad noCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoCuenta() {
        return noCuenta;
    }

    /**
     * Define el valor de la propiedad noCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoCuenta(String value) {
        this.noCuenta = value;
    }

}
