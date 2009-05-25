//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2009.05.10 um 07:36:58 CEST 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated;


/**
 * Java content class for anonymous complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 81)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="price" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="price_id">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="price_commodity">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}cmdty_space"/>
 *                             &lt;element ref="{}cmdty_id"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="price_currency">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}cmdty_space"/>
 *                             &lt;element ref="{}cmdty_id"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="price_time">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}ts_date"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="price_source">
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Finance::Quote"/>
 *                       &lt;enumeration value="user:price-editor"/>
 *                       &lt;enumeration value="user:xfer-dialog"/>
 *                     &lt;/restriction>
 *                   &lt;/element>
 *                   &lt;element name="price_type" minOccurs="0">
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="last"/>
 *                       &lt;enumeration value="nav"/>
 *                     &lt;/restriction>
 *                   &lt;/element>
 *                   &lt;element name="price_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface GncPricedbType {


    /**
     * Gets the value of the Price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType}
     * 
     */
    java.util.List getPrice();

    /**
     * Gets the value of the version property.
     * 
     */
    int getVersion();

    /**
     * Sets the value of the version property.
     * 
     */
    void setVersion(int value);


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 84)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="price_id">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="price_commodity">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}cmdty_space"/>
     *                   &lt;element ref="{}cmdty_id"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="price_currency">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}cmdty_space"/>
     *                   &lt;element ref="{}cmdty_id"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="price_time">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{}ts_date"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="price_source">
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Finance::Quote"/>
     *             &lt;enumeration value="user:price-editor"/>
     *             &lt;enumeration value="user:xfer-dialog"/>
     *           &lt;/restriction>
     *         &lt;/element>
     *         &lt;element name="price_type" minOccurs="0">
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="last"/>
     *             &lt;enumeration value="nav"/>
     *           &lt;/restriction>
     *         &lt;/element>
     *         &lt;element name="price_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface PriceType {


        /**
         * Gets the value of the priceSource property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getPriceSource();

        /**
         * Sets the value of the priceSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setPriceSource(java.lang.String value);

        /**
         * Gets the value of the priceTime property.
         * 
         * @return
         *     possible object is
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceTimeType}
         */
        biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceTimeType getPriceTime();

        /**
         * Sets the value of the priceTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceTimeType}
         */
        void setPriceTime(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceTimeType value);

        /**
         * Gets the value of the priceType property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getPriceType();

        /**
         * Sets the value of the priceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setPriceType(java.lang.String value);

        /**
         * Gets the value of the priceCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceCurrencyType}
         */
        biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceCurrencyType getPriceCurrency();

        /**
         * Sets the value of the priceCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceCurrencyType}
         */
        void setPriceCurrency(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceCurrencyType value);

        /**
         * Gets the value of the priceCommodity property.
         * 
         * @return
         *     possible object is
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceCommodityType}
         */
        biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceCommodityType getPriceCommodity();

        /**
         * Sets the value of the priceCommodity property.
         * 
         * @param value
         *     allowed object is
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceCommodityType}
         */
        void setPriceCommodity(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceCommodityType value);

        /**
         * Gets the value of the priceId property.
         * 
         * @return
         *     possible object is
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceIdType}
         */
        biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceIdType getPriceId();

        /**
         * Sets the value of the priceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceIdType}
         */
        void setPriceId(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncPricedbType.PriceType.PriceIdType value);

        /**
         * Gets the value of the priceValue property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getPriceValue();

        /**
         * Sets the value of the priceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setPriceValue(java.lang.String value);


        /**
         * Java content class for anonymous complex type.
         * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 96)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{}cmdty_space"/>
         *         &lt;element ref="{}cmdty_id"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface PriceCommodityType {


            /**
             * Gets the value of the cmdtyId property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getCmdtyId();

            /**
             * Sets the value of the cmdtyId property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setCmdtyId(java.lang.String value);

            /**
             * Gets the value of the cmdtySpace property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getCmdtySpace();

            /**
             * Sets the value of the cmdtySpace property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setCmdtySpace(java.lang.String value);

        }


        /**
         * Java content class for anonymous complex type.
         * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 104)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{}cmdty_space"/>
         *         &lt;element ref="{}cmdty_id"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface PriceCurrencyType {


            /**
             * Gets the value of the cmdtyId property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getCmdtyId();

            /**
             * Sets the value of the cmdtyId property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setCmdtyId(java.lang.String value);

            /**
             * Gets the value of the cmdtySpace property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getCmdtySpace();

            /**
             * Sets the value of the cmdtySpace property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setCmdtySpace(java.lang.String value);

        }


        /**
         * Java content class for anonymous complex type.
         * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 87)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface PriceIdType {


            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getValue();

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setValue(java.lang.String value);

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getType();

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setType(java.lang.String value);

        }


        /**
         * Java content class for anonymous complex type.
         * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 112)
         * <p>
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{}ts_date"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         */
        public interface PriceTimeType {


            /**
             * Gets the value of the tsDate property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.String}
             */
            java.lang.String getTsDate();

            /**
             * Sets the value of the tsDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.String}
             */
            void setTsDate(java.lang.String value);

        }

    }

}
