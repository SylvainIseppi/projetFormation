package com.formation.requete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.formation.basesql.ConnexionBdd;


public class RequeteClient {
	static Connection connexion=ConnexionBdd.getInstance();

	public  void getAllClient(){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from client");
			/* Ex�cution d'une requ�te de lecture */
	

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			while ( resultat.next() ) {
			    int idclient = resultat.getInt( "code" );
			    String nom = resultat.getString( "nom" );
			    String prenom = resultat.getString( "prenom" );
			    System.out.println("l'utilisateur num�ro "+idclient+" a pour prenom "+prenom+" et nom "+nom);
			    /* Traiter ici les valeurs r�cup�r�es. */
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
