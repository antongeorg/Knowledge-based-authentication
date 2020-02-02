
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

    private final static QName _EpistrofiExetasatikouKentrou_QNAME = new QName("http://loginwebservices/", "epistrofi_exetasatikou_kentrou");
    private final static QName _EpistrofiExetasatikouKentrouResponse_QNAME = new QName("http://loginwebservices/", "epistrofi_exetasatikou_kentrouResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EpistrofiExetasatikouKentrou }
     * 
     */
    public EpistrofiExetasatikouKentrou createEpistrofiExetasatikouKentrou() {
        return new EpistrofiExetasatikouKentrou();
    }

    /**
     * Create an instance of {@link EpistrofiExetasatikouKentrouResponse }
     * 
     */
    public EpistrofiExetasatikouKentrouResponse createEpistrofiExetasatikouKentrouResponse() {
        return new EpistrofiExetasatikouKentrouResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpistrofiExetasatikouKentrou }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "epistrofi_exetasatikou_kentrou")
    public JAXBElement<EpistrofiExetasatikouKentrou> createEpistrofiExetasatikouKentrou(EpistrofiExetasatikouKentrou value) {
        return new JAXBElement<EpistrofiExetasatikouKentrou>(_EpistrofiExetasatikouKentrou_QNAME, EpistrofiExetasatikouKentrou.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EpistrofiExetasatikouKentrouResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "epistrofi_exetasatikou_kentrouResponse")
    public JAXBElement<EpistrofiExetasatikouKentrouResponse> createEpistrofiExetasatikouKentrouResponse(EpistrofiExetasatikouKentrouResponse value) {
        return new JAXBElement<EpistrofiExetasatikouKentrouResponse>(_EpistrofiExetasatikouKentrouResponse_QNAME, EpistrofiExetasatikouKentrouResponse.class, null, value);
    }

}
