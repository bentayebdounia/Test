/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package models.agent.reception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ClasseVerification;
import models.agent.confirmation;

/**
 *
 * @author Dounia
 */
public class entierPouletPanel extends javax.swing.JPanel {

    ClasseVerification verify = new ClasseVerification();
    public entierPouletPanel() {
        initComponents();
        
    }

    public void enable(boolean enabled){
        fournisseurText.setEnabled(enabled);
        acheteurText.setEnabled(enabled);
        recepteurText.setEnabled(enabled);
        poidsBon.setEnabled(enabled);
        pieceBon.setEnabled(enabled);
        bonOption.setEnabled(enabled);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fournisseurText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        acheteurText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        recepteurText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        poidsBon = new javax.swing.JTextField();
        pieceBon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bouttonAjouter = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        bonOption = new javax.swing.JComboBox<>();
        actualiseBtn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        poids = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        piece = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        stockBox = new javax.swing.JComboBox<>();
        validerBtn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        annulerBtn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(720, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel1.setText("Fournisseur");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 28));

        fournisseurText.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        fournisseurText.setPreferredSize(new java.awt.Dimension(360, 26));
        fournisseurText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fournisseurTextKeyPressed(evt);
            }
        });
        jPanel1.add(fournisseurText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 622, 28));

        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel2.setText("Acheteur");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 28));

        acheteurText.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        acheteurText.setPreferredSize(new java.awt.Dimension(360, 30));
        acheteurText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                acheteurTextKeyPressed(evt);
            }
        });
        jPanel1.add(acheteurText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 370, 28));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel3.setText("Recepteur");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 28));

        recepteurText.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        recepteurText.setPreferredSize(new java.awt.Dimension(360, 30));
        recepteurText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recepteurTextKeyPressed(evt);
            }
        });
        jPanel1.add(recepteurText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 622, 28));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel4.setText("Poids de bon");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 28));

        poidsBon.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        poidsBon.setPreferredSize(new java.awt.Dimension(360, 30));
        poidsBon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                poidsBonKeyPressed(evt);
            }
        });
        jPanel1.add(poidsBon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 280, 28));

        pieceBon.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        pieceBon.setPreferredSize(new java.awt.Dimension(360, 30));
        pieceBon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pieceBonKeyPressed(evt);
            }
        });
        jPanel1.add(pieceBon, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 231, 28));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel5.setText("Pieces de bon");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, 28));

        bouttonAjouter.setBackground(new java.awt.Color(123, 23, 15));
        bouttonAjouter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(123, 23, 15), 25, true));
        bouttonAjouter.setOpaque(false);
        bouttonAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bouttonAjouterMouseClicked(evt);
            }
        });
        bouttonAjouter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ajouter le Bon");
        bouttonAjouter.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 110, 29));

        jPanel1.add(bouttonAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 217, 29));

        bonOption.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        bonOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bon de livraison ", "Bon de réception" }));
        bonOption.setPreferredSize(new java.awt.Dimension(72, 26));
        jPanel1.add(bonOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 70, 240, 28));

        actualiseBtn.setBackground(new java.awt.Color(79, 139, 42));
        actualiseBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 139, 42), 15, true));
        actualiseBtn.setToolTipText("");
        actualiseBtn.setOpaque(false);
        actualiseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualiseBtnMouseClicked(evt);
            }
        });
        actualiseBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Actualiser");
        actualiseBtn.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel1.add(actualiseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 80, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 845, 250));

        jPanel2.setBackground(new java.awt.Color(240, 240, 240));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel6.setText("Poids ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 20, -1, 28));

        poids.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        poids.setPreferredSize(new java.awt.Dimension(360, 30));
        poids.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                poidsKeyPressed(evt);
            }
        });
        jPanel2.add(poids, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 280, 28));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel7.setText("Pieces ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, 28));

        piece.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        piece.setPreferredSize(new java.awt.Dimension(360, 30));
        piece.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pieceKeyPressed(evt);
            }
        });
        jPanel2.add(piece, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 231, 28));

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jLabel8.setText("Stock");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 70, -1, 28));

        stockBox.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        stockBox.setPreferredSize(new java.awt.Dimension(72, 26));
        jPanel2.add(stockBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 622, 28));

        validerBtn.setBackground(new java.awt.Color(79, 139, 42));
        validerBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 139, 42), 25, true));
        validerBtn.setOpaque(false);
        validerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validerBtnMouseClicked(evt);
            }
        });
        validerBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Valider");
        validerBtn.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 30));

        jPanel2.add(validerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 140, 29));

        annulerBtn.setBackground(new java.awt.Color(223, 66, 53));
        annulerBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(223, 66, 53), 25, true));
        annulerBtn.setOpaque(false);
        annulerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                annulerBtnMouseClicked(evt);
            }
        });
        annulerBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Annuler");
        annulerBtn.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        jPanel2.add(annulerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 140, 29));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 277, 845, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void fournisseurTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fournisseurTextKeyPressed
        verify.verifyCaracter(fournisseurText, evt);
        

    }//GEN-LAST:event_fournisseurTextKeyPressed

    private void acheteurTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acheteurTextKeyPressed
        verify.verifyCaracter(acheteurText, evt);

    }//GEN-LAST:event_acheteurTextKeyPressed

    private void recepteurTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recepteurTextKeyPressed
        verify.verifyCaracter(recepteurText, evt);
    }//GEN-LAST:event_recepteurTextKeyPressed

    private void poidsBonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_poidsBonKeyPressed
        verify.verifyNamber(poidsBon, evt);
    }//GEN-LAST:event_poidsBonKeyPressed

    private void pieceBonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pieceBonKeyPressed
        verify.verifyNamber(pieceBon, evt);
    }//GEN-LAST:event_pieceBonKeyPressed

    private void poidsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_poidsKeyPressed
        verify.verifyNamber(poids, evt);
    }//GEN-LAST:event_poidsKeyPressed

    private void pieceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pieceKeyPressed
        verify.verifyNamber(piece, evt);
    }//GEN-LAST:event_pieceKeyPressed

    private void bouttonAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bouttonAjouterMouseClicked
        
        //confirmation conf = new confirmation(fournisseurText.getText() , acheteurText.getText() ,recepteurText.getText(), (String) bonOption.getSelectedItem(), poidsBon.getText(), pieceBon.getText());
        //conf.setVisible(true);
        int input = JOptionPane.showConfirmDialog(null, "Fournisseur: "+ fournisseurText.getText() +"\n Acheteur: "+ recepteurText.getText() +"\n Type de bon: "+ bonOption.getSelectedItem() +"\n Récepteur: "+ recepteurText.getText() +"\n Poids de bon: "+ poidsBon.getText() +"\n Pièces de bon: "+pieceBon.getText());
        if(input==0) enable(false);
        
    }//GEN-LAST:event_bouttonAjouterMouseClicked

    private void validerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerBtnMouseClicked
        if(poids.getText().isEmpty() || piece.getText().isEmpty())
             JOptionPane.showMessageDialog(null, "Viellez remplir les champs ","", JOptionPane.ERROR_MESSAGE);
        else JOptionPane.showMessageDialog(null, "AJOUTER ","", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_validerBtnMouseClicked

    private void annulerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annulerBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_annulerBtnMouseClicked

    private void actualiseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualiseBtnMouseClicked
        
        int input = JOptionPane.showConfirmDialog(null, "Est ce que vous avez terminer cette réception?");
        if(input==0){
             enable(true);
        
            fournisseurText.setText("");
            acheteurText.setText("");
            recepteurText.setText("");
            poidsBon.setText("");
            pieceBon.setText("");
        }
        
    }//GEN-LAST:event_actualiseBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acheteurText;
    private javax.swing.JPanel actualiseBtn;
    private javax.swing.JPanel annulerBtn;
    private javax.swing.JComboBox<String> bonOption;
    private javax.swing.JPanel bouttonAjouter;
    private javax.swing.JTextField fournisseurText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField piece;
    private javax.swing.JTextField pieceBon;
    private javax.swing.JTextField poids;
    private javax.swing.JTextField poidsBon;
    private javax.swing.JTextField recepteurText;
    private javax.swing.JComboBox<String> stockBox;
    private javax.swing.JPanel validerBtn;
    // End of variables declaration//GEN-END:variables
}
