//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.23 at 08:51:57 AM CET 
//


package pl.blaszak.practise.myEnterpriseProject.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramingLanguage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProgramingLanguage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="C_SHARP"/>
 *     &lt;enumeration value="CPP"/>
 *     &lt;enumeration value="JAVA"/>
 *     &lt;enumeration value="JAVA_EE"/>
 *     &lt;enumeration value="SCALA"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="RUBY"/>
 *     &lt;enumeration value="PYTHON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProgramingLanguage")
@XmlEnum
public enum ProgramingLanguage {

    C,
    C_SHARP,
    CPP,
    JAVA,
    JAVA_EE,
    SCALA,
    PHP,
    RUBY,
    PYTHON;

    public String value() {
        return name();
    }

    public static ProgramingLanguage fromValue(String v) {
        return valueOf(v);
    }

}
