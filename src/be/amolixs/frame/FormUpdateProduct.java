package be.amolixs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe qui permet de gérer la fenetre pour mettre les produits à jour
 * @version 1.0
 * @author amolixs
 */
public class FormUpdateProduct extends javax.swing.JFrame {

	/**
	 * Serial de la classe
	 * @author amolixs
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Button qui permet de mettre l'image à jour
	 * @author amolixs
	 */
    private javax.swing.JButton buttonImageUpdate;
    
    /**
     * Button qui permet de validé la modification des changements
     * @author amolixs
     */
    private javax.swing.JButton buttonValidUpdate;
    
    /**
     * Button quitter
     * @author amolixs
     */
    private javax.swing.JButton buttonQuit;
    
    /**
     * CheckButton qui permet de mettre le isDrinked du produit à jour
     * @author amolixs
     */
    private javax.swing.JCheckBox checkButtonIsDrinkUpdate;
    
    /**
     * Label pour le titre
     * @author amolixs
     */
    private javax.swing.JLabel titleLabel;
    
    /**
     * Label id product 
     * @author amolixs
     */
    private javax.swing.JLabel idProductLabel;
    
    /**
     * Label nom
     * @author amolixs
     */
    private javax.swing.JLabel nameLabel;
    
    /**
     * Label origin
     * @author amolixs
     */
    private javax.swing.JLabel originLabel;
    
    /**
     * Label prix
     * @author amolixs
     */
    private javax.swing.JLabel priceLabel;
    
    /**
     * @author amolixs
     */
    private javax.swing.JLabel jLabel6;
    
    /**
     * Label pour le isDrinked
     * @author amolixs
     */
    private javax.swing.JLabel labelIsDrinked;
    
    /**
     * Permet d'entré l'id du produit à modifié
     * @author amolixs
     */
    private javax.swing.JTextField inputId;
    
    /**
     * Permet d'entré le nom à modifié
     * @author amolixs
     */
    private javax.swing.JTextField inputName;
    
    /**
     * Permet d'entré l'origin à mofifié
     * @author amolixs
     */
    private javax.swing.JTextField inputOrigin;
    
    /**
     * Permet d'entré le prix à mofifié
     * @author amolixs
     */
    private javax.swing.JTextField inputPrice;
	
	/**
	 * Constructeur
	 * @author amolixs
	 */
    public FormUpdateProduct() {
    	configure();
        initComponents();
    }
    
    /**
     * Méthode qui permet de configurer la fenetre
     * @author amolixs
     */
    public void configure() {
    	setTitle("*-Update product-*");
    	setResizable(false);
    	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    /**
     * Méhode qui permet d'initialisé les composants de la fenetre
     * @author amolixs
     */
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        idProductLabel = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        originLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelIsDrinked = new javax.swing.JLabel();
        checkButtonIsDrinkUpdate = new javax.swing.JCheckBox();
        buttonImageUpdate = new javax.swing.JButton();
        buttonValidUpdate = new javax.swing.JButton();
        buttonQuit = new javax.swing.JButton();
        inputName = new javax.swing.JTextField();
        inputOrigin = new javax.swing.JTextField();
        inputPrice = new javax.swing.JTextField();

        

        titleLabel.setText("Modifié un produit");

        idProductLabel.setText("Id du produit à modifié :");

        nameLabel.setText("Nom : ");

        originLabel.setText("Origin : ");

        priceLabel.setText("Prix : ");

        labelIsDrinked.setText("Buvable : ");

        checkButtonIsDrinkUpdate.setText("buvable");

        buttonImageUpdate.setText("Image");

        buttonValidUpdate.setIcon(new javax.swing.ImageIcon("/home/amolixs/eclipse-workspace/ProductStockManagement/src/img/icons8-approuver-et-mettre-à-jour-filled-20.png")); // NOI18N
        buttonValidUpdate.setText("Modifié");
        
        buttonQuit.setIcon(new javax.swing.ImageIcon("/home/amolixs/eclipse-workspace/ProductStockManagement/src/img/icons8-sortie-filled-20.png")); // NOI18N
        buttonQuit.setText("Quitter");
        
        /******************************************\
         * 
         * 				ACTIONS
         * 
        \******************************************/
        buttonValidUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });
        
        buttonQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				setVisible(false);
			}
		});
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonValidUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonQuit)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idProductLabel)
                        .addGap(18, 18, 18)
                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelIsDrinked)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkButtonIsDrinkUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(buttonImageUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nameLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(originLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(priceLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputOrigin, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(inputPrice)
                            .addComponent(inputName))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idProductLabel)
                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(originLabel)
                    .addComponent(inputOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(inputPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIsDrinked)
                    .addComponent(checkButtonIsDrinkUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonImageUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonQuit)
                    .addComponent(buttonValidUpdate)))
        );
        pack();
    }                                                                         
}
