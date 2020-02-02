
package loginwebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the loginwebservices package. 
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

    private final static QName _PistopoisiExetastikouKentrou_QNAME = new QName("http://loginwebservices/", "pistopoisi_exetastikou_kentrou");
    private final static QName _PistopoisiExetastikouKentrouResponse_QNAME = new QName("http://loginwebservices/", "pistopoisi_exetastikou_kentrouResponse");
    private final static QName _ShowCount2_QNAME = new QName("http://loginwebservices/", "showCount2");
    private final static QName _ShowCount2Response_QNAME = new QName("http://loginwebservices/", "showCount2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PistopoisiExetastikouKentrou }
     * 
     */
    public PistopoisiExetastikouKentrou createPistopoisiExetastikouKentrou() {
        return new PistopoisiExetastikouKentrou();
    }

    /**
     * Create an instance of {@link PistopoisiExetastikouKentrouResponse }
     * 
     */
    public PistopoisiExetastikouKentrouResponse createPistopoisiExetastikouKentrouResponse() {
        return new PistopoisiExetastikouKentrouResponse();
    }

    /**
     * Create an instance of {@link ShowCount2 }
     * 
     */
    public ShowCount2 createShowCount2() {
        return new ShowCount2();
    }

    /**
     * Create an instance of {@link ShowCount2Response }
     * 
     */
    public ShowCount2Response createShowCount2Response() {
        return new ShowCount2Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PistopoisiExetastikouKentrou }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "pistopoisi_exetastikou_kentrou")
    public JAXBElement<PistopoisiExetastikouKentrou> createPistopoisiExetastikouKentrou(PistopoisiExetastikouKentrou value) {
        return new JAXBElement<PistopoisiExetastikouKentrou>(_PistopoisiExetastikouKentrou_QNAME, PistopoisiExetastikouKentrou.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PistopoisiExetastikouKentrouResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "pistopoisi_exetastikou_kentrouResponse")
    public JAXBElement<PistopoisiExetastikouKentrouResponse> createPistopoisiExetastikouKentrouResponse(PistopoisiExetastikouKentrouResponse value) {
        return new JAXBElement<PistopoisiExetastikouKentrouResponse>(_PistopoisiExetastikouKentrouResponse_QNAME, PistopoisiExetastikouKentrouResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCount2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "showCount2")
    public JAXBElement<ShowCount2> createShowCount2(ShowCount2 value) {
        return new JAXBElement<ShowCount2>(_ShowCount2_QNAME, ShowCount2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCount2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "showCount2Response")
    public JAXBElement<ShowCount2Response> createShowCount2Response(ShowCount2Response value) {
        return new JAXBElement<ShowCount2Response>(_ShowCount2Response_QNAME, ShowCount2Response.class, null, value);
    }

}
