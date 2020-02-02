
package loginwebservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the loginwebservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DiagrafiThematon_QNAME = new QName("http://loginwebservices/", "diagrafi_thematon");
    private final static QName _DiagrafiThematonResponse_QNAME = new QName("http://loginwebservices/", "diagrafi_thematonResponse");
    private final static QName _GetCountDiagrafiThematon_QNAME = new QName("http://loginwebservices/", "getCount_diagrafi_thematon");
    private final static QName _GetCountDiagrafiThematonResponse_QNAME = new QName("http://loginwebservices/", "getCount_diagrafi_thematonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DiagrafiThematon }
     * 
     */
    public DiagrafiThematon createDiagrafiThematon() {
        return new DiagrafiThematon();
    }

    /**
     * Create an instance of {@link DiagrafiThematonResponse }
     * 
     */
    public DiagrafiThematonResponse createDiagrafiThematonResponse() {
        return new DiagrafiThematonResponse();
    }

    /**
     * Create an instance of {@link GetCountDiagrafiThematon }
     * 
     */
    public GetCountDiagrafiThematon createGetCountDiagrafiThematon() {
        return new GetCountDiagrafiThematon();
    }

    /**
     * Create an instance of {@link GetCountDiagrafiThematonResponse }
     * 
     */
    public GetCountDiagrafiThematonResponse createGetCountDiagrafiThematonResponse() {
        return new GetCountDiagrafiThematonResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagrafiThematon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "diagrafi_thematon")
    public JAXBElement<DiagrafiThematon> createDiagrafiThematon(DiagrafiThematon value) {
        return new JAXBElement<DiagrafiThematon>(_DiagrafiThematon_QNAME, DiagrafiThematon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagrafiThematonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "diagrafi_thematonResponse")
    public JAXBElement<DiagrafiThematonResponse> createDiagrafiThematonResponse(DiagrafiThematonResponse value) {
        return new JAXBElement<DiagrafiThematonResponse>(_DiagrafiThematonResponse_QNAME, DiagrafiThematonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountDiagrafiThematon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getCount_diagrafi_thematon")
    public JAXBElement<GetCountDiagrafiThematon> createGetCountDiagrafiThematon(GetCountDiagrafiThematon value) {
        return new JAXBElement<GetCountDiagrafiThematon>(_GetCountDiagrafiThematon_QNAME, GetCountDiagrafiThematon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountDiagrafiThematonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getCount_diagrafi_thematonResponse")
    public JAXBElement<GetCountDiagrafiThematonResponse> createGetCountDiagrafiThematonResponse(GetCountDiagrafiThematonResponse value) {
        return new JAXBElement<GetCountDiagrafiThematonResponse>(_GetCountDiagrafiThematonResponse_QNAME, GetCountDiagrafiThematonResponse.class, null, value);
    }

}
