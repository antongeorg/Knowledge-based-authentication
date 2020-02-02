
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

    private final static QName _ReturnApotelesmata_QNAME = new QName("http://loginwebservices/", "return_apotelesmata");
    private final static QName _ReturnApotelesmataResponse_QNAME = new QName("http://loginwebservices/", "return_apotelesmataResponse");
    private final static QName _ShowTelikaApotelesmata_QNAME = new QName("http://loginwebservices/", "show_telika_apotelesmata");
    private final static QName _ShowTelikaApotelesmataResponse_QNAME = new QName("http://loginwebservices/", "show_telika_apotelesmataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnApotelesmata }
     * 
     */
    public ReturnApotelesmata createReturnApotelesmata() {
        return new ReturnApotelesmata();
    }

    /**
     * Create an instance of {@link ReturnApotelesmataResponse }
     * 
     */
    public ReturnApotelesmataResponse createReturnApotelesmataResponse() {
        return new ReturnApotelesmataResponse();
    }

    /**
     * Create an instance of {@link ShowTelikaApotelesmata }
     * 
     */
    public ShowTelikaApotelesmata createShowTelikaApotelesmata() {
        return new ShowTelikaApotelesmata();
    }

    /**
     * Create an instance of {@link ShowTelikaApotelesmataResponse }
     * 
     */
    public ShowTelikaApotelesmataResponse createShowTelikaApotelesmataResponse() {
        return new ShowTelikaApotelesmataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnApotelesmata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "return_apotelesmata")
    public JAXBElement<ReturnApotelesmata> createReturnApotelesmata(ReturnApotelesmata value) {
        return new JAXBElement<ReturnApotelesmata>(_ReturnApotelesmata_QNAME, ReturnApotelesmata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnApotelesmataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "return_apotelesmataResponse")
    public JAXBElement<ReturnApotelesmataResponse> createReturnApotelesmataResponse(ReturnApotelesmataResponse value) {
        return new JAXBElement<ReturnApotelesmataResponse>(_ReturnApotelesmataResponse_QNAME, ReturnApotelesmataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowTelikaApotelesmata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "show_telika_apotelesmata")
    public JAXBElement<ShowTelikaApotelesmata> createShowTelikaApotelesmata(ShowTelikaApotelesmata value) {
        return new JAXBElement<ShowTelikaApotelesmata>(_ShowTelikaApotelesmata_QNAME, ShowTelikaApotelesmata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowTelikaApotelesmataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "show_telika_apotelesmataResponse")
    public JAXBElement<ShowTelikaApotelesmataResponse> createShowTelikaApotelesmataResponse(ShowTelikaApotelesmataResponse value) {
        return new JAXBElement<ShowTelikaApotelesmataResponse>(_ShowTelikaApotelesmataResponse_QNAME, ShowTelikaApotelesmataResponse.class, null, value);
    }

}
