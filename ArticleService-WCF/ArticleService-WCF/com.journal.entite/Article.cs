using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Web;

namespace ArticleService_WCF
{
    [DataContract]
    public class Article
    {
        int id;
        string titre;
        string texte;
        int appreciation;
        int depreciation;

        public Article()
        {

        }

        public Article(String titre, String texte)
        {
            this.titre = titre;
            this.texte = texte;
        }

        [DataMember]
        public int Id
        {
            get { return id; }
            set { id = value; }
        }

        [DataMember]
        public string Titre
        {
            get { return titre; }
            set { titre = value; }
        }

        [DataMember]
        public string Texte
        {
            get { return texte; }
            set { texte = value; }
        }

        [DataMember]
        public int Appreciation
        {
            get { return appreciation; }
            set { appreciation = value; }
        }

        [DataMember]
        public int Depreciation
        {
            get { return depreciation; }
            set { depreciation = value; }
        }
    }
}