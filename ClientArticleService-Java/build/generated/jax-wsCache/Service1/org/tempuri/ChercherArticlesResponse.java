
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.articleservice_wcf.ArrayOfArticle;


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
 *         &lt;element name="ChercherArticlesResult" type="{http://schemas.datacontract.org/2004/07/ArticleService_WCF}ArrayOfArticle" minOccurs="0"/>
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
    "chercherArticlesResult"
})
@XmlRootElement(name = "ChercherArticlesResponse")
public class ChercherArticlesResponse {

    @XmlElementRef(name = "ChercherArticlesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfArticle> chercherArticlesResult;

    /**
     * Obtient la valeur de la propriété chercherArticlesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArticle }{@code >}
     *     
     */
    public JAXBElement<ArrayOfArticle> getChercherArticlesResult() {
        return chercherArticlesResult;
    }

    /**
     * Définit la valeur de la propriété chercherArticlesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfArticle }{@code >}
     *     
     */
    public void setChercherArticlesResult(JAXBElement<ArrayOfArticle> value) {
        this.chercherArticlesResult = value;
    }

}
