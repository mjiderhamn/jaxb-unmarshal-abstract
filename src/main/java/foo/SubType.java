
package foo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import base.BaseType;


/**
 * <p>Java class for SubType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:base}BaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubType", propOrder = {
    "bar"
})
public class SubType
    extends BaseType
{

    @XmlElement(required = true)
    protected String bar;

    /**
     * Gets the value of the bar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBar() {
        return bar;
    }

    /**
     * Sets the value of the bar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBar(String value) {
        this.bar = value;
    }

}
