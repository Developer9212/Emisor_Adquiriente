
package com.fenoreste_alestra.ws_client_tdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getCardholderInformationResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getCardholderInformationResponse">
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
 *                   &lt;element name="tarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="direccion2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="telefono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="telefono3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getCardholderInformationResponse", propOrder = {
    "_return"
})
public class GetCardholderInformationResponse {

    @XmlElement(name = "return")
    protected GetCardholderInformationResponse.Return _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link GetCardholderInformationResponse.Return }
     *     
     */
    public GetCardholderInformationResponse.Return getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardholderInformationResponse.Return }
     *     
     */
    public void setReturn(GetCardholderInformationResponse.Return value) {
        this._return = value;
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
     *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="direccion2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="localidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="telefono2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="telefono3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "code",
        "description",
        "tarjeta",
        "nombre",
        "direccion",
        "direccion2",
        "colonia",
        "localidad",
        "estado",
        "cp",
        "telefono",
        "telefono2",
        "telefono3",
        "rfc"
    })
    public static class Return {

        protected int code;
        protected String description;
        protected String tarjeta;
        protected String nombre;
        protected String direccion;
        protected String direccion2;
        protected String colonia;
        protected String localidad;
        protected String estado;
        protected String cp;
        protected String telefono;
        protected String telefono2;
        protected String telefono3;
        protected String rfc;

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
         * Obtiene el valor de la propiedad tarjeta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarjeta() {
            return tarjeta;
        }

        /**
         * Define el valor de la propiedad tarjeta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarjeta(String value) {
            this.tarjeta = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
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
         * Obtiene el valor de la propiedad direccion2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion2() {
            return direccion2;
        }

        /**
         * Define el valor de la propiedad direccion2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion2(String value) {
            this.direccion2 = value;
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
         * Obtiene el valor de la propiedad localidad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalidad() {
            return localidad;
        }

        /**
         * Define el valor de la propiedad localidad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalidad(String value) {
            this.localidad = value;
        }

        /**
         * Obtiene el valor de la propiedad estado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstado() {
            return estado;
        }

        /**
         * Define el valor de la propiedad estado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstado(String value) {
            this.estado = value;
        }

        /**
         * Obtiene el valor de la propiedad cp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCp() {
            return cp;
        }

        /**
         * Define el valor de la propiedad cp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCp(String value) {
            this.cp = value;
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
         * Obtiene el valor de la propiedad telefono3.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefono3() {
            return telefono3;
        }

        /**
         * Define el valor de la propiedad telefono3.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono3(String value) {
            this.telefono3 = value;
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

    }

}
