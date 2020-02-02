
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

    private final static QName _AnaforaExetastikoKentro_QNAME = new QName("http://loginwebservices/", "anafora_exetastiko_kentro");
    private final static QName _AnaforaExetastikoKentroResponse_QNAME = new QName("http://loginwebservices/", "anafora_exetastiko_kentroResponse");
    private final static QName _GetListLastName_QNAME = new QName("http://loginwebservices/", "getList_lastName");
    private final static QName _GetListLastNameResponse_QNAME = new QName("http://loginwebservices/", "getList_lastNameResponse");
    private final static QName _GetListName_QNAME = new QName("http://loginwebservices/", "getList_name");
    private final static QName _GetListNameResponse_QNAME = new QName("http://loginwebservices/", "getList_nameResponse");
    private final static QName _GetListSum_QNAME = new QName("http://loginwebservices/", "getList_sum");
    private final static QName _GetListSumResponse_QNAME = new QName("http://loginwebservices/", "getList_sumResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnaforaExetastikoKentro }
     * 
     */
    public AnaforaExetastikoKentro createAnaforaExetastikoKentro() {
        return new AnaforaExetastikoKentro();
    }

    /**
     * Create an instance of {@link AnaforaExetastikoKentroResponse }
     * 
     */
    public AnaforaExetastikoKentroResponse createAnaforaExetastikoKentroResponse() {
        return new AnaforaExetastikoKentroResponse();
    }

    /**
     * Create an instance of {@link GetListLastName }
     * 
     */
    public GetListLastName createGetListLastName() {
        return new GetListLastName();
    }

    /**
     * Create an instance of {@link GetListLastNameResponse }
     * 
     */
    public GetListLastNameResponse createGetListLastNameResponse() {
        return new GetListLastNameResponse();
    }

    /**
     * Create an instance of {@link GetListName }
     * 
     */
    public GetListName createGetListName() {
        return new GetListName();
    }

    /**
     * Create an instance of {@link GetListNameResponse }
     * 
     */
    public GetListNameResponse createGetListNameResponse() {
        return new GetListNameResponse();
    }

    /**
     * Create an instance of {@link GetListSum }
     * 
     */
    public GetListSum createGetListSum() {
        return new GetListSum();
    }

    /**
     * Create an instance of {@link GetListSumResponse }
     * 
     */
    public GetListSumResponse createGetListSumResponse() {
        return new GetListSumResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnaforaExetastikoKentro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "anafora_exetastiko_kentro")
    public JAXBElement<AnaforaExetastikoKentro> createAnaforaExetastikoKentro(AnaforaExetastikoKentro value) {
        return new JAXBElement<AnaforaExetastikoKentro>(_AnaforaExetastikoKentro_QNAME, AnaforaExetastikoKentro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnaforaExetastikoKentroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "anafora_exetastiko_kentroResponse")
    public JAXBElement<AnaforaExetastikoKentroResponse> createAnaforaExetastikoKentroResponse(AnaforaExetastikoKentroResponse value) {
        return new JAXBElement<AnaforaExetastikoKentroResponse>(_AnaforaExetastikoKentroResponse_QNAME, AnaforaExetastikoKentroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListLastName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_lastName")
    public JAXBElement<GetListLastName> createGetListLastName(GetListLastName value) {
        return new JAXBElement<GetListLastName>(_GetListLastName_QNAME, GetListLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListLastNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_lastNameResponse")
    public JAXBElement<GetListLastNameResponse> createGetListLastNameResponse(GetListLastNameResponse value) {
        return new JAXBElement<GetListLastNameResponse>(_GetListLastNameResponse_QNAME, GetListLastNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_name")
    public JAXBElement<GetListName> createGetListName(GetListName value) {
        return new JAXBElement<GetListName>(_GetListName_QNAME, GetListName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_nameResponse")
    public JAXBElement<GetListNameResponse> createGetListNameResponse(GetListNameResponse value) {
        return new JAXBElement<GetListNameResponse>(_GetListNameResponse_QNAME, GetListNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListSum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_sum")
    public JAXBElement<GetListSum> createGetListSum(GetListSum value) {
        return new JAXBElement<GetListSum>(_GetListSum_QNAME, GetListSum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListSumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "getList_sumResponse")
    public JAXBElement<GetListSumResponse> createGetListSumResponse(GetListSumResponse value) {
        return new JAXBElement<GetListSumResponse>(_GetListSumResponse_QNAME, GetListSumResponse.class, null, value);
    }

}
