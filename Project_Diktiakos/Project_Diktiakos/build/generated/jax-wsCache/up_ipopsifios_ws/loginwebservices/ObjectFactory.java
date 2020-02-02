
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

    private final static QName _ShowCountUpIpopsifios_QNAME = new QName("http://loginwebservices/", "showCount_up_ipopsifios");
    private final static QName _ShowCountUpIpopsifiosResponse_QNAME = new QName("http://loginwebservices/", "showCount_up_ipopsifiosResponse");
    private final static QName _UpIpopsifios_QNAME = new QName("http://loginwebservices/", "up_ipopsifios");
    private final static QName _UpIpopsifiosResponse_QNAME = new QName("http://loginwebservices/", "up_ipopsifiosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowCountUpIpopsifios }
     * 
     */
    public ShowCountUpIpopsifios createShowCountUpIpopsifios() {
        return new ShowCountUpIpopsifios();
    }

    /**
     * Create an instance of {@link ShowCountUpIpopsifiosResponse }
     * 
     */
    public ShowCountUpIpopsifiosResponse createShowCountUpIpopsifiosResponse() {
        return new ShowCountUpIpopsifiosResponse();
    }

    /**
     * Create an instance of {@link UpIpopsifios }
     * 
     */
    public UpIpopsifios createUpIpopsifios() {
        return new UpIpopsifios();
    }

    /**
     * Create an instance of {@link UpIpopsifiosResponse }
     * 
     */
    public UpIpopsifiosResponse createUpIpopsifiosResponse() {
        return new UpIpopsifiosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCountUpIpopsifios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "showCount_up_ipopsifios")
    public JAXBElement<ShowCountUpIpopsifios> createShowCountUpIpopsifios(ShowCountUpIpopsifios value) {
        return new JAXBElement<ShowCountUpIpopsifios>(_ShowCountUpIpopsifios_QNAME, ShowCountUpIpopsifios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCountUpIpopsifiosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "showCount_up_ipopsifiosResponse")
    public JAXBElement<ShowCountUpIpopsifiosResponse> createShowCountUpIpopsifiosResponse(ShowCountUpIpopsifiosResponse value) {
        return new JAXBElement<ShowCountUpIpopsifiosResponse>(_ShowCountUpIpopsifiosResponse_QNAME, ShowCountUpIpopsifiosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpIpopsifios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "up_ipopsifios")
    public JAXBElement<UpIpopsifios> createUpIpopsifios(UpIpopsifios value) {
        return new JAXBElement<UpIpopsifios>(_UpIpopsifios_QNAME, UpIpopsifios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpIpopsifiosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "up_ipopsifiosResponse")
    public JAXBElement<UpIpopsifiosResponse> createUpIpopsifiosResponse(UpIpopsifiosResponse value) {
        return new JAXBElement<UpIpopsifiosResponse>(_UpIpopsifiosResponse_QNAME, UpIpopsifiosResponse.class, null, value);
    }

}
