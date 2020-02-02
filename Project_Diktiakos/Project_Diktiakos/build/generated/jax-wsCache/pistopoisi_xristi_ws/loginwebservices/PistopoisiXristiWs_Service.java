
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
@WebServiceClient(name = "pistopoisi_xristi_ws", targetNamespace = "http://loginwebservices/", wsdlLocation = "http://localhost:8080/Project_Diktiakos/pistopoisi_xristi_ws?wsdl")
public class PistopoisiXristiWs_Service
    extends Service
{

    private final static URL PISTOPOISIXRISTIWS_WSDL_LOCATION;
    private final static WebServiceException PISTOPOISIXRISTIWS_EXCEPTION;
    private final static QName PISTOPOISIXRISTIWS_QNAME = new QName("http://loginwebservices/", "pistopoisi_xristi_ws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Project_Diktiakos/pistopoisi_xristi_ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PISTOPOISIXRISTIWS_WSDL_LOCATION = url;
        PISTOPOISIXRISTIWS_EXCEPTION = e;
    }

    public PistopoisiXristiWs_Service() {
        super(__getWsdlLocation(), PISTOPOISIXRISTIWS_QNAME);
    }

    public PistopoisiXristiWs_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PISTOPOISIXRISTIWS_QNAME, features);
    }

    public PistopoisiXristiWs_Service(URL wsdlLocation) {
        super(wsdlLocation, PISTOPOISIXRISTIWS_QNAME);
    }

    public PistopoisiXristiWs_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PISTOPOISIXRISTIWS_QNAME, features);
    }

    public PistopoisiXristiWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PistopoisiXristiWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PistopoisiXristiWs
     */
    @WebEndpoint(name = "pistopoisi_xristi_wsPort")
    public PistopoisiXristiWs getPistopoisiXristiWsPort() {
        return super.getPort(new QName("http://loginwebservices/", "pistopoisi_xristi_wsPort"), PistopoisiXristiWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PistopoisiXristiWs
     */
    @WebEndpoint(name = "pistopoisi_xristi_wsPort")
    public PistopoisiXristiWs getPistopoisiXristiWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://loginwebservices/", "pistopoisi_xristi_wsPort"), PistopoisiXristiWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PISTOPOISIXRISTIWS_EXCEPTION!= null) {
            throw PISTOPOISIXRISTIWS_EXCEPTION;
        }
        return PISTOPOISIXRISTIWS_WSDL_LOCATION;
    }

}
