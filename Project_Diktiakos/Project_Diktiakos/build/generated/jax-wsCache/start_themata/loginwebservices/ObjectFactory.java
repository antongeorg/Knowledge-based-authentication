
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

    private final static QName _ArxikopoisiThemata_QNAME = new QName("http://loginwebservices/", "arxikopoisi_themata");
    private final static QName _ArxikopoisiThemataResponse_QNAME = new QName("http://loginwebservices/", "arxikopoisi_themataResponse");
    private final static QName _GetChoice1_QNAME = new QName("http://loginwebservices/", "get_choice1");
    private final static QName _GetChoice1Response_QNAME = new QName("http://loginwebservices/", "get_choice1Response");
    private final static QName _GetChoice2_QNAME = new QName("http://loginwebservices/", "get_choice2");
    private final static QName _GetChoice2Response_QNAME = new QName("http://loginwebservices/", "get_choice2Response");
    private final static QName _GetChoice3_QNAME = new QName("http://loginwebservices/", "get_choice3");
    private final static QName _GetChoice3Response_QNAME = new QName("http://loginwebservices/", "get_choice3Response");
    private final static QName _GetChoice4_QNAME = new QName("http://loginwebservices/", "get_choice4");
    private final static QName _GetChoice4Response_QNAME = new QName("http://loginwebservices/", "get_choice4Response");
    private final static QName _GetErwtisi_QNAME = new QName("http://loginwebservices/", "get_erwtisi");
    private final static QName _GetErwtisiResponse_QNAME = new QName("http://loginwebservices/", "get_erwtisiResponse");
    private final static QName _GetNumberCode_QNAME = new QName("http://loginwebservices/", "get_number_code");
    private final static QName _GetNumberCodeResponse_QNAME = new QName("http://loginwebservices/", "get_number_codeResponse");
    private final static QName _RandomErwtisi_QNAME = new QName("http://loginwebservices/", "random_erwtisi");
    private final static QName _RandomErwtisiResponse_QNAME = new QName("http://loginwebservices/", "random_erwtisiResponse");
    private final static QName _ThemataRandom_QNAME = new QName("http://loginwebservices/", "themata_random");
    private final static QName _ThemataRandomResponse_QNAME = new QName("http://loginwebservices/", "themata_randomResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArxikopoisiThemata }
     * 
     */
    public ArxikopoisiThemata createArxikopoisiThemata() {
        return new ArxikopoisiThemata();
    }

    /**
     * Create an instance of {@link ArxikopoisiThemataResponse }
     * 
     */
    public ArxikopoisiThemataResponse createArxikopoisiThemataResponse() {
        return new ArxikopoisiThemataResponse();
    }

    /**
     * Create an instance of {@link GetChoice1 }
     * 
     */
    public GetChoice1 createGetChoice1() {
        return new GetChoice1();
    }

    /**
     * Create an instance of {@link GetChoice1Response }
     * 
     */
    public GetChoice1Response createGetChoice1Response() {
        return new GetChoice1Response();
    }

    /**
     * Create an instance of {@link GetChoice2 }
     * 
     */
    public GetChoice2 createGetChoice2() {
        return new GetChoice2();
    }

    /**
     * Create an instance of {@link GetChoice2Response }
     * 
     */
    public GetChoice2Response createGetChoice2Response() {
        return new GetChoice2Response();
    }

    /**
     * Create an instance of {@link GetChoice3 }
     * 
     */
    public GetChoice3 createGetChoice3() {
        return new GetChoice3();
    }

    /**
     * Create an instance of {@link GetChoice3Response }
     * 
     */
    public GetChoice3Response createGetChoice3Response() {
        return new GetChoice3Response();
    }

    /**
     * Create an instance of {@link GetChoice4 }
     * 
     */
    public GetChoice4 createGetChoice4() {
        return new GetChoice4();
    }

    /**
     * Create an instance of {@link GetChoice4Response }
     * 
     */
    public GetChoice4Response createGetChoice4Response() {
        return new GetChoice4Response();
    }

    /**
     * Create an instance of {@link GetErwtisi }
     * 
     */
    public GetErwtisi createGetErwtisi() {
        return new GetErwtisi();
    }

    /**
     * Create an instance of {@link GetErwtisiResponse }
     * 
     */
    public GetErwtisiResponse createGetErwtisiResponse() {
        return new GetErwtisiResponse();
    }

    /**
     * Create an instance of {@link GetNumberCode }
     * 
     */
    public GetNumberCode createGetNumberCode() {
        return new GetNumberCode();
    }

    /**
     * Create an instance of {@link GetNumberCodeResponse }
     * 
     */
    public GetNumberCodeResponse createGetNumberCodeResponse() {
        return new GetNumberCodeResponse();
    }

    /**
     * Create an instance of {@link RandomErwtisi }
     * 
     */
    public RandomErwtisi createRandomErwtisi() {
        return new RandomErwtisi();
    }

    /**
     * Create an instance of {@link RandomErwtisiResponse }
     * 
     */
    public RandomErwtisiResponse createRandomErwtisiResponse() {
        return new RandomErwtisiResponse();
    }

    /**
     * Create an instance of {@link ThemataRandom }
     * 
     */
    public ThemataRandom createThemataRandom() {
        return new ThemataRandom();
    }

    /**
     * Create an instance of {@link ThemataRandomResponse }
     * 
     */
    public ThemataRandomResponse createThemataRandomResponse() {
        return new ThemataRandomResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArxikopoisiThemata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "arxikopoisi_themata")
    public JAXBElement<ArxikopoisiThemata> createArxikopoisiThemata(ArxikopoisiThemata value) {
        return new JAXBElement<ArxikopoisiThemata>(_ArxikopoisiThemata_QNAME, ArxikopoisiThemata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArxikopoisiThemataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "arxikopoisi_themataResponse")
    public JAXBElement<ArxikopoisiThemataResponse> createArxikopoisiThemataResponse(ArxikopoisiThemataResponse value) {
        return new JAXBElement<ArxikopoisiThemataResponse>(_ArxikopoisiThemataResponse_QNAME, ArxikopoisiThemataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChoice1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_choice1")
    public JAXBElement<GetChoice1> createGetChoice1(GetChoice1 value) {
        return new JAXBElement<GetChoice1>(_GetChoice1_QNAME, GetChoice1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChoice1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_choice1Response")
    public JAXBElement<GetChoice1Response> createGetChoice1Response(GetChoice1Response value) {
        return new JAXBElement<GetChoice1Response>(_GetChoice1Response_QNAME, GetChoice1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChoice2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_choice2")
    public JAXBElement<GetChoice2> createGetChoice2(GetChoice2 value) {
        return new JAXBElement<GetChoice2>(_GetChoice2_QNAME, GetChoice2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChoice2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_choice2Response")
    public JAXBElement<GetChoice2Response> createGetChoice2Response(GetChoice2Response value) {
        return new JAXBElement<GetChoice2Response>(_GetChoice2Response_QNAME, GetChoice2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChoice3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_choice3")
    public JAXBElement<GetChoice3> createGetChoice3(GetChoice3 value) {
        return new JAXBElement<GetChoice3>(_GetChoice3_QNAME, GetChoice3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChoice3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_choice3Response")
    public JAXBElement<GetChoice3Response> createGetChoice3Response(GetChoice3Response value) {
        return new JAXBElement<GetChoice3Response>(_GetChoice3Response_QNAME, GetChoice3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChoice4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_choice4")
    public JAXBElement<GetChoice4> createGetChoice4(GetChoice4 value) {
        return new JAXBElement<GetChoice4>(_GetChoice4_QNAME, GetChoice4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChoice4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_choice4Response")
    public JAXBElement<GetChoice4Response> createGetChoice4Response(GetChoice4Response value) {
        return new JAXBElement<GetChoice4Response>(_GetChoice4Response_QNAME, GetChoice4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetErwtisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_erwtisi")
    public JAXBElement<GetErwtisi> createGetErwtisi(GetErwtisi value) {
        return new JAXBElement<GetErwtisi>(_GetErwtisi_QNAME, GetErwtisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetErwtisiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_erwtisiResponse")
    public JAXBElement<GetErwtisiResponse> createGetErwtisiResponse(GetErwtisiResponse value) {
        return new JAXBElement<GetErwtisiResponse>(_GetErwtisiResponse_QNAME, GetErwtisiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_number_code")
    public JAXBElement<GetNumberCode> createGetNumberCode(GetNumberCode value) {
        return new JAXBElement<GetNumberCode>(_GetNumberCode_QNAME, GetNumberCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNumberCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "get_number_codeResponse")
    public JAXBElement<GetNumberCodeResponse> createGetNumberCodeResponse(GetNumberCodeResponse value) {
        return new JAXBElement<GetNumberCodeResponse>(_GetNumberCodeResponse_QNAME, GetNumberCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomErwtisi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "random_erwtisi")
    public JAXBElement<RandomErwtisi> createRandomErwtisi(RandomErwtisi value) {
        return new JAXBElement<RandomErwtisi>(_RandomErwtisi_QNAME, RandomErwtisi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomErwtisiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "random_erwtisiResponse")
    public JAXBElement<RandomErwtisiResponse> createRandomErwtisiResponse(RandomErwtisiResponse value) {
        return new JAXBElement<RandomErwtisiResponse>(_RandomErwtisiResponse_QNAME, RandomErwtisiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThemataRandom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "themata_random")
    public JAXBElement<ThemataRandom> createThemataRandom(ThemataRandom value) {
        return new JAXBElement<ThemataRandom>(_ThemataRandom_QNAME, ThemataRandom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ThemataRandomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "themata_randomResponse")
    public JAXBElement<ThemataRandomResponse> createThemataRandomResponse(ThemataRandomResponse value) {
        return new JAXBElement<ThemataRandomResponse>(_ThemataRandomResponse_QNAME, ThemataRandomResponse.class, null, value);
    }

}
