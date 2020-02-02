
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

    private final static QName _ShowCountUpThemata_QNAME = new QName("http://loginwebservices/", "showCount_up_themata");
    private final static QName _ShowCountUpThemataResponse_QNAME = new QName("http://loginwebservices/", "showCount_up_themataResponse");
    private final static QName _UpThemata_QNAME = new QName("http://loginwebservices/", "up_themata");
    private final static QName _UpThemataResponse_QNAME = new QName("http://loginwebservices/", "up_themataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowCountUpThemata }
     * 
     */
    public ShowCountUpThemata createShowCountUpThemata() {
        return new ShowCountUpThemata();
    }

    /**
     * Create an instance of {@link ShowCountUpThemataResponse }
     * 
     */
    public ShowCountUpThemataResponse createShowCountUpThemataResponse() {
        return new ShowCountUpThemataResponse();
    }

    /**
     * Create an instance of {@link UpThemata }
     * 
     */
    public UpThemata createUpThemata() {
        return new UpThemata();
    }

    /**
     * Create an instance of {@link UpThemataResponse }
     * 
     */
    public UpThemataResponse createUpThemataResponse() {
        return new UpThemataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCountUpThemata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "showCount_up_themata")
    public JAXBElement<ShowCountUpThemata> createShowCountUpThemata(ShowCountUpThemata value) {
        return new JAXBElement<ShowCountUpThemata>(_ShowCountUpThemata_QNAME, ShowCountUpThemata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCountUpThemataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "showCount_up_themataResponse")
    public JAXBElement<ShowCountUpThemataResponse> createShowCountUpThemataResponse(ShowCountUpThemataResponse value) {
        return new JAXBElement<ShowCountUpThemataResponse>(_ShowCountUpThemataResponse_QNAME, ShowCountUpThemataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpThemata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "up_themata")
    public JAXBElement<UpThemata> createUpThemata(UpThemata value) {
        return new JAXBElement<UpThemata>(_UpThemata_QNAME, UpThemata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpThemataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "up_themataResponse")
    public JAXBElement<UpThemataResponse> createUpThemataResponse(UpThemataResponse value) {
        return new JAXBElement<UpThemataResponse>(_UpThemataResponse_QNAME, UpThemataResponse.class, null, value);
    }

}
