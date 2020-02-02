
package loginwebservices.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getList_lastname_exetasisResponse", namespace = "http://loginwebservices/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getList_lastname_exetasisResponse", namespace = "http://loginwebservices/")
public class GetList_lastname_exetasisResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<String> _return;

    /**
     * 
     * @return
     *     returns ArrayList<String>
     */
    public ArrayList<String> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<String> _return) {
        this._return = _return;
    }

}
