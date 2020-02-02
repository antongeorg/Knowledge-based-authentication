
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
@WebService(name = "themata_wc", targetNamespace = "http://loginwebservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ThemataWc {


    /**
     * 
     * @param arg0
     */
    @WebMethod(operationName = "up_themata")
    @RequestWrapper(localName = "up_themata", targetNamespace = "http://loginwebservices/", className = "loginwebservices.UpThemata")
    @ResponseWrapper(localName = "up_themataResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.UpThemataResponse")
    @Action(input = "http://loginwebservices/themata_wc/up_themataRequest", output = "http://loginwebservices/themata_wc/up_themataResponse")
    public void upThemata(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod(operationName = "showCount_up_themata")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showCount_up_themata", targetNamespace = "http://loginwebservices/", className = "loginwebservices.ShowCountUpThemata")
    @ResponseWrapper(localName = "showCount_up_themataResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.ShowCountUpThemataResponse")
    @Action(input = "http://loginwebservices/themata_wc/showCount_up_themataRequest", output = "http://loginwebservices/themata_wc/showCount_up_themataResponse")
    public int showCountUpThemata();

}
