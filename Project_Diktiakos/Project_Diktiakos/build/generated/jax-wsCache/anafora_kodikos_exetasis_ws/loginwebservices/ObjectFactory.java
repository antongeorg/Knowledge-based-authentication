
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

    private final static QName _AnaforaKodikosExetasis_QNAME = new QName("http://loginwebservices/", "anafora_kodikos_exetasis");
    private final static QName _AnaforaKodikosExetasisResponse_QNAME = new QName("http://loginwebservices/", "anafora_kodikos_exetasisResponse");
    private final static QName _GetListLastnameExetasis_QNAME = new QName("http://loginwebservices/", "getList_lastname_exetasis");
    private final static QName _GetListLastnameExetasisResponse_QNAME = new QName("http://loginwebservices/", "getList_lastname_exetasisResponse");
    private final static QName _GetListNameExetasis_QNAME = new QName("http://loginwebservices/", "getList_name_exetasis");
    private final static QName _GetListNameExetasisResponse_QNAME = new QName("http://loginwebservices/", "getList_name_exetasisResponse");
    private final static QName _GetListTelikoAp_QNAME = new QName("http://loginwebservices/", "getList_teliko_ap");
    private final static QName _GetListTelikoApResponse_QNAME = new QName("http://loginwebservices/", "getList_teliko_apResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnaforaKodikosExetasis }
     * 
     */
    public AnaforaKodikosExetasis createAnaforaKodikosExetasis() {
        return new AnaforaKodikosExetasis();
    }

    /**
     * Create an instance of {@link AnaforaKodikosExetasisResponse }
     * 
     */
    public AnaforaKodikosExetasisResponse createAnaforaKodikosExetasisResponse() {
        return new AnaforaKodikosExetasisResponse();
    }

    /**
     * Create an instance of {@link GetListLastnameExetasis }
     * 
     */
    public GetListLastnameExetasis createGetListLastnameExetasis() {
        return new GetListLastnameExetasis();
    }

    /**
     * Create an instance of {@link GetListLastnameExetasisResponse }
     * 
     */
    public GetListLastnameExetasisResponse createGetListLastnameExetasisResponse() {
        return new GetListLastnameExetasisResponse();
    }

    /**
     * Create an instance of {@link GetListNameExetasis }
     * 
     */
    public GetListNameExetasis createGetListNameExetasis() {
        return new GetListNameExetasis();
    }

    /**
     * Create an instance of {@link GetListNameExetasisResponse }
     * 
     */
    public GetListNameExetasisResponse createGetListNameExetasisResponse() {
        return new GetListNameExetasisResponse();
    }

    /**
     * Create an instance of {@link GetListTelikoAp }
     * 
     */
    public GetListTelikoAp createGetListTelikoAp() {
        return new GetListTelikoAp();
    }

    /**
     * Create an instance of {@link GetListTelikoApResponse }
     * 
     */
    public GetListTelikoApResponse createGetListTelikoApResponse() {
        return new GetListTelikoApResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnaforaKodikosExetasis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "anafora_kodikos_exetasis")
    public JAXBElement<AnaforaKodikosExetasis> createAnaforaKodikosExetasis(AnaforaKodikosExetasis value) {
        return new JAXBElement<AnaforaKodikosExetasis>(_AnaforaKodikosExetasis_QNAME, AnaforaKodikosExetasis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnaforaKodikosExetasisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "anafora_kodikos_exetasisResponse")
    public JAXBElement<AnaforaKodikosExetasisResponse> createAnaforaKodikosExetasisResponse(AnaforaKodikosExetasisResponse value) {
        return new JAXBElement<AnaforaKodikosExetasisResponse>(_AnaforaKodikosExetasisResponse_QNAME, AnaforaKodikosExetasisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListLastnameExetasis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_lastname_exetasis")
    public JAXBElement<GetListLastnameExetasis> createGetListLastnameExetasis(GetListLastnameExetasis value) {
        return new JAXBElement<GetListLastnameExetasis>(_GetListLastnameExetasis_QNAME, GetListLastnameExetasis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListLastnameExetasisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_lastname_exetasisResponse")
    public JAXBElement<GetListLastnameExetasisResponse> createGetListLastnameExetasisResponse(GetListLastnameExetasisResponse value) {
        return new JAXBElement<GetListLastnameExetasisResponse>(_GetListLastnameExetasisResponse_QNAME, GetListLastnameExetasisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListNameExetasis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_name_exetasis")
    public JAXBElement<GetListNameExetasis> createGetListNameExetasis(GetListNameExetasis value) {
        return new JAXBElement<GetListNameExetasis>(_GetListNameExetasis_QNAME, GetListNameExetasis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListNameExetasisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_name_exetasisResponse")
    public JAXBElement<GetListNameExetasisResponse> createGetListNameExetasisResponse(GetListNameExetasisResponse value) {
        return new JAXBElement<GetListNameExetasisResponse>(_GetListNameExetasisResponse_QNAME, GetListNameExetasisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListTelikoAp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_teliko_ap")
    public JAXBElement<GetListTelikoAp> createGetListTelikoAp(GetListTelikoAp value) {
        return new JAXBElement<GetListTelikoAp>(_GetListTelikoAp_QNAME, GetListTelikoAp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListTelikoApResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_teliko_apResponse")
    public JAXBElement<GetListTelikoApResponse> createGetListTelikoApResponse(GetListTelikoApResponse value) {
        return new JAXBElement<GetListTelikoApResponse>(_GetListTelikoApResponse_QNAME, GetListTelikoApResponse.class, null, value);
    }

}
