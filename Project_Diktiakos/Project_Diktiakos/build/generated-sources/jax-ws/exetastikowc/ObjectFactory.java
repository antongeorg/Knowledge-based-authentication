
package exetastikowc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the exetastikowc package. 
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

    private final static QName _Foo3_QNAME = new QName("http://loginwebservices/", "foo3");
    private final static QName _Foo3Response_QNAME = new QName("http://loginwebservices/", "foo3Response");
    private final static QName _ShowCount1_QNAME = new QName("http://loginwebservices/", "showCount1");
    private final static QName _ShowCount1Response_QNAME = new QName("http://loginwebservices/", "showCount1Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: exetastikowc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Foo3 }
     * 
     */
    public Foo3 createFoo3() {
        return new Foo3();
    }

    /**
     * Create an instance of {@link Foo3Response }
     * 
     */
    public Foo3Response createFoo3Response() {
        return new Foo3Response();
    }

    /**
     * Create an instance of {@link ShowCount1 }
     * 
     */
    public ShowCount1 createShowCount1() {
        return new ShowCount1();
    }

    /**
     * Create an instance of {@link ShowCount1Response }
     * 
     */
    public ShowCount1Response createShowCount1Response() {
        return new ShowCount1Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Foo3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "foo3")
    public JAXBElement<Foo3> createFoo3(Foo3 value) {
        return new JAXBElement<Foo3>(_Foo3_QNAME, Foo3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Foo3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "foo3Response")
    public JAXBElement<Foo3Response> createFoo3Response(Foo3Response value) {
        return new JAXBElement<Foo3Response>(_Foo3Response_QNAME, Foo3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCount1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "showCount1")
    public JAXBElement<ShowCount1> createShowCount1(ShowCount1 value) {
        return new JAXBElement<ShowCount1>(_ShowCount1_QNAME, ShowCount1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowCount1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "showCount1Response")
    public JAXBElement<ShowCount1Response> createShowCount1Response(ShowCount1Response value) {
        return new JAXBElement<ShowCount1Response>(_ShowCount1Response_QNAME, ShowCount1Response.class, null, value);
    }

}
