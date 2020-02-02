
package java1;

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
@WebService(name = "ipopsifiows", targetNamespace = "http://loginwebservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Ipopsifiows {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "foo2", targetNamespace = "http://loginwebservices/", className = "java1.Foo2")
    @ResponseWrapper(localName = "foo2Response", targetNamespace = "http://loginwebservices/", className = "java1.Foo2Response")
    @Action(input = "http://loginwebservices/ipopsifiows/foo2Request", output = "http://loginwebservices/ipopsifiows/foo2Response")
    public void foo2(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        int arg5);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "showCount", targetNamespace = "http://loginwebservices/", className = "java1.ShowCount")
    @ResponseWrapper(localName = "showCountResponse", targetNamespace = "http://loginwebservices/", className = "java1.ShowCountResponse")
    @Action(input = "http://loginwebservices/ipopsifiows/showCountRequest", output = "http://loginwebservices/ipopsifiows/showCountResponse")
    public int showCount();

}
