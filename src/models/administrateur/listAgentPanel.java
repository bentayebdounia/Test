/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package models.administrateur;

/**
 *
 * @author Dounia
 */
public class listAgentPanel extends javax.swing.JPanel {

    /**
     * Creates new form listAgentPanel
     */
    public listAgentPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        Text_recherche = new javax.swing.JTextField();
        rechercheIcon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(950, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nom", "Prénom", "Rôle", " " }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 109, 37));

        Text_recherche.setBackground(new java.awt.Color(240, 240, 240));
        Text_recherche.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        Text_recherche.setForeground(new java.awt.Color(255, 255, 255));
        Text_recherche.setPreferredSize(new java.awt.Dimension(360, 30));
        add(Text_recherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 410, 37));

        rechercheIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_30px.png"))); // NOI18N
        add(rechercheIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(123, 23, 15));
        jLabel7.setText("Liste des agents");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 36, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 860, 440));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Text_recherche;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel rechercheIcon;
    // End of variables declaration//GEN-END:variables
}