package be.amolixs.frame;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Classe qui permet de gérer la fenetre
 * @author amolixs
 */
public class Frame extends javax.swing.JFrame {
	/**
	 * Serial de la fenetre
	 * @author amolixs
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Button ajouter
	 * @author amolixs
	 */
	private javax.swing.JButton addButton;
	
	/**
	 * Button modifié
	 * @author amolixs
	 */
    private javax.swing.JButton updateButton;
    
    /**
     * Button supprimé
     * @author amolixs
     */
    private javax.swing.JButton deleteButton;
    
    /**
     * Button affiché
     * @author amolixs
     */
    private javax.swing.JButton displayButton;
    
    /**
     * Button quitter
     * @author amolixs
     */
    private javax.swing.JButton quitButton;
    
    /**
     * Label qui va servir d'icon
     */
    private javax.swing.JLabel jLabel1;
    
    /**
     * Object de type FormDialogProduct
     * @author amolixs
     */
    private FormDialogProduct formDialogProduct;
    
    /**
     * Object de type FormViewProduct
     * @author amolixs
     */
    private FormViewProduct formViewProduct;
    
    /**
     * Object de type formDeleteProduct
     * @author amolixs
     */
    private FormDeleteProduct formDeleteProduct;
    
    /**
     * Object de type FormUpdateProduct
     * @author amolixs
     */
    private FormUpdateProduct formUpdateProduct;
    
    /**
     * Constructeur.
     * @author amolixs
     */
    public Frame() {
    	init();
        initComponents();
    }
    
    /**
     * Méthode qui permet d'initialisé les attributs
     * @author amolixs
     */
    public void init() {
    	this.formDialogProduct = new FormDialogProduct();
    	this.formViewProduct = new FormViewProduct();
    	this.formDeleteProduct = new FormDeleteProduct();
    	this.formUpdateProduct = new FormUpdateProduct();
    }
    
    /**
     * Méthode qui permet de configurer la fenetre
     * @author amolixs
     */
    public void configureFrame() {
    	setTitle("*-Product-Stock-Management-*");
    	setIconImage(Toolkit.getDefaultToolkit().getImage(""));
    	setResizable(false);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    /**
     * Méthode qui permet de récupérer le résultat du popup pour la fermeture de la fenetre
     * @author amolixs
     * @return
     * 		La réponse de l'utilisateur
     */
    public int getVerifQuitDIalogResult() {
    	int verifQuitDialogResult = JOptionPane.showConfirmDialog(null, "Etes-vous sur de vouloir quitter ?");
    	return verifQuitDialogResult;
    }
    
    /**
     * Méthode qui permet de vérifier si l'utilisateur veut bien fermé la fenetre ou non
     * @author amolixs
     * @return
     * 		True si l'utilisateur veut quitter la fenetre
     */
    public boolean verifQuitFrame() {
    	int dialogResult = getVerifQuitDIalogResult();
    	if (dialogResult == JOptionPane.YES_OPTION) 
    		return true;
    	else
    		return false;
    }

    
    /**
     * Méthode qui permet d'initalisé les composants
     * @author amolixs                      
     */
    private void initComponents() {
    	configureFrame();
        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/icons8-vendre-les-stock-filled-100.png")));

        addButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/icons8-plus-filled-20.png")));
        addButton.setText("Ajouter");

        updateButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/icons8-approuver-et-mettre-à-jour-filled-20.png")));
        updateButton.setText("Modifié");

        deleteButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/icons8-annuler-filled-20.png"))); 
        deleteButton.setText("Supprimé");

        displayButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/icons8-télévision-filled-20.png")));
        displayButton.setText("Affiché");

        quitButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/icons8-sortie-filled-20.png")));
        quitButton.setText("Quitter");
        
        /******************************************\
         * 
         * 				ACTIONS
         * 
        \******************************************/
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	if (verifQuitFrame()) {
            		setVisible(false);
            		System.exit(0);
            	}else{
            		setVisible(true);
            	}
            }
        });
        
        addButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				formDialogProduct.setVisible(true);
			}
		});
        
        displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				formViewProduct.setVisible(true);
			}
		});
        
        updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				formUpdateProduct.setVisible(true);
				
			}
		});
        
        deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				formDeleteProduct.setVisible(true);
			}
		});
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(displayButton)
                .addGap(18, 18, 18)
                .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }                                       
}
