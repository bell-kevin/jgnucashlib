//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2008.09.28 um 10:30:48 MESZ 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated;


/**
 * Java content class for gnc_count-data element declaration.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 665)
 * <p>
 * <pre>
 * &lt;element name="gnc_count-data">
 *   &lt;complexType>
 *     &lt;simpleContent>
 *       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>int">
 *         &lt;attribute name="cd_type" use="required">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *               &lt;enumeration value="account"/>
 *               &lt;enumeration value="book"/>
 *               &lt;enumeration value="commodity"/>
 *               &lt;enumeration value="gnc:GncCustomer"/>
 *               &lt;enumeration value="gnc:GncEntry"/>
 *               &lt;enumeration value="gnc:GncInvoice"/>
 *               &lt;enumeration value="gnc:GncJob"/>
 *               &lt;enumeration value="gnc:GncTaxTable"/>
 *               &lt;enumeration value="schedxaction"/>
 *               &lt;enumeration value="transaction"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/attribute>
 *       &lt;/extension>
 *     &lt;/simpleContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface GncCountData
    extends javax.xml.bind.Element, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.GncCountDataType
{


}
