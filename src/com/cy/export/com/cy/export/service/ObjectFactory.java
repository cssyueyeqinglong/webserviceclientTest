
package com.cy.export.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cy.export.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ShowWeater_QNAME = new QName("http://service.export.cy.com/", "showWeater");
    private final static QName _ShowWeaterResponse_QNAME = new QName("http://service.export.cy.com/", "showWeaterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cy.export.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowWeaterResponse }
     * 
     */
    public ShowWeaterResponse createShowWeaterResponse() {
        return new ShowWeaterResponse();
    }

    /**
     * Create an instance of {@link ShowWeater }
     * 
     */
    public ShowWeater createShowWeater() {
        return new ShowWeater();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowWeater }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.export.cy.com/", name = "showWeater")
    public JAXBElement<ShowWeater> createShowWeater(ShowWeater value) {
        return new JAXBElement<ShowWeater>(_ShowWeater_QNAME, ShowWeater.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowWeaterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.export.cy.com/", name = "showWeaterResponse")
    public JAXBElement<ShowWeaterResponse> createShowWeaterResponse(ShowWeaterResponse value) {
        return new JAXBElement<ShowWeaterResponse>(_ShowWeaterResponse_QNAME, ShowWeaterResponse.class, null, value);
    }

}
