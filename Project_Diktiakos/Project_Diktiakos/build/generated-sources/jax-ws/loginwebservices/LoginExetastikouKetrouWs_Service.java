
package loginwebservices;

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
@WebServiceClient(name = "login_exetastikou_ketrou_ws", targetNamespace = "http://loginwebservices/", wsdlLocation = "http://localhost:8080/Project_Diktiakos/login_exetastikou_ketrou_ws?wsdl")
public class LoginExetastikouKetrouWs_Service
    extends Service
{

    private final static URL LOGINEXETASTIKOUKETROUWS_WSDL_LOCATION;
    private final static WebServiceException LOGINEXETASTIKOUKETROUWS_EXCEPTION;
    private final static QName LOGINEXETASTIKOUKETROUWS_QNAME = new QName("http://loginwebservices/", "login_exetastikou_ketrou_ws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Project_Diktiakos/login_exetastikou_ketrou_ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOGINEXETASTIKOUKETROUWS_WSDL_LOCATION = url;
        LOGINEXETASTIKOUKETROUWS_EXCEPTION = e;
    }

    public LoginExetastikouKetrouWs_Service() {
        super(__getWsdlLocation(), LOGINEXETASTIKOUKETROUWS_QNAME);
    }

    public LoginExetastikouKetrouWs_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOGINEXETASTIKOUKETROUWS_QNAME, features);
    }

    public LoginExetastikouKetrouWs_Service(URL wsdlLocation) {
        super(wsdlLocation, LOGINEXETASTIKOUKETROUWS_QNAME);
    }

    public LoginExetastikouKetrouWs_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOGINEXETASTIKOUKETROUWS_QNAME, features);
    }

    public LoginExetastikouKetrouWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LoginExetastikouKetrouWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LoginExetastikouKetrouWs
     */
    @WebEndpoint(name = "login_exetastikou_ketrou_wsPort")
    public LoginExetastikouKetrouWs getLoginExetastikouKetrouWsPort() {
        return super.getPort(new QName("http://loginwebservices/", "login_exetastikou_ketrou_wsPort"), LoginExetastikouKetrouWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LoginExetastikouKetrouWs
     */
    @WebEndpoint(name = "login_exetastikou_ketrou_wsPort")
    public LoginExetastikouKetrouWs getLoginExetastikouKetrouWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://loginwebservices/", "login_exetastikou_ketrou_wsPort"), LoginExetastikouKetrouWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOGINEXETASTIKOUKETROUWS_EXCEPTION!= null) {
            throw LOGINEXETASTIKOUKETROUWS_EXCEPTION;
        }
        return LOGINEXETASTIKOUKETROUWS_WSDL_LOCATION;
    }

}
