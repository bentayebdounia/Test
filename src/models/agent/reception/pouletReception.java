/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package models.agent.reception;

import javax.swing.JPanel;
import models.ClasseVerification;

/**
 *
 * @author Dounia
 */
public class pouletReception extends javax.swing.JPanel {

    //ClasseVerification c = new ClasseVerification();
    
    public pouletReception() {
        initComponents();
        typePoulet.setVisible(false);
        
        
    }
   
    void SelectRadio(){
        
        
        
        
        
        if(entierRadio.isSelected()){
            
            typePoulet.setVisible(false);
            
            entierPouletPanel p=new entierPouletPanel();
            receptionMain.removeAll();
            receptionMain.add(p);
            p.setVisible(true);
            
        }
        else if(tranchierRadio.isSelected()){
                    typePoulet.setVisible(true);
                   
                    tranchierPouletPanel trp=new tranchierPouletPanel();
                    receptionMain.removeAll();
                    receptionMain.add(trp);
                    trp.setVisible(true);
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        entierRadio = new javax.swing.JRadioButton();
        tranchierRadio = new javax.swing.JRadioButton();
        receptionMain = new javax.swing.JPanel();
        typePoulet = new javax.swing.JComboBox<>();

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
        add(entierRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 25, -1, -1));

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
        add(tranchierRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 25, -1, -1));

        receptionMain.setBackground(new java.awt.Color(255, 255, 255));
        receptionMain.setPreferredSize(new java.awt.Dimension(700, 460));
        receptionMain.setLayout(new java.awt.GridLayout(1, 0));
        add(receptionMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 880, 520));

        typePoulet.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        typePoulet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tenders", "Wings", "Dips", "HotDog" }));
        add(typePoulet, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 25, 170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void entierRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entierRadioActionPerformed
        SelectRadio();
    }//GEN-LAST:event_entierRadioActionPerformed

    private void tranchierRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranchierRadioActionPerformed
        SelectRadio();
    }//GEN-LAST:event_tranchierRadioActionPerformed

    private void entierRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entierRadioMouseClicked
        
        
    }//GEN-LAST:event_entierRadioMouseClicked

    private void tranchierRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranchierRadioMouseClicked
        
    }//GEN-LAST:event_tranchierRadioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton entierRadio;
    private javax.swing.JPanel receptionMain;
    private javax.swing.JRadioButton tranchierRadio;
    private javax.swing.JComboBox<String> typePoulet;
    // End of variables declaration//GEN-END:variables
}
