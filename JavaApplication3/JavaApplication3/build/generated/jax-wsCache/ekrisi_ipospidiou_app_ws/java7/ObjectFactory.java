
package java7;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the java7 package. 
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

    private final static QName _EgkrisiIpopsifiouAppResponse_QNAME = new QName("http://loginwebservices/", "egkrisi_ipopsifiou_appResponse");
    private final static QName _EgkrisiIpopsifiouApp_QNAME = new QName("http://loginwebservices/", "egkrisi_ipopsifiou_app");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: java7
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EgkrisiIpopsifiouApp }
     * 
     */
    public EgkrisiIpopsifiouApp createEgkrisiIpopsifiouApp() {
        return new EgkrisiIpopsifiouApp();
    }

    /**
     * Create an instance of {@link EgkrisiIpopsifiouAppResponse }
     * 
     */
    public EgkrisiIpopsifiouAppResponse createEgkrisiIpopsifiouAppResponse() {
        return new EgkrisiIpopsifiouAppResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgkrisiIpopsifiouAppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "egkrisi_ipopsifiou_appResponse")
    public JAXBElement<EgkrisiIpopsifiouAppResponse> createEgkrisiIpopsifiouAppResponse(EgkrisiIpopsifiouAppResponse value) {
        return new JAXBElement<EgkrisiIpopsifiouAppResponse>(_EgkrisiIpopsifiouAppResponse_QNAME, EgkrisiIpopsifiouAppResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgkrisiIpopsifiouApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "egkrisi_ipopsifiou_app")
    public JAXBElement<EgkrisiIpopsifiouApp> createEgkrisiIpopsifiouApp(EgkrisiIpopsifiouApp value) {
        return new JAXBElement<EgkrisiIpopsifiouApp>(_EgkrisiIpopsifiouApp_QNAME, EgkrisiIpopsifiouApp.class, null, value);
    }

}
