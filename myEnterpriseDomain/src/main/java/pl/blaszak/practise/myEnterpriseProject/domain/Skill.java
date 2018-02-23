//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.23 at 08:51:57 AM CET 
//


package pl.blaszak.practise.myEnterpriseProject.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Skill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Skill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="language" type="{}ProgramingLanguage"/>
 *         &lt;element name="level" type="{}SkillLevel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Skill", propOrder = {
    "language",
    "level"
})
public class Skill {

    @XmlElement(required = true)
    protected ProgramingLanguage language;
    @XmlElement(required = true)
    protected SkillLevel level;

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramingLanguage }
     *     
     */
    public ProgramingLanguage getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramingLanguage }
     *     
     */
    public void setLanguage(ProgramingLanguage value) {
        this.language = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link SkillLevel }
     *     
     */
    public SkillLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkillLevel }
     *     
     */
    public void setLevel(SkillLevel value) {
        this.level = value;
    }

}
