//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2010.05.30 um 08:02:04 CEST 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated;


/**
 * Java content class for slot_value element declaration.
 * 	<p>The following schema fragment specifies the expected 	content contained within this java content object. 	(defined at file:/home/fox/workspace/jGnucashLib-GPL/plugins/biz.wolschon.finance.jgnucash.viewer.main/source/gnucash.xsd line 1073)
 * <p>
 * <pre>
 * &lt;element name="slot_value">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{}slot"/>
 *           &lt;element ref="{}ts_date"/>
 *           &lt;element ref="{}slot_value"/>
 *         &lt;/choice>
 *         &lt;attribute name="type" use="required">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *               &lt;enumeration value="list"/>
 *               &lt;enumeration value="frame"/>
 *               &lt;enumeration value="guid"/>
 *               &lt;enumeration value="integer"/>
 *               &lt;enumeration value="string"/>
 *               &lt;enumeration value="timespec"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/attribute>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface SlotValue
    extends javax.xml.bind.Element, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.SlotValueType
{


}
