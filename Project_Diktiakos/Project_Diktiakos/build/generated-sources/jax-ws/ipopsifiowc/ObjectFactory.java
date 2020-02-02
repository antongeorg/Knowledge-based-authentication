
package ipopsifiowc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ipopsifiowc package. 
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

    private final static QName _Foo2_QNAME = new QName("http://loginwebservices/", "foo2");
    private final static QName _Foo2Response_QNAME = new QName("http://loginwebservices/", "foo2Response");
    private final static QName _ShowCount_QNAME = new QName("http://loginwebservices/", "showCount");
    private final static QName _ShowCountResponse_QNAME = new QName("http://loginwebservices/", "showCountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ipopsifiowc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Foo2 }
     * 
     */
    public Foo2 createFoo2() {
        return new Foo2();
    }

    /**
     * Create an instance of {@link Foo2Response }
     * 
     */
    public Foo2Response createFoo2Response() {
        return new Foo2Response();
    }

    /**
     * Create an instance of {@link ShowCount }
     * 
     */
    public ShowCount createShowCount() {
        return new ShowCount();
    }

    /**
     * Create an instance of {@link ShowCountResponse }
     * 
     */
    public ShowCountResponse createShowCountResponse() {
        return new ShowCountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Foo2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "foo2")
    public JAXBElement<Foo2> createFoo2(Foo2 value) {
        return new JAXBElement<Foo2>(_Foo2_QNAME, Foo2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Foo2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "foo2Response")
    public JAXBElement<Foo2Response> createFoo2Response(Foo2Response value) {
        return new JAXBElement<Foo2Response>(_Foo2Response_QNAME, Foo2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "showCount")
    public JAXBElement<ShowCount> createShowCount(ShowCount value) {
        return new JAXBElement<ShowCount>(_ShowCount_QNAME, ShowCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "showCountResponse")
    public JAXBElement<ShowCountResponse> createShowCountResponse(ShowCountResponse value) {
        return new JAXBElement<ShowCountResponse>(_ShowCountResponse_QNAME, ShowCountResponse.class, null, value);
    }

}
