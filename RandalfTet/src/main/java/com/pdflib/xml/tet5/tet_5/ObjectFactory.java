//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.02.28 alle 02:40:46 PM CET 
//


package com.pdflib.xml.tet5.tet_5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pdflib.xml.tet5.tet_5 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Text_QNAME = new QName("http://www.pdflib.com/XML/TET5/TET-5.0", "Text");
    private final static QName _Options_QNAME = new QName("http://www.pdflib.com/XML/TET5/TET-5.0", "Options");
    private final static QName _ColorSpaceRange_QNAME = new QName("http://www.pdflib.com/XML/TET5/TET-5.0", "Range");
    private final static QName _ColorSpaceColorant_QNAME = new QName("http://www.pdflib.com/XML/TET5/TET-5.0", "Colorant");
    private final static QName _ColorSpaceBlackPoint_QNAME = new QName("http://www.pdflib.com/XML/TET5/TET-5.0", "BlackPoint");
    private final static QName _ColorSpaceProcess_QNAME = new QName("http://www.pdflib.com/XML/TET5/TET-5.0", "Process");
    private final static QName _ColorSpaceLookup_QNAME = new QName("http://www.pdflib.com/XML/TET5/TET-5.0", "Lookup");
    private final static QName _ColorSpaceMatrix_QNAME = new QName("http://www.pdflib.com/XML/TET5/TET-5.0", "Matrix");
    private final static QName _ColorSpaceWhitePoint_QNAME = new QName("http://www.pdflib.com/XML/TET5/TET-5.0", "WhitePoint");
    private final static QName _ColorSpaceGamma_QNAME = new QName("http://www.pdflib.com/XML/TET5/TET-5.0", "Gamma");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pdflib.xml.tet5.tet_5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link OutputIntents }
     * 
     */
    public OutputIntents createOutputIntents() {
        return new OutputIntents();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link Table }
     * 
     */
    public Table createTable() {
        return new Table();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link ColorSpace }
     * 
     */
    public ColorSpace createColorSpace() {
        return new ColorSpace();
    }

    /**
     * Create an instance of {@link Function }
     * 
     */
    public Function createFunction() {
        return new Function();
    }

    /**
     * Create an instance of {@link Graphics }
     * 
     */
    public Graphics createGraphics() {
        return new Graphics();
    }

    /**
     * Create an instance of {@link Resources }
     * 
     */
    public Resources createResources() {
        return new Resources();
    }

    /**
     * Create an instance of {@link Resources.Patterns }
     * 
     */
    public Resources.Patterns createResourcesPatterns() {
        return new Resources.Patterns();
    }

    /**
     * Create an instance of {@link Resources.Images }
     * 
     */
    public Resources.Images createResourcesImages() {
        return new Resources.Images();
    }

    /**
     * Create an instance of {@link Resources.Fonts }
     * 
     */
    public Resources.Fonts createResourcesFonts() {
        return new Resources.Fonts();
    }

    /**
     * Create an instance of {@link Graphics.ICCProfiles }
     * 
     */
    public Graphics.ICCProfiles createGraphicsICCProfiles() {
        return new Graphics.ICCProfiles();
    }

    /**
     * Create an instance of {@link Graphics.Colors }
     * 
     */
    public Graphics.Colors createGraphicsColors() {
        return new Graphics.Colors();
    }

    /**
     * Create an instance of {@link ColorSpace.Process }
     * 
     */
    public ColorSpace.Process createColorSpaceProcess() {
        return new ColorSpace.Process();
    }

    /**
     * Create an instance of {@link List.Item }
     * 
     */
    public List.Item createListItem() {
        return new List.Item();
    }

    /**
     * Create an instance of {@link Table.Row }
     * 
     */
    public Table.Row createTableRow() {
        return new Table.Row();
    }

    /**
     * Create an instance of {@link Line.Word }
     * 
     */
    public Line.Word createLineWord() {
        return new Line.Word();
    }

    /**
     * Create an instance of {@link Document.Attachments }
     * 
     */
    public Document.Attachments createDocumentAttachments() {
        return new Document.Attachments();
    }

    /**
     * Create an instance of {@link Document.JavaScripts }
     * 
     */
    public Document.JavaScripts createDocumentJavaScripts() {
        return new Document.JavaScripts();
    }

    /**
     * Create an instance of {@link Document.Destinations }
     * 
     */
    public Document.Destinations createDocumentDestinations() {
        return new Document.Destinations();
    }

    /**
     * Create an instance of {@link Document.Pages }
     * 
     */
    public Document.Pages createDocumentPages() {
        return new Document.Pages();
    }

    /**
     * Create an instance of {@link Document.Pages.Page }
     * 
     */
    public Document.Pages.Page createDocumentPagesPage() {
        return new Document.Pages.Page();
    }

    /**
     * Create an instance of {@link Document.DocInfo }
     * 
     */
    public Document.DocInfo createDocumentDocInfo() {
        return new Document.DocInfo();
    }

    /**
     * Create an instance of {@link Document.SignatureFields }
     * 
     */
    public Document.SignatureFields createDocumentSignatureFields() {
        return new Document.SignatureFields();
    }

    /**
     * Create an instance of {@link A }
     * 
     */
    public A createA() {
        return new A();
    }

    /**
     * Create an instance of {@link TET }
     * 
     */
    public TET createTET() {
        return new TET();
    }

    /**
     * Create an instance of {@link Creation }
     * 
     */
    public Creation createCreation() {
        return new Creation();
    }

    /**
     * Create an instance of {@link Document.XFA }
     * 
     */
    public Document.XFA createDocumentXFA() {
        return new Document.XFA();
    }

    /**
     * Create an instance of {@link Document.Encryption }
     * 
     */
    public Document.Encryption createDocumentEncryption() {
        return new Document.Encryption();
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link OutputIntents.OutputIntent }
     * 
     */
    public OutputIntents.OutputIntent createOutputIntentsOutputIntent() {
        return new OutputIntents.OutputIntent();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link Document.Bookmarks }
     * 
     */
    public Document.Bookmarks createDocumentBookmarks() {
        return new Document.Bookmarks();
    }

    /**
     * Create an instance of {@link com.pdflib.xml.tet5.tet_5.Word }
     * 
     */
    public com.pdflib.xml.tet5.tet_5.Word createWord() {
        return new com.pdflib.xml.tet5.tet_5.Word();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link com.pdflib.xml.tet5.tet_5.Box }
     * 
     */
    public com.pdflib.xml.tet5.tet_5.Box createBox() {
        return new com.pdflib.xml.tet5.tet_5.Box();
    }

    /**
     * Create an instance of {@link Para }
     * 
     */
    public Para createPara() {
        return new Para();
    }

    /**
     * Create an instance of {@link PlacedImage }
     * 
     */
    public PlacedImage createPlacedImage() {
        return new PlacedImage();
    }

    /**
     * Create an instance of {@link Glyph }
     * 
     */
    public Glyph createGlyph() {
        return new Glyph();
    }

    /**
     * Create an instance of {@link ColorSpace.Colorant }
     * 
     */
    public ColorSpace.Colorant createColorSpaceColorant() {
        return new ColorSpace.Colorant();
    }

    /**
     * Create an instance of {@link Function.Bounds }
     * 
     */
    public Function.Bounds createFunctionBounds() {
        return new Function.Bounds();
    }

    /**
     * Create an instance of {@link Function.C0 }
     * 
     */
    public Function.C0 createFunctionC0() {
        return new Function.C0();
    }

    /**
     * Create an instance of {@link Function.C1 }
     * 
     */
    public Function.C1 createFunctionC1() {
        return new Function.C1();
    }

    /**
     * Create an instance of {@link Function.Decode }
     * 
     */
    public Function.Decode createFunctionDecode() {
        return new Function.Decode();
    }

    /**
     * Create an instance of {@link Function.Domain }
     * 
     */
    public Function.Domain createFunctionDomain() {
        return new Function.Domain();
    }

    /**
     * Create an instance of {@link Function.Encode }
     * 
     */
    public Function.Encode createFunctionEncode() {
        return new Function.Encode();
    }

    /**
     * Create an instance of {@link Function.Functions }
     * 
     */
    public Function.Functions createFunctionFunctions() {
        return new Function.Functions();
    }

    /**
     * Create an instance of {@link Function.Range }
     * 
     */
    public Function.Range createFunctionRange() {
        return new Function.Range();
    }

    /**
     * Create an instance of {@link Function.Size }
     * 
     */
    public Function.Size createFunctionSize() {
        return new Function.Size();
    }

    /**
     * Create an instance of {@link ColorSpace.WhitePoint }
     * 
     */
    public ColorSpace.WhitePoint createColorSpaceWhitePoint() {
        return new ColorSpace.WhitePoint();
    }

    /**
     * Create an instance of {@link ColorSpace.BlackPoint }
     * 
     */
    public ColorSpace.BlackPoint createColorSpaceBlackPoint() {
        return new ColorSpace.BlackPoint();
    }

    /**
     * Create an instance of {@link ColorSpace.Gamma }
     * 
     */
    public ColorSpace.Gamma createColorSpaceGamma() {
        return new ColorSpace.Gamma();
    }

    /**
     * Create an instance of {@link ColorSpace.Matrix }
     * 
     */
    public ColorSpace.Matrix createColorSpaceMatrix() {
        return new ColorSpace.Matrix();
    }

    /**
     * Create an instance of {@link ColorSpace.Range }
     * 
     */
    public ColorSpace.Range createColorSpaceRange() {
        return new ColorSpace.Range();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link Layers }
     * 
     */
    public Layers createLayers() {
        return new Layers();
    }

    /**
     * Create an instance of {@link Layer }
     * 
     */
    public Layer createLayer() {
        return new Layer();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link Bookmark }
     * 
     */
    public Bookmark createBookmark() {
        return new Bookmark();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link Resources.ColorSpaces }
     * 
     */
    public Resources.ColorSpaces createResourcesColorSpaces() {
        return new Resources.ColorSpaces();
    }

    /**
     * Create an instance of {@link Resources.Patterns.Pattern }
     * 
     */
    public Resources.Patterns.Pattern createResourcesPatternsPattern() {
        return new Resources.Patterns.Pattern();
    }

    /**
     * Create an instance of {@link Resources.Images.Image }
     * 
     */
    public Resources.Images.Image createResourcesImagesImage() {
        return new Resources.Images.Image();
    }

    /**
     * Create an instance of {@link Resources.Fonts.Font }
     * 
     */
    public Resources.Fonts.Font createResourcesFontsFont() {
        return new Resources.Fonts.Font();
    }

    /**
     * Create an instance of {@link Graphics.ICCProfiles.ICCProfile }
     * 
     */
    public Graphics.ICCProfiles.ICCProfile createGraphicsICCProfilesICCProfile() {
        return new Graphics.ICCProfiles.ICCProfile();
    }

    /**
     * Create an instance of {@link Graphics.Colors.Color }
     * 
     */
    public Graphics.Colors.Color createGraphicsColorsColor() {
        return new Graphics.Colors.Color();
    }

    /**
     * Create an instance of {@link ColorSpace.Process.Component }
     * 
     */
    public ColorSpace.Process.Component createColorSpaceProcessComponent() {
        return new ColorSpace.Process.Component();
    }

    /**
     * Create an instance of {@link List.Item.Label }
     * 
     */
    public List.Item.Label createListItemLabel() {
        return new List.Item.Label();
    }

    /**
     * Create an instance of {@link List.Item.Body }
     * 
     */
    public List.Item.Body createListItemBody() {
        return new List.Item.Body();
    }

    /**
     * Create an instance of {@link Table.Row.Cell }
     * 
     */
    public Table.Row.Cell createTableRowCell() {
        return new Table.Row.Cell();
    }

    /**
     * Create an instance of {@link Line.Word.Box }
     * 
     */
    public Line.Word.Box createLineWordBox() {
        return new Line.Word.Box();
    }

    /**
     * Create an instance of {@link Document.Attachments.Attachment }
     * 
     */
    public Document.Attachments.Attachment createDocumentAttachmentsAttachment() {
        return new Document.Attachments.Attachment();
    }

    /**
     * Create an instance of {@link Document.JavaScripts.JavaScript }
     * 
     */
    public Document.JavaScripts.JavaScript createDocumentJavaScriptsJavaScript() {
        return new Document.JavaScripts.JavaScript();
    }

    /**
     * Create an instance of {@link Document.Destinations.Destination }
     * 
     */
    public Document.Destinations.Destination createDocumentDestinationsDestination() {
        return new Document.Destinations.Destination();
    }

    /**
     * Create an instance of {@link Document.Pages.Page.Annotations }
     * 
     */
    public Document.Pages.Page.Annotations createDocumentPagesPageAnnotations() {
        return new Document.Pages.Page.Annotations();
    }

    /**
     * Create an instance of {@link Document.Pages.Page.Fields }
     * 
     */
    public Document.Pages.Page.Fields createDocumentPagesPageFields() {
        return new Document.Pages.Page.Fields();
    }

    /**
     * Create an instance of {@link Document.DocInfo.Custom }
     * 
     */
    public Document.DocInfo.Custom createDocumentDocInfoCustom() {
        return new Document.DocInfo.Custom();
    }

    /**
     * Create an instance of {@link Document.DocInfo.CustomBinary }
     * 
     */
    public Document.DocInfo.CustomBinary createDocumentDocInfoCustomBinary() {
        return new Document.DocInfo.CustomBinary();
    }

    /**
     * Create an instance of {@link Document.SignatureFields.SignatureField }
     * 
     */
    public Document.SignatureFields.SignatureField createDocumentSignatureFieldsSignatureField() {
        return new Document.SignatureFields.SignatureField();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Text }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", name = "Text")
    public JAXBElement<Text> createText(Text value) {
        return new JAXBElement<Text>(_Text_QNAME, Text.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", name = "Options")
    public JAXBElement<String> createOptions(String value) {
        return new JAXBElement<String>(_Options_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorSpace.Range }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", name = "Range", scope = ColorSpace.class)
    public JAXBElement<ColorSpace.Range> createColorSpaceRange(ColorSpace.Range value) {
        return new JAXBElement<ColorSpace.Range>(_ColorSpaceRange_QNAME, ColorSpace.Range.class, ColorSpace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorSpace.Colorant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", name = "Colorant", scope = ColorSpace.class)
    public JAXBElement<ColorSpace.Colorant> createColorSpaceColorant(ColorSpace.Colorant value) {
        return new JAXBElement<ColorSpace.Colorant>(_ColorSpaceColorant_QNAME, ColorSpace.Colorant.class, ColorSpace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorSpace.BlackPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", name = "BlackPoint", scope = ColorSpace.class)
    public JAXBElement<ColorSpace.BlackPoint> createColorSpaceBlackPoint(ColorSpace.BlackPoint value) {
        return new JAXBElement<ColorSpace.BlackPoint>(_ColorSpaceBlackPoint_QNAME, ColorSpace.BlackPoint.class, ColorSpace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorSpace.Process }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", name = "Process", scope = ColorSpace.class)
    public JAXBElement<ColorSpace.Process> createColorSpaceProcess(ColorSpace.Process value) {
        return new JAXBElement<ColorSpace.Process>(_ColorSpaceProcess_QNAME, ColorSpace.Process.class, ColorSpace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", name = "Lookup", scope = ColorSpace.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createColorSpaceLookup(byte[] value) {
        return new JAXBElement<byte[]>(_ColorSpaceLookup_QNAME, byte[].class, ColorSpace.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorSpace.Matrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", name = "Matrix", scope = ColorSpace.class)
    public JAXBElement<ColorSpace.Matrix> createColorSpaceMatrix(ColorSpace.Matrix value) {
        return new JAXBElement<ColorSpace.Matrix>(_ColorSpaceMatrix_QNAME, ColorSpace.Matrix.class, ColorSpace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorSpace.WhitePoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", name = "WhitePoint", scope = ColorSpace.class)
    public JAXBElement<ColorSpace.WhitePoint> createColorSpaceWhitePoint(ColorSpace.WhitePoint value) {
        return new JAXBElement<ColorSpace.WhitePoint>(_ColorSpaceWhitePoint_QNAME, ColorSpace.WhitePoint.class, ColorSpace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorSpace.Gamma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pdflib.com/XML/TET5/TET-5.0", name = "Gamma", scope = ColorSpace.class)
    public JAXBElement<ColorSpace.Gamma> createColorSpaceGamma(ColorSpace.Gamma value) {
        return new JAXBElement<ColorSpace.Gamma>(_ColorSpaceGamma_QNAME, ColorSpace.Gamma.class, ColorSpace.class, value);
    }

}
