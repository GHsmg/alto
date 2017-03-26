//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.18 at 01:41:32 PM CEST 
//


package org.mycore.xml.abbyy.v10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TextType" minOccurs="0"/>
 *         &lt;element name="table" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}TableType" minOccurs="0"/>
 *         &lt;element name="barcode" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}BarcodeType" minOccurs="0"/>
 *         &lt;element name="picture" type="{http://www.abbyy.com/FineReader_xml/FineReader10-schema-v1.xml}PictureType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pageElemId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageElementType", propOrder = {
    "text",
    "table",
    "barcode",
    "picture"
})
public class PageElementType {

    protected TextType text;
    protected TableType table;
    protected BarcodeType barcode;
    protected PictureType picture;
    @XmlAttribute(name = "pageElemId", required = true)
    protected String pageElemId;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setText(TextType value) {
        this.text = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link TableType }
     *     
     */
    public TableType getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableType }
     *     
     */
    public void setTable(TableType value) {
        this.table = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeType }
     *     
     */
    public BarcodeType getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeType }
     *     
     */
    public void setBarcode(BarcodeType value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the picture property.
     * 
     * @return
     *     possible object is
     *     {@link PictureType }
     *     
     */
    public PictureType getPicture() {
        return picture;
    }

    /**
     * Sets the value of the picture property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureType }
     *     
     */
    public void setPicture(PictureType value) {
        this.picture = value;
    }

    /**
     * Gets the value of the pageElemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageElemId() {
        return pageElemId;
    }

    /**
     * Sets the value of the pageElemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageElemId(String value) {
        this.pageElemId = value;
    }

}