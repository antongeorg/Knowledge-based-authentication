
package loginwebservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "egkrisi_ipospifiou_app", targetNamespace = "http://loginwebservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EgkrisiIpospifiouApp {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "egkrisi_ipopsifiou_app")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "egkrisi_ipopsifiou_app", targetNamespace = "http://loginwebservices/", className = "loginwebservices.EgkrisiIpopsifiouApp")
    @ResponseWrapper(localName = "egkrisi_ipopsifiou_appResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.EgkrisiIpopsifiouAppResponse")
    @Action(input = "http://loginwebservices/egkrisi_ipospifiou_app/egkrisi_ipopsifiou_appRequest", output = "http://loginwebservices/egkrisi_ipospifiou_app/egkrisi_ipopsifiou_appResponse")
    public int egkrisiIpopsifiouApp(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
