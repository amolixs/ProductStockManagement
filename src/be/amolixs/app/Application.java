package be.amolixs.app;

import be.amolixs.frame.Frame;

/**
 * Classe qui permet de gérer tous le programme
 * @version 1.0
 * @author amolixs
 */

public class Application {
	private Frame frame;
	
	/**
	 * Constructeur.
	 * @author amolixs
	 */
	public Application() {
		this.frame = new Frame();
	}
	
	/**
	 * Méthode qui permet de lancer le programme
	 * @author amolixs
	 */
	public void run() {
		this.frame.setVisible(true);
	}
}
