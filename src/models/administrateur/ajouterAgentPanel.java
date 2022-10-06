/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package models.administrateur;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.ClasseVerification;

/**
 *
 * @author Alfec Informatique 2
 */
public class ajouterAgentPanel extends javax.swing.JPanel {

    ClasseVerification verify = new ClasseVerification();
    
    public ajouterAgentPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupAgent = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nomText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        prenomText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JTextField();
        bouttonAjouter = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adresseText = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        passwordLabel1 = new javax.swing.JLabel();
        roleBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(950, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel1.setText("Nom");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, 37));

        nomText.setBackground(new java.awt.Color(240, 240, 240));
        nomText.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        nomText.setPreferredSize(new java.awt.Dimension(360, 30));
        nomText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomTextKeyPressed(evt);
            }
        });
        add(nomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 615, 37));

        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel2.setText("Prénom");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, 37));

        prenomText.setBackground(new java.awt.Color(240, 240, 240));
        prenomText.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        prenomText.setPreferredSize(new java.awt.Dimension(360, 30));
        prenomText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prenomTextKeyPressed(evt);
            }
        });
        add(prenomText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 615, 37));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel3.setText("Adresse");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, 37));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel4.setText("N° telephone");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, 37));

        telText.setBackground(new java.awt.Color(240, 240, 240));
        telText.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        telText.setPreferredSize(new java.awt.Dimension(360, 30));
        telText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telTextKeyPressed(evt);
            }
        });
        add(telText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 615, 37));

        passwordLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        passwordLabel.setText("Mot de passe");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, 37));

        passwordText.setBackground(new java.awt.Color(240, 240, 240));
        passwordText.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        passwordText.setPreferredSize(new java.awt.Dimension(360, 30));
        add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 615, 37));

        bouttonAjouter.setBackground(new java.awt.Color(79, 139, 42));
        bouttonAjouter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 139, 42), 30, true));
        bouttonAjouter.setOpaque(false);
        bouttonAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bouttonAjouterMouseClicked(evt);
            }
        });
        bouttonAjouter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AJOUTER");
        bouttonAjouter.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 45));

        add(bouttonAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 615, 268, 45));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel5.setText("Date de naissance");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 37));

        adresseText.setBackground(new java.awt.Color(240, 240, 240));
        adresseText.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        adresseText.setPreferredSize(new java.awt.Dimension(360, 30));
        adresseText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adresseTextKeyPressed(evt);
            }
        });
        add(adresseText, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 615, 37));

        jSpinner1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerDateModel());
        jSpinner1.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner1, "yyyy-MM-dd"));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 615, 37));

        passwordLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        passwordLabel1.setText("Role");
        add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, 37));

        roleBox.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        roleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent de saisie", "Agent simple", "Administrateur", "Modulateur ", " " }));
        roleBox.setPreferredSize(new java.awt.Dimension(72, 37));
        roleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleBoxActionPerformed(evt);
            }
        });
        add(roleBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 615, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(123, 23, 15));
        jLabel7.setText("Ajouter un agent");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 36, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    
    //Fonction pour vérifier les champs  
    boolean feildsVerify( JTextField nom , JTextField prenom , JTextField adresse , JTextField NumTel){
        
        if (nom.getText().isEmpty() && ( prenom.getText().isEmpty()==false && adresse.getText().isEmpty()==false  && NumTel.getText().isEmpty()==false)){
            JOptionPane.showMessageDialog(null, "Veillez remplir le nom ","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       if ( prenom.getText().isEmpty() && ( nom.getText().isEmpty()==false && adresse.getText().isEmpty()==false  && NumTel.getText().isEmpty()==false)){
            JOptionPane.showMessageDialog(null, "Entrer votre le prénom","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       if ( adresse.getText().isEmpty() && ( nom.getText().isEmpty()==false && prenom.getText().isEmpty()==false  && NumTel.getText().isEmpty()==false)){
            JOptionPane.showMessageDialog(null, "Entrer votre l'adresse","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       
       if ( NumTel.getText().isEmpty() && ( nom.getText().isEmpty()==false && prenom.getText().isEmpty()==false  && adresse.getText().isEmpty()==false)){
            JOptionPane.showMessageDialog(null, "Entrer votre le numéro de téléphone","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       
        if ( nom.getText().isEmpty()  && prenom.getText().isEmpty() && adresse.getText().isEmpty()  && NumTel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Veillez remplir les champs ","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if ( nom.getText().isEmpty()  || prenom.getText().isEmpty() || adresse.getText().isEmpty()  || NumTel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Veillez remplir les champs ","", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        
       
        return true;
    }
    
    
   
    
    private void bouttonAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bouttonAjouterMouseClicked
      
        if(feildsVerify (nomText, prenomText, adresseText, telText)==true) {
           if(roleBox.getSelectedItem()=="Agent simple"){
             if(verify.PassewordVerify(passwordText))  
               JOptionPane.showMessageDialog(null, "ajouter","", JOptionPane.INFORMATION_MESSAGE);
           } 
           else{
               
               JOptionPane.showMessageDialog(null, "ajouter","", JOptionPane.INFORMATION_MESSAGE);
           } 
           
                
       }
       
    }//GEN-LAST:event_bouttonAjouterMouseClicked

    private void nomTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomTextKeyPressed
       
        verify.verifyCaracter( nomText, evt);
        
    }//GEN-LAST:event_nomTextKeyPressed

    private void prenomTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomTextKeyPressed
       verify.verifyCaracter( prenomText, evt);
        
    }//GEN-LAST:event_prenomTextKeyPressed
        
    private void telTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telTextKeyPressed
        
        verify.verifyNamber(telText , evt);
        
    }//GEN-LAST:event_telTextKeyPressed

    private void adresseTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adresseTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresseTextKeyPressed

    private void roleBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleBoxActionPerformed
        if (roleBox.getSelectedItem()=="Agent simple"){
            passwordText.setVisible(false);
            passwordLabel.setVisible(false);
        }
        else {
            passwordText.setVisible(true);
            passwordLabel.setVisible(true);
        }
            
    }//GEN-LAST:event_roleBoxActionPerformed
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupAgent;
    private javax.swing.JTextField adresseText;
    private javax.swing.JPanel bouttonAjouter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField nomText;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JTextField passwordText;
    private javax.swing.JTextField prenomText;
    private javax.swing.JComboBox<String> roleBox;
    private javax.swing.JTextField telText;
    // End of variables declaration//GEN-END:variables
}
