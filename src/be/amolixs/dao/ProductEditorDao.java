package be.amolixs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Classe qui permet de gérer les produits
 * @version 1.0
 * @author amolixs
 */

public class ProductEditorDao {
	/**
	 * Object de type DaoFactory
	 * @author amolixs
	 */
	DaoFactory daoFactory;
	
	/**
	 * Object de type productDao
	 * @author amolixs
	 */
	ProductDao productDao;
	
	/**
	 * Constructeur
	 * @author amolixs
	 */
	public ProductEditorDao() {
		this.daoFactory = DaoFactory.getInstance();
		this.productDao = new ProductDao();
	}
	
	
	/**
	 * Méthode qui permet d'ajouter un produit dans la base de donée
	 * @author amolixs
	 * @param name
	 * 		Nom du produit
	 * @param price
	 * 		Prix du produit
	 * @param origin
	 * 		Origin du produit
	 * @param isADrink
	 * 		Le produit est buvable ou non
	 * @param pathFileImage
	 * 		Le nom du chemin pour l'image
	 */
	public void add(String name, int price, String origin, String isADrink, String pathFileImage) {
		productDao.setName(name);
		productDao.setOrigin(origin);
		productDao.setADrink(isADrink);
		productDao.setPrice(price);
		productDao.setPathImage(pathFileImage);
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = daoFactory.getConnection();
			preparedStatement = connection.prepareStatement("INSERT INTO Product(id, name, price,"
					+ "isADrink, origin, pathImage) VALUES(?, ?, ?, ?, ?, ?);");
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, productDao.getName());
			preparedStatement.setInt(3, productDao.getPrice());
			preparedStatement.setString(4, productDao.getIsADrink());
			preparedStatement.setString(5, productDao.getOrigin());
			preparedStatement.setString(6, productDao.getPathImage());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
