/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientarticleservice.java;

import java.util.Scanner;
import org.datacontract.schemas._2004._07.articleservice_wcf.ArrayOfArticle;
import org.datacontract.schemas._2004._07.articleservice_wcf.Article;

/**
 *
 * @author F_Des
 */
public class ClientArticleServiceJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 port = service.getBasicHttpBindingIService1();
        ArrayOfArticle articles;
        Article article;
        
        System.out.print("Bonjour, veuillez entrer le nom de l'article recherché:");
        Scanner input = new Scanner(System.in);
        String reponse = input.next();
        articles = port.chercherArticles(reponse);
        boolean FinProgramme = false;
        while(FinProgramme == false){
            if(articles.getArticle().isEmpty()){
                System.out.println("Aucun article ne correspond à cette recherche.");
                System.out.print("Voulez-vous lire une autre article? [oui/non] ");
                reponse = input.next();
                reponse = reponse.toLowerCase();
                switch (reponse){
                    case "oui":
                        System.out.print("Veuillez entrer le nom de l'article recherché:");
                        input = new Scanner(System.in);
                        reponse = input.next();
                        reponse = reponse.toLowerCase();
                        articles = port.chercherArticles(reponse);
                        break;
                    case "non":
                        FinProgramme = true;
                        break;
                    default :
                        System.out.println("Entrer une réponse valide.");
                        System.out.print("Voulez-vous lire une autre article? [oui/non] ");
                        reponse = input.next();
                        reponse = reponse.toLowerCase();
                        break;  
                }
            }else{

                for(int i = 0; i < articles.getArticle().size(); i++){
                    System.out.println((i+1)+" - "+articles.getArticle().get(i).getTitre().getValue());
                }

                System.out.print("Entrez le numéro de l'article désiré:");
                int reponseNum = input.nextInt();
                try{
                    article = articles.getArticle().get(reponseNum-1);
                    System.out.println(article.getTitre().getValue());
                    System.out.println(article.getTexte().getValue());
                    System.out.println(article.getAppreciation()+" Likes");
                    System.out.println(article.getDepreciation()+" Dislikes");
                    System.out.print("L'aimez vous? [oui/non]");
                    reponse = input.next();
                    reponse = reponse.toLowerCase();
                    switch (reponse) {
                    case "oui":
                        article.setAppreciation(article.getAppreciation()+1);
                        port.ajouterAppreciation(article);
                        System.out.println(article.getTitre().getValue());
                        System.out.println(article.getTexte().getValue());
                        System.out.println(article.getAppreciation()+" Likes");
                        System.out.println(article.getDepreciation()+" Dislikes");
                        break;
                    case "non":
                        article.setDepreciation(article.getDepreciation()+1);
                        port.ajouterDepreciation(article);
                        System.out.println(article.getTitre().getValue());
                        System.out.println(article.getTexte().getValue());
                        System.out.println(article.getAppreciation()+" Likes");
                        System.out.println(article.getDepreciation()+" Dislikes");
                        break;
                    default:
                        System.out.println("Entrer une réponse valide.");
                        System.out.print("Voulez-vous lire une autre article? [oui/non] ");
                        reponse = input.next();
                        reponse = reponse.toLowerCase();
                        break;
                    }
                }catch(IndexOutOfBoundsException ex){
                    System.out.println("Entrée invalide.");
                }  
                System.out.print("Voulez-vous lire une autre article? [oui/non] ");
                reponse = input.next();
                reponse = reponse.toLowerCase();
                switch (reponse){
                    case "oui":
                        System.out.print("Veuillez entrer le nom de l'article recherché:");
                        input = new Scanner(System.in);
                        reponse = input.next();
                        reponse = reponse.toLowerCase();
                        articles = port.chercherArticles(reponse);
                        break;
                    case "non":
                        FinProgramme = true;
                        break;
                    default :
                        System.out.println("Entrer une réponse valide.");
                        System.out.print("Voulez-vous lire une autre article? [oui/non] ");
                        reponse = input.next();
                        reponse = reponse.toLowerCase();
                        break;      
                }                                     
            }
        }
        System.out.print("Merci beaucoup pour la visité et à la prochaine!");
    }
}