
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

    private final static QName _PistopoisiXristi_QNAME = new QName("http://loginwebservices/", "pistopoisi_xristi");
    private final static QName _PistopoisiXristiResponse_QNAME = new QName("http://loginwebservices/", "pistopoisi_xristiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PistopoisiXristi }
     * 
     */
    public PistopoisiXristi createPistopoisiXristi() {
        return new PistopoisiXristi();
    }

    /**
     * Create an instance of {@link PistopoisiXristiResponse }
     * 
     */
    public PistopoisiXristiResponse createPistopoisiXristiResponse() {
        return new PistopoisiXristiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PistopoisiXristi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "pistopoisi_xristi")
    public JAXBElement<PistopoisiXristi> createPistopoisiXristi(PistopoisiXristi value) {
        return new JAXBElement<PistopoisiXristi>(_PistopoisiXristi_QNAME, PistopoisiXristi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PistopoisiXristiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "pistopoisi_xristiResponse")
    public JAXBElement<PistopoisiXristiResponse> createPistopoisiXristiResponse(PistopoisiXristiResponse value) {
        return new JAXBElement<PistopoisiXristiResponse>(_PistopoisiXristiResponse_QNAME, PistopoisiXristiResponse.class, null, value);
    }

}
