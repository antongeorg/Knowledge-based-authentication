
package java7;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ekrisi_ipospidiou_app_ws", targetNamespace = "http://loginwebservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EkrisiIpospidiouAppWs {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "egkrisi_ipopsifiou_app")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "egkrisi_ipopsifiou_app", targetNamespace = "http://loginwebservices/", className = "java7.EgkrisiIpopsifiouApp")
    @ResponseWrapper(localName = "egkrisi_ipopsifiou_appResponse", targetNamespace = "http://loginwebservices/", className = "java7.EgkrisiIpopsifiouAppResponse")
    @Action(input = "http://loginwebservices/ekrisi_ipospidiou_app_ws/egkrisi_ipopsifiou_appRequest", output = "http://loginwebservices/ekrisi_ipospidiou_app_ws/egkrisi_ipopsifiou_appResponse")
    public int egkrisiIpopsifiouApp(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    public int egkrisiIpopsifiouApp();

}