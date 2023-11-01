
package com.fenoreste_alestra.ws_client_tdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getLastestTransactions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getLastestTransactions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numMaxOfRows" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLastestTransactions", propOrder = {
    "pan",
    "numMaxOfRows",
    "operationType"
})
public class GetLastestTransactions {

    protected String pan;
    protected int numMaxOfRows;
    protected int operationType;

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
     * Obtiene el valor de la propiedad numMaxOfRows.
     * 
     */
    public int getNumMaxOfRows() {
        return numMaxOfRows;
    }

    /**
     * Define el valor de la propiedad numMaxOfRows.
     * 
     */
    public void setNumMaxOfRows(int value) {
        this.numMaxOfRows = value;
    }

    /**
     * Obtiene el valor de la propiedad operationType.
     * 
     */
    public int getOperationType() {
        return operationType;
    }

    /**
     * Define el valor de la propiedad operationType.
     * 
     */
    public void setOperationType(int value) {
        this.operationType = value;
    }

}
