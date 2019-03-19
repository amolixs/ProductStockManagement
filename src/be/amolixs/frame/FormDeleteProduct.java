package be.amolixs.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import be.amolixs.dao.ProductEditorDao;

/**
 * Classe qui permet de gérer la fenetre pour supprimé des produits
 * @author amolixs
 */
public class FormDeleteProduct extends javax.swing.JFrame {
    /**
     * Serial de la classe
	 * @author amolixs
	 */
	private static final long serialVersionUID = 1L;
	
    /**
     * Button quitter
     * @author amolixs
     */
	private javax.swing.JButton quitButton;
	
	/**
	 * Button supprimé
	 * @author amolixs
	 */
	private javax.swing.JButton deleteButton;
	
	/**
	 * Label pour le titre
	 * @author amolixs
	 */
	private javax.swing.JLabel titleLabel;
	
	/**
	 * Label textField
	 * @author amolixs
	 */
	private javax.swing.JLabel labelForTextField;
	
	/**
	 * Label résultat
	 * @author amolixs
	 */
	private javax.swing.JLabel resultLabel;
	
	/**
	 * Permet d'entré l'id
	 * @author amolixs
	 */
	private javax.swing.JTextField inputId;
	
	/**
	 * Object de type ProductEditorDao
	 * @author amolixs
	 */
	private ProductEditorDao productEditorDao;
	
	/**
     * Constructeur
     * @author amolixs
     */
    public FormDeleteProduct() {
    	init();
        initComponents();
    }
    
    /**
     * Méthode qui permet d'initialisé les attributs
     * @author amolixs
     */
    public void init() {
    	this.productEditorDao = new ProductEditorDao();
    }
    
    /**
     * Méthode qui permet de configurer la fenetre
     * @author amolixs
     */
    public void configure() {
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("*-Delete product-*");
    }

    /**
     * Méthode qui permet d'initialisé les composants de la fenetre
     * @author amolixs                       
     */
    private void initComponents() {
        titleLabel = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        labelForTextField = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        resultLabel = new javax.swing.JLabel();

        titleLabel.setText("Supprimer un produit");

        quitButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/icons8-sortie-filled-20.png")));
        quitButton.setText("Quitter");

        deleteButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/icons8-annuler-filled-20.png")));
        deleteButton.setText("Supprimer");
        deleteButton.setToolTipText("");

        labelForTextField.setText("Entrez id du produit :");
        
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

        deleteButton.addActionListener(new ActionListener() {
        	int id = 0;
			public void actionPerformed(ActionEvent evt) {
				try {
					id = Integer.parseInt(inputId.getText());
				}catch (NumberFormatException e) {
				}
				try {
					productEditorDao.delete(id);
					resultLabel.setText("Réussie !");
					resultLabel.setForeground(Color.green);
				} catch (SQLException e) {
					e.printStackTrace();
					resultLabel.setText("Erreur !");
					resultLabel.setForeground(Color.red);
				}
			}
		});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelForTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultLabel)
                            .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelForTextField)
                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(resultLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitButton)
                    .addComponent(deleteButton))
                .addContainerGap())
        );

        pack();
    }                 
}
