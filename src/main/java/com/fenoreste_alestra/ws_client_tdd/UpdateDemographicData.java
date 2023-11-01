
package com.fenoreste_alestra.ws_client_tdd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para updateDemographicData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateDemographicData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardinfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="colony" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "updateDemographicData", propOrder = {
    "pan",
    "cardinfo"
})
public class UpdateDemographicData {

    protected String pan;
    protected UpdateDemographicData.Cardinfo cardinfo;

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
     * Obtiene el valor de la propiedad cardinfo.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDemographicData.Cardinfo }
     *     
     */
    public UpdateDemographicData.Cardinfo getCardinfo() {
        return cardinfo;
    }

    /**
     * Define el valor de la propiedad cardinfo.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDemographicData.Cardinfo }
     *     
     */
    public void setCardinfo(UpdateDemographicData.Cardinfo value) {
        this.cardinfo = value;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="colony" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="workPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */@XmlRootElement
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "shortName",
        "email",
        "address",
        "colony",
        "zipCode",
        "municipality",
        "city",
        "state",
        "rfc",
        "homePhone",
        "cellPhone",
        "workPhone"
    })
    public static class Cardinfo {

        protected String name;
        protected String shortName;
        protected String email;
        protected String address;
        protected String colony;
        protected String zipCode;
        protected String municipality;
        protected String city;
        protected String state;
        protected String rfc;
        protected String homePhone;
        protected String cellPhone;
        protected String workPhone;

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad shortName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortName() {
            return shortName;
        }

        /**
         * Define el valor de la propiedad shortName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortName(String value) {
            this.shortName = value;
        }

        /**
         * Obtiene el valor de la propiedad email.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Define el valor de la propiedad email.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Obtiene el valor de la propiedad address.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddress() {
            return address;
        }

        /**
         * Define el valor de la propiedad address.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddress(String value) {
            this.address = value;
        }

        /**
         * Obtiene el valor de la propiedad colony.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getColony() {
            return colony;
        }

        /**
         * Define el valor de la propiedad colony.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setColony(String value) {
            this.colony = value;
        }

        /**
         * Obtiene el valor de la propiedad zipCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZipCode() {
            return zipCode;
        }

        /**
         * Define el valor de la propiedad zipCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZipCode(String value) {
            this.zipCode = value;
        }

        /**
         * Obtiene el valor de la propiedad municipality.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMunicipality() {
            return municipality;
        }

        /**
         * Define el valor de la propiedad municipality.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMunicipality(String value) {
            this.municipality = value;
        }

        /**
         * Obtiene el valor de la propiedad city.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCity() {
            return city;
        }

        /**
         * Define el valor de la propiedad city.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCity(String value) {
            this.city = value;
        }

        /**
         * Obtiene el valor de la propiedad state.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Define el valor de la propiedad state.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
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
         * Obtiene el valor de la propiedad homePhone.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHomePhone() {
            return homePhone;
        }

        /**
         * Define el valor de la propiedad homePhone.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHomePhone(String value) {
            this.homePhone = value;
        }

        /**
         * Obtiene el valor de la propiedad cellPhone.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCellPhone() {
            return cellPhone;
        }

        /**
         * Define el valor de la propiedad cellPhone.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCellPhone(String value) {
            this.cellPhone = value;
        }

        /**
         * Obtiene el valor de la propiedad workPhone.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWorkPhone() {
            return workPhone;
        }

        /**
         * Define el valor de la propiedad workPhone.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWorkPhone(String value) {
            this.workPhone = value;
        }

    }

}
