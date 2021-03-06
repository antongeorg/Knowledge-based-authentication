
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
@WebService(name = "anafora_kodikos_exetasis_ws", targetNamespace = "http://loginwebservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AnaforaKodikosExetasisWs {


    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Integer>
     */
    @WebMethod(operationName = "getList_teliko_ap")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getList_teliko_ap", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListTelikoAp")
    @ResponseWrapper(localName = "getList_teliko_apResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListTelikoApResponse")
    @Action(input = "http://loginwebservices/anafora_kodikos_exetasis_ws/getList_teliko_apRequest", output = "http://loginwebservices/anafora_kodikos_exetasis_ws/getList_teliko_apResponse")
    public List<Integer> getListTelikoAp();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "getList_name_exetasis")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getList_name_exetasis", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListNameExetasis")
    @ResponseWrapper(localName = "getList_name_exetasisResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListNameExetasisResponse")
    @Action(input = "http://loginwebservices/anafora_kodikos_exetasis_ws/getList_name_exetasisRequest", output = "http://loginwebservices/anafora_kodikos_exetasis_ws/getList_name_exetasisResponse")
    public List<String> getListNameExetasis();

    /**
     * 
     * @param arg0
     */
    @WebMethod(operationName = "anafora_kodikos_exetasis")
    @RequestWrapper(localName = "anafora_kodikos_exetasis", targetNamespace = "http://loginwebservices/", className = "loginwebservices.AnaforaKodikosExetasis")
    @ResponseWrapper(localName = "anafora_kodikos_exetasisResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.AnaforaKodikosExetasisResponse")
    @Action(input = "http://loginwebservices/anafora_kodikos_exetasis_ws/anafora_kodikos_exetasisRequest", output = "http://loginwebservices/anafora_kodikos_exetasis_ws/anafora_kodikos_exetasisResponse")
    public void anaforaKodikosExetasis(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "getList_lastname_exetasis")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getList_lastname_exetasis", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListLastnameExetasis")
    @ResponseWrapper(localName = "getList_lastname_exetasisResponse", targetNamespace = "http://loginwebservices/", className = "loginwebservices.GetListLastnameExetasisResponse")
    @Action(input = "http://loginwebservices/anafora_kodikos_exetasis_ws/getList_lastname_exetasisRequest", output = "http://loginwebservices/anafora_kodikos_exetasis_ws/getList_lastname_exetasisResponse")
    public List<String> getListLastnameExetasis();

}
