//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.22 at 02:24:03 PM CET 
//


package pl.blaszak.practise.myEnterpriseProject.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SkillLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SkillLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOVICE"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="SENIOR"/>
 *     &lt;enumeration value="GURU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SkillLevel")
@XmlEnum
public enum SkillLevel {

    NOVICE,
    MEDIUM,
    SENIOR,
    GURU;

    public String value() {
        return name();
    }

    public static SkillLevel fromValue(String v) {
        return valueOf(v);
    }

}
