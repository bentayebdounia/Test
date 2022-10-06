/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package models;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import models.administrateur.administrateur_menu;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Alfec Informatique 2
 */
public class Authentification extends javax.swing.JFrame {

    
    ClasseVerification c = new ClasseVerification();
    
    public Authentification() {
        initComponents();
        this.setResizable(false);
        jPanel2.setBackground(new Color(123, 23, 15, 100));
        //connecterBTN.setBackground(new Color(123, 23, 15, 100));
        c.scalImage(imageLabel, "/icons/berger.jpg");
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        connecterBTN = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Authentification");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(123, 23, 15));
        jPanel2.setPreferredSize(new java.awt.Dimension(875, 580));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mot de passe");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, 37));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 242, -1, 37));

        ID.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel2.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 242, 355, 37));

        connecterBTN.setBackground(new java.awt.Color(123, 23, 15));
        connecterBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 30, true));
        connecterBTN.setOpaque(false);
        connecterBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connecterBTNMouseClicked(evt);
            }
        });
        connecterBTN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel5.setText("CONNECTER");
        connecterBTN.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 120, 56));

        jPanel2.add(connecterBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 410, 226, 56));

        Password.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 330, 355, 37));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 725, 700));
        jPanel1.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Fonction pour vérifier les champs  
    boolean verify(JTextField ID , JPasswordField password){
        if (ID.getText().isEmpty() && password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Entrer votre ID et Mot de passe","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (ID.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Entrer votre ID ","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       if ( Password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Entrer votre  Mot de passe","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void connecterBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connecterBTNMouseClicked
        // TODO add your handling code here:
        if(verify(ID , Password)){
            administrateur_menu ad = new administrateur_menu();
            ad.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_connecterBTNMouseClicked

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
           UIManager.setLookAndFeel(new FlatIntelliJLaf());
           //org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
       } catch (Exception e){
           e.printStackTrace();
       }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel connecterBTN;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
