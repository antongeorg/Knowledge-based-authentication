
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

    private final static QName _EgkrisiIpopsifiou_QNAME = new QName("http://loginwebservices/", "egkrisi_ipopsifiou");
    private final static QName _EgkrisiIpopsifiouResponse_QNAME = new QName("http://loginwebservices/", "egkrisi_ipopsifiouResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EgkrisiIpopsifiou }
     * 
     */
    public EgkrisiIpopsifiou createEgkrisiIpopsifiou() {
        return new EgkrisiIpopsifiou();
    }

    /**
     * Create an instance of {@link EgkrisiIpopsifiouResponse }
     * 
     */
    public EgkrisiIpopsifiouResponse createEgkrisiIpopsifiouResponse() {
        return new EgkrisiIpopsifiouResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgkrisiIpopsifiou }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "egkrisi_ipopsifiou")
    public JAXBElement<EgkrisiIpopsifiou> createEgkrisiIpopsifiou(EgkrisiIpopsifiou value) {
        return new JAXBElement<EgkrisiIpopsifiou>(_EgkrisiIpopsifiou_QNAME, EgkrisiIpopsifiou.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgkrisiIpopsifiouResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "egkrisi_ipopsifiouResponse")
    public JAXBElement<EgkrisiIpopsifiouResponse> createEgkrisiIpopsifiouResponse(EgkrisiIpopsifiouResponse value) {
        return new JAXBElement<EgkrisiIpopsifiouResponse>(_EgkrisiIpopsifiouResponse_QNAME, EgkrisiIpopsifiouResponse.class, null, value);
    }

}
