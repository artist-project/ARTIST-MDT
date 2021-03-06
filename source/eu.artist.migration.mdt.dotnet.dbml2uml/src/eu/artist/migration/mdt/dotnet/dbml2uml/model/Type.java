/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.02 at 02:42:29 PM CEST 
//


package eu.artist.migration.mdt.dotnet.dbml2uml.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Column" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}Column" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="Association" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}Association" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="Type" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IdRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InheritanceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsInheritanceDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AccessModifier" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}AccessModifier" />
 *       &lt;attribute name="Modifier" type="{http://schemas.microsoft.com/linqtosql/dbml/2007}ClassModifier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type", propOrder = {
    "columnOrAssociation",
    "type"
})
public class Type {

    @XmlElements({
        @XmlElement(name = "Column", type = Column.class),
        @XmlElement(name = "Association", type = Association.class)
    })
    protected List<Object> columnOrAssociation;
    @XmlElement(name = "Type")
    protected List<Type> type;
    @XmlAttribute(name = "IdRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object idRef;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "InheritanceCode")
    protected String inheritanceCode;
    @XmlAttribute(name = "IsInheritanceDefault")
    protected Boolean isInheritanceDefault;
    @XmlAttribute(name = "AccessModifier")
    protected AccessModifier accessModifier;
    @XmlAttribute(name = "Modifier")
    protected ClassModifier modifier;

    /**
     * Gets the value of the columnOrAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnOrAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnOrAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Column }
     * {@link Association }
     * 
     * 
     */
    public List<Object> getColumnOrAssociation() {
        if (columnOrAssociation == null) {
            columnOrAssociation = new ArrayList<Object>();
        }
        return this.columnOrAssociation;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Type }
     * 
     * 
     */
    public List<Type> getType() {
        if (type == null) {
            type = new ArrayList<Type>();
        }
        return this.type;
    }

    /**
     * Gets the value of the idRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdRef() {
        return idRef;
    }

    /**
     * Sets the value of the idRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdRef(Object value) {
        this.idRef = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the inheritanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInheritanceCode() {
        return inheritanceCode;
    }

    /**
     * Sets the value of the inheritanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInheritanceCode(String value) {
        this.inheritanceCode = value;
    }

    /**
     * Gets the value of the isInheritanceDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInheritanceDefault() {
        return isInheritanceDefault;
    }

    /**
     * Sets the value of the isInheritanceDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInheritanceDefault(Boolean value) {
        this.isInheritanceDefault = value;
    }

    /**
     * Gets the value of the accessModifier property.
     * 
     * @return
     *     possible object is
     *     {@link AccessModifier }
     *     
     */
    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    /**
     * Sets the value of the accessModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModifier }
     *     
     */
    public void setAccessModifier(AccessModifier value) {
        this.accessModifier = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * @return
     *     possible object is
     *     {@link ClassModifier }
     *     
     */
    public ClassModifier getModifier() {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassModifier }
     *     
     */
    public void setModifier(ClassModifier value) {
        this.modifier = value;
    }

}
