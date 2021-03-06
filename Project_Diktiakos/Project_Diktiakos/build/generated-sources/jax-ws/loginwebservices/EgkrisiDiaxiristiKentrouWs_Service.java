
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
@WebServiceClient(name = "egkrisi_diaxiristi_kentrou_ws", targetNamespace = "http://loginwebservices/", wsdlLocation = "http://localhost:8080/Project_Diktiakos/egkrisi_diaxiristi_kentrou_ws?wsdl")
public class EgkrisiDiaxiristiKentrouWs_Service
    extends Service
{

    private final static URL EGKRISIDIAXIRISTIKENTROUWS_WSDL_LOCATION;
    private final static WebServiceException EGKRISIDIAXIRISTIKENTROUWS_EXCEPTION;
    private final static QName EGKRISIDIAXIRISTIKENTROUWS_QNAME = new QName("http://loginwebservices/", "egkrisi_diaxiristi_kentrou_ws");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Project_Diktiakos/egkrisi_diaxiristi_kentrou_ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EGKRISIDIAXIRISTIKENTROUWS_WSDL_LOCATION = url;
        EGKRISIDIAXIRISTIKENTROUWS_EXCEPTION = e;
    }

    public EgkrisiDiaxiristiKentrouWs_Service() {
        super(__getWsdlLocation(), EGKRISIDIAXIRISTIKENTROUWS_QNAME);
    }

    public EgkrisiDiaxiristiKentrouWs_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EGKRISIDIAXIRISTIKENTROUWS_QNAME, features);
    }

    public EgkrisiDiaxiristiKentrouWs_Service(URL wsdlLocation) {
        super(wsdlLocation, EGKRISIDIAXIRISTIKENTROUWS_QNAME);
    }

    public EgkrisiDiaxiristiKentrouWs_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EGKRISIDIAXIRISTIKENTROUWS_QNAME, features);
    }

    public EgkrisiDiaxiristiKentrouWs_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EgkrisiDiaxiristiKentrouWs_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EgkrisiDiaxiristiKentrouWs
     */
    @WebEndpoint(name = "egkrisi_diaxiristi_kentrou_wsPort")
    public EgkrisiDiaxiristiKentrouWs getEgkrisiDiaxiristiKentrouWsPort() {
        return super.getPort(new QName("http://loginwebservices/", "egkrisi_diaxiristi_kentrou_wsPort"), EgkrisiDiaxiristiKentrouWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EgkrisiDiaxiristiKentrouWs
     */
    @WebEndpoint(name = "egkrisi_diaxiristi_kentrou_wsPort")
    public EgkrisiDiaxiristiKentrouWs getEgkrisiDiaxiristiKentrouWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://loginwebservices/", "egkrisi_diaxiristi_kentrou_wsPort"), EgkrisiDiaxiristiKentrouWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EGKRISIDIAXIRISTIKENTROUWS_EXCEPTION!= null) {
            throw EGKRISIDIAXIRISTIKENTROUWS_EXCEPTION;
        }
        return EGKRISIDIAXIRISTIKENTROUWS_WSDL_LOCATION;
    }

}
