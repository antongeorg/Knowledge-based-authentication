
package exetastikowc;

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
@WebServiceClient(name = "exetastikokedrows", targetNamespace = "http://loginwebservices/", wsdlLocation = "http://localhost:8080/Project_Diktiakos/exetastikokedrows?wsdl")
public class Exetastikokedrows_Service
    extends Service
{

    private final static URL EXETASTIKOKEDROWS_WSDL_LOCATION;
    private final static WebServiceException EXETASTIKOKEDROWS_EXCEPTION;
    private final static QName EXETASTIKOKEDROWS_QNAME = new QName("http://loginwebservices/", "exetastikokedrows");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Project_Diktiakos/exetastikokedrows?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXETASTIKOKEDROWS_WSDL_LOCATION = url;
        EXETASTIKOKEDROWS_EXCEPTION = e;
    }

    public Exetastikokedrows_Service() {
        super(__getWsdlLocation(), EXETASTIKOKEDROWS_QNAME);
    }

    public Exetastikokedrows_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXETASTIKOKEDROWS_QNAME, features);
    }

    public Exetastikokedrows_Service(URL wsdlLocation) {
        super(wsdlLocation, EXETASTIKOKEDROWS_QNAME);
    }

    public Exetastikokedrows_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXETASTIKOKEDROWS_QNAME, features);
    }

    public Exetastikokedrows_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Exetastikokedrows_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Exetastikokedrows
     */
    @WebEndpoint(name = "exetastikokedrowsPort")
    public Exetastikokedrows getExetastikokedrowsPort() {
        return super.getPort(new QName("http://loginwebservices/", "exetastikokedrowsPort"), Exetastikokedrows.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Exetastikokedrows
     */
    @WebEndpoint(name = "exetastikokedrowsPort")
    public Exetastikokedrows getExetastikokedrowsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://loginwebservices/", "exetastikokedrowsPort"), Exetastikokedrows.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXETASTIKOKEDROWS_EXCEPTION!= null) {
            throw EXETASTIKOKEDROWS_EXCEPTION;
        }
        return EXETASTIKOKEDROWS_WSDL_LOCATION;
    }

}