
package base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import foo.SubType;


/**
 * <p>Java class for ListOfSomethingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfSomethingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:base}mybase" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfSomethingType", propOrder = {
    "mybase"
})
@XmlRootElement(namespace = "urn:base")
public class ListOfSomethingType {

    @XmlElementRef(name = "mybase", namespace = "urn:base", type = JAXBElement.class)
    protected List<JAXBElement<? extends BaseType>> mybase;

    /**
     * Gets the value of the mybase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mybase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMybase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link SubType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BaseType>> getMybase() {
        if (mybase == null) {
            mybase = new ArrayList<JAXBElement<? extends BaseType>>();
        }
        return this.mybase;
    }

}
