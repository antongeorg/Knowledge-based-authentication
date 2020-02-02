
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

    private final static QName _FinalResult_QNAME = new QName("http://loginwebservices/", "final_result");
    private final static QName _FinalResultResponse_QNAME = new QName("http://loginwebservices/", "final_resultResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginwebservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FinalResult }
     * 
     */
    public FinalResult createFinalResult() {
        return new FinalResult();
    }

    /**
     * Create an instance of {@link FinalResultResponse }
     * 
     */
    public FinalResultResponse createFinalResultResponse() {
        return new FinalResultResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "final_result")
    public JAXBElement<FinalResult> createFinalResult(FinalResult value) {
        return new JAXBElement<FinalResult>(_FinalResult_QNAME, FinalResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "final_resultResponse")
    public JAXBElement<FinalResultResponse> createFinalResultResponse(FinalResultResponse value) {
        return new JAXBElement<FinalResultResponse>(_FinalResultResponse_QNAME, FinalResultResponse.class, null, value);
    }

}
