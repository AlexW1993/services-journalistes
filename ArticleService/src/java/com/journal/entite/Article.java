/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journal.entite;

import java.io.Serializable;

/**
 *
 * @author F_Des
 */
public class Article implements Serializable{
    
    private int id;
    private String titre;
    private String texte;
    private int appreciation;
    private int depreciation;
    
    public Article(){
    }

    public Article(String titre, String texte) {
        this.id = id;
        this.titre = titre;
        this.texte = texte;
        this.appreciation = appreciation;
        this.depreciation = depreciation;
    }

    public int getId() {
        return id;
    }
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public int getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(int appreciation) {
        this.appreciation = appreciation;
    }

    public int getDepreciation() {
        return depreciation;
    }

    public void setDepreciation(int depreciation) {
        this.depreciation = depreciation;
    }
    
    
}
