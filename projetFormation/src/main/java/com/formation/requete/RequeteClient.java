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
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			while ( resultat.next() ) {
			    int idclient = resultat.getInt( "code" );
			    String nom = resultat.getString( "nom" );
			    String prenom = resultat.getString( "prenom" );
			    System.out.println("l'utilisateur numéro "+idclient+" a pour prenom "+prenom+" et nom "+nom);
			    /* Traiter ici les valeurs récupérées. */
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
