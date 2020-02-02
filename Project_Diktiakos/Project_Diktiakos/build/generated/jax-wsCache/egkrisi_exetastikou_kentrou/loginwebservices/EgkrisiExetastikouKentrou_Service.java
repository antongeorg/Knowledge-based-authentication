
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
@WebServiceClient(name = "egkrisi_exetastikou_kentrou", targetNamespace = "http://loginwebservices/", wsdlLocation = "http://localhost:8080/Project_Diktiakos/egkrisi_exetastikou_kentrou?wsdl")
public class EgkrisiExetastikouKentrou_Service
    extends Service
{

    private final static URL EGKRISIEXETASTIKOUKENTROU_WSDL_LOCATION;
    private final static WebServiceException EGKRISIEXETASTIKOUKENTROU_EXCEPTION;
    private final static QName EGKRISIEXETASTIKOUKENTROU_QNAME = new QName("http://loginwebservices/", "egkrisi_exetastikou_kentrou");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Project_Diktiakos/egkrisi_exetastikou_kentrou?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EGKRISIEXETASTIKOUKENTROU_WSDL_LOCATION = url;
        EGKRISIEXETASTIKOUKENTROU_EXCEPTION = e;
    }

    public EgkrisiExetastikouKentrou_Service() {
        super(__getWsdlLocation(), EGKRISIEXETASTIKOUKENTROU_QNAME);
    }

    public EgkrisiExetastikouKentrou_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EGKRISIEXETASTIKOUKENTROU_QNAME, features);
    }

    public EgkrisiExetastikouKentrou_Service(URL wsdlLocation) {
        super(wsdlLocation, EGKRISIEXETASTIKOUKENTROU_QNAME);
    }

    public EgkrisiExetastikouKentrou_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EGKRISIEXETASTIKOUKENTROU_QNAME, features);
    }

    public EgkrisiExetastikouKentrou_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EgkrisiExetastikouKentrou_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EgkrisiExetastikouKentrou
     */
    @WebEndpoint(name = "egkrisi_exetastikou_kentrouPort")
    public EgkrisiExetastikouKentrou getEgkrisiExetastikouKentrouPort() {
        return super.getPort(new QName("http://loginwebservices/", "egkrisi_exetastikou_kentrouPort"), EgkrisiExetastikouKentrou.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EgkrisiExetastikouKentrou
     */
    @WebEndpoint(name = "egkrisi_exetastikou_kentrouPort")
    public EgkrisiExetastikouKentrou getEgkrisiExetastikouKentrouPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://loginwebservices/", "egkrisi_exetastikou_kentrouPort"), EgkrisiExetastikouKentrou.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EGKRISIEXETASTIKOUKENTROU_EXCEPTION!= null) {
            throw EGKRISIEXETASTIKOUKENTROU_EXCEPTION;
        }
        return EGKRISIEXETASTIKOUKENTROU_WSDL_LOCATION;
    }

}
