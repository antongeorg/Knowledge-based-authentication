
package loginwebservices;

import java.util.List;
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
@WebService(name = "anafora_exetastikou_kentro", targetNamespace = "http://loginwebservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AnaforaExetastikouKentro {


    /**
     * 
     * @param arg0
     */
    @WebMethod(operationName = "anafora_exetastiko_kentro")
    @RequestWrapper(localName = "anafora_exetastiko_kentro", targetNamespace = "http://loginwebservices/", className = "loginwebservices.AnaforaExetastikoKentro")
    @ResponseWrapper(localName = "anafora_exetastiko_kentroResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.AnaforaExetastikoKentroResponse")
    @Action(input = "http://loginwebservices/anafora_exetastikou_kentro/anafora_exetastiko_kentroRequest", output = "http://loginwebservices/anafora_exetastikou_kentro/anafora_exetastiko_kentroResponse")
    public void anaforaExetastikoKentro(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod(operationName = "getList_sum")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getList_sum", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListSum")
    @ResponseWrapper(localName = "getList_sumResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListSumResponse")
    @Action(input = "http://loginwebservices/anafora_exetastikou_kentro/getList_sumRequest", output = "http://loginwebservices/anafora_exetastikou_kentro/getList_sumResponse")
    public List<Integer> getListSum();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "getList_name")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getList_name", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListName")
    @ResponseWrapper(localName = "getList_nameResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListNameResponse")
    @Action(input = "http://loginwebservices/anafora_exetastikou_kentro/getList_nameRequest", output = "http://loginwebservices/anafora_exetastikou_kentro/getList_nameResponse")
    public List<String> getListName();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "getList_lastName")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getList_lastName", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListLastName")
    @ResponseWrapper(localName = "getList_lastNameResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListLastNameResponse")
    @Action(input = "http://loginwebservices/anafora_exetastikou_kentro/getList_lastNameRequest", output = "http://loginwebservices/anafora_exetastikou_kentro/getList_lastNameResponse")
    public List<String> getListLastName();

}
