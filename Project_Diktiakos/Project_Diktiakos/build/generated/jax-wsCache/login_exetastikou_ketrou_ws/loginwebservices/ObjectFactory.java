
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

    private final static QName _LoginExetastikouKentrou_QNAME = new QName("http://loginwebservices/", "login_exetastikou_kentrou");
    private final static QName _LoginExetastikouKentrouResponse_QNAME = new QName("http://loginwebservices/", "login_exetastikou_kentrouResponse");
    private final static QName _ReturnApp_QNAME = new QName("http://loginwebservices/", "return_app");
    private final static QName _ReturnAppResponse_QNAME = new QName("http://loginwebservices/", "return_appResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginExetastikouKentrou }
     * 
     */
    public LoginExetastikouKentrou createLoginExetastikouKentrou() {
        return new LoginExetastikouKentrou();
    }

    /**
     * Create an instance of {@link LoginExetastikouKentrouResponse }
     * 
     */
    public LoginExetastikouKentrouResponse createLoginExetastikouKentrouResponse() {
        return new LoginExetastikouKentrouResponse();
    }

    /**
     * Create an instance of {@link ReturnApp }
     * 
     */
    public ReturnApp createReturnApp() {
        return new ReturnApp();
    }

    /**
     * Create an instance of {@link ReturnAppResponse }
     * 
     */
    public ReturnAppResponse createReturnAppResponse() {
        return new ReturnAppResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginExetastikouKentrou }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "login_exetastikou_kentrou")
    public JAXBElement<LoginExetastikouKentrou> createLoginExetastikouKentrou(LoginExetastikouKentrou value) {
        return new JAXBElement<LoginExetastikouKentrou>(_LoginExetastikouKentrou_QNAME, LoginExetastikouKentrou.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginExetastikouKentrouResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "login_exetastikou_kentrouResponse")
    public JAXBElement<LoginExetastikouKentrouResponse> createLoginExetastikouKentrouResponse(LoginExetastikouKentrouResponse value) {
        return new JAXBElement<LoginExetastikouKentrouResponse>(_LoginExetastikouKentrouResponse_QNAME, LoginExetastikouKentrouResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnApp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "return_app")
    public JAXBElement<ReturnApp> createReturnApp(ReturnApp value) {
        return new JAXBElement<ReturnApp>(_ReturnApp_QNAME, ReturnApp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnAppResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "return_appResponse")
    public JAXBElement<ReturnAppResponse> createReturnAppResponse(ReturnAppResponse value) {
        return new JAXBElement<ReturnAppResponse>(_ReturnAppResponse_QNAME, ReturnAppResponse.class, null, value);
    }

}
