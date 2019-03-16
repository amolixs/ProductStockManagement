package be.amolixs.test;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import be.amolixs.dao.DaoFactory;


/**
 * Classe qui permet de tester la connexion à la base de donnée(DaoFactory)
 * @version 1.0
 * @author amolixs
 */
class DaoFactoryTest {
	/**
	 * Object de type DaoFactory
	 * @author amolixs
	 */
	private DaoFactory daoFactory;
	
	/**
	 * Constructeur
	 * @author amolixs
	 */
	public DaoFactoryTest() {
		daoFactory = DaoFactory.getInstance();
	}

	/**
	 * Test de la méthode getInstance() de la classe 
	 * @author amolixs
	 */
	@Test
	void testGetInstance() {
		DaoFactory.getInstance();
	}
	
	/**
	 * 
	 */
	@Test
	void testGetConnection() {
		try {
			daoFactory.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	@Test
	void testGetProductDao() {
		daoFactory.getProductDao();
	}
}
