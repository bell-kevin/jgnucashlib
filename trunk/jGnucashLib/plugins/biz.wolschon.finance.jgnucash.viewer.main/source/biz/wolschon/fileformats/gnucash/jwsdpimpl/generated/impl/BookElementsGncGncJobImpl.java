//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v@@BUILD_VERSION@@ 
// 	See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 	Any modifications to this file will be lost upon recompilation of the source schema. 
// 	Generated on: 2010.05.30 um 08:02:04 CEST 
//


package biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl;

public class BookElementsGncGncJobImpl
    extends biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncGncJobTypeImpl
    implements biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.BookElementsGncGncJob, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallableObject, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializable, biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.BookElementsGncGncJob.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "gnc_GncJob";
    }

    public biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingEventHandler createUnmarshaller(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingContext context) {
        return new biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.BookElementsGncGncJobImpl.Unmarshaller(context);
    }

    public void serializeBody(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("", "gnc_GncJob");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.BookElementsGncGncJob.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sr\u0000"
+"\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.sun"
+".msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar."
+"UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r"
+"\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0019psr\u00002com.sun.m"
+"sv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq"
+"\u0000~\u0000\u0018\u0001psr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom"
+".sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.gramm"
+"ar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001epsr\u0000#co"
+"m.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012L"
+"java/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000%xq\u0000~\u0000 t\u0000Nbiz.wolschon.f"
+"ileformats.gnucash.jwsdpimpl.generated.GncGncJobType.JobGuid"
+"Typet\u0000+http://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0013ppsq"
+"\u0000~\u0000\u001aq\u0000~\u0000\u0019psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001f"
+"Lorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/"
+"sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.datatype.xsd"
+".QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAto"
+"micType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000%L\u0000\btypeNameq\u0000~\u0000%L\u0000\nwhiteSpacet\u0000.Lcom"
+"/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3"
+".org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.Whit"
+"eSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype."
+"xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar."
+"Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.m"
+"sv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000%L\u0000\fnamespaceUR"
+"Iq\u0000~\u0000%xpq\u0000~\u00006q\u0000~\u00005sq\u0000~\u0000$t\u0000\u0004typet\u0000)http://www.w3.org/2001/XML"
+"Schema-instanceq\u0000~\u0000#sq\u0000~\u0000$t\u0000\bjob_guidt\u0000\u0000sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000"
+"~\u0000+q\u0000~\u0000\u0019psr\u0000#com.sun.msv.datatype.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z"
+"\u0000\risAlwaysValidxq\u0000~\u00000q\u0000~\u00005t\u0000\u0006stringsr\u00005com.sun.msv.datatype."
+"xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00008\u0001q\u0000~\u0000;sq\u0000~\u0000"
+"<q\u0000~\u0000Iq\u0000~\u00005sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0019pq\u0000~\u0000.q\u0000~\u0000>q\u0000~\u0000#sq\u0000~\u0000$t\u0000\u0006job_i"
+"dq\u0000~\u0000Csq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000Fsq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0019pq\u0000~\u0000.q\u0000~\u0000>q\u0000"
+"~\u0000#sq\u0000~\u0000$t\u0000\bjob_nameq\u0000~\u0000Csq\u0000~\u0000\u0013ppsq\u0000~\u0000\u0000q\u0000~\u0000\u0019p\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000Fs"
+"q\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0019pq\u0000~\u0000.q\u0000~\u0000>q\u0000~\u0000#sq\u0000~\u0000$t\u0000\rjob_referenceq\u0000~\u0000"
+"Cq\u0000~\u0000#sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u0015q\u0000~\u0000\u0019psq\u0000~\u0000\u001aq\u0000"
+"~\u0000\u0019pq\u0000~\u0000\u001dq\u0000~\u0000!q\u0000~\u0000#sq\u0000~\u0000$t\u0000Obiz.wolschon.fileformats.gnucash"
+".jwsdpimpl.generated.GncGncJobType.JobOwnerTypeq\u0000~\u0000(sq\u0000~\u0000\u0013pp"
+"sq\u0000~\u0000\u001aq\u0000~\u0000\u0019pq\u0000~\u0000.q\u0000~\u0000>q\u0000~\u0000#sq\u0000~\u0000$t\u0000\tjob_ownerq\u0000~\u0000Csq\u0000~\u0000\u0000pp\u0000s"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000+ppsr\u0000 com.sun.msv.datatype.xsd.IntType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.IntegerDerivedType\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001"
+"L\u0000\nbaseFacetst\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;xq\u0000"
+"~\u00000q\u0000~\u00005t\u0000\u0003intq\u0000~\u00009sr\u0000*com.sun.msv.datatype.xsd.MaxInclusive"
+"Facet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatype.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljava/lang/Object;xr\u00009com.sun.msv.data"
+"type.xsd.DataTypeWithValueConstraintFacet\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com."
+"sun.msv.datatype.xsd.DataTypeWithFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetF"
+"ixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypeq\u0000~\u0000oL\u0000\fconcreteTypet\u0000\'L"
+"com/sun/msv/datatype/xsd/ConcreteType;L\u0000\tfacetNameq\u0000~\u0000%xq\u0000~\u0000"
+"2ppq\u0000~\u00009\u0000\u0001sr\u0000*com.sun.msv.datatype.xsd.MinInclusiveFacet\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000sppq\u0000~\u00009\u0000\u0000sr\u0000!com.sun.msv.datatype.xsd.LongType\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000nq\u0000~\u00005t\u0000\u0004longq\u0000~\u00009sq\u0000~\u0000rppq\u0000~\u00009\u0000\u0001sq\u0000~\u0000yppq\u0000~\u0000"
+"9\u0000\u0000sr\u0000$com.sun.msv.datatype.xsd.IntegerType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000n"
+"q\u0000~\u00005t\u0000\u0007integerq\u0000~\u00009sr\u0000,com.sun.msv.datatype.xsd.FractionDig"
+"itsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun.msv.datatype.xsd.Data"
+"TypeWithLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002\u0000\u0000xq\u0000~\u0000vppq\u0000~\u00009\u0001\u0000sr\u0000#"
+"com.sun.msv.datatype.xsd.NumberType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u00000q\u0000~\u00005t\u0000\u0007"
+"decimalq\u0000~\u00009q\u0000~\u0000\u0087t\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q\u0000~\u0000\u0081t\u0000\fminInclusivesr"
+"\u0000\u000ejava.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010java.lang.Number\u0086\u00ac\u0095\u001d\u000b"
+"\u0094\u00e0\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000\u0081t\u0000\fmaxInclusivesq\u0000~\u0000\u008b\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000|q\u0000~\u0000\u008a"
+"sr\u0000\u0011java.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valuexq\u0000~\u0000\u008c\u0080\u0000\u0000\u0000q\u0000~\u0000|q\u0000~\u0000\u008e"
+"sq\u0000~\u0000\u0090\u007f\u00ff\u00ff\u00ffq\u0000~\u0000;sq\u0000~\u0000<q\u0000~\u0000qq\u0000~\u00005sq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0019pq\u0000~\u0000.q\u0000~\u0000"
+">q\u0000~\u0000#sq\u0000~\u0000$t\u0000\njob_activeq\u0000~\u0000Csq\u0000~\u0000\u001appq\u0000~\u0000Fsq\u0000~\u0000$t\u0000\u0007versionq"
+"\u0000~\u0000Csq\u0000~\u0000\u0013ppsq\u0000~\u0000\u001aq\u0000~\u0000\u0019pq\u0000~\u0000.q\u0000~\u0000>q\u0000~\u0000#sq\u0000~\u0000$t\u0000\ngnc_GncJobq\u0000"
+"~\u0000Csr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTa"
+"blet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-c"
+"om.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005co"
+"untB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/Expressi"
+"onPool;xp\u0000\u0000\u0000\u0019\u0001pq\u0000~\u0000\u000eq\u0000~\u0000)q\u0000~\u0000Mq\u0000~\u0000Sq\u0000~\u0000Zq\u0000~\u0000fq\u0000~\u0000\u0094q\u0000~\u0000\u009bq\u0000~\u0000\u000b"
+"q\u0000~\u0000\u000fq\u0000~\u0000Wq\u0000~\u0000\u0017q\u0000~\u0000bq\u0000~\u0000\u0014q\u0000~\u0000aq\u0000~\u0000\rq\u0000~\u0000\tq\u0000~\u0000\u0011q\u0000~\u0000_q\u0000~\u0000kq\u0000~\u0000E"
+"q\u0000~\u0000Rq\u0000~\u0000Yq\u0000~\u0000\fq\u0000~\u0000\nx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.BookElementsGncGncJobImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("gnc_GncJob" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("gnc_GncJob" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        if (("version" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.GncGncJobTypeImpl)biz.wolschon.fileformats.gnucash.jwsdpimpl.generated.impl.BookElementsGncGncJobImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  1 :
                        attIdx = context.getAttribute("", "version");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            attIdx = context.getAttribute("", "version");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
