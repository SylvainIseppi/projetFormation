package com.formation.basesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBdd {
	private Connection instance;
	static String url = "jdbc:mysql://localhost:3306/projet";
	static String utilisateur = "root";
	static String mdp = "";
	static Connection connexion = null;
	private static Connection ConnexionBdd() {
		try {
		    Class.forName( "com.mysql.jdbc.Driver" );
		    connexion = DriverManager.getConnection( url, utilisateur, mdp );
		} catch ( ClassNotFoundException e ) {
		    /* Gérer les éventuelles erreurs ici. */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connexion;
	}
	public static Connection getInstance() {
        if (null == connexion) {
            connexion =ConnexionBdd();
        }
        return connexion;
    }
	
	
}
