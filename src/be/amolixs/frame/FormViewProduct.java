package be.amolixs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import be.amolixs.dao.ProductDao;
import be.amolixs.dao.ProductEditorDao;

/**
 * Classe qui permet de gérer la fenetre pour l'affichage des produits
 * @author amolixs
 *
 */
public class FormViewProduct extends javax.swing.JFrame {
	/**
	 * Serial de la classe
	 * @author amolixs
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Label qui permet d'affiché la description complète du produit
	 * @author amolixs
	 */
	private javax.swing.JLabel labelDescription;
	
	/**
	 * Label qui permet d'affiché l'image du produit
	 * @author amolixs
	 */
	private javax.swing.JLabel labelImg;
	
	/**
	 * Label pour le titre de la fenetre
	 * @author amolixs
	 */
	private javax.swing.JLabel labelTitle;
	
	/**
	 * Button quitter
	 * @author amolixs
	 */
	private JButton quitButton;
	
	/**
	 * Liste qui va permettre de contenir la liste de tous les produits
	 * @author amolixs
	 */
	List<ProductDao> products;
	
	/**
	 * Object de type productEditorDao qui permet de listé les produits
	 * @author amolixs
	 */
	private ProductEditorDao productEditorDao;
	
	/**
	 * TextPane qui va permettre d'affiché l'ensemble des produits
	 * @author amolixs
	 */
	private JTextPane textPane;

	/**
	 * Constructeur
	 * @author amolixs
	 */
    public FormViewProduct() {
    	init();
        initComponents();
    }
    
    /**
     * Méthode qui permet d'initialisé tous les attributs
     * @author amolixs
     */
    public void init() {
    	this.textPane = new JTextPane();
    	this.productEditorDao = new ProductEditorDao();
    	this.products = new ArrayList<>();
    }
    
    /**
     * Méthode qui permet de configuré la fenetre
     * @author amolixs
     */
    public void configure() {
    	setTitle("*-Display product-*");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    /**
     * Méthode qui permet d'initialisé les composants de la fenetre
     * @author amolixs
     */
    private void initComponents() {

        labelDescription = new javax.swing.JLabel();
        labelImg = new javax.swing.JLabel();
        labelTitle = new JLabel();
        quitButton = new JButton("Quitter");
        quitButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/icons8-sortie-filled-20.png")));
        labelTitle.setText("Affiché produits");
        products = productEditorDao.display();
        textPane.setEditable(false);
        for (ProductDao productDao : products) {
            StyledDocument document = (StyledDocument)textPane.getDocument();
            Style imagesStyle = document.addStyle("ImageStyle", null);
            StyleConstants.setIcon(imagesStyle, new ImageIcon(productDao.getPathImage()));
            try {
    			document.insertString(document.getLength(), "\uFFFC", imagesStyle);
    			document.insertString(document.getLength(), "\n" + "Id : " + productDao.getId() + "\n" + "Nom : " + productDao.getName() + "\n" + "Origin : " + productDao.getOrigin() + "\n" + "Prix : " + productDao.getPrice() + "\n" + "Boisson : " + productDao.getIsADrink() + "\n", null);
    		} catch (BadLocationException e) {
    			e.printStackTrace();
    		}  	
		}

        labelDescription.setIcon(new javax.swing.ImageIcon(productEditorDao.getPathImage()));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        
        /******************************************\
         * 
         * 				ACTIONS
         * 
        \******************************************/
        quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				setVisible(false);
			}
		});
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(labelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelImg)
                            .addComponent(textPane)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(quitButton)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addComponent(textPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(quitButton)
                .addContainerGap())
        );

        pack();
    }                                  
}
