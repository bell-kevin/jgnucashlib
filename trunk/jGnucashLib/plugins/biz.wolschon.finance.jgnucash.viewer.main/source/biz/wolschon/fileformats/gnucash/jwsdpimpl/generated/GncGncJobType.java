//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2010.01.03 um 07:35:23 CET 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated;


/**
 * Java content class for anonymous complex type.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/jGnucashLib/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 395)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="job_guid">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="job_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="job_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="job_reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="job_owner">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}owner_type"/>
 *                   &lt;element ref="{}owner_id"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="job_active" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface GncGncJobType {


    /**
     * Gets the value of the jobOwner property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncJobType.JobOwnerType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncJobType.JobOwnerType getJobOwner();

    /**
     * Sets the value of the jobOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncJobType.JobOwnerType}
     */
    void setJobOwner(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncJobType.JobOwnerType value);

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getJobId();

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setJobId(java.lang.String value);

    /**
     * Gets the value of the jobReference property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getJobReference();

    /**
     * Sets the value of the jobReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setJobReference(java.lang.String value);

    /**
     * Gets the value of the jobName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getJobName();

    /**
     * Sets the value of the jobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setJobName(java.lang.String value);

    /**
     * Gets the value of the jobActive property.
     * 
     */
    int getJobActive();

    /**
     * Sets the value of the jobActive property.
     * 
     */
    void setJobActive(int value);

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
     * Gets the value of the jobGuid property.
     * 
     * @return
     *     possible object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncJobType.JobGuidType}
     */
    biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncJobType.JobGuidType getJobGuid();

    /**
     * Sets the value of the jobGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncJobType.JobGuidType}
     */
    void setJobGuid(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncGncJobType.JobGuidType value);


    /**
     * Java content class for anonymous complex type.
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/jGnucashLib/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 398)
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
    public interface JobGuidType {


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
     * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/jGnucashLib/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 410)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}owner_type"/>
     *         &lt;element ref="{}owner_id"/>
     *       &lt;/sequence>
     *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface JobOwnerType {


        /**
         * Gets the value of the ownerId property.
         * 
         * @return
         *     possible object is
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.OwnerIdType}
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.OwnerId}
         */
        biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.OwnerIdType getOwnerId();

        /**
         * Sets the value of the ownerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.OwnerIdType}
         *     {@link biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.OwnerId}
         */
        void setOwnerId(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.OwnerIdType value);

        /**
         * Gets the value of the ownerType property.
         * 
         * @return
         *     possible object is
         *     {@link java.lang.String}
         */
        java.lang.String getOwnerType();

        /**
         * Sets the value of the ownerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.lang.String}
         */
        void setOwnerType(java.lang.String value);

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

    }

}
