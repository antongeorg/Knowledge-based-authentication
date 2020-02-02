
package java6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the java6 package. 
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

    private final static QName _EgkrisiDiaxiristiKentrouResponse_QNAME = new QName("http://loginwebservices/", "egkrisi_diaxiristi_kentrouResponse");
    private final static QName _EgkrisiDiaxiristiKentrou_QNAME = new QName("http://loginwebservices/", "egkrisi_diaxiristi_kentrou");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: java6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EgkrisiDiaxiristiKentrou }
     * 
     */
    public EgkrisiDiaxiristiKentrou createEgkrisiDiaxiristiKentrou() {
        return new EgkrisiDiaxiristiKentrou();
    }

    /**
     * Create an instance of {@link EgkrisiDiaxiristiKentrouResponse }
     * 
     */
    public EgkrisiDiaxiristiKentrouResponse createEgkrisiDiaxiristiKentrouResponse() {
        return new EgkrisiDiaxiristiKentrouResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgkrisiDiaxiristiKentrouResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "egkrisi_diaxiristi_kentrouResponse")
    public JAXBElement<EgkrisiDiaxiristiKentrouResponse> createEgkrisiDiaxiristiKentrouResponse(EgkrisiDiaxiristiKentrouResponse value) {
        return new JAXBElement<EgkrisiDiaxiristiKentrouResponse>(_EgkrisiDiaxiristiKentrouResponse_QNAME, EgkrisiDiaxiristiKentrouResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgkrisiDiaxiristiKentrou }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "egkrisi_diaxiristi_kentrou")
    public JAXBElement<EgkrisiDiaxiristiKentrou> createEgkrisiDiaxiristiKentrou(EgkrisiDiaxiristiKentrou value) {
        return new JAXBElement<EgkrisiDiaxiristiKentrou>(_EgkrisiDiaxiristiKentrou_QNAME, EgkrisiDiaxiristiKentrou.class, null, value);
    }

}
