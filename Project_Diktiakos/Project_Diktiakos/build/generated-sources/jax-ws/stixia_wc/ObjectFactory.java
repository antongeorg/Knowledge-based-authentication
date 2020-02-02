
package stixia_wc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stixia_wc package. 
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

    private final static QName _CountStixia_QNAME = new QName("http://loginwebservices/", "Count_stixia");
    private final static QName _CountStixiaResponse_QNAME = new QName("http://loginwebservices/", "Count_stixiaResponse");
    private final static QName _InsertStixia_QNAME = new QName("http://loginwebservices/", "insert_stixia");
    private final static QName _InsertStixiaResponse_QNAME = new QName("http://loginwebservices/", "insert_stixiaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stixia_wc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CountStixia }
     * 
     */
    public CountStixia createCountStixia() {
        return new CountStixia();
    }

    /**
     * Create an instance of {@link CountStixiaResponse }
     * 
     */
    public CountStixiaResponse createCountStixiaResponse() {
        return new CountStixiaResponse();
    }

    /**
     * Create an instance of {@link InsertStixia }
     * 
     */
    public InsertStixia createInsertStixia() {
        return new InsertStixia();
    }

    /**
     * Create an instance of {@link InsertStixiaResponse }
     * 
     */
    public InsertStixiaResponse createInsertStixiaResponse() {
        return new InsertStixiaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountStixia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "Count_stixia")
    public JAXBElement<CountStixia> createCountStixia(CountStixia value) {
        return new JAXBElement<CountStixia>(_CountStixia_QNAME, CountStixia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountStixiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "Count_stixiaResponse")
    public JAXBElement<CountStixiaResponse> createCountStixiaResponse(CountStixiaResponse value) {
        return new JAXBElement<CountStixiaResponse>(_CountStixiaResponse_QNAME, CountStixiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStixia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "insert_stixia")
    public JAXBElement<InsertStixia> createInsertStixia(InsertStixia value) {
        return new JAXBElement<InsertStixia>(_InsertStixia_QNAME, InsertStixia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertStixiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://loginwebservices/", name = "insert_stixiaResponse")
    public JAXBElement<InsertStixiaResponse> createInsertStixiaResponse(InsertStixiaResponse value) {
        return new JAXBElement<InsertStixiaResponse>(_InsertStixiaResponse_QNAME, InsertStixiaResponse.class, null, value);
    }

}
