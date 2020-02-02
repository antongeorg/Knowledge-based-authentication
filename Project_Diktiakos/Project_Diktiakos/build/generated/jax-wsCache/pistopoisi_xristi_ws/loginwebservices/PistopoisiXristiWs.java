
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
@WebService(name = "pistopoisi_xristi_ws", targetNamespace = "http://loginwebservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PistopoisiXristiWs {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "pistopoisi_xristi")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "pistopoisi_xristi", targetNamespace = "http://loginwebservices/", className = "loginwebservices.PistopoisiXristi")
    @ResponseWrapper(localName = "pistopoisi_xristiResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.PistopoisiXristiResponse")
    @Action(input = "http://loginwebservices/pistopoisi_xristi_ws/pistopoisi_xristiRequest", output = "http://loginwebservices/pistopoisi_xristi_ws/pistopoisi_xristiResponse")
    public int pistopoisiXristi(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}