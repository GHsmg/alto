//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.18 at 01:41:32 PM CEST 
//


package org.mycore.xml.abbyy.v10;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WordRecognitionVariant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WordRecognitionVariant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="variantText">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="charParams" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}CharParamsType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="wordFromDictionary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordNormal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordNumeric" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordIdentifier" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="wordPenalty" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="meanStrokeWidth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordRecognitionVariant", propOrder = {
    "variantText"
})
public class WordRecognitionVariant {

    @XmlElement(required = true)
    protected WordRecognitionVariant.VariantText variantText;
    @XmlAttribute(name = "wordFromDictionary")
    protected Boolean wordFromDictionary;
    @XmlAttribute(name = "wordNormal")
    protected Boolean wordNormal;
    @XmlAttribute(name = "wordNumeric")
    protected Boolean wordNumeric;
    @XmlAttribute(name = "wordIdentifier")
    protected Boolean wordIdentifier;
    @XmlAttribute(name = "wordPenalty")
    protected BigInteger wordPenalty;
    @XmlAttribute(name = "meanStrokeWidth")
    protected BigInteger meanStrokeWidth;

    /**
     * Gets the value of the variantText property.
     * 
     * @return
     *     possible object is
     *     {@link WordRecognitionVariant.VariantText }
     *     
     */
    public WordRecognitionVariant.VariantText getVariantText() {
        return variantText;
    }

    /**
     * Sets the value of the variantText property.
     * 
     * @param value
     *     allowed object is
     *     {@link WordRecognitionVariant.VariantText }
     *     
     */
    public void setVariantText(WordRecognitionVariant.VariantText value) {
        this.variantText = value;
    }

    /**
     * Gets the value of the wordFromDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWordFromDictionary() {
        return wordFromDictionary;
    }

    /**
     * Sets the value of the wordFromDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWordFromDictionary(Boolean value) {
        this.wordFromDictionary = value;
    }

    /**
     * Gets the value of the wordNormal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWordNormal() {
        return wordNormal;
    }

    /**
     * Sets the value of the wordNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWordNormal(Boolean value) {
        this.wordNormal = value;
    }

    /**
     * Gets the value of the wordNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWordNumeric() {
        return wordNumeric;
    }

    /**
     * Sets the value of the wordNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWordNumeric(Boolean value) {
        this.wordNumeric = value;
    }

    /**
     * Gets the value of the wordIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWordIdentifier() {
        return wordIdentifier;
    }

    /**
     * Sets the value of the wordIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWordIdentifier(Boolean value) {
        this.wordIdentifier = value;
    }

    /**
     * Gets the value of the wordPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWordPenalty() {
        return wordPenalty;
    }

    /**
     * Sets the value of the wordPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWordPenalty(BigInteger value) {
        this.wordPenalty = value;
    }

    /**
     * Gets the value of the meanStrokeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeanStrokeWidth() {
        return meanStrokeWidth;
    }

    /**
     * Sets the value of the meanStrokeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeanStrokeWidth(BigInteger value) {
        this.meanStrokeWidth = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="charParams" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}CharParamsType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class VariantText {

        @XmlElementRef(name = "charParams", namespace = "http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml", type = JAXBElement.class, required = false)
        @XmlMixed
        protected List<Serializable> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link JAXBElement }{@code <}{@link CharParamsType }{@code >}
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }

}
