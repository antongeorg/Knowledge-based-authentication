
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

    private final static QName _AnaforaKodikosThematon_QNAME = new QName("http://loginwebservices/", "anafora_kodikos_thematon");
    private final static QName _AnaforaKodikosThematonResponse_QNAME = new QName("http://loginwebservices/", "anafora_kodikos_thematonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnaforaKodikosThematon }
     * 
     */
    public AnaforaKodikosThematon createAnaforaKodikosThematon() {
        return new AnaforaKodikosThematon();
    }

    /**
     * Create an instance of {@link AnaforaKodikosThematonResponse }
     * 
     */
    public AnaforaKodikosThematonResponse createAnaforaKodikosThematonResponse() {
        return new AnaforaKodikosThematonResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnaforaKodikosThematon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "anafora_kodikos_thematon")
    public JAXBElement<AnaforaKodikosThematon> createAnaforaKodikosThematon(AnaforaKodikosThematon value) {
        return new JAXBElement<AnaforaKodikosThematon>(_AnaforaKodikosThematon_QNAME, AnaforaKodikosThematon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnaforaKodikosThematonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "anafora_kodikos_thematonResponse")
    public JAXBElement<AnaforaKodikosThematonResponse> createAnaforaKodikosThematonResponse(AnaforaKodikosThematonResponse value) {
        return new JAXBElement<AnaforaKodikosThematonResponse>(_AnaforaKodikosThematonResponse_QNAME, AnaforaKodikosThematonResponse.class, null, value);
    }

}
