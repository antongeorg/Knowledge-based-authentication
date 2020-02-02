
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

    private final static QName _DiagrafiIpopsifiou_QNAME = new QName("http://loginwebservices/", "diagrafi_ipopsifiou");
    private final static QName _DiagrafiIpopsifiouResponse_QNAME = new QName("http://loginwebservices/", "diagrafi_ipopsifiouResponse");
    private final static QName _GetCountDiagrafiIpopsifiou_QNAME = new QName("http://loginwebservices/", "getCount_diagrafi_ipopsifiou");
    private final static QName _GetCountDiagrafiIpopsifiouResponse_QNAME = new QName("http://loginwebservices/", "getCount_diagrafi_ipopsifiouResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DiagrafiIpopsifiou }
     * 
     */
    public DiagrafiIpopsifiou createDiagrafiIpopsifiou() {
        return new DiagrafiIpopsifiou();
    }

    /**
     * Create an instance of {@link DiagrafiIpopsifiouResponse }
     * 
     */
    public DiagrafiIpopsifiouResponse createDiagrafiIpopsifiouResponse() {
        return new DiagrafiIpopsifiouResponse();
    }

    /**
     * Create an instance of {@link GetCountDiagrafiIpopsifiou }
     * 
     */
    public GetCountDiagrafiIpopsifiou createGetCountDiagrafiIpopsifiou() {
        return new GetCountDiagrafiIpopsifiou();
    }

    /**
     * Create an instance of {@link GetCountDiagrafiIpopsifiouResponse }
     * 
     */
    public GetCountDiagrafiIpopsifiouResponse createGetCountDiagrafiIpopsifiouResponse() {
        return new GetCountDiagrafiIpopsifiouResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagrafiIpopsifiou }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "diagrafi_ipopsifiou")
    public JAXBElement<DiagrafiIpopsifiou> createDiagrafiIpopsifiou(DiagrafiIpopsifiou value) {
        return new JAXBElement<DiagrafiIpopsifiou>(_DiagrafiIpopsifiou_QNAME, DiagrafiIpopsifiou.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiagrafiIpopsifiouResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "diagrafi_ipopsifiouResponse")
    public JAXBElement<DiagrafiIpopsifiouResponse> createDiagrafiIpopsifiouResponse(DiagrafiIpopsifiouResponse value) {
        return new JAXBElement<DiagrafiIpopsifiouResponse>(_DiagrafiIpopsifiouResponse_QNAME, DiagrafiIpopsifiouResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountDiagrafiIpopsifiou }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getCount_diagrafi_ipopsifiou")
    public JAXBElement<GetCountDiagrafiIpopsifiou> createGetCountDiagrafiIpopsifiou(GetCountDiagrafiIpopsifiou value) {
        return new JAXBElement<GetCountDiagrafiIpopsifiou>(_GetCountDiagrafiIpopsifiou_QNAME, GetCountDiagrafiIpopsifiou.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCountDiagrafiIpopsifiouResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getCount_diagrafi_ipopsifiouResponse")
    public JAXBElement<GetCountDiagrafiIpopsifiouResponse> createGetCountDiagrafiIpopsifiouResponse(GetCountDiagrafiIpopsifiouResponse value) {
        return new JAXBElement<GetCountDiagrafiIpopsifiouResponse>(_GetCountDiagrafiIpopsifiouResponse_QNAME, GetCountDiagrafiIpopsifiouResponse.class, null, value);
    }

}
