
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
@WebServiceClient(name = "themata_wc", targetNamespace = "http://loginwebservices/", wsdlLocation = "http://localhost:8080/Project_Diktiakos/themata_wc?wsdl")
public class ThemataWc_Service
    extends Service
{

    private final static URL THEMATAWC_WSDL_LOCATION;
    private final static WebServiceException THEMATAWC_EXCEPTION;
    private final static QName THEMATAWC_QNAME = new QName("http://loginwebservices/", "themata_wc");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Project_Diktiakos/themata_wc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        THEMATAWC_WSDL_LOCATION = url;
        THEMATAWC_EXCEPTION = e;
    }

    public ThemataWc_Service() {
        super(__getWsdlLocation(), THEMATAWC_QNAME);
    }

    public ThemataWc_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), THEMATAWC_QNAME, features);
    }

    public ThemataWc_Service(URL wsdlLocation) {
        super(wsdlLocation, THEMATAWC_QNAME);
    }

    public ThemataWc_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, THEMATAWC_QNAME, features);
    }

    public ThemataWc_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ThemataWc_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ThemataWc
     */
    @WebEndpoint(name = "themata_wcPort")
    public ThemataWc getThemataWcPort() {
        return super.getPort(new QName("http://loginwebservices/", "themata_wcPort"), ThemataWc.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ThemataWc
     */
    @WebEndpoint(name = "themata_wcPort")
    public ThemataWc getThemataWcPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://loginwebservices/", "themata_wcPort"), ThemataWc.class, features);
    }

    private static URL __getWsdlLocation() {
        if (THEMATAWC_EXCEPTION!= null) {
            throw THEMATAWC_EXCEPTION;
        }
        return THEMATAWC_WSDL_LOCATION;
    }

}