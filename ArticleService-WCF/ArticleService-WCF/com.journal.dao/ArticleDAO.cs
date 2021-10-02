using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Data.Common;
using System.Linq;
using System.Web;

namespace ArticleService_WCF.com.journal.dao
{
    public class ArticleDAO
    {
        
        public ArticleDAO()
        {

        }

        public List<Article> ChercherArticles(string nom )
        {
            List<Article> liste = new List<Article>();
            Article article;

            DbConnection cnx = new MySqlConnection("Server=127.0.0.1;Uid=root;Pwd=root;Database=journaliste;SSL MODE=None");
            cnx.Open();

            DbCommand cmd = new MySqlCommand(); 
            cmd.Connection = cnx;
            cmd.CommandText = "SELECT * FROM journaliste.article WHERE titre LIKE @nom";

            MySqlParameter nomArticle = new MySqlParameter("@nom", MySqlDbType.VarChar);

            nomArticle.Value = "%"+nom+"%";
            cmd.Parameters.Add(nomArticle);

            DbDataReader dr = cmd.ExecuteReader();

            while (dr.Read())
            {
                article = new Article();

                article.Id = (int)dr["id_article"];
                article.Titre = "" + dr["titre"];
                article.Texte = "" + dr["texte"];
                article.Appreciation = (int)dr["appreciation"];
                article.Appreciation = (int)dr["depreciation"];

                liste.Add(article);
            }
            cnx.Close();
            return liste;
        }

        public string UpdateAppreciation(Article article)
        {

            DbConnection cnx = new MySqlConnection("Server=127.0.0.1;Uid=root;Pwd=root;Database=journaliste;SSL MODE=None");
            cnx.Open();

            DbCommand cmd = new MySqlCommand(); 
            cmd.Connection = cnx;
            cmd.CommandText = "UPDATE article SET appreciation = @nombreAppreciation WHERE id_article = @id";

            MySqlParameter nombreAppreciation = new MySqlParameter("@nombreAppreciation", MySqlDbType.Int32);
            MySqlParameter idArticle= new MySqlParameter("@id", MySqlDbType.Int32);
            
            nombreAppreciation.Value = article.Appreciation;
            idArticle.Value = article.Id;

            cmd.Parameters.Add(nombreAppreciation);
            cmd.Parameters.Add(idArticle);
      
            cmd.Prepare();
            cmd.ExecuteNonQuery();
            return "Operation complète";
        }

        public string UpdateDepreciation(Article article)
        {

            DbConnection cnx = new MySqlConnection("Server=127.0.0.1;Uid=root;Pwd=root;Database=journaliste;SSL MODE=None");
            cnx.Open();

            DbCommand cmd = new MySqlCommand();
            cmd.Connection = cnx;
            cmd.CommandText = "UPDATE article SET Depreciation = @nombreDepreciation WHERE id_article = @id";

            MySqlParameter nombreDepreciation = new MySqlParameter("@nombreDepreciation", MySqlDbType.Int32);
            MySqlParameter idArticle = new MySqlParameter("@id", MySqlDbType.Int32);

            nombreDepreciation.Value = article.Depreciation;
            idArticle.Value = article.Id;

            cmd.Parameters.Add(nombreDepreciation);
            cmd.Parameters.Add(idArticle);

            cmd.Prepare();
            cmd.ExecuteNonQuery();
            return "Operation complète";
        }
    }
}