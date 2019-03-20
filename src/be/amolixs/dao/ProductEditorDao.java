package be.amolixs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
			preparedStatement.setInt(1, (int) (Math.random() * (100000 - 0)));
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
	
	/**
	 * Méthode qui permet de renvoyé tous les produits
	 * @author amolixs
	 * @return
	 * 		Le texte de description
	 */
	public List<ProductDao> display() {
		List<ProductDao> products = new ArrayList<>();
		Connection connection = null;
		Statement statement = null;
		ResultSet res = null;
		try {	
			connection = daoFactory.getConnection();
			statement = connection.createStatement();
			res = statement.executeQuery("SELECT * FROM Product;");
			while (res.next()) {
				int id = res.getInt("id");
				System.out.println(id);
				String name = res.getString("name");
				int price = res.getInt("price");
				String origin = res.getString("origin");
				String isADrink = res.getString("isADrink");
				String pathImage = res.getString("pathImage");
				ProductDao product = new ProductDao(id, name, price, origin, pathImage, isADrink);
				products.add(product);
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return products;
	}
	
	/**
	 * Méthode qui permet de récupérer l'url des images des produits
	 * @author amolixs
	 */
	public String getPathImage() {
		String pathImage = "";
		Connection connection = null;
		Statement statement = null;
		ResultSet res = null;
		try {	
			connection = daoFactory.getConnection();
			statement = connection.createStatement();
			res = statement.executeQuery("SELECT * FROM Product;");
			while (res.next()) {
				 pathImage = res.getString("pathImage");
				 System.out.println(pathImage);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pathImage;
	}
	
	/**
	 * Méthode qui permet de supprimé un produit grace a son id
	 * @author amolixs
	 * @param id
	 * 		Id du produit à supprimé
	 * @throws SQLException 
	 */
	public void delete(int id) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		
		connection = daoFactory.getConnection();
		statement = connection.prepareStatement("DELETE FROM Product WHERE id=?;");
		statement.setInt(1, id);
		statement.executeUpdate();
	}
	
	public void update(int id, String name, String origin, int price, String isADrink, String pathImage) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		connection = daoFactory.getConnection();
		
		if (!name.isEmpty()) {
			statement = connection.prepareStatement("UPDATE Product SET name=? WHERE id=?");
			statement.setString(1, name);
			statement.setInt(2, id);
			statement.executeUpdate();
		}
		
		if (!origin.isEmpty()) {
			System.out.println("iiiiiiiiiii");
			statement = connection.prepareStatement("UPDATE Product SET origin=? WHERE id=?");
			statement.setString(1, origin);
			statement.setInt(2, id);
			statement.executeUpdate();
		}
		
		if (price != 0 && price > 0) {
			statement = connection.prepareStatement("UPDATE Product SET price=? WHERE id=?");
			statement.setInt(1, price);
			statement.setInt(2, id);
			statement.executeUpdate();
		}
		
		if (!isADrink.isEmpty()) {
			statement = connection.prepareStatement("UPDATE Product SET isADrink=? WHERE id=?");
			statement.setString(1, isADrink);
			statement.setInt(2, id);
			statement.executeUpdate();
		}
		
		if (!pathImage.isEmpty()) {
			statement = connection.prepareStatement("UPDATE Product SET pathImage=? WHERE id=?");
			statement.setString(1, pathImage);
			statement.setInt(2, id);
			statement.executeUpdate();
		}
	}
}
