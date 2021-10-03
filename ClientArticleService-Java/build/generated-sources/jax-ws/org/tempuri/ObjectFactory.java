
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.articleservice_wcf.ArrayOfArticle;
import org.datacontract.schemas._2004._07.articleservice_wcf.Article;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _ChercherArticlesResponseChercherArticlesResult_QNAME = new QName("http://tempuri.org/", "ChercherArticlesResult");
    private final static QName _AjouterAppreciationArticle_QNAME = new QName("http://tempuri.org/", "article");
    private final static QName _AjouterAppreciationResponseAjouterAppreciationResult_QNAME = new QName("http://tempuri.org/", "AjouterAppreciationResult");
    private final static QName _AjouterDepreciationResponseAjouterDepreciationResult_QNAME = new QName("http://tempuri.org/", "AjouterDepreciationResult");
    private final static QName _ChercherArticlesNomArticle_QNAME = new QName("http://tempuri.org/", "nomArticle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChercherArticlesResponse }
     * 
     */
    public ChercherArticlesResponse createChercherArticlesResponse() {
        return new ChercherArticlesResponse();
    }

    /**
     * Create an instance of {@link AjouterDepreciationResponse }
     * 
     */
    public AjouterDepreciationResponse createAjouterDepreciationResponse() {
        return new AjouterDepreciationResponse();
    }

    /**
     * Create an instance of {@link AjouterAppreciation }
     * 
     */
    public AjouterAppreciation createAjouterAppreciation() {
        return new AjouterAppreciation();
    }

    /**
     * Create an instance of {@link ChercherArticles }
     * 
     */
    public ChercherArticles createChercherArticles() {
        return new ChercherArticles();
    }

    /**
     * Create an instance of {@link AjouterAppreciationResponse }
     * 
     */
    public AjouterAppreciationResponse createAjouterAppreciationResponse() {
        return new AjouterAppreciationResponse();
    }

    /**
     * Create an instance of {@link AjouterDepreciation }
     * 
     */
    public AjouterDepreciation createAjouterDepreciation() {
        return new AjouterDepreciation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ChercherArticlesResult", scope = ChercherArticlesResponse.class)
    public JAXBElement<ArrayOfArticle> createChercherArticlesResponseChercherArticlesResult(ArrayOfArticle value) {
        return new JAXBElement<ArrayOfArticle>(_ChercherArticlesResponseChercherArticlesResult_QNAME, ArrayOfArticle.class, ChercherArticlesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Article }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "article", scope = AjouterAppreciation.class)
    public JAXBElement<Article> createAjouterAppreciationArticle(Article value) {
        return new JAXBElement<Article>(_AjouterAppreciationArticle_QNAME, Article.class, AjouterAppreciation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Article }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "article", scope = AjouterDepreciation.class)
    public JAXBElement<Article> createAjouterDepreciationArticle(Article value) {
        return new JAXBElement<Article>(_AjouterAppreciationArticle_QNAME, Article.class, AjouterDepreciation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AjouterAppreciationResult", scope = AjouterAppreciationResponse.class)
    public JAXBElement<String> createAjouterAppreciationResponseAjouterAppreciationResult(String value) {
        return new JAXBElement<String>(_AjouterAppreciationResponseAjouterAppreciationResult_QNAME, String.class, AjouterAppreciationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AjouterDepreciationResult", scope = AjouterDepreciationResponse.class)
    public JAXBElement<String> createAjouterDepreciationResponseAjouterDepreciationResult(String value) {
        return new JAXBElement<String>(_AjouterDepreciationResponseAjouterDepreciationResult_QNAME, String.class, AjouterDepreciationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nomArticle", scope = ChercherArticles.class)
    public JAXBElement<String> createChercherArticlesNomArticle(String value) {
        return new JAXBElement<String>(_ChercherArticlesNomArticle_QNAME, String.class, ChercherArticles.class, value);
    }

}
