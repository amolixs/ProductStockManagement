package be.amolixs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe qui permet d'initialisé la connexion à la base de donnée
 * @version 1.0
 * @author amolixs
 */

public class DaoFactory {
	/**
	 * Url pour la connexion à la base de donnée
	 * @author amolixs
	 */
	private String url;
	
	/**
	 * Username pour la connexion à la base de donnée
	 * @author amolixs
	 */
	private String username;
	
	/**
	 * Mot de passe pour la connexion à la base de donnée
	 * @author amolixs
	 */
	private String password;
	
	/**
	 * Constructeur
	 * @author amolixs
	 * @param url
	 * 		Url pour la connexion à la base de donnée
	 * @param username
	 * 		Username pour la connexion à la base de donnée
	 * @param Password pour la connexion à la base de donnée
	 */
	public DaoFactory(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	/**
	 * Permet de retourné une instance de la classe
	 * @author amolixs
	 * @return
	 * 		Object de type DaoFactory 
	 */
	public static DaoFactory getInstance() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		DaoFactory instance = new DaoFactory("jdbc:mysql://localhost:3306/product", "root", "root");
		return instance;
	}
	
	/**
	 * Méthode qui permet de récupérer la connexion à la base de données
	 * @author amolixs
	 * @return
	 * 		La connexion en cours
	 * @throws SQLException 
	 */
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
	
	/**
	 * Méthode qui permet de récupérer un produit
	 * @author amolixs
	 * @return
	 * 		Un produit
	 */
	public ProductDao getProductDao() {
		return new ProductDao();
	}
}
