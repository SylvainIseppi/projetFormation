package com.formation.requete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.formation.basesql.ConnexionBdd;
import com.formation.objet.User;
import com.formation.vue.Connexion;

public class RequeteConnexion {
	static Connection connexion=ConnexionBdd.getInstance();
	public static  void getUser(String login, String mdp){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select login,role from user where login='"+login+"' and pass='"+mdp+"'");
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			if(resultat.next()!=false){
				System.out.println("connexion ok");
				User droit=User.getUser(resultat.getInt( "role" ), resultat.getString( "login" ));
				System.out.println("blabla");

			}
			else{
				System.out.println("user introuvable");
				Connexion c=new Connexion();
				c.erreurCo();
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
