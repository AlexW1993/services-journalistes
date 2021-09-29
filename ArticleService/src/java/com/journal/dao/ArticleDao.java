/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.journal.dao;

import com.journal.entite.Article;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author F_Des
 */
public class ArticleDao {
    
    public String create(Article article){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/journaliste?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            PreparedStatement stm = con.prepareStatement("INSERT INTO article (titre,texte) VALUES (?,?)");
            stm.setString(1,article.getTitre());
            stm.setString(2,article.getTexte());
            stm.executeUpdate();
            
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ClassNotFoundException ex){
            System.err.println(ex.getMessage());
        }
        return "Un article a été ajouté";
    }
}
