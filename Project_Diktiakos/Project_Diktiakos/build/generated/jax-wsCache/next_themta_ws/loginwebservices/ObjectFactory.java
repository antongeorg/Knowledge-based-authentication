
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

    private final static QName _UpdateThematon_QNAME = new QName("http://loginwebservices/", "update_thematon");
    private final static QName _UpdateThematonResponse_QNAME = new QName("http://loginwebservices/", "update_thematonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateThematon }
     * 
     */
    public UpdateThematon createUpdateThematon() {
        return new UpdateThematon();
    }

    /**
     * Create an instance of {@link UpdateThematonResponse }
     * 
     */
    public UpdateThematonResponse createUpdateThematonResponse() {
        return new UpdateThematonResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateThematon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "update_thematon")
    public JAXBElement<UpdateThematon> createUpdateThematon(UpdateThematon value) {
        return new JAXBElement<UpdateThematon>(_UpdateThematon_QNAME, UpdateThematon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateThematonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "update_thematonResponse")
    public JAXBElement<UpdateThematonResponse> createUpdateThematonResponse(UpdateThematonResponse value) {
        return new JAXBElement<UpdateThematonResponse>(_UpdateThematonResponse_QNAME, UpdateThematonResponse.class, null, value);
    }

}
