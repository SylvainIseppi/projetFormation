package com.formation.requete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.formation.basesql.ConnexionBdd;

public class RequeteConnexion {
	static Connection connexion=ConnexionBdd.getInstance();
	public static  void getUser(String login, String mdp){
		try {
			Statement state= connexion.createStatement();
			System.out.println("select login,role from user where login='"+login+"' and pass='"+mdp.toString()+"'");
			ResultSet resultat= state.executeQuery("select login,role from user where login='"+login+"' and pass='"+mdp+"'");
			/* Ex�cution d'une requ�te de lecture */
	

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			if(resultat.next()!=false){
				System.out.println("connexion ok");
				System.out.println(resultat);
			}
			else{
				System.out.println("user introuvable");
			}
			System.out.println(login + mdp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
