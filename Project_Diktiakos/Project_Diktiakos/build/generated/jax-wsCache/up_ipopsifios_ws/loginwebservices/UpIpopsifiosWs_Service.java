
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
@WebServiceClient(name = "up_ipopsifios_ws", targetNamespace = "http://loginwebservices/", wsdlLocation = "http://localhost:8080/Project_Diktiakos/up_ipopsifios_ws?wsdl")
public class UpIpopsifiosWs_Service
    extends Service
{

    private final static URL UPIPOPSIFIOSWS_WSDL_LOCATION;
    private final static WebServiceException UPIPOPSIFIOSWS_EXCEPTION;
    private final static QName UPIPOPSIFIOSWS_QNAME = new QName("http://loginwebservices/", "up_ipopsifios_ws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Project_Diktiakos/up_ipopsifios_ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UPIPOPSIFIOSWS_WSDL_LOCATION = url;
        UPIPOPSIFIOSWS_EXCEPTION = e;
    }

    public UpIpopsifiosWs_Service() {
        super(__getWsdlLocation(), UPIPOPSIFIOSWS_QNAME);
    }

    public UpIpopsifiosWs_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), UPIPOPSIFIOSWS_QNAME, features);
    }

    public UpIpopsifiosWs_Service(URL wsdlLocation) {
        super(wsdlLocation, UPIPOPSIFIOSWS_QNAME);
    }

    public UpIpopsifiosWs_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UPIPOPSIFIOSWS_QNAME, features);
    }

    public UpIpopsifiosWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UpIpopsifiosWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UpIpopsifiosWs
     */
    @WebEndpoint(name = "up_ipopsifios_wsPort")
    public UpIpopsifiosWs getUpIpopsifiosWsPort() {
        return super.getPort(new QName("http://loginwebservices/", "up_ipopsifios_wsPort"), UpIpopsifiosWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UpIpopsifiosWs
     */
    @WebEndpoint(name = "up_ipopsifios_wsPort")
    public UpIpopsifiosWs getUpIpopsifiosWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://loginwebservices/", "up_ipopsifios_wsPort"), UpIpopsifiosWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UPIPOPSIFIOSWS_EXCEPTION!= null) {
            throw UPIPOPSIFIOSWS_EXCEPTION;
        }
        return UPIPOPSIFIOSWS_WSDL_LOCATION;
    }

}
