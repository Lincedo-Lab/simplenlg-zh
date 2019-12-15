//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.04 at 09:14:07 AM EST 
//


package simplenlg.xmlrealiser.wrapper;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WordElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WordElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://simplenlg.googlecode.com/svn/trunk/res/xml}NLGElement">
 *       &lt;sequence>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://simplenlg.googlecode.com/svn/trunk/res/xml}wordAtts"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordElement", propOrder = {
    "base"
})
public class XmlWordElement
    extends XmlNLGElement
{

    @XmlElement(required = true)
    protected String base;
    @XmlAttribute(name = "cat")
    protected XmlLexicalCategory cat;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "EXPLETIVE_SUBJECT")
    protected Boolean expletivesubject;
    @XmlAttribute(name = "PROPER")
    protected Boolean proper;
    @XmlAttribute(name = "var")
    protected XmlInflection var;
    @XmlAttribute(name = "canned")
    protected Boolean canned;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the cat property.
     * 
     * @return
     *     possible object is
     *     {@link XmlLexicalCategory }
     *     
     */
    public XmlLexicalCategory getCat() {
        return cat;
    }

    /**
     * Sets the value of the cat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlLexicalCategory }
     *     
     */
    public void setCat(XmlLexicalCategory value) {
        this.cat = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the expletivesubject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEXPLETIVESUBJECT() {
        return expletivesubject;
    }

    /**
     * Sets the value of the expletivesubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEXPLETIVESUBJECT(Boolean value) {
        this.expletivesubject = value;
    }

    /**
     * Gets the value of the proper property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPROPER() {
        return proper;
    }

    /**
     * Sets the value of the proper property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPROPER(Boolean value) {
        this.proper = value;
    }

    /**
     * Gets the value of the var property.
     * 
     * @return
     *     possible object is
     *     {@link XmlInflection }
     *     
     */
    public XmlInflection getVar() {
        return var;
    }

    /**
     * Sets the value of the var property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlInflection }
     *     
     */
    public void setVar(XmlInflection value) {
        this.var = value;
    }

    /**
     * Gets the value of the canned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanned() {
        return canned;
    }

    /**
     * Sets the value of the canned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanned(Boolean value) {
        this.canned = value;
    }

}
