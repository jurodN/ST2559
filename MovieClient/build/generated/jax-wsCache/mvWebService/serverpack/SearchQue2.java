
package serverpack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchQue2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchQue2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="conditon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="secondNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchQue2", propOrder = {
    "category",
    "conditon",
    "firstNum",
    "secondNum"
})
public class SearchQue2 {

    protected String category;
    protected String conditon;
    protected int firstNum;
    protected int secondNum;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the conditon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditon() {
        return conditon;
    }

    /**
     * Sets the value of the conditon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditon(String value) {
        this.conditon = value;
    }

    /**
     * Gets the value of the firstNum property.
     * 
     */
    public int getFirstNum() {
        return firstNum;
    }

    /**
     * Sets the value of the firstNum property.
     * 
     */
    public void setFirstNum(int value) {
        this.firstNum = value;
    }

    /**
     * Gets the value of the secondNum property.
     * 
     */
    public int getSecondNum() {
        return secondNum;
    }

    /**
     * Sets the value of the secondNum property.
     * 
     */
    public void setSecondNum(int value) {
        this.secondNum = value;
    }

}
