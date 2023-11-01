
package com.fenoreste_alestra.ws_client_tdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para assignmentAccount complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="assignmentAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nombreLargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nombreCorto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="entidadFederativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="telefono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assignmentAccount", propOrder = {
    "pan",
    "clientInfo"
})
public class AssignmentAccount {

    protected String pan;
    protected AssignmentAccount.ClientInfo clientInfo;

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
     * Obtiene el valor de la propiedad clientInfo.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentAccount.ClientInfo }
     *     
     */
    public AssignmentAccount.ClientInfo getClientInfo() {
        return clientInfo;
    }

    /**
     * Define el valor de la propiedad clientInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentAccount.ClientInfo }
     *     
     */
    public void setClientInfo(AssignmentAccount.ClientInfo value) {
        this.clientInfo = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nombreLargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nombreCorto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="entidadFederativa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="codigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="telefono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cuenta",
        "nombreLargo",
        "nombreCorto",
        "direccion",
        "colonia",
        "entidadFederativa",
        "codigoPostal",
        "rfc",
        "telefono",
        "telefono2",
        "sucursal",
        "producto"
    })
    public static class ClientInfo {

        protected String cuenta;
        protected String nombreLargo;
        protected String nombreCorto;
        protected String direccion;
        protected String colonia;
        protected String entidadFederativa;
        protected String codigoPostal;
        protected String rfc;
        protected String telefono;
        protected String telefono2;
        protected String sucursal;
        protected String producto;

        /**
         * Obtiene el valor de la propiedad cuenta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCuenta() {
            return cuenta;
        }

        /**
         * Define el valor de la propiedad cuenta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCuenta(String value) {
            this.cuenta = value;
        }

        /**
         * Obtiene el valor de la propiedad nombreLargo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreLargo() {
            return nombreLargo;
        }

        /**
         * Define el valor de la propiedad nombreLargo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreLargo(String value) {
            this.nombreLargo = value;
        }

        /**
         * Obtiene el valor de la propiedad nombreCorto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreCorto() {
            return nombreCorto;
        }

        /**
         * Define el valor de la propiedad nombreCorto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreCorto(String value) {
            this.nombreCorto = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

        /**
         * Obtiene el valor de la propiedad colonia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColonia() {
            return colonia;
        }

        /**
         * Define el valor de la propiedad colonia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColonia(String value) {
            this.colonia = value;
        }

        /**
         * Obtiene el valor de la propiedad entidadFederativa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEntidadFederativa() {
            return entidadFederativa;
        }

        /**
         * Define el valor de la propiedad entidadFederativa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEntidadFederativa(String value) {
            this.entidadFederativa = value;
        }

        /**
         * Obtiene el valor de la propiedad codigoPostal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoPostal() {
            return codigoPostal;
        }

        /**
         * Define el valor de la propiedad codigoPostal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoPostal(String value) {
            this.codigoPostal = value;
        }

        /**
         * Obtiene el valor de la propiedad rfc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRfc() {
            return rfc;
        }

        /**
         * Define el valor de la propiedad rfc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRfc(String value) {
            this.rfc = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono(String value) {
            this.telefono = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefono2() {
            return telefono2;
        }

        /**
         * Define el valor de la propiedad telefono2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono2(String value) {
            this.telefono2 = value;
        }

        /**
         * Obtiene el valor de la propiedad sucursal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSucursal() {
            return sucursal;
        }

        /**
         * Define el valor de la propiedad sucursal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSucursal(String value) {
            this.sucursal = value;
        }

        /**
         * Obtiene el valor de la propiedad producto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProducto() {
            return producto;
        }

        /**
         * Define el valor de la propiedad producto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProducto(String value) {
            this.producto = value;
        }

    }

}
