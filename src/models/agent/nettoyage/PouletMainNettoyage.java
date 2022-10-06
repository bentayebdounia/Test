/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package models.agent.nettoyage;

import models.ClasseVerification;

/**
 *
 * @author Alfec Informatique 2
 */
public class PouletMainNettoyage extends javax.swing.JPanel {

    ClasseVerification verify = new ClasseVerification();
    
    public PouletMainNettoyage() {
        initComponents();
        typePoulet.setVisible(false);
    }

    void SelectRadio(){
        
        
        
        
        
        if(entierRadio.isSelected()){
            
            typePoulet.setVisible(false);
            
            
            
        }
        else if(tranchierRadio.isSelected()){
                    typePoulet.setVisible(true);
                   
                   
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        entierRadio = new javax.swing.JRadioButton();
        tranchierRadio = new javax.swing.JRadioButton();
        typePoulet = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        receptionMain = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        agentNettoyage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAgent = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        poids = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        StockBox = new javax.swing.JComboBox<>();
        bouttonAjouter3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        bouttonAjouter1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        piece = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(912, 576));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(entierRadio);
        entierRadio.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        entierRadio.setText("Entier");
        entierRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entierRadioMouseClicked(evt);
            }
        });
        entierRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entierRadioActionPerformed(evt);
            }
        });
        add(entierRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 25, -1, 30));

        buttonGroup1.add(tranchierRadio);
        tranchierRadio.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        tranchierRadio.setText("Tranchier");
        tranchierRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tranchierRadioMouseClicked(evt);
            }
        });
        tranchierRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranchierRadioActionPerformed(evt);
            }
        });
        add(tranchierRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 25, -1, 30));

        typePoulet.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        typePoulet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tenders", "Wings", "Dips", "HotDog" }));
        add(typePoulet, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 25, 170, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel1.setText("ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 25, 20, 30));

        idText.setBackground(new java.awt.Color(240, 240, 240));
        idText.setPreferredSize(new java.awt.Dimension(64, 30));
        add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 25, 260, -1));

        receptionMain.setBackground(new java.awt.Color(240, 240, 240));
        receptionMain.setPreferredSize(new java.awt.Dimension(845, 460));
        receptionMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel2.setText("Agent de Nettoyage");
        jLabel2.setPreferredSize(new java.awt.Dimension(135, 26));
        receptionMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, -1));

        agentNettoyage.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        agentNettoyage.setPreferredSize(new java.awt.Dimension(360, 26));
        agentNettoyage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                agentNettoyageKeyPressed(evt);
            }
        });
        receptionMain.add(agentNettoyage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 580, 28));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Plus_30px.png"))); // NOI18N
        receptionMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, -1, -1));

        jScrollPane1.setViewportView(listAgent);

        receptionMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 620, 70));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel6.setText("Poids ");
        receptionMain.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 28));

        poids.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        poids.setPreferredSize(new java.awt.Dimension(360, 30));
        poids.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                poidsKeyPressed(evt);
            }
        });
        receptionMain.add(poids, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 310, 28));

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel8.setText("Stock");
        receptionMain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, 28));

        StockBox.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        StockBox.setPreferredSize(new java.awt.Dimension(72, 26));
        receptionMain.add(StockBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 622, 28));

        bouttonAjouter3.setBackground(new java.awt.Color(223, 66, 53));
        bouttonAjouter3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 66, 53), 25, true));
        bouttonAjouter3.setOpaque(false);
        bouttonAjouter3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bouttonAjouter3MouseClicked(evt);
            }
        });
        bouttonAjouter3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Annuler");
        bouttonAjouter3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        receptionMain.add(bouttonAjouter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 140, 29));

        bouttonAjouter1.setBackground(new java.awt.Color(79, 139, 42));
        bouttonAjouter1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 139, 42), 25, true));
        bouttonAjouter1.setOpaque(false);
        bouttonAjouter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bouttonAjouter1MouseClicked(evt);
            }
        });
        bouttonAjouter1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Valider");
        bouttonAjouter1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 30));

        receptionMain.add(bouttonAjouter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 140, 29));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel7.setText("Pieces ");
        receptionMain.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, 28));

        piece.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        piece.setPreferredSize(new java.awt.Dimension(360, 30));
        piece.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pieceKeyPressed(evt);
            }
        });
        receptionMain.add(piece, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 231, 28));

        add(receptionMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 845, 390));
    }// </editor-fold>//GEN-END:initComponents

    private void entierRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entierRadioMouseClicked

    }//GEN-LAST:event_entierRadioMouseClicked

    private void entierRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entierRadioActionPerformed
        SelectRadio();
    }//GEN-LAST:event_entierRadioActionPerformed

    private void tranchierRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranchierRadioMouseClicked

    }//GEN-LAST:event_tranchierRadioMouseClicked

    private void tranchierRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranchierRadioActionPerformed
        SelectRadio();
    }//GEN-LAST:event_tranchierRadioActionPerformed

    private void agentNettoyageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agentNettoyageKeyPressed
        verify.verifyCaracter(agentNettoyage, evt);
    }//GEN-LAST:event_agentNettoyageKeyPressed

    private void poidsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_poidsKeyPressed
        verify.verifyNamber(poids, evt);
    }//GEN-LAST:event_poidsKeyPressed

    private void bouttonAjouter3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bouttonAjouter3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bouttonAjouter3MouseClicked

    private void bouttonAjouter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bouttonAjouter1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bouttonAjouter1MouseClicked

    private void pieceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pieceKeyPressed
        verify.verifyNamber(piece, evt);
    }//GEN-LAST:event_pieceKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> StockBox;
    private javax.swing.JTextField agentNettoyage;
    private javax.swing.JPanel bouttonAjouter1;
    private javax.swing.JPanel bouttonAjouter3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton entierRadio;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listAgent;
    private javax.swing.JTextField piece;
    private javax.swing.JTextField poids;
    private javax.swing.JPanel receptionMain;
    private javax.swing.JRadioButton tranchierRadio;
    private javax.swing.JComboBox<String> typePoulet;
    // End of variables declaration//GEN-END:variables
}
