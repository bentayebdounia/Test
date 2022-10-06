/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package models.administrateur;

import models.ClasseVerification;

/**
 *
 * @author Dounia
 */
public class ModifierAgentPanel extends javax.swing.JPanel {

    ClasseVerification verify = new ClasseVerification();
    
    public ModifierAgentPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        adresse = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        roleBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(950, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(360, 30));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 410, 37));

        jComboBox1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nom", "Prénom", " " }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 109, 37));

        jScrollPane1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jTable1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Prénom", "Adresse", "Numéro de téléphone", "Rôle", "Mot de passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(240, 240, 240));
        jTable1.setSelectionBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 860, 168));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_30px.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 40, 30));

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel1.setText("Nom");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, 37));

        nom.setBackground(new java.awt.Color(240, 240, 240));
        nom.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        nom.setPreferredSize(new java.awt.Dimension(360, 30));
        nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomKeyPressed(evt);
            }
        });
        add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 280, 37));

        jLabel3.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel3.setText("Date de naissance");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, 37));

        prenom.setBackground(new java.awt.Color(240, 240, 240));
        prenom.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        prenom.setPreferredSize(new java.awt.Dimension(360, 30));
        prenom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prenomKeyPressed(evt);
            }
        });
        add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 280, 37));

        jLabel4.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel4.setText("Adresse");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, 37));

        adresse.setBackground(new java.awt.Color(240, 240, 240));
        adresse.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        adresse.setForeground(new java.awt.Color(255, 255, 255));
        adresse.setPreferredSize(new java.awt.Dimension(360, 30));
        add(adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 280, 37));

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel5.setText("N° téléphone");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, 37));

        telephone.setBackground(new java.awt.Color(240, 240, 240));
        telephone.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        telephone.setPreferredSize(new java.awt.Dimension(360, 30));
        telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telephoneKeyPressed(evt);
            }
        });
        add(telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 250, 37));

        passwordLabel.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        passwordLabel.setText("Mot de passe");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, -1, 37));

        passwordText.setBackground(new java.awt.Color(240, 240, 240));
        passwordText.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        passwordText.setPreferredSize(new java.awt.Dimension(360, 30));
        add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 250, 37));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel7.setText("Rôle");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, 37));

        jPanel3.setBackground(new java.awt.Color(79, 139, 42));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 139, 42), 30, true));
        jPanel3.setOpaque(false);
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MODIFIER");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 0, 90, 45));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 613, 268, 45));

        jLabel9.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(123, 23, 15));
        jLabel9.setText("Modifier un agent");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 36, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jLabel10.setText("Prénom");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, 37));

        jSpinner1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerDateModel());
        jSpinner1.setEditor(new javax.swing.JSpinner.DateEditor(jSpinner1, "yyyy-MM-dd"));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 280, 37));

        roleBox.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        roleBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent de saisie", "Agent simple", "Administrateur", "Modulateur ", " " }));
        roleBox.setPreferredSize(new java.awt.Dimension(72, 37));
        roleBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleBoxActionPerformed(evt);
            }
        });
        add(roleBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 250, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        
        
        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void nomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomKeyPressed
        // TODO add your handling code here:
        verify.verifyCaracter(nom, evt);
    }//GEN-LAST:event_nomKeyPressed

    private void prenomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prenomKeyPressed
        
        verify.verifyCaracter(prenom, evt);
    }//GEN-LAST:event_prenomKeyPressed

    private void telephoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telephoneKeyPressed
        verify.verifyNamber(telephone, evt);
    }//GEN-LAST:event_telephoneKeyPressed

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
    private javax.swing.JTextField adresse;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordText;
    private javax.swing.JTextField prenom;
    private javax.swing.JComboBox<String> roleBox;
    private javax.swing.JTextField telephone;
    // End of variables declaration//GEN-END:variables
}
