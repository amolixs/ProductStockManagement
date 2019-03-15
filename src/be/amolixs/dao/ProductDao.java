package be.amolixs.dao;

/**
 * Classe qui permet de gérer les produits
 * @version 1.0
 * @author amolixs
 */

public class ProductDao {
	/**
	 * Nom du produit
	 * @author amolixs
	 */
	private String name;
	
	/**
	 * Prix du produit
	 */
	private int price;
	
	/**
	 * Boolean pour savoir si le produit est une boisson ou non
	 * @author amolixs
	 */
	boolean isADrink;
	
	/**
	 * L'origine du produit(pays)
	 * @author amolixs
	 */
	private String origin;
	
	/**
	 * Chemin de l'image pour le produit
	 * @author amolixs
	 */
	private String pathImage;
	
	/**
	 * Constructeur par défault
	 * @author amolixs
	 */
	public ProductDao() {
		this.name = "";
		this.price = 0;
		this.isADrink = false;
		this.origin = "";
		this.pathImage = "";
	}
	
	/**
	 * Constructeur qui permet d'initalisé le nom du produit et l'origin
	 * @param name
	 * 		Le nom renseigné
	 * @param origin
	 * 		L'origin renseigné
	 */
	public ProductDao(String name, String origin) {
		this.name = name;
	}
	
	/**
	 * Constructeur qui permet d'initialisé le prix du produit
	 * @param price
	 */
	public ProductDao(int price) {
		this.price = price;
	}
	
	/**
	 * Constructeur qui permet d'initalisé si le produit est une boisson ou non
	 * @param isADrink
	 */
	public ProductDao(boolean isADrink) {
		this.isADrink = isADrink;
	}
	
	/**
	 * Méthode qui permet d'initialisé le nom su produit
	 * @author amolixs
	 * @param name
	 * 		Le nom renseigné
	 */
	public ProductDao(String name) {
		this.name = name;
	}
	
	/**
	 * Méthode qui permet d'initialisé le nom du produit, l'origin, et le chemon pour l'image.
	 * @author amolixs
	 * @param name
	 * 		Le nom du produit
	 * @param origin
	 * 		L'origin du produit
	 * @param pathImage
	 * 		Le chemin pour l'image
	 */
	public ProductDao(String name, String origin, String pathImage) {
		this.name = name;
		this.origin = origin;
		this.pathImage = pathImage;
	}
	
	/****************************************************\
	 
	 					GUETTEURS
	 
	\****************************************************/
	
	/**
	 * Guetteur qui permet de retourné le nom du produit
	 * @author amolixs
	 * @return
	 * 		Nom du produit
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Guetteur qui permet de retourné l'origin du produit
	 * @author amolixs
	 * @return
	 * 		Origin du produit
	 */
	public String getOrigin() {
		return origin;
	}
	
	/**
	 * Guetteur qui permet de retourné le chemin 
	 * @author amolixs
	 * @return
	 */
	public String getPathImage() {
		return pathImage;
	}
	
	/**
	 * Guetteur qui permet de retourné le prix
	 * @author amolixs
	 * @return
	 */
	public int getPrice() {
		return price;
	}
	
	/****************************************************\
	 
						SUETTEURS

	\****************************************************/
	
	/**
	 * Suetteur qui permet de modifié l'attribut isADrink
	 * @author amolixs
	 * @param isADrink
	 * 		L'attribut isADrink
	 */
	public void setADrink(boolean isADrink) {
		this.isADrink = isADrink;
	}
	
	/**
	 * Suetteur qui permet de modifié le nom 
	 * @param name
	 * 		La nouvel valeur du nom
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Suetteur qui permet de modifié l'origin
	 * @param origin
	 * 		La nouvelle origin
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	/**
	 * Suetteur qui permet de modifié le chemin pour l'image
	 * @param pathImage
	 * 		Le nouveau chemin de l'image
	 */
	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}
	
	/**
	 * Suetteur qui permet de modifié le prix du produit
	 * @param price
	 * 		Le nouveau prix du produit
	 */
	public void setPrice(int price) {
		this.price = price;
	}
}