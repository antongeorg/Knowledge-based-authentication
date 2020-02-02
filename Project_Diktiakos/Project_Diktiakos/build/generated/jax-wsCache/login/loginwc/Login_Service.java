
package loginwc;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "login", targetNamespace = "http://loginwebservices/", wsdlLocation = "http://localhost:8080/Project_Diktiakos/login?wsdl")
public class Login_Service
    extends Service
{

    private final static URL LOGIN_WSDL_LOCATION;
    private final static WebServiceException LOGIN_EXCEPTION;
    private final static QName LOGIN_QNAME = new QName("http://loginwebservices/", "login");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Project_Diktiakos/login?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOGIN_WSDL_LOCATION = url;
        LOGIN_EXCEPTION = e;
    }

    public Login_Service() {
        super(__getWsdlLocation(), LOGIN_QNAME);
    }

    public Login_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOGIN_QNAME, features);
    }

    public Login_Service(URL wsdlLocation) {
        super(wsdlLocation, LOGIN_QNAME);
    }

    public Login_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOGIN_QNAME, features);
    }

    public Login_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Login_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Login
     */
    @WebEndpoint(name = "loginPort")
    public Login getLoginPort() {
        return super.getPort(new QName("http://loginwebservices/", "loginPort"), Login.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Login
     */
    @WebEndpoint(name = "loginPort")
    public Login getLoginPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://loginwebservices/", "loginPort"), Login.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOGIN_EXCEPTION!= null) {
            throw LOGIN_EXCEPTION;
        }
        return LOGIN_WSDL_LOCATION;
    }

}