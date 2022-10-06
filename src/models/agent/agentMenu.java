/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package models.agent;

import models.agent.reception.pouletReception;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import models.Authentification;
import models.ClasseVerification;
import models.administrateur.ModifierAgentPanel;
import models.agent.nettoyage.PouletMainNettoyage;
import models.agent.nettoyage.legumeMainNettoyage;
import models.agent.reception.legumeReception;
import models.agent.conditionnement.LegumeMainConditionnemt;
import models.agent.conditionnement.PouletMainConditionnement;
import models.agent.coupage.LegumeMainCoupage;
import models.agent.coupage.PouletMainCoupage;
import models.agent.coupage.journalCoupage;
import models.agent.nettoyage.journalNettoyage;
import models.agent.reception.journalReception;
import models.agent.sortie.LegumeMainSortie;
import models.agent.sortie.PouletMainSortie;
import models.agent.sortie.journalSortie;
import models.inventaire.ajouter_inventaire;
import models.inventaire.inventaireEN_cours;
import models.inventaire.liste_inventaire;
import models.stock.journal_stock;
import models.stock.mouvement_stock;
import models.stock.parametre_stock;

/**
 *
 * @author Alfec Informatique 2
 */
public class agentMenu extends javax.swing.JFrame {

    
    
    ClasseVerification c = new ClasseVerification();
    
    public agentMenu() {
        initComponents();
        this.setResizable(false);
        System.out.println(tabPanel.getSelectedComponent()); 
        
        scalImage(logo, "/icons/logo-kerux-food.png");
        //labelMenu.setVisible(false);
        //this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        
    }
    
    public void hovenEntered(JLabel label , JPanel panel){
        label.setForeground(Color.decode("#7B170F"));
        
    }
    public void hovenExited(JLabel label , JPanel panel){
        label.setForeground(Color.BLACK);
        
    }
    
    public void hovenpassed(JLabel label , JPanel panel){
        label.setForeground(Color.decode("#7B170F"));
        panel.setBackground(Color.WHITE);
    }
    public void hovenReleased(JLabel label , JPanel panel){
        label.setForeground(Color.BLACK);
        panel.setBackground(Color.decode("#F0F0F0"));
    }
  /*  
    public void afficher_Panel(JPanel p1 , JPanel p2){
        p1.removeAll();
        p1.add(p2);
        pack();
        p2.setVisible(true);
        
    }
   */ 
    
    public void scalImage(JMenu menu , String link) {
        ImageIcon icon =new ImageIcon(getClass().getResource(link));
        //reduir la taile d'image 
        //Image img = ;
        Image ImgScale = (icon).getImage().getScaledInstance(menu.getWidth(), menu.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon = new ImageIcon(ImgScale);
        menu.setIcon(ScaledIcon);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        receptionMenuPanel = new javax.swing.JPanel();
        receptionMenuLabel = new javax.swing.JLabel();
        nettoyageMenuPanel = new javax.swing.JPanel();
        nettoyageMenuLabel = new javax.swing.JLabel();
        coupageMenuPanel = new javax.swing.JPanel();
        coupageMenuLabel = new javax.swing.JLabel();
        condMenuPanel = new javax.swing.JPanel();
        condMenuLabel = new javax.swing.JLabel();
        sortieMenuPanel = new javax.swing.JPanel();
        sortieMenuLabel = new javax.swing.JLabel();
        iconUser = new javax.swing.JLabel();
        Nom_user = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        retour = new javax.swing.JLabel();
        mainForm = new javax.swing.JPanel();
        tabPanel = new javax.swing.JTabbedPane();
        pouletTabPanel = new javax.swing.JPanel();
        legumeTabPanel = new javax.swing.JPanel();
        autreTabPanel = new javax.swing.JPanel();
        heure = new javax.swing.JSpinner();
        date = new javax.swing.JSpinner();
        nomProcess = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        logo = new javax.swing.JMenu();
        journal = new javax.swing.JMenu();
        reception_menu = new javax.swing.JMenuItem();
        nettoyage_menu = new javax.swing.JMenuItem();
        coupage_menu = new javax.swing.JMenuItem();
        conditionnement_menu = new javax.swing.JMenuItem();
        sortie_menu = new javax.swing.JMenuItem();
        stock = new javax.swing.JMenu();
        stock_param = new javax.swing.JMenuItem();
        journal_stock = new javax.swing.JMenuItem();
        mouvement_stock = new javax.swing.JMenuItem();
        inventaire = new javax.swing.JMenu();
        ajouter_inventaire = new javax.swing.JMenuItem();
        inventaireCours = new javax.swing.JMenuItem();
        listeInventaire = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(240, 240, 240));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 700));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receptionMenuPanel.setBackground(new java.awt.Color(240, 240, 240));
        receptionMenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receptionMenuPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                receptionMenuPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                receptionMenuPanelMouseExited(evt);
            }
        });

        receptionMenuLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        receptionMenuLabel.setText("Réception");

        javax.swing.GroupLayout receptionMenuPanelLayout = new javax.swing.GroupLayout(receptionMenuPanel);
        receptionMenuPanel.setLayout(receptionMenuPanelLayout);
        receptionMenuPanelLayout.setHorizontalGroup(
            receptionMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receptionMenuPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(receptionMenuLabel)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        receptionMenuPanelLayout.setVerticalGroup(
            receptionMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receptionMenuLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(receptionMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 250, 50));

        nettoyageMenuPanel.setBackground(new java.awt.Color(240, 240, 240));
        nettoyageMenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nettoyageMenuPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nettoyageMenuPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nettoyageMenuPanelMouseExited(evt);
            }
        });

        nettoyageMenuLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        nettoyageMenuLabel.setText("Nettoyage");

        javax.swing.GroupLayout nettoyageMenuPanelLayout = new javax.swing.GroupLayout(nettoyageMenuPanel);
        nettoyageMenuPanel.setLayout(nettoyageMenuPanelLayout);
        nettoyageMenuPanelLayout.setHorizontalGroup(
            nettoyageMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nettoyageMenuPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(nettoyageMenuLabel)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        nettoyageMenuPanelLayout.setVerticalGroup(
            nettoyageMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nettoyageMenuLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(nettoyageMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, -1));

        coupageMenuPanel.setBackground(new java.awt.Color(240, 240, 240));
        coupageMenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coupageMenuPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                coupageMenuPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                coupageMenuPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                coupageMenuPanelMousePressed(evt);
            }
        });

        coupageMenuLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        coupageMenuLabel.setText("Coupage");

        javax.swing.GroupLayout coupageMenuPanelLayout = new javax.swing.GroupLayout(coupageMenuPanel);
        coupageMenuPanel.setLayout(coupageMenuPanelLayout);
        coupageMenuPanelLayout.setHorizontalGroup(
            coupageMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coupageMenuPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(coupageMenuLabel)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        coupageMenuPanelLayout.setVerticalGroup(
            coupageMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coupageMenuLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel2.add(coupageMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, -1));

        condMenuPanel.setBackground(new java.awt.Color(240, 240, 240));
        condMenuPanel.setPreferredSize(new java.awt.Dimension(250, 50));
        condMenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                condMenuPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                condMenuPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                condMenuPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                condMenuPanelMousePressed(evt);
            }
        });

        condMenuLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        condMenuLabel.setText("Conditionnement");

        javax.swing.GroupLayout condMenuPanelLayout = new javax.swing.GroupLayout(condMenuPanel);
        condMenuPanel.setLayout(condMenuPanelLayout);
        condMenuPanelLayout.setHorizontalGroup(
            condMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, condMenuPanelLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(condMenuLabel)
                .addGap(39, 39, 39))
        );
        condMenuPanelLayout.setVerticalGroup(
            condMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, condMenuPanelLayout.createSequentialGroup()
                .addComponent(condMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(condMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 250, 50));

        sortieMenuPanel.setBackground(new java.awt.Color(240, 240, 240));
        sortieMenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sortieMenuPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sortieMenuPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sortieMenuPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sortieMenuPanelMousePressed(evt);
            }
        });

        sortieMenuLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        sortieMenuLabel.setText("Sortie");

        javax.swing.GroupLayout sortieMenuPanelLayout = new javax.swing.GroupLayout(sortieMenuPanel);
        sortieMenuPanel.setLayout(sortieMenuPanelLayout);
        sortieMenuPanelLayout.setHorizontalGroup(
            sortieMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sortieMenuPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(sortieMenuLabel)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        sortieMenuPanelLayout.setVerticalGroup(
            sortieMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sortieMenuLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jPanel2.add(sortieMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, -1));

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/male_user_60px.png"))); // NOI18N
        jPanel2.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 617, -1, -1));

        Nom_user.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        Nom_user.setText("Nom user");
        jPanel2.add(Nom_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 617, 90, -1));

        role.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        role.setText("Role");
        jPanel2.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 646, -1, -1));

        retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Go Back_60pxW.png"))); // NOI18N
        jPanel2.add(retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        mainForm.setBackground(new java.awt.Color(255, 255, 255));
        mainForm.setPreferredSize(new java.awt.Dimension(950, 700));
        mainForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabPanel.setBackground(new java.awt.Color(255, 255, 255));
        tabPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabPanel.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        tabPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabPanelKeyPressed(evt);
            }
        });

        pouletTabPanel.setBackground(new java.awt.Color(255, 255, 255));
        pouletTabPanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pouletTabPanelKeyPressed(evt);
            }
        });
        pouletTabPanel.setLayout(new java.awt.GridLayout(1, 0));
        tabPanel.addTab("Poulet", pouletTabPanel);

        legumeTabPanel.setBackground(new java.awt.Color(255, 255, 255));
        legumeTabPanel.setLayout(new java.awt.GridLayout(1, 1));
        tabPanel.addTab("Légume", legumeTabPanel);

        autreTabPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout autreTabPanelLayout = new javax.swing.GroupLayout(autreTabPanel);
        autreTabPanel.setLayout(autreTabPanelLayout);
        autreTabPanelLayout.setHorizontalGroup(
            autreTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );
        autreTabPanelLayout.setVerticalGroup(
            autreTabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );

        tabPanel.addTab("Autres", autreTabPanel);

        mainForm.add(tabPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        heure.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        heure.setModel(new javax.swing.SpinnerDateModel());
        heure.setEditor(new javax.swing.JSpinner.DateEditor(heure, "hh:mm:ss"));
        heure.setEnabled(false);
        mainForm.add(heure, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, -1, -1));

        date.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        date.setModel(new javax.swing.SpinnerDateModel());
        date.setEditor(new javax.swing.JSpinner.DateEditor(date, "yyyy-MM-dd"));
        date.setEnabled(false);
        mainForm.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, -1, -1));

        nomProcess.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 36)); // NOI18N
        nomProcess.setForeground(new java.awt.Color(123, 23, 15));
        mainForm.add(nomProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel1.add(mainForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 950, 700));

        jMenuBar1.setBorder(null);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(1200, 32768));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(1200, 30));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(1200, 30));

        logo.setBackground(new java.awt.Color(240, 240, 240));
        logo.setToolTipText("");
        logo.setAlignmentX(0.0F);
        logo.setAlignmentY(0.0F);
        logo.setIconTextGap(0);
        logo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logo.setMinimumSize(new java.awt.Dimension(34, 50));
        logo.setPreferredSize(new java.awt.Dimension(240, 30));
        jMenuBar1.add(logo);

        journal.setBackground(new java.awt.Color(240, 240, 240));
        journal.setForeground(new java.awt.Color(255, 255, 255));
        journal.setText(" Journal ");
        journal.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        journal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        journal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        journal.setOpaque(true);
        journal.setPreferredSize(new java.awt.Dimension(100, 25));

        reception_menu.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        reception_menu.setText("Reception");
        reception_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reception_menuMouseClicked(evt);
            }
        });
        reception_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reception_menuActionPerformed(evt);
            }
        });
        journal.add(reception_menu);

        nettoyage_menu.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        nettoyage_menu.setText("Nettoyage");
        nettoyage_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nettoyage_menuActionPerformed(evt);
            }
        });
        journal.add(nettoyage_menu);

        coupage_menu.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        coupage_menu.setText("Coupage");
        coupage_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coupage_menuActionPerformed(evt);
            }
        });
        journal.add(coupage_menu);

        conditionnement_menu.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        conditionnement_menu.setText("Conditionnement");
        journal.add(conditionnement_menu);

        sortie_menu.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        sortie_menu.setText("Sortie");
        sortie_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortie_menuActionPerformed(evt);
            }
        });
        journal.add(sortie_menu);

        jMenuBar1.add(journal);

        stock.setBackground(new java.awt.Color(240, 240, 240));
        stock.setText("Stock");
        stock.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        stock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stock.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stock.setOpaque(true);
        stock.setPreferredSize(new java.awt.Dimension(100, 25));

        stock_param.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        stock_param.setText("Parametre de stock");
        stock_param.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_paramActionPerformed(evt);
            }
        });
        stock.add(stock_param);

        journal_stock.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        journal_stock.setText("Journal de sotck");
        journal_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                journal_stockActionPerformed(evt);
            }
        });
        stock.add(journal_stock);

        mouvement_stock.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        mouvement_stock.setText("Mouvement de Stock");
        mouvement_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mouvement_stockActionPerformed(evt);
            }
        });
        stock.add(mouvement_stock);

        jMenuBar1.add(stock);

        inventaire.setBackground(new java.awt.Color(240, 240, 240));
        inventaire.setText("Inventaire");
        inventaire.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        inventaire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventaire.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inventaire.setPreferredSize(new java.awt.Dimension(100, 25));

        ajouter_inventaire.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        ajouter_inventaire.setText("Ajouter un inventeur");
        ajouter_inventaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_inventaireActionPerformed(evt);
            }
        });
        inventaire.add(ajouter_inventaire);

        inventaireCours.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        inventaireCours.setText("Inventaire en cours");
        inventaireCours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventaireCoursActionPerformed(evt);
            }
        });
        inventaire.add(inventaireCours);

        listeInventaire.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        listeInventaire.setText("Liste des inventeur");
        listeInventaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeInventaireActionPerformed(evt);
            }
        });
        inventaire.add(listeInventaire);

        jMenuBar1.add(inventaire);

        jMenu1.setText("Statistique");
        jMenu1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setPreferredSize(new java.awt.Dimension(100, 25));
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Alert");
        jMenu2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setMinimumSize(new java.awt.Dimension(100, 25));
        jMenu2.setPreferredSize(new java.awt.Dimension(100, 25));
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void receptionMenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionMenuPanelMouseClicked
        // TODO add your handling code here:

        hovenReleased(nettoyageMenuLabel,nettoyageMenuPanel);
        hovenReleased(coupageMenuLabel,coupageMenuPanel);
        hovenpassed(receptionMenuLabel,receptionMenuPanel);
        hovenReleased(sortieMenuLabel,sortieMenuPanel);
        hovenReleased(condMenuLabel,condMenuPanel);
        nomProcess.setText("Réception");
        
        
        
        
        
        
        pouletTabPanel.removeAll();
        pouletReception pPoulet=new pouletReception();
        pouletTabPanel.add(pPoulet);
        pPoulet.setVisible(true);
        
        
        legumeTabPanel.removeAll();
        legumeReception pLegume=new legumeReception();
        legumeTabPanel.add(pLegume);
        pLegume.setVisible(true);
        
        
        
            
        
/*
        mainForm.removeAll();
        ajouterAgentPanel p=new ajouterAgentPanel();
        mainForm.add(p);
        pack();
        p.setVisible(true);*/

    }//GEN-LAST:event_receptionMenuPanelMouseClicked

    private void receptionMenuPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionMenuPanelMouseEntered
        // TODO add your handling code here:
        hovenEntered(receptionMenuLabel,receptionMenuPanel);
        
            
        
    }//GEN-LAST:event_receptionMenuPanelMouseEntered

    private void receptionMenuPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receptionMenuPanelMouseExited
        // TODO add your handling code here:
        hovenExited(receptionMenuLabel,receptionMenuPanel);
    }//GEN-LAST:event_receptionMenuPanelMouseExited

    private void nettoyageMenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nettoyageMenuPanelMouseClicked
        // TODO add your handling code here:

        hovenReleased(receptionMenuLabel,receptionMenuPanel);
        hovenReleased(coupageMenuLabel,coupageMenuPanel);
        hovenpassed(nettoyageMenuLabel,nettoyageMenuPanel);
        hovenReleased(sortieMenuLabel,sortieMenuPanel);
        hovenReleased(condMenuLabel,condMenuPanel);
        nomProcess.setText("Nettoyage");
        
        
        pouletTabPanel.removeAll();
        PouletMainNettoyage pPoulet=new PouletMainNettoyage();
        pouletTabPanel.add(pPoulet);
        pPoulet.setVisible(true);
        
        
        legumeTabPanel.removeAll();
        legumeMainNettoyage pLegume=new legumeMainNettoyage();
        legumeTabPanel.add(pLegume);
        pLegume.setVisible(true);
/*
        mainForm.removeAll();
        ModifierAgentPanel p=new ModifierAgentPanel();
        mainForm.add(p);
        pack();
        p.setVisible(true);*/
    }//GEN-LAST:event_nettoyageMenuPanelMouseClicked

    private void nettoyageMenuPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nettoyageMenuPanelMouseEntered
        // TODO add your handling code here:
        hovenEntered(nettoyageMenuLabel,nettoyageMenuPanel);

    }//GEN-LAST:event_nettoyageMenuPanelMouseEntered

    private void nettoyageMenuPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nettoyageMenuPanelMouseExited
        // TODO add your handling code here:
        hovenExited(nettoyageMenuLabel,nettoyageMenuPanel);
    }//GEN-LAST:event_nettoyageMenuPanelMouseExited

    private void coupageMenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coupageMenuPanelMouseClicked
        // TODO add your handling code here:

        hovenReleased(receptionMenuLabel,receptionMenuPanel);
        hovenReleased(nettoyageMenuLabel,nettoyageMenuPanel);
        hovenpassed(coupageMenuLabel,coupageMenuPanel);
        hovenReleased(sortieMenuLabel,sortieMenuPanel);
        hovenReleased(condMenuLabel,condMenuPanel);
        nomProcess.setText("Coupage");
        
        pouletTabPanel.removeAll();
        
        pouletTabPanel.removeAll();
        PouletMainCoupage pPoulet=new PouletMainCoupage();
        pouletTabPanel.add(pPoulet);
        pPoulet.setVisible(true);
        
        
        legumeTabPanel.removeAll();
        LegumeMainCoupage pLegume=new LegumeMainCoupage();
        legumeTabPanel.add(pLegume);
        pLegume.setVisible(true);
        
/*
        mainForm.removeAll();
        listAgentPanel p=new listAgentPanel();
        mainForm.add(p);
        pack();
        p.setVisible(true);*/
    }//GEN-LAST:event_coupageMenuPanelMouseClicked

    private void coupageMenuPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coupageMenuPanelMouseEntered
        // TODO add your handling code here:
        hovenEntered(coupageMenuLabel,coupageMenuPanel);
    }//GEN-LAST:event_coupageMenuPanelMouseEntered

    private void coupageMenuPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coupageMenuPanelMouseExited
        // TODO add your handling code here:
        hovenExited(coupageMenuLabel,coupageMenuPanel);
    }//GEN-LAST:event_coupageMenuPanelMouseExited

    private void coupageMenuPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coupageMenuPanelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_coupageMenuPanelMousePressed

    private void condMenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_condMenuPanelMouseClicked
        hovenReleased(receptionMenuLabel,receptionMenuPanel);
        hovenReleased(nettoyageMenuLabel,nettoyageMenuPanel);
        hovenReleased(coupageMenuLabel,coupageMenuPanel);
        hovenReleased(sortieMenuLabel,sortieMenuPanel);
        hovenpassed(condMenuLabel,condMenuPanel);
        nomProcess.setText("Conditionnement");
        
        pouletTabPanel.removeAll();
        PouletMainConditionnement pPoulet=new PouletMainConditionnement();
        pouletTabPanel.add(pPoulet);
        pPoulet.setVisible(true);
        
        
        legumeTabPanel.removeAll();
        LegumeMainConditionnemt pLegume=new LegumeMainConditionnemt();
        legumeTabPanel.add(pLegume);
        pLegume.setVisible(true);
    }//GEN-LAST:event_condMenuPanelMouseClicked

    private void condMenuPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_condMenuPanelMouseEntered
        hovenEntered(condMenuLabel,condMenuPanel);
        
        
    }//GEN-LAST:event_condMenuPanelMouseEntered

    private void condMenuPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_condMenuPanelMouseExited
        hovenExited(condMenuLabel,condMenuPanel);
        
    }//GEN-LAST:event_condMenuPanelMouseExited

    private void condMenuPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_condMenuPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_condMenuPanelMousePressed

    private void sortieMenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortieMenuPanelMouseClicked
        hovenReleased(receptionMenuLabel,receptionMenuPanel);
        hovenReleased(nettoyageMenuLabel,nettoyageMenuPanel);
        hovenReleased(coupageMenuLabel,coupageMenuPanel);
        hovenReleased(condMenuLabel,condMenuPanel);
        hovenpassed(sortieMenuLabel,sortieMenuPanel);
        nomProcess.setText("Sortie");
        
        pouletTabPanel.removeAll();
        PouletMainSortie pPoulet=new PouletMainSortie();
        pouletTabPanel.add(pPoulet);
        pPoulet.setVisible(true);
        
        
        legumeTabPanel.removeAll();
        LegumeMainSortie pLegume=new LegumeMainSortie();
        legumeTabPanel.add(pLegume);
        pLegume.setVisible(true);
    }//GEN-LAST:event_sortieMenuPanelMouseClicked

    private void sortieMenuPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortieMenuPanelMouseEntered
        hovenEntered(sortieMenuLabel, sortieMenuPanel);
        
    }//GEN-LAST:event_sortieMenuPanelMouseEntered

    private void sortieMenuPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortieMenuPanelMouseExited
        hovenExited(sortieMenuLabel, sortieMenuPanel);
        
    }//GEN-LAST:event_sortieMenuPanelMouseExited

    private void sortieMenuPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sortieMenuPanelMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortieMenuPanelMousePressed

    private void pouletTabPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pouletTabPanelKeyPressed
       
        
    }//GEN-LAST:event_pouletTabPanelKeyPressed

    private void tabPanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabPanelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabPanelKeyPressed

    private void reception_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reception_menuActionPerformed
        journalReception j = new journalReception();
        j.setVisible(true);
        
    }//GEN-LAST:event_reception_menuActionPerformed

    private void reception_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reception_menuMouseClicked
       
        
    }//GEN-LAST:event_reception_menuMouseClicked

    private void nettoyage_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nettoyage_menuActionPerformed
        journalNettoyage j = new journalNettoyage();
        j.setVisible(true);
    }//GEN-LAST:event_nettoyage_menuActionPerformed

    private void coupage_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coupage_menuActionPerformed
        journalCoupage j = new journalCoupage();
        j.setVisible(true);
    }//GEN-LAST:event_coupage_menuActionPerformed

    private void sortie_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortie_menuActionPerformed
        journalSortie j = new journalSortie();
        j.setVisible(true);
    }//GEN-LAST:event_sortie_menuActionPerformed

    private void ajouter_inventaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_inventaireActionPerformed
        ajouter_inventaire a = new ajouter_inventaire();
        a.setVisible(true);
    }//GEN-LAST:event_ajouter_inventaireActionPerformed

    private void stock_paramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_paramActionPerformed
        parametre_stock param =  new parametre_stock();
        param.setVisible(true);
    }//GEN-LAST:event_stock_paramActionPerformed

    private void journal_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_journal_stockActionPerformed
        journal_stock j = new journal_stock();
        j.setVisible(true);
        
    }//GEN-LAST:event_journal_stockActionPerformed

    private void mouvement_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mouvement_stockActionPerformed
        mouvement_stock j = new mouvement_stock();
        j.setVisible(true);
    }//GEN-LAST:event_mouvement_stockActionPerformed

    private void listeInventaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeInventaireActionPerformed
        liste_inventaire liste = new liste_inventaire();
        liste.setVisible(true);
    }//GEN-LAST:event_listeInventaireActionPerformed

    private void inventaireCoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventaireCoursActionPerformed
        inventaireEN_cours inv = new inventaireEN_cours();
        inv.setVisible(true);
    }//GEN-LAST:event_inventaireCoursActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(agentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        try{
           UIManager.setLookAndFeel(new FlatIntelliJLaf());
           //org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
       } catch (Exception e){
           e.printStackTrace();
       }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nom_user;
    private javax.swing.JMenuItem ajouter_inventaire;
    private javax.swing.JPanel autreTabPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel condMenuLabel;
    private javax.swing.JPanel condMenuPanel;
    private javax.swing.JMenuItem conditionnement_menu;
    private javax.swing.JLabel coupageMenuLabel;
    private javax.swing.JPanel coupageMenuPanel;
    private javax.swing.JMenuItem coupage_menu;
    private javax.swing.JSpinner date;
    private javax.swing.JSpinner heure;
    private javax.swing.JLabel iconUser;
    private javax.swing.JMenu inventaire;
    private javax.swing.JMenuItem inventaireCours;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu journal;
    private javax.swing.JMenuItem journal_stock;
    private javax.swing.JPanel legumeTabPanel;
    private javax.swing.JMenuItem listeInventaire;
    private javax.swing.JMenu logo;
    private javax.swing.JPanel mainForm;
    private javax.swing.JMenuItem mouvement_stock;
    private javax.swing.JLabel nettoyageMenuLabel;
    private javax.swing.JPanel nettoyageMenuPanel;
    private javax.swing.JMenuItem nettoyage_menu;
    private javax.swing.JLabel nomProcess;
    private javax.swing.JPanel pouletTabPanel;
    private javax.swing.JLabel receptionMenuLabel;
    private javax.swing.JPanel receptionMenuPanel;
    private javax.swing.JMenuItem reception_menu;
    private javax.swing.JLabel retour;
    private javax.swing.JLabel role;
    private javax.swing.JLabel sortieMenuLabel;
    private javax.swing.JPanel sortieMenuPanel;
    private javax.swing.JMenuItem sortie_menu;
    private javax.swing.JMenu stock;
    private javax.swing.JMenuItem stock_param;
    private javax.swing.JTabbedPane tabPanel;
    // End of variables declaration//GEN-END:variables
}
