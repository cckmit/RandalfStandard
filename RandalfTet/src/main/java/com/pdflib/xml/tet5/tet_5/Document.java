//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2020.02.28 alle 02:40:46 PM CET 
//


package com.pdflib.xml.tet5.tet_5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XFA" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="static" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Encryption" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="keylength" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;minInclusive value="40"/>
 *                       &lt;maxInclusive value="256"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="algorithm" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;minInclusive value="-1"/>
 *                       &lt;maxInclusive value="11"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="description" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Unknown encryption"/>
 *                       &lt;enumeration value="No encryption"/>
 *                       &lt;enumeration value="40-bit RC4 (Acrobat 2-4)"/>
 *                       &lt;enumeration value="128-bit RC4 (Acrobat 5)"/>
 *                       &lt;enumeration value="128-bit RC4 (Acrobat 6)"/>
 *                       &lt;enumeration value="128-bit AES (Acrobat 7)"/>
 *                       &lt;enumeration value="Public key on top of 128-bit RC4 (Acrobat 5)"/>
 *                       &lt;enumeration value="Public key on top of 128-bit AES (Acrobat 7)"/>
 *                       &lt;enumeration value="Adobe Policy Server (Acrobat 7)"/>
 *                       &lt;enumeration value="Adobe Digital Editions (EBX)"/>
 *                       &lt;enumeration value="256-bit AES (Acrobat 9)"/>
 *                       &lt;enumeration value="Public key on top of 256-bit AES (Acrobat 9)"/>
 *                       &lt;enumeration value="256-bit AES (Acrobat X)"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="masterpassword" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="userpassword" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="attachmentpassword" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="noprint" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="nomodify" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="nocopy" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="noannots" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="noassemble" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="noforms" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="noaccessible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="nohiresprint" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                 &lt;attribute name="plainmetadata" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SignatureFields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SignatureField" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="cades" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="field" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}fieldId" />
 *                           &lt;attribute name="fillablefields" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="permissions">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="formfilling"/>
 *                                 &lt;enumeration value="formsandannotations"/>
 *                                 &lt;enumeration value="nochanges"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="preventchanges" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="sigtype" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="approval"/>
 *                                 &lt;enumeration value="certification"/>
 *                                 &lt;enumeration value="doctimestamp"/>
 *                                 &lt;enumeration value="none"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DocInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://www.pdflib.com/XML/TET5/TET-5.0}DocInfoGroup" minOccurs="0"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Metadata" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}OutputIntents" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Options" minOccurs="0"/>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Action" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Bookmarks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Bookmark" maxOccurs="unbounded"/>
 *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *         &lt;element name="Pages">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Page" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Options" minOccurs="0"/>
 *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Action" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Annotations" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Annotation" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Fields" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Field" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}OutputIntents" minOccurs="0"/>
 *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Content" minOccurs="0"/>
 *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="number" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="topdown" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                           &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="hasdefaultgray" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="hasdefaultrgb" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="hasdefaultcmyk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Resources" minOccurs="0"/>
 *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Graphics" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Destinations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Destination" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="anchor" type="{http://www.pdflib.com/XML/TET5/TET-5.0}anchorId" />
 *                           &lt;attribute name="bottom" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}destinationId" />
 *                           &lt;attribute name="left" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="right" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="top" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="XYZ"/>
 *                                 &lt;enumeration value="Fit"/>
 *                                 &lt;enumeration value="FitH"/>
 *                                 &lt;enumeration value="FitV"/>
 *                                 &lt;enumeration value="FitR"/>
 *                                 &lt;enumeration value="FitB"/>
 *                                 &lt;enumeration value="FitBH"/>
 *                                 &lt;enumeration value="FitBV"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="zoom" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="JavaScripts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JavaScript" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.pdflib.com/XML/TET5/TET-5.0}javaScriptId" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Attachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="Attachment" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;choice minOccurs="0">
 *                               &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
 *                               &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Document" minOccurs="0"/>
 *                             &lt;/choice>
 *                             &lt;attribute name="name" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="level" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="document"/>
 *                                   &lt;enumeration value="page"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="pagenumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="destination" type="{http://www.pdflib.com/XML/TET5/TET-5.0}destinationId" />
 *       &lt;attribute name="filename" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="filesize" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="linearized" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="pageCount" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="pdfVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pdfa" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="PDF/A-1a:2005"/>
 *             &lt;enumeration value="PDF/A-1b:2005"/>
 *             &lt;enumeration value="PDF/A-2a"/>
 *             &lt;enumeration value="PDF/A-2b"/>
 *             &lt;enumeration value="PDF/A-2u"/>
 *             &lt;enumeration value="PDF/A-3a"/>
 *             &lt;enumeration value="PDF/A-3b"/>
 *             &lt;enumeration value="PDF/A-3u"/>
 *             &lt;enumeration value="PDF/A-4"/>
 *             &lt;enumeration value="PDF/A-4e"/>
 *             &lt;enumeration value="PDF/A-4f"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pdfe" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="PDF/E-1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pdfua" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="PDF/UA-1"/>
 *             &lt;enumeration value="PDF/UA-2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pdfvcr" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="PDF/VCR-1"/>
 *             &lt;enumeration value="PDF/VCR-2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pdfvt" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="PDF/VT-1"/>
 *             &lt;enumeration value="PDF/VT-2"/>
 *             &lt;enumeration value="PDF/VT-3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pdfx" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="PDF/X-1:2001"/>
 *             &lt;enumeration value="PDF/X-1a:2001"/>
 *             &lt;enumeration value="PDF/X-1a:2003"/>
 *             &lt;enumeration value="PDF/X-2:2003"/>
 *             &lt;enumeration value="PDF/X-3:2002"/>
 *             &lt;enumeration value="PDF/X-3:2003"/>
 *             &lt;enumeration value="PDF/X-4"/>
 *             &lt;enumeration value="PDF/X-4p"/>
 *             &lt;enumeration value="PDF/X-5g"/>
 *             &lt;enumeration value="PDF/X-5n"/>
 *             &lt;enumeration value="PDF/X-5p"/>
 *             &lt;enumeration value="PDF/X-6"/>
 *             &lt;enumeration value="PDF/X-6p"/>
 *             &lt;enumeration value="PDF/X-6n"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="revisions" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="tagged" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="usagerights" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xfa",
    "encryption",
    "signatureFields",
    "docInfo",
    "metadata",
    "outputIntents",
    "options",
    "action",
    "bookmarks",
    "exception",
    "pages",
    "destinations",
    "javaScripts",
    "attachments"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "XFA")
    protected Document.XFA xfa;
    @XmlElement(name = "Encryption")
    protected Document.Encryption encryption;
    @XmlElement(name = "SignatureFields")
    protected Document.SignatureFields signatureFields;
    @XmlElement(name = "DocInfo")
    protected Document.DocInfo docInfo;
    @XmlElement(name = "Metadata")
    protected Metadata metadata;
    @XmlElement(name = "OutputIntents")
    protected OutputIntents outputIntents;
    @XmlElement(name = "Options")
    protected String options;
    @XmlElement(name = "Action")
    protected List<Action> action;
    @XmlElement(name = "Bookmarks")
    protected Document.Bookmarks bookmarks;
    @XmlElement(name = "Exception")
    protected Exception exception;
    @XmlElement(name = "Pages", required = true)
    protected Document.Pages pages;
    @XmlElement(name = "Destinations")
    protected Document.Destinations destinations;
    @XmlElement(name = "JavaScripts")
    protected Document.JavaScripts javaScripts;
    @XmlElement(name = "Attachments")
    protected Document.Attachments attachments;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "filename", required = true)
    protected String filename;
    @XmlAttribute(name = "filesize", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger filesize;
    @XmlAttribute(name = "linearized", required = true)
    protected boolean linearized;
    @XmlAttribute(name = "pageCount", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pageCount;
    @XmlAttribute(name = "pdfVersion", required = true)
    protected String pdfVersion;
    @XmlAttribute(name = "pdfa")
    protected String pdfa;
    @XmlAttribute(name = "pdfe")
    protected String pdfe;
    @XmlAttribute(name = "pdfua")
    protected String pdfua;
    @XmlAttribute(name = "pdfvcr")
    protected String pdfvcr;
    @XmlAttribute(name = "pdfvt")
    protected String pdfvt;
    @XmlAttribute(name = "pdfx")
    protected String pdfx;
    @XmlAttribute(name = "revisions")
    protected Integer revisions;
    @XmlAttribute(name = "tagged")
    protected Boolean tagged;
    @XmlAttribute(name = "usagerights")
    protected Boolean usagerights;

    /**
     * Recupera il valore della proprietà xfa.
     * 
     * @return
     *     possible object is
     *     {@link Document.XFA }
     *     
     */
    public Document.XFA getXFA() {
        return xfa;
    }

    /**
     * Imposta il valore della proprietà xfa.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.XFA }
     *     
     */
    public void setXFA(Document.XFA value) {
        this.xfa = value;
    }

    /**
     * Recupera il valore della proprietà encryption.
     * 
     * @return
     *     possible object is
     *     {@link Document.Encryption }
     *     
     */
    public Document.Encryption getEncryption() {
        return encryption;
    }

    /**
     * Imposta il valore della proprietà encryption.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.Encryption }
     *     
     */
    public void setEncryption(Document.Encryption value) {
        this.encryption = value;
    }

    /**
     * Recupera il valore della proprietà signatureFields.
     * 
     * @return
     *     possible object is
     *     {@link Document.SignatureFields }
     *     
     */
    public Document.SignatureFields getSignatureFields() {
        return signatureFields;
    }

    /**
     * Imposta il valore della proprietà signatureFields.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.SignatureFields }
     *     
     */
    public void setSignatureFields(Document.SignatureFields value) {
        this.signatureFields = value;
    }

    /**
     * Recupera il valore della proprietà docInfo.
     * 
     * @return
     *     possible object is
     *     {@link Document.DocInfo }
     *     
     */
    public Document.DocInfo getDocInfo() {
        return docInfo;
    }

    /**
     * Imposta il valore della proprietà docInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.DocInfo }
     *     
     */
    public void setDocInfo(Document.DocInfo value) {
        this.docInfo = value;
    }

    /**
     * Recupera il valore della proprietà metadata.
     * 
     * @return
     *     possible object is
     *     {@link Metadata }
     *     
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Imposta il valore della proprietà metadata.
     * 
     * @param value
     *     allowed object is
     *     {@link Metadata }
     *     
     */
    public void setMetadata(Metadata value) {
        this.metadata = value;
    }

    /**
     * Recupera il valore della proprietà outputIntents.
     * 
     * @return
     *     possible object is
     *     {@link OutputIntents }
     *     
     */
    public OutputIntents getOutputIntents() {
        return outputIntents;
    }

    /**
     * Imposta il valore della proprietà outputIntents.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputIntents }
     *     
     */
    public void setOutputIntents(OutputIntents value) {
        this.outputIntents = value;
    }

    /**
     * Recupera il valore della proprietà options.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptions() {
        return options;
    }

    /**
     * Imposta il valore della proprietà options.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptions(String value) {
        this.options = value;
    }

    /**
     * TET 5.0 Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action }
     * 
     * 
     */
    public List<Action> getAction() {
        if (action == null) {
            action = new ArrayList<Action>();
        }
        return this.action;
    }

    /**
     * Recupera il valore della proprietà bookmarks.
     * 
     * @return
     *     possible object is
     *     {@link Document.Bookmarks }
     *     
     */
    public Document.Bookmarks getBookmarks() {
        return bookmarks;
    }

    /**
     * Imposta il valore della proprietà bookmarks.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.Bookmarks }
     *     
     */
    public void setBookmarks(Document.Bookmarks value) {
        this.bookmarks = value;
    }

    /**
     * Recupera il valore della proprietà exception.
     * 
     * @return
     *     possible object is
     *     {@link Exception }
     *     
     */
    public Exception getException() {
        return exception;
    }

    /**
     * Imposta il valore della proprietà exception.
     * 
     * @param value
     *     allowed object is
     *     {@link Exception }
     *     
     */
    public void setException(Exception value) {
        this.exception = value;
    }

    /**
     * Recupera il valore della proprietà pages.
     * 
     * @return
     *     possible object is
     *     {@link Document.Pages }
     *     
     */
    public Document.Pages getPages() {
        return pages;
    }

    /**
     * Imposta il valore della proprietà pages.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.Pages }
     *     
     */
    public void setPages(Document.Pages value) {
        this.pages = value;
    }

    /**
     * Recupera il valore della proprietà destinations.
     * 
     * @return
     *     possible object is
     *     {@link Document.Destinations }
     *     
     */
    public Document.Destinations getDestinations() {
        return destinations;
    }

    /**
     * Imposta il valore della proprietà destinations.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.Destinations }
     *     
     */
    public void setDestinations(Document.Destinations value) {
        this.destinations = value;
    }

    /**
     * Recupera il valore della proprietà javaScripts.
     * 
     * @return
     *     possible object is
     *     {@link Document.JavaScripts }
     *     
     */
    public Document.JavaScripts getJavaScripts() {
        return javaScripts;
    }

    /**
     * Imposta il valore della proprietà javaScripts.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.JavaScripts }
     *     
     */
    public void setJavaScripts(Document.JavaScripts value) {
        this.javaScripts = value;
    }

    /**
     * Recupera il valore della proprietà attachments.
     * 
     * @return
     *     possible object is
     *     {@link Document.Attachments }
     *     
     */
    public Document.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Imposta il valore della proprietà attachments.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.Attachments }
     *     
     */
    public void setAttachments(Document.Attachments value) {
        this.attachments = value;
    }

    /**
     * Recupera il valore della proprietà destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Imposta il valore della proprietà destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Recupera il valore della proprietà filename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Imposta il valore della proprietà filename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Recupera il valore della proprietà filesize.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFilesize() {
        return filesize;
    }

    /**
     * Imposta il valore della proprietà filesize.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFilesize(BigInteger value) {
        this.filesize = value;
    }

    /**
     * Recupera il valore della proprietà linearized.
     * 
     */
    public boolean isLinearized() {
        return linearized;
    }

    /**
     * Imposta il valore della proprietà linearized.
     * 
     */
    public void setLinearized(boolean value) {
        this.linearized = value;
    }

    /**
     * Recupera il valore della proprietà pageCount.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageCount() {
        return pageCount;
    }

    /**
     * Imposta il valore della proprietà pageCount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageCount(BigInteger value) {
        this.pageCount = value;
    }

    /**
     * Recupera il valore della proprietà pdfVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfVersion() {
        return pdfVersion;
    }

    /**
     * Imposta il valore della proprietà pdfVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfVersion(String value) {
        this.pdfVersion = value;
    }

    /**
     * Recupera il valore della proprietà pdfa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfa() {
        if (pdfa == null) {
            return "none";
        } else {
            return pdfa;
        }
    }

    /**
     * Imposta il valore della proprietà pdfa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfa(String value) {
        this.pdfa = value;
    }

    /**
     * Recupera il valore della proprietà pdfe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfe() {
        if (pdfe == null) {
            return "none";
        } else {
            return pdfe;
        }
    }

    /**
     * Imposta il valore della proprietà pdfe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfe(String value) {
        this.pdfe = value;
    }

    /**
     * Recupera il valore della proprietà pdfua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfua() {
        if (pdfua == null) {
            return "none";
        } else {
            return pdfua;
        }
    }

    /**
     * Imposta il valore della proprietà pdfua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfua(String value) {
        this.pdfua = value;
    }

    /**
     * Recupera il valore della proprietà pdfvcr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfvcr() {
        if (pdfvcr == null) {
            return "none";
        } else {
            return pdfvcr;
        }
    }

    /**
     * Imposta il valore della proprietà pdfvcr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfvcr(String value) {
        this.pdfvcr = value;
    }

    /**
     * Recupera il valore della proprietà pdfvt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfvt() {
        if (pdfvt == null) {
            return "none";
        } else {
            return pdfvt;
        }
    }

    /**
     * Imposta il valore della proprietà pdfvt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfvt(String value) {
        this.pdfvt = value;
    }

    /**
     * Recupera il valore della proprietà pdfx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfx() {
        if (pdfx == null) {
            return "none";
        } else {
            return pdfx;
        }
    }

    /**
     * Imposta il valore della proprietà pdfx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfx(String value) {
        this.pdfx = value;
    }

    /**
     * Recupera il valore della proprietà revisions.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRevisions() {
        if (revisions == null) {
            return  0;
        } else {
            return revisions;
        }
    }

    /**
     * Imposta il valore della proprietà revisions.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRevisions(Integer value) {
        this.revisions = value;
    }

    /**
     * Recupera il valore della proprietà tagged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTagged() {
        if (tagged == null) {
            return false;
        } else {
            return tagged;
        }
    }

    /**
     * Imposta il valore della proprietà tagged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTagged(Boolean value) {
        this.tagged = value;
    }

    /**
     * Recupera il valore della proprietà usagerights.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUsagerights() {
        if (usagerights == null) {
            return false;
        } else {
            return usagerights;
        }
    }

    /**
     * Imposta il valore della proprietà usagerights.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsagerights(Boolean value) {
        this.usagerights = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="Attachment" maxOccurs="unbounded">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;choice minOccurs="0">
     *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *                     &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Document" minOccurs="0"/>
     *                   &lt;/choice>
     *                   &lt;attribute name="name" use="required">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="level" use="required">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="document"/>
     *                         &lt;enumeration value="page"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="pagenumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/sequence>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exception",
        "attachment"
    })
    public static class Attachments {

        @XmlElement(name = "Exception")
        protected Exception exception;
        @XmlElement(name = "Attachment")
        protected List<Document.Attachments.Attachment> attachment;

        /**
         * Recupera il valore della proprietà exception.
         * 
         * @return
         *     possible object is
         *     {@link Exception }
         *     
         */
        public Exception getException() {
            return exception;
        }

        /**
         * Imposta il valore della proprietà exception.
         * 
         * @param value
         *     allowed object is
         *     {@link Exception }
         *     
         */
        public void setException(Exception value) {
            this.exception = value;
        }

        /**
         * Gets the value of the attachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.Attachments.Attachment }
         * 
         * 
         */
        public List<Document.Attachments.Attachment> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<Document.Attachments.Attachment>();
            }
            return this.attachment;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice minOccurs="0">
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Document" minOccurs="0"/>
         *       &lt;/choice>
         *       &lt;attribute name="name" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="level" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="document"/>
         *             &lt;enumeration value="page"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="pagenumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "exception",
            "document"
        })
        public static class Attachment {

            @XmlElement(name = "Exception")
            protected Exception exception;
            @XmlElement(name = "Document")
            protected Document document;
            @XmlAttribute(name = "name", required = true)
            protected String name;
            @XmlAttribute(name = "level", required = true)
            protected String level;
            @XmlAttribute(name = "pagenumber")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger pagenumber;

            /**
             * Recupera il valore della proprietà exception.
             * 
             * @return
             *     possible object is
             *     {@link Exception }
             *     
             */
            public Exception getException() {
                return exception;
            }

            /**
             * Imposta il valore della proprietà exception.
             * 
             * @param value
             *     allowed object is
             *     {@link Exception }
             *     
             */
            public void setException(Exception value) {
                this.exception = value;
            }

            /**
             * Recupera il valore della proprietà document.
             * 
             * @return
             *     possible object is
             *     {@link Document }
             *     
             */
            public Document getDocument() {
                return document;
            }

            /**
             * Imposta il valore della proprietà document.
             * 
             * @param value
             *     allowed object is
             *     {@link Document }
             *     
             */
            public void setDocument(Document value) {
                this.document = value;
            }

            /**
             * Recupera il valore della proprietà name.
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
             * Imposta il valore della proprietà name.
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
             * Recupera il valore della proprietà level.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLevel() {
                return level;
            }

            /**
             * Imposta il valore della proprietà level.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLevel(String value) {
                this.level = value;
            }

            /**
             * Recupera il valore della proprietà pagenumber.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPagenumber() {
                return pagenumber;
            }

            /**
             * Imposta il valore della proprietà pagenumber.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPagenumber(BigInteger value) {
                this.pagenumber = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Bookmark" maxOccurs="unbounded"/>
     *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
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
        "bookmark",
        "exception"
    })
    public static class Bookmarks {

        @XmlElement(name = "Bookmark", required = true)
        protected List<Bookmark> bookmark;
        @XmlElement(name = "Exception")
        protected Exception exception;

        /**
         * Gets the value of the bookmark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookmark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookmark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Bookmark }
         * 
         * 
         */
        public List<Bookmark> getBookmark() {
            if (bookmark == null) {
                bookmark = new ArrayList<Bookmark>();
            }
            return this.bookmark;
        }

        /**
         * Recupera il valore della proprietà exception.
         * 
         * @return
         *     possible object is
         *     {@link Exception }
         *     
         */
        public Exception getException() {
            return exception;
        }

        /**
         * Imposta il valore della proprietà exception.
         * 
         * @param value
         *     allowed object is
         *     {@link Exception }
         *     
         */
        public void setException(Exception value) {
            this.exception = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Destination" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="anchor" type="{http://www.pdflib.com/XML/TET5/TET-5.0}anchorId" />
     *                 &lt;attribute name="bottom" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}destinationId" />
     *                 &lt;attribute name="left" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="right" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="top" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="XYZ"/>
     *                       &lt;enumeration value="Fit"/>
     *                       &lt;enumeration value="FitH"/>
     *                       &lt;enumeration value="FitV"/>
     *                       &lt;enumeration value="FitR"/>
     *                       &lt;enumeration value="FitB"/>
     *                       &lt;enumeration value="FitBH"/>
     *                       &lt;enumeration value="FitBV"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="zoom" type="{http://www.w3.org/2001/XMLSchema}double" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "destination"
    })
    public static class Destinations {

        @XmlElement(name = "Destination", required = true)
        protected List<Document.Destinations.Destination> destination;

        /**
         * Gets the value of the destination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the destination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDestination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.Destinations.Destination }
         * 
         * 
         */
        public List<Document.Destinations.Destination> getDestination() {
            if (destination == null) {
                destination = new ArrayList<Document.Destinations.Destination>();
            }
            return this.destination;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="anchor" type="{http://www.pdflib.com/XML/TET5/TET-5.0}anchorId" />
         *       &lt;attribute name="bottom" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="id" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}destinationId" />
         *       &lt;attribute name="left" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="right" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="top" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="XYZ"/>
         *             &lt;enumeration value="Fit"/>
         *             &lt;enumeration value="FitH"/>
         *             &lt;enumeration value="FitV"/>
         *             &lt;enumeration value="FitR"/>
         *             &lt;enumeration value="FitB"/>
         *             &lt;enumeration value="FitBH"/>
         *             &lt;enumeration value="FitBV"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="zoom" type="{http://www.w3.org/2001/XMLSchema}double" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Destination {

            @XmlAttribute(name = "anchor")
            protected String anchor;
            @XmlAttribute(name = "bottom")
            protected Double bottom;
            @XmlAttribute(name = "id", required = true)
            protected String id;
            @XmlAttribute(name = "left")
            protected Double left;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "page")
            protected Integer page;
            @XmlAttribute(name = "right")
            protected Double right;
            @XmlAttribute(name = "top")
            protected Double top;
            @XmlAttribute(name = "type", required = true)
            protected String type;
            @XmlAttribute(name = "zoom")
            protected Double zoom;

            /**
             * Recupera il valore della proprietà anchor.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnchor() {
                return anchor;
            }

            /**
             * Imposta il valore della proprietà anchor.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnchor(String value) {
                this.anchor = value;
            }

            /**
             * Recupera il valore della proprietà bottom.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getBottom() {
                return bottom;
            }

            /**
             * Imposta il valore della proprietà bottom.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setBottom(Double value) {
                this.bottom = value;
            }

            /**
             * Recupera il valore della proprietà id.
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
             * Imposta il valore della proprietà id.
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
             * Recupera il valore della proprietà left.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getLeft() {
                return left;
            }

            /**
             * Imposta il valore della proprietà left.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setLeft(Double value) {
                this.left = value;
            }

            /**
             * Recupera il valore della proprietà name.
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
             * Imposta il valore della proprietà name.
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
             * Recupera il valore della proprietà page.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPage() {
                return page;
            }

            /**
             * Imposta il valore della proprietà page.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPage(Integer value) {
                this.page = value;
            }

            /**
             * Recupera il valore della proprietà right.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getRight() {
                return right;
            }

            /**
             * Imposta il valore della proprietà right.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setRight(Double value) {
                this.right = value;
            }

            /**
             * Recupera il valore della proprietà top.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getTop() {
                return top;
            }

            /**
             * Imposta il valore della proprietà top.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setTop(Double value) {
                this.top = value;
            }

            /**
             * Recupera il valore della proprietà type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Imposta il valore della proprietà type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Recupera il valore della proprietà zoom.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getZoom() {
                return zoom;
            }

            /**
             * Imposta il valore della proprietà zoom.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setZoom(Double value) {
                this.zoom = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{http://www.pdflib.com/XML/TET5/TET-5.0}DocInfoGroup" minOccurs="0"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "author",
        "creationDate",
        "creator",
        "gtspdfxConformance",
        "gtspdfxVersion",
        "gtsppmlvdxConformance",
        "gtsppmlvdxVersion",
        "isopdfeVersion",
        "keywords",
        "modDate",
        "producer",
        "subject",
        "title",
        "trapped",
        "custom",
        "customBinary"
    })
    public static class DocInfo {

        @XmlElement(name = "Author")
        protected String author;
        @XmlElement(name = "CreationDate")
        protected String creationDate;
        @XmlElement(name = "Creator")
        protected String creator;
        @XmlElement(name = "GTS_PDFXConformance")
        protected String gtspdfxConformance;
        @XmlElement(name = "GTS_PDFXVersion")
        protected String gtspdfxVersion;
        @XmlElement(name = "GTS_PPMLVDXConformance")
        protected String gtsppmlvdxConformance;
        @XmlElement(name = "GTS_PPMLVDXVersion")
        protected String gtsppmlvdxVersion;
        @XmlElement(name = "ISO_PDFEVersion")
        protected String isopdfeVersion;
        @XmlElement(name = "Keywords")
        protected String keywords;
        @XmlElement(name = "ModDate")
        protected String modDate;
        @XmlElement(name = "Producer")
        protected String producer;
        @XmlElement(name = "Subject")
        protected String subject;
        @XmlElement(name = "Title")
        protected String title;
        @XmlElement(name = "Trapped")
        protected String trapped;
        @XmlElement(name = "Custom")
        protected List<Document.DocInfo.Custom> custom;
        @XmlElement(name = "CustomBinary")
        protected List<Document.DocInfo.CustomBinary> customBinary;

        /**
         * Recupera il valore della proprietà author.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthor() {
            return author;
        }

        /**
         * Imposta il valore della proprietà author.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthor(String value) {
            this.author = value;
        }

        /**
         * Recupera il valore della proprietà creationDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreationDate() {
            return creationDate;
        }

        /**
         * Imposta il valore della proprietà creationDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreationDate(String value) {
            this.creationDate = value;
        }

        /**
         * Recupera il valore della proprietà creator.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreator() {
            return creator;
        }

        /**
         * Imposta il valore della proprietà creator.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreator(String value) {
            this.creator = value;
        }

        /**
         * Recupera il valore della proprietà gtspdfxConformance.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGTSPDFXConformance() {
            return gtspdfxConformance;
        }

        /**
         * Imposta il valore della proprietà gtspdfxConformance.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGTSPDFXConformance(String value) {
            this.gtspdfxConformance = value;
        }

        /**
         * Recupera il valore della proprietà gtspdfxVersion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGTSPDFXVersion() {
            return gtspdfxVersion;
        }

        /**
         * Imposta il valore della proprietà gtspdfxVersion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGTSPDFXVersion(String value) {
            this.gtspdfxVersion = value;
        }

        /**
         * Recupera il valore della proprietà gtsppmlvdxConformance.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGTSPPMLVDXConformance() {
            return gtsppmlvdxConformance;
        }

        /**
         * Imposta il valore della proprietà gtsppmlvdxConformance.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGTSPPMLVDXConformance(String value) {
            this.gtsppmlvdxConformance = value;
        }

        /**
         * Recupera il valore della proprietà gtsppmlvdxVersion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGTSPPMLVDXVersion() {
            return gtsppmlvdxVersion;
        }

        /**
         * Imposta il valore della proprietà gtsppmlvdxVersion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGTSPPMLVDXVersion(String value) {
            this.gtsppmlvdxVersion = value;
        }

        /**
         * Recupera il valore della proprietà isopdfeVersion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getISOPDFEVersion() {
            return isopdfeVersion;
        }

        /**
         * Imposta il valore della proprietà isopdfeVersion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setISOPDFEVersion(String value) {
            this.isopdfeVersion = value;
        }

        /**
         * Recupera il valore della proprietà keywords.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeywords() {
            return keywords;
        }

        /**
         * Imposta il valore della proprietà keywords.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeywords(String value) {
            this.keywords = value;
        }

        /**
         * Recupera il valore della proprietà modDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModDate() {
            return modDate;
        }

        /**
         * Imposta il valore della proprietà modDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModDate(String value) {
            this.modDate = value;
        }

        /**
         * Recupera il valore della proprietà producer.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProducer() {
            return producer;
        }

        /**
         * Imposta il valore della proprietà producer.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProducer(String value) {
            this.producer = value;
        }

        /**
         * Recupera il valore della proprietà subject.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubject() {
            return subject;
        }

        /**
         * Imposta il valore della proprietà subject.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubject(String value) {
            this.subject = value;
        }

        /**
         * Recupera il valore della proprietà title.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Imposta il valore della proprietà title.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }

        /**
         * Recupera il valore della proprietà trapped.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrapped() {
            return trapped;
        }

        /**
         * Imposta il valore della proprietà trapped.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrapped(String value) {
            this.trapped = value;
        }

        /**
         * Gets the value of the custom property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the custom property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustom().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.DocInfo.Custom }
         * 
         * 
         */
        public List<Document.DocInfo.Custom> getCustom() {
            if (custom == null) {
                custom = new ArrayList<Document.DocInfo.Custom>();
            }
            return this.custom;
        }

        /**
         * Gets the value of the customBinary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customBinary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomBinary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.DocInfo.CustomBinary }
         * 
         * 
         */
        public List<Document.DocInfo.CustomBinary> getCustomBinary() {
            if (customBinary == null) {
                customBinary = new ArrayList<Document.DocInfo.CustomBinary>();
            }
            return this.customBinary;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="key" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Custom {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "key", required = true)
            protected String key;

            /**
             * Recupera il valore della proprietà value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Imposta il valore della proprietà value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Recupera il valore della proprietà key.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Imposta il valore della proprietà key.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>hexBinary">
         *       &lt;attribute name="key" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class CustomBinary {

            @XmlValue
            @XmlJavaTypeAdapter(HexBinaryAdapter.class)
            @XmlSchemaType(name = "hexBinary")
            protected byte[] value;
            @XmlAttribute(name = "key", required = true)
            protected String key;

            /**
             * Recupera il valore della proprietà value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public byte[] getValue() {
                return value;
            }

            /**
             * Imposta il valore della proprietà value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(byte[] value) {
                this.value = value;
            }

            /**
             * Recupera il valore della proprietà key.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Imposta il valore della proprietà key.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="keylength" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;minInclusive value="40"/>
     *             &lt;maxInclusive value="256"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="algorithm" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;minInclusive value="-1"/>
     *             &lt;maxInclusive value="11"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="description" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Unknown encryption"/>
     *             &lt;enumeration value="No encryption"/>
     *             &lt;enumeration value="40-bit RC4 (Acrobat 2-4)"/>
     *             &lt;enumeration value="128-bit RC4 (Acrobat 5)"/>
     *             &lt;enumeration value="128-bit RC4 (Acrobat 6)"/>
     *             &lt;enumeration value="128-bit AES (Acrobat 7)"/>
     *             &lt;enumeration value="Public key on top of 128-bit RC4 (Acrobat 5)"/>
     *             &lt;enumeration value="Public key on top of 128-bit AES (Acrobat 7)"/>
     *             &lt;enumeration value="Adobe Policy Server (Acrobat 7)"/>
     *             &lt;enumeration value="Adobe Digital Editions (EBX)"/>
     *             &lt;enumeration value="256-bit AES (Acrobat 9)"/>
     *             &lt;enumeration value="Public key on top of 256-bit AES (Acrobat 9)"/>
     *             &lt;enumeration value="256-bit AES (Acrobat X)"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="masterpassword" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="userpassword" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="attachmentpassword" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="noprint" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="nomodify" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="nocopy" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="noannots" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="noassemble" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="noforms" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="noaccessible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="nohiresprint" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *       &lt;attribute name="plainmetadata" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Encryption {

        @XmlAttribute(name = "keylength", required = true)
        protected int keylength;
        @XmlAttribute(name = "algorithm", required = true)
        protected int algorithm;
        @XmlAttribute(name = "description", required = true)
        protected String description;
        @XmlAttribute(name = "masterpassword", required = true)
        protected boolean masterpassword;
        @XmlAttribute(name = "userpassword", required = true)
        protected boolean userpassword;
        @XmlAttribute(name = "attachmentpassword")
        protected Boolean attachmentpassword;
        @XmlAttribute(name = "noprint")
        protected Boolean noprint;
        @XmlAttribute(name = "nomodify")
        protected Boolean nomodify;
        @XmlAttribute(name = "nocopy")
        protected Boolean nocopy;
        @XmlAttribute(name = "noannots")
        protected Boolean noannots;
        @XmlAttribute(name = "noassemble")
        protected Boolean noassemble;
        @XmlAttribute(name = "noforms")
        protected Boolean noforms;
        @XmlAttribute(name = "noaccessible")
        protected Boolean noaccessible;
        @XmlAttribute(name = "nohiresprint")
        protected Boolean nohiresprint;
        @XmlAttribute(name = "plainmetadata")
        protected Boolean plainmetadata;

        /**
         * Recupera il valore della proprietà keylength.
         * 
         */
        public int getKeylength() {
            return keylength;
        }

        /**
         * Imposta il valore della proprietà keylength.
         * 
         */
        public void setKeylength(int value) {
            this.keylength = value;
        }

        /**
         * Recupera il valore della proprietà algorithm.
         * 
         */
        public int getAlgorithm() {
            return algorithm;
        }

        /**
         * Imposta il valore della proprietà algorithm.
         * 
         */
        public void setAlgorithm(int value) {
            this.algorithm = value;
        }

        /**
         * Recupera il valore della proprietà description.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Imposta il valore della proprietà description.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Recupera il valore della proprietà masterpassword.
         * 
         */
        public boolean isMasterpassword() {
            return masterpassword;
        }

        /**
         * Imposta il valore della proprietà masterpassword.
         * 
         */
        public void setMasterpassword(boolean value) {
            this.masterpassword = value;
        }

        /**
         * Recupera il valore della proprietà userpassword.
         * 
         */
        public boolean isUserpassword() {
            return userpassword;
        }

        /**
         * Imposta il valore della proprietà userpassword.
         * 
         */
        public void setUserpassword(boolean value) {
            this.userpassword = value;
        }

        /**
         * Recupera il valore della proprietà attachmentpassword.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAttachmentpassword() {
            return attachmentpassword;
        }

        /**
         * Imposta il valore della proprietà attachmentpassword.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAttachmentpassword(Boolean value) {
            this.attachmentpassword = value;
        }

        /**
         * Recupera il valore della proprietà noprint.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNoprint() {
            if (noprint == null) {
                return false;
            } else {
                return noprint;
            }
        }

        /**
         * Imposta il valore della proprietà noprint.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoprint(Boolean value) {
            this.noprint = value;
        }

        /**
         * Recupera il valore della proprietà nomodify.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNomodify() {
            if (nomodify == null) {
                return false;
            } else {
                return nomodify;
            }
        }

        /**
         * Imposta il valore della proprietà nomodify.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNomodify(Boolean value) {
            this.nomodify = value;
        }

        /**
         * Recupera il valore della proprietà nocopy.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNocopy() {
            if (nocopy == null) {
                return false;
            } else {
                return nocopy;
            }
        }

        /**
         * Imposta il valore della proprietà nocopy.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNocopy(Boolean value) {
            this.nocopy = value;
        }

        /**
         * Recupera il valore della proprietà noannots.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNoannots() {
            if (noannots == null) {
                return false;
            } else {
                return noannots;
            }
        }

        /**
         * Imposta il valore della proprietà noannots.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoannots(Boolean value) {
            this.noannots = value;
        }

        /**
         * Recupera il valore della proprietà noassemble.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNoassemble() {
            if (noassemble == null) {
                return false;
            } else {
                return noassemble;
            }
        }

        /**
         * Imposta il valore della proprietà noassemble.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoassemble(Boolean value) {
            this.noassemble = value;
        }

        /**
         * Recupera il valore della proprietà noforms.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNoforms() {
            if (noforms == null) {
                return false;
            } else {
                return noforms;
            }
        }

        /**
         * Imposta il valore della proprietà noforms.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoforms(Boolean value) {
            this.noforms = value;
        }

        /**
         * Recupera il valore della proprietà noaccessible.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNoaccessible() {
            if (noaccessible == null) {
                return false;
            } else {
                return noaccessible;
            }
        }

        /**
         * Imposta il valore della proprietà noaccessible.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNoaccessible(Boolean value) {
            this.noaccessible = value;
        }

        /**
         * Recupera il valore della proprietà nohiresprint.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isNohiresprint() {
            if (nohiresprint == null) {
                return false;
            } else {
                return nohiresprint;
            }
        }

        /**
         * Imposta il valore della proprietà nohiresprint.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNohiresprint(Boolean value) {
            this.nohiresprint = value;
        }

        /**
         * Recupera il valore della proprietà plainmetadata.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isPlainmetadata() {
            if (plainmetadata == null) {
                return false;
            } else {
                return plainmetadata;
            }
        }

        /**
         * Imposta il valore della proprietà plainmetadata.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPlainmetadata(Boolean value) {
            this.plainmetadata = value;
        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="JavaScript" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.pdflib.com/XML/TET5/TET-5.0}javaScriptId" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "javaScript"
    })
    public static class JavaScripts {

        @XmlElement(name = "JavaScript", required = true)
        protected List<Document.JavaScripts.JavaScript> javaScript;

        /**
         * Gets the value of the javaScript property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the javaScript property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJavaScript().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.JavaScripts.JavaScript }
         * 
         * 
         */
        public List<Document.JavaScripts.JavaScript> getJavaScript() {
            if (javaScript == null) {
                javaScript = new ArrayList<Document.JavaScripts.JavaScript>();
            }
            return this.javaScript;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.pdflib.com/XML/TET5/TET-5.0}javaScriptId" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class JavaScript {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "name")
            protected String name;

            /**
             * Recupera il valore della proprietà value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Imposta il valore della proprietà value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Recupera il valore della proprietà id.
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
             * Imposta il valore della proprietà id.
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
             * Recupera il valore della proprietà name.
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
             * Imposta il valore della proprietà name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Page" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Options" minOccurs="0"/>
     *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Action" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Annotations" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Annotation" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Fields" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Field" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}OutputIntents" minOccurs="0"/>
     *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Content" minOccurs="0"/>
     *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="number" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="topdown" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="hasdefaultgray" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="hasdefaultrgb" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="hasdefaultcmyk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Resources" minOccurs="0"/>
     *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Graphics" minOccurs="0"/>
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
        "page",
        "resources",
        "graphics"
    })
    public static class Pages {

        @XmlElement(name = "Page", required = true)
        protected List<Document.Pages.Page> page;
        @XmlElement(name = "Resources")
        protected Resources resources;
        @XmlElement(name = "Graphics")
        protected Graphics graphics;

        /**
         * Gets the value of the page property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the page property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.Pages.Page }
         * 
         * 
         */
        public List<Document.Pages.Page> getPage() {
            if (page == null) {
                page = new ArrayList<Document.Pages.Page>();
            }
            return this.page;
        }

        /**
         * Recupera il valore della proprietà resources.
         * 
         * @return
         *     possible object is
         *     {@link Resources }
         *     
         */
        public Resources getResources() {
            return resources;
        }

        /**
         * Imposta il valore della proprietà resources.
         * 
         * @param value
         *     allowed object is
         *     {@link Resources }
         *     
         */
        public void setResources(Resources value) {
            this.resources = value;
        }

        /**
         * 
         * 										TET 5.0
         * 									
         * 
         * @return
         *     possible object is
         *     {@link Graphics }
         *     
         */
        public Graphics getGraphics() {
            return graphics;
        }

        /**
         * Imposta il valore della proprietà graphics.
         * 
         * @param value
         *     allowed object is
         *     {@link Graphics }
         *     
         */
        public void setGraphics(Graphics value) {
            this.graphics = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Options" minOccurs="0"/>
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Action" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Annotations" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Annotation" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Fields" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Field" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}OutputIntents" minOccurs="0"/>
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Content" minOccurs="0"/>
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="number" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="topdown" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="hasdefaultgray" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="hasdefaultrgb" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="hasdefaultcmyk" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "options",
            "action",
            "annotations",
            "fields",
            "outputIntents",
            "content",
            "exception"
        })
        public static class Page {

            @XmlElement(name = "Options")
            protected String options;
            @XmlElement(name = "Action")
            protected List<Action> action;
            @XmlElement(name = "Annotations")
            protected Document.Pages.Page.Annotations annotations;
            @XmlElement(name = "Fields")
            protected Document.Pages.Page.Fields fields;
            @XmlElement(name = "OutputIntents")
            protected OutputIntents outputIntents;
            @XmlElement(name = "Content")
            protected Content content;
            @XmlElement(name = "Exception")
            protected Exception exception;
            @XmlAttribute(name = "number", required = true)
            protected String number;
            @XmlAttribute(name = "height", required = true)
            protected double height;
            @XmlAttribute(name = "width", required = true)
            protected double width;
            @XmlAttribute(name = "topdown")
            protected Boolean topdown;
            @XmlAttribute(name = "label")
            protected String label;
            @XmlAttribute(name = "hasdefaultgray")
            protected Boolean hasdefaultgray;
            @XmlAttribute(name = "hasdefaultrgb")
            protected Boolean hasdefaultrgb;
            @XmlAttribute(name = "hasdefaultcmyk")
            protected Boolean hasdefaultcmyk;

            /**
             * Recupera il valore della proprietà options.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOptions() {
                return options;
            }

            /**
             * Imposta il valore della proprietà options.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOptions(String value) {
                this.options = value;
            }

            /**
             * Gets the value of the action property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the action property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAction().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Action }
             * 
             * 
             */
            public List<Action> getAction() {
                if (action == null) {
                    action = new ArrayList<Action>();
                }
                return this.action;
            }

            /**
             * Recupera il valore della proprietà annotations.
             * 
             * @return
             *     possible object is
             *     {@link Document.Pages.Page.Annotations }
             *     
             */
            public Document.Pages.Page.Annotations getAnnotations() {
                return annotations;
            }

            /**
             * Imposta il valore della proprietà annotations.
             * 
             * @param value
             *     allowed object is
             *     {@link Document.Pages.Page.Annotations }
             *     
             */
            public void setAnnotations(Document.Pages.Page.Annotations value) {
                this.annotations = value;
            }

            /**
             * Recupera il valore della proprietà fields.
             * 
             * @return
             *     possible object is
             *     {@link Document.Pages.Page.Fields }
             *     
             */
            public Document.Pages.Page.Fields getFields() {
                return fields;
            }

            /**
             * Imposta il valore della proprietà fields.
             * 
             * @param value
             *     allowed object is
             *     {@link Document.Pages.Page.Fields }
             *     
             */
            public void setFields(Document.Pages.Page.Fields value) {
                this.fields = value;
            }

            /**
             * Recupera il valore della proprietà outputIntents.
             * 
             * @return
             *     possible object is
             *     {@link OutputIntents }
             *     
             */
            public OutputIntents getOutputIntents() {
                return outputIntents;
            }

            /**
             * Imposta il valore della proprietà outputIntents.
             * 
             * @param value
             *     allowed object is
             *     {@link OutputIntents }
             *     
             */
            public void setOutputIntents(OutputIntents value) {
                this.outputIntents = value;
            }

            /**
             * Recupera il valore della proprietà content.
             * 
             * @return
             *     possible object is
             *     {@link Content }
             *     
             */
            public Content getContent() {
                return content;
            }

            /**
             * Imposta il valore della proprietà content.
             * 
             * @param value
             *     allowed object is
             *     {@link Content }
             *     
             */
            public void setContent(Content value) {
                this.content = value;
            }

            /**
             * Recupera il valore della proprietà exception.
             * 
             * @return
             *     possible object is
             *     {@link Exception }
             *     
             */
            public Exception getException() {
                return exception;
            }

            /**
             * Imposta il valore della proprietà exception.
             * 
             * @param value
             *     allowed object is
             *     {@link Exception }
             *     
             */
            public void setException(Exception value) {
                this.exception = value;
            }

            /**
             * Recupera il valore della proprietà number.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Imposta il valore della proprietà number.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Recupera il valore della proprietà height.
             * 
             */
            public double getHeight() {
                return height;
            }

            /**
             * Imposta il valore della proprietà height.
             * 
             */
            public void setHeight(double value) {
                this.height = value;
            }

            /**
             * Recupera il valore della proprietà width.
             * 
             */
            public double getWidth() {
                return width;
            }

            /**
             * Imposta il valore della proprietà width.
             * 
             */
            public void setWidth(double value) {
                this.width = value;
            }

            /**
             * Recupera il valore della proprietà topdown.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isTopdown() {
                if (topdown == null) {
                    return false;
                } else {
                    return topdown;
                }
            }

            /**
             * Imposta il valore della proprietà topdown.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTopdown(Boolean value) {
                this.topdown = value;
            }

            /**
             * Recupera il valore della proprietà label.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLabel() {
                return label;
            }

            /**
             * Imposta il valore della proprietà label.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLabel(String value) {
                this.label = value;
            }

            /**
             * Recupera il valore della proprietà hasdefaultgray.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHasdefaultgray() {
                return hasdefaultgray;
            }

            /**
             * Imposta il valore della proprietà hasdefaultgray.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHasdefaultgray(Boolean value) {
                this.hasdefaultgray = value;
            }

            /**
             * Recupera il valore della proprietà hasdefaultrgb.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHasdefaultrgb() {
                return hasdefaultrgb;
            }

            /**
             * Imposta il valore della proprietà hasdefaultrgb.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHasdefaultrgb(Boolean value) {
                this.hasdefaultrgb = value;
            }

            /**
             * Recupera il valore della proprietà hasdefaultcmyk.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isHasdefaultcmyk() {
                return hasdefaultcmyk;
            }

            /**
             * Imposta il valore della proprietà hasdefaultcmyk.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setHasdefaultcmyk(Boolean value) {
                this.hasdefaultcmyk = value;
            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Annotation" maxOccurs="unbounded"/>
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
                "annotation"
            })
            public static class Annotations {

                @XmlElement(name = "Annotation", required = true)
                protected List<Annotation> annotation;

                /**
                 * Gets the value of the annotation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the annotation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAnnotation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Annotation }
                 * 
                 * 
                 */
                public List<Annotation> getAnnotation() {
                    if (annotation == null) {
                        annotation = new ArrayList<Annotation>();
                    }
                    return this.annotation;
                }

            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Field" maxOccurs="unbounded"/>
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
                "field"
            })
            public static class Fields {

                @XmlElement(name = "Field", required = true)
                protected List<Field> field;

                /**
                 * Gets the value of the field property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the field property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getField().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Field }
                 * 
                 * 
                 */
                public List<Field> getField() {
                    if (field == null) {
                        field = new ArrayList<Field>();
                    }
                    return this.field;
                }

            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SignatureField" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="cades" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="field" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}fieldId" />
     *                 &lt;attribute name="fillablefields" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="permissions">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="formfilling"/>
     *                       &lt;enumeration value="formsandannotations"/>
     *                       &lt;enumeration value="nochanges"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="preventchanges" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="sigtype" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="approval"/>
     *                       &lt;enumeration value="certification"/>
     *                       &lt;enumeration value="doctimestamp"/>
     *                       &lt;enumeration value="none"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
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
        "signatureField",
        "exception"
    })
    public static class SignatureFields {

        @XmlElement(name = "SignatureField", required = true)
        protected List<Document.SignatureFields.SignatureField> signatureField;
        @XmlElement(name = "Exception")
        protected Exception exception;

        /**
         * Gets the value of the signatureField property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signatureField property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSignatureField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document.SignatureFields.SignatureField }
         * 
         * 
         */
        public List<Document.SignatureFields.SignatureField> getSignatureField() {
            if (signatureField == null) {
                signatureField = new ArrayList<Document.SignatureFields.SignatureField>();
            }
            return this.signatureField;
        }

        /**
         * Recupera il valore della proprietà exception.
         * 
         * @return
         *     possible object is
         *     {@link Exception }
         *     
         */
        public Exception getException() {
            return exception;
        }

        /**
         * Imposta il valore della proprietà exception.
         * 
         * @param value
         *     allowed object is
         *     {@link Exception }
         *     
         */
        public void setException(Exception value) {
            this.exception = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.pdflib.com/XML/TET5/TET-5.0}Exception" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="cades" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="field" use="required" type="{http://www.pdflib.com/XML/TET5/TET-5.0}fieldId" />
         *       &lt;attribute name="fillablefields" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="permissions">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="formfilling"/>
         *             &lt;enumeration value="formsandannotations"/>
         *             &lt;enumeration value="nochanges"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="preventchanges" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="sigtype" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="approval"/>
         *             &lt;enumeration value="certification"/>
         *             &lt;enumeration value="doctimestamp"/>
         *             &lt;enumeration value="none"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "exception"
        })
        public static class SignatureField {

            @XmlElement(name = "Exception")
            protected Exception exception;
            @XmlAttribute(name = "cades", required = true)
            protected boolean cades;
            @XmlAttribute(name = "field", required = true)
            protected String field;
            @XmlAttribute(name = "fillablefields")
            protected Boolean fillablefields;
            @XmlAttribute(name = "permissions")
            protected String permissions;
            @XmlAttribute(name = "preventchanges")
            protected Boolean preventchanges;
            @XmlAttribute(name = "sigtype", required = true)
            protected String sigtype;
            @XmlAttribute(name = "visible")
            protected Boolean visible;

            /**
             * Recupera il valore della proprietà exception.
             * 
             * @return
             *     possible object is
             *     {@link Exception }
             *     
             */
            public Exception getException() {
                return exception;
            }

            /**
             * Imposta il valore della proprietà exception.
             * 
             * @param value
             *     allowed object is
             *     {@link Exception }
             *     
             */
            public void setException(Exception value) {
                this.exception = value;
            }

            /**
             * Recupera il valore della proprietà cades.
             * 
             */
            public boolean isCades() {
                return cades;
            }

            /**
             * Imposta il valore della proprietà cades.
             * 
             */
            public void setCades(boolean value) {
                this.cades = value;
            }

            /**
             * Recupera il valore della proprietà field.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getField() {
                return field;
            }

            /**
             * Imposta il valore della proprietà field.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setField(String value) {
                this.field = value;
            }

            /**
             * Recupera il valore della proprietà fillablefields.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFillablefields() {
                return fillablefields;
            }

            /**
             * Imposta il valore della proprietà fillablefields.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFillablefields(Boolean value) {
                this.fillablefields = value;
            }

            /**
             * Recupera il valore della proprietà permissions.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPermissions() {
                return permissions;
            }

            /**
             * Imposta il valore della proprietà permissions.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPermissions(String value) {
                this.permissions = value;
            }

            /**
             * Recupera il valore della proprietà preventchanges.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPreventchanges() {
                return preventchanges;
            }

            /**
             * Imposta il valore della proprietà preventchanges.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPreventchanges(Boolean value) {
                this.preventchanges = value;
            }

            /**
             * Recupera il valore della proprietà sigtype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSigtype() {
                return sigtype;
            }

            /**
             * Imposta il valore della proprietà sigtype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSigtype(String value) {
                this.sigtype = value;
            }

            /**
             * Recupera il valore della proprietà visible.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isVisible() {
                if (visible == null) {
                    return true;
                } else {
                    return visible;
                }
            }

            /**
             * Imposta il valore della proprietà visible.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setVisible(Boolean value) {
                this.visible = value;
            }

        }

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="static" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class XFA {

        @XmlAttribute(name = "type", required = true)
        protected String type;

        /**
         * Recupera il valore della proprietà type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            if (type == null) {
                return "static";
            } else {
                return type;
            }
        }

        /**
         * Imposta il valore della proprietà type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
