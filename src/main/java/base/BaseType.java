
package base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import foo.SubType;


/**
 * <p>Java class for BaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="foo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseType", propOrder = {
    "foo"
})
@XmlSeeAlso({
    SubType.class
})
public abstract class BaseType {

    @XmlElement(namespace = "", required = true)
    protected String foo;

    /**
     * Gets the value of the foo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoo() {
        return foo;
    }

    /**
     * Sets the value of the foo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoo(String value) {
        this.foo = value;
    }

}
