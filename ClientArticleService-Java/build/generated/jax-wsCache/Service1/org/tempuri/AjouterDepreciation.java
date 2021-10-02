
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.articleservice_wcf.Article;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="article" type="{http://schemas.datacontract.org/2004/07/ArticleService_WCF}Article" minOccurs="0"/>
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
    "article"
})
@XmlRootElement(name = "AjouterDepreciation")
public class AjouterDepreciation {

    @XmlElementRef(name = "article", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Article> article;

    /**
     * Obtient la valeur de la propriété article.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Article }{@code >}
     *     
     */
    public JAXBElement<Article> getArticle() {
        return article;
    }

    /**
     * Définit la valeur de la propriété article.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Article }{@code >}
     *     
     */
    public void setArticle(JAXBElement<Article> value) {
        this.article = value;
    }

}
