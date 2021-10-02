using ArticleService_WCF.com.journal.dao;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;

namespace ArticleService_WCF
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom de classe "Service1" dans le code, le fichier svc et le fichier de configuration.
    // REMARQUE : pour lancer le client test WCF afin de tester ce service, sélectionnez Service1.svc ou Service1.svc.cs dans l'Explorateur de solutions et démarrez le débogage.
    public class Service1 : IService1
    {
        public String AjouterAppreciation(Article article)
        {
            ArticleDAO dao = new ArticleDAO();
            return dao.UpdateAppreciation(article);
        }

        public String AjouterDepreciation(Article article)
        {
            ArticleDAO dao = new ArticleDAO();
            return dao.UpdateDepreciation(article);
        }

        public List<Article> ChercherArticles(string nomArticle)
        {
            ArticleDAO dao = new ArticleDAO();
            return dao.ChercherArticles(nomArticle);
        }
    }
}
