
package org.datacontract.schemas._2004._07.articleservice_wcf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.articleservice_wcf package. 
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

    private final static QName _Article_QNAME = new QName("http://schemas.datacontract.org/2004/07/ArticleService_WCF", "Article");
    private final static QName _ArrayOfArticle_QNAME = new QName("http://schemas.datacontract.org/2004/07/ArticleService_WCF", "ArrayOfArticle");
    private final static QName _ArticleTexte_QNAME = new QName("http://schemas.datacontract.org/2004/07/ArticleService_WCF", "Texte");
    private final static QName _ArticleTitre_QNAME = new QName("http://schemas.datacontract.org/2004/07/ArticleService_WCF", "Titre");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.articleservice_wcf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Article }
     * 
     */
    public Article createArticle() {
        return new Article();
    }

    /**
     * Create an instance of {@link ArrayOfArticle }
     * 
     */
    public ArrayOfArticle createArrayOfArticle() {
        return new ArrayOfArticle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Article }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ArticleService_WCF", name = "Article")
    public JAXBElement<Article> createArticle(Article value) {
        return new JAXBElement<Article>(_Article_QNAME, Article.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArticle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ArticleService_WCF", name = "ArrayOfArticle")
    public JAXBElement<ArrayOfArticle> createArrayOfArticle(ArrayOfArticle value) {
        return new JAXBElement<ArrayOfArticle>(_ArrayOfArticle_QNAME, ArrayOfArticle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ArticleService_WCF", name = "Texte", scope = Article.class)
    public JAXBElement<String> createArticleTexte(String value) {
        return new JAXBElement<String>(_ArticleTexte_QNAME, String.class, Article.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ArticleService_WCF", name = "Titre", scope = Article.class)
    public JAXBElement<String> createArticleTitre(String value) {
        return new JAXBElement<String>(_ArticleTitre_QNAME, String.class, Article.class, value);
    }

}
