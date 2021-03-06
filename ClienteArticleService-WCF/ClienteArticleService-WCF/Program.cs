using System;
using ServiceReference1;

namespace ClienteArticleService_WCF
{
    class Program
    {
        static void Main(string[] args)
        {
            bool confirmation = false;
            ServiceReference1.ArticleServiceClient service = new ArticleServiceClient();
            Console.WriteLine("Bonjour et bienvenue à la console pour ajouter un article");

            while(confirmation != true) {
                Console.WriteLine("Ecrivez le titre de votre article :");
                string titre = Console.ReadLine();

                Console.WriteLine("Ecrivez-vous le texte de votre article :");
                string texte = Console.ReadLine();

                article article= new article();
                article.titre = titre;
                article.texte = texte;
                Console.WriteLine(service.ajouterArticle(article));
                bool error = true;

                while(error == true)
                {
                    Console.WriteLine("Voulez-vous ajouter un autre article ? [oui/non]:");
                    string choix = Console.ReadLine();
                    choix = choix.ToLower();
                    switch (choix)
                    {
                        case "oui":
                            confirmation = false;
                            error = false;
                            break;
                        case "non":
                            confirmation = true;
                            error = false;
                            break;
                        default:
                            Console.WriteLine("Le choix que vous avez fait n'est pas valide");
                            error = true;
                            break;
                    }
                }
            }
            Console.WriteLine("Merci beaucoup pour votre(s) article(s). Bonne journée.");
        }
    }
}
