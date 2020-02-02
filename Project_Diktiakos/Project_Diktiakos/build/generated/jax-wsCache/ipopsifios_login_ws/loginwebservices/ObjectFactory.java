
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

    private final static QName _IpopsifiosLogin_QNAME = new QName("http://loginwebservices/", "ipopsifios_login");
    private final static QName _IpopsifiosLoginResponse_QNAME = new QName("http://loginwebservices/", "ipopsifios_loginResponse");
    private final static QName _ShowName_QNAME = new QName("http://loginwebservices/", "show_name");
    private final static QName _ShowNameResponse_QNAME = new QName("http://loginwebservices/", "show_nameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IpopsifiosLogin }
     * 
     */
    public IpopsifiosLogin createIpopsifiosLogin() {
        return new IpopsifiosLogin();
    }

    /**
     * Create an instance of {@link IpopsifiosLoginResponse }
     * 
     */
    public IpopsifiosLoginResponse createIpopsifiosLoginResponse() {
        return new IpopsifiosLoginResponse();
    }

    /**
     * Create an instance of {@link ShowName }
     * 
     */
    public ShowName createShowName() {
        return new ShowName();
    }

    /**
     * Create an instance of {@link ShowNameResponse }
     * 
     */
    public ShowNameResponse createShowNameResponse() {
        return new ShowNameResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IpopsifiosLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "ipopsifios_login")
    public JAXBElement<IpopsifiosLogin> createIpopsifiosLogin(IpopsifiosLogin value) {
        return new JAXBElement<IpopsifiosLogin>(_IpopsifiosLogin_QNAME, IpopsifiosLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IpopsifiosLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "ipopsifios_loginResponse")
    public JAXBElement<IpopsifiosLoginResponse> createIpopsifiosLoginResponse(IpopsifiosLoginResponse value) {
        return new JAXBElement<IpopsifiosLoginResponse>(_IpopsifiosLoginResponse_QNAME, IpopsifiosLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "show_name")
    public JAXBElement<ShowName> createShowName(ShowName value) {
        return new JAXBElement<ShowName>(_ShowName_QNAME, ShowName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "show_nameResponse")
    public JAXBElement<ShowNameResponse> createShowNameResponse(ShowNameResponse value) {
        return new JAXBElement<ShowNameResponse>(_ShowNameResponse_QNAME, ShowNameResponse.class, null, value);
    }

}
