package com.formation.objet;

public class User {
	private static int role;
	private static String login;
	private static User user;
	private static User User(int role, String login) {
		 setRole(role);
		setLogin(login);
		return user;
	}
	public static User getUser(int role, String login){
		if(user==null){
			user=User(role,login);
		}
		return user;
	}
	public static int getRole() {
		return role;
	}
	public static void setRole(int role) {
		User.role = role;
	}
	public static String getLogin() {
		return login;
	}
	public static void setLogin(String login) {
		User.login = login;
	}
	public static User getUser() {
		return user;
	}
	public static void setUser(User user) {
		User.user = user;
	}
	

}
