package be.amolixs.main;

import be.amolixs.app.Application;

/**
 * Classe principal.
 * @version 1.0
 * @author amolixs
 */
public class Main {
	
	/**
	 * Méthode principal
	 * @author amolixs
	 * @param args
	 * 		Tableau contenant les arguments passé au programme
	 */
	public static void main(String[] args) {
		Application app = new Application();
		app.run();
	}
}
