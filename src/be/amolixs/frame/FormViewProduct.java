package be.amolixs.frame;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * Classe qui permet de gérer la fenetre pour l'affichage des produits
 * @author amolixs
 *
 */
public class FormViewProduct extends javax.swing.JFrame {
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
	 * Constructeur
	 * @author amolixs
	 */
    public FormViewProduct() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setText("Affiché produits");

        labelImg.setText("jLabel2");
        
        labelDescription.setText("desc");


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                            .addComponent(labelDescription)))
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
                .addComponent(labelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(quitButton)
                .addContainerGap())
        );

        pack();
    }                                  
}
