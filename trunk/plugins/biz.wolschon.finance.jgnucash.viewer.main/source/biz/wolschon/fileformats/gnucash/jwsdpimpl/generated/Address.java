//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2009.05.10 um 07:36:58 CEST 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated;


/**
 * Java content class for address complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 14)
 * <p>
 * <pre>
 * &lt;complexType name="address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addr_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr_addr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr_addr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr_addr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr_addr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr_fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr_email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Address {


    /**
     * Gets the value of the addrAddr4 property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAddrAddr4();

    /**
     * Sets the value of the addrAddr4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAddrAddr4(java.lang.String value);

    /**
     * Gets the value of the addrPhone property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAddrPhone();

    /**
     * Sets the value of the addrPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAddrPhone(java.lang.String value);

    /**
     * Gets the value of the addrAddr3 property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAddrAddr3();

    /**
     * Sets the value of the addrAddr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAddrAddr3(java.lang.String value);

    /**
     * Gets the value of the addrAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAddrAddr2();

    /**
     * Sets the value of the addrAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAddrAddr2(java.lang.String value);

    /**
     * Gets the value of the addrEmail property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAddrEmail();

    /**
     * Sets the value of the addrEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAddrEmail(java.lang.String value);

    /**
     * Gets the value of the addrAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAddrAddr1();

    /**
     * Sets the value of the addrAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAddrAddr1(java.lang.String value);

    /**
     * Gets the value of the addrName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAddrName();

    /**
     * Sets the value of the addrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAddrName(java.lang.String value);

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getVersion();

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setVersion(java.lang.String value);

    /**
     * Gets the value of the addrFax property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getAddrFax();

    /**
     * Sets the value of the addrFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setAddrFax(java.lang.String value);

}
