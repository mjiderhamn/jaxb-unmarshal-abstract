
package foo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the foo package. 
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

    private final static QName _Sub_QNAME = new QName("urn:foo", "sub");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: foo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubType }
     * 
     */
    public SubType createSubType() {
        return new SubType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:foo", name = "sub", substitutionHeadNamespace = "urn:base", substitutionHeadName = "mybase")
    public JAXBElement<SubType> createSub(SubType value) {
        return new JAXBElement<SubType>(_Sub_QNAME, SubType.class, null, value);
    }

}
