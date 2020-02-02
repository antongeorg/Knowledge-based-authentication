
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
@WebService(name = "ipopsifios_login_ws", targetNamespace = "http://loginwebservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IpopsifiosLoginWs {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ipopsifios_login")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ipopsifios_login", targetNamespace = "http://loginwebservices/", className = "loginwebservices.IpopsifiosLogin")
    @ResponseWrapper(localName = "ipopsifios_loginResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.IpopsifiosLoginResponse")
    @Action(input = "http://loginwebservices/ipopsifios_login_ws/ipopsifios_loginRequest", output = "http://loginwebservices/ipopsifios_login_ws/ipopsifios_loginResponse")
    public String ipopsifiosLogin(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "show_name")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "show_name", targetNamespace = "http://loginwebservices/", className = "loginwebservices.ShowName")
    @ResponseWrapper(localName = "show_nameResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.ShowNameResponse")
    @Action(input = "http://loginwebservices/ipopsifios_login_ws/show_nameRequest", output = "http://loginwebservices/ipopsifios_login_ws/show_nameResponse")
    public String showName();

}
