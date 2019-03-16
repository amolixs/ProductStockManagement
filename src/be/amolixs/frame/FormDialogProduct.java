package be.amolixs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import be.amolixs.dao.ProductEditorDao;

/**
 * Classe qui permet de gérer la fenetre de formulaire pour la création d'un produit
 * @author amolixs
 */
public class FormDialogProduct extends javax.swing.JFrame {
	/**
	 * Serial pour ma classe
	 * @author amolixs
	 */
	private static final long serialVersionUID = -1105984093307881801L;

	/**
	 * Button create
	 * @author amolixs
	 */
    private javax.swing.JButton createButton;
    
    /**
     * Button quit
     * @author amolixs
     */
    private javax.swing.JButton quitButton;
    
    /**
     * Button img qui permet d'importer une image pour mon produit
     * @author amolixs
     */
    private javax.swing.JButton buttonImg;
   
    
    /**
     * Label pour le titre
     * @author amolixs
     */
    private javax.swing.JLabel titleLabel;
    
    /**
     * Label pour le champ d'entré name
     * @author amolixs
     */
    private javax.swing.JLabel nameLabel;
    
    /**
     * Label pour le champ d'entrée prix
     * @author amolixs
     */
    private javax.swing.JLabel priceLabel;
    
    /**
     * Label pour le champ d'entreé origin
     * @author amolixs
     */
    private javax.swing.JLabel originLabel;
    
    /**
     * Label pour le champ d'entré origin
     * @author amolixs
     */
    private javax.swing.JLabel drinkLabel;
    
    /**
     * Text field pour le label name
     * @author amolixs
     */
    private javax.swing.JTextField textFieldName;
    
    /**
     * Text field pour le label price
     * @author amolixs
     */
    private javax.swing.JTextField textFieldPrice;
    
    /**
     * Text field pour le label origin
     * @author amolixs
     */
    private javax.swing.JTextField textFieldOrigin;
    
    /**
     * CheckButton pour savoir si le produit est buvable ou non
     * @author amolixs
     */
    private javax.swing.JCheckBox checkButtonIsADrink;
    
    /**
     * Object de type productEditorDao
     * @author amolixs
     */
    private ProductEditorDao productEditorDao;

    /**
     * Constructeur
     * @author amolixs
     */
    public FormDialogProduct() {
    	init();
    	configureFrame();
        initComponents();
    }
    
    /**
     * Méthode qui permet de configurer la fenetre
     * @author amolixs
     */
    public void configureFrame() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("*-Create product-*");
    }
    
    /**
     * Méthode qui permet d'initialisé les attributs
     * @author amolixs
     */
    public void init() {
    	this.productEditorDao = new ProductEditorDao();
    }
    
    /**
     * Méthode qui permet d'initialisé les composants de la fenetre
     * @author amolixs
     */
    private void initComponents() {

    	titleLabel = new javax.swing.JLabel();
    	nameLabel = new javax.swing.JLabel();
    	priceLabel = new javax.swing.JLabel();
    	drinkLabel = new javax.swing.JLabel();
    	textFieldName = new javax.swing.JTextField();
    	textFieldPrice = new javax.swing.JTextField();
    	textFieldOrigin = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        originLabel = new javax.swing.JLabel();
        checkButtonIsADrink = new javax.swing.JCheckBox();
        buttonImg = new javax.swing.JButton();

        titleLabel.setText("Création produit");

        nameLabel.setText("Nom : ");

        priceLabel.setText("Prix  :");

        originLabel.setText("Origin :");

        textFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        textFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        createButton.setText("Créer");
        createButton.setToolTipText("");
        
        /******************************************\
         * 
         * 				ACTIONS
         * 
        \******************************************/
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	String nameProduct = textFieldName.getText();
            	String originProduct = textFieldOrigin.getText();
            	String pathFileImage = "";
            	String isADrink = "";
            	int priceProduct = Integer.parseInt(textFieldPrice.getText());
            	if (checkButtonIsADrink.isSelected())
            		isADrink = "true";
            	else
            		isADrink = "false";
            	productEditorDao.add(nameProduct, priceProduct, originProduct, isADrink, pathFileImage);
            }
        });
        
        quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				setVisible(false);
			}
		});
        
        quitButton.setText("Quitter");
        drinkLabel.setText(" Buvable : ");
        drinkLabel.setToolTipText("");
        checkButtonIsADrink.setText("buvable");
        buttonImg.setText("Image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(titleLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldOrigin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(originLabel)
                                    .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabel)
                                    .addComponent(drinkLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkButtonIsADrink))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(buttonImg)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quitButton)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(originLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkLabel)
                    .addComponent(checkButtonIsADrink))
                .addGap(18, 18, 18)
                .addComponent(buttonImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitButton)
                    .addComponent(createButton))
                .addContainerGap())
        );

        pack();
    }                      

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                                                              
}
