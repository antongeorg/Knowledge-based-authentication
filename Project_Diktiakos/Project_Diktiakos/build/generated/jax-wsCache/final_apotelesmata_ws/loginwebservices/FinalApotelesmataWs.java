
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
@WebService(name = "final_apotelesmata_ws", targetNamespace = "http://loginwebservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FinalApotelesmataWs {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod(operationName = "return_apotelesmata")
    @RequestWrapper(localName = "return_apotelesmata", targetNamespace = "http://loginwebservices/", className = "loginwebservices.ReturnApotelesmata")
    @ResponseWrapper(localName = "return_apotelesmataResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.ReturnApotelesmataResponse")
    @Action(input = "http://loginwebservices/final_apotelesmata_ws/return_apotelesmataRequest", output = "http://loginwebservices/final_apotelesmata_ws/return_apotelesmataResponse")
    public void returnApotelesmata(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod(operationName = "show_telika_apotelesmata")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "show_telika_apotelesmata", targetNamespace = "http://loginwebservices/", className = "loginwebservices.ShowTelikaApotelesmata")
    @ResponseWrapper(localName = "show_telika_apotelesmataResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.ShowTelikaApotelesmataResponse")
    @Action(input = "http://loginwebservices/final_apotelesmata_ws/show_telika_apotelesmataRequest", output = "http://loginwebservices/final_apotelesmata_ws/show_telika_apotelesmataResponse")
    public int showTelikaApotelesmata();

}