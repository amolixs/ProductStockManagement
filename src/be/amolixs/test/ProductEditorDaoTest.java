package be.amolixs.test;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import be.amolixs.dao.ProductEditorDao;

/**
 * Classe qui permet de tester la Classe ProductEditorDao
 * @version 1.0
 * @author amolixs
 */
class ProductEditorDaoTest {
	/**
	 * Object de type productEditorDao
	 * @author amolixs
	 */
	private ProductEditorDao productEditorDao;
	
	/**
	 * Constructeur
	 * @author amolixs
	 */
	public ProductEditorDaoTest() {
		this.productEditorDao = new ProductEditorDao();
	}
	
	@Test
	void testAdd() {
	}

	@Test
	void testDisplay() {
	}
	
	@Test
	void delete() {
		/*
		 * Test de l'exception sql
		 */
		int id = 1;
		try {
			productEditorDao.delete(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
