/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import ngo2024.AndraUppgifterOmEttProjektFrame;
import ngo2024.AndraUppgifterProjektSelect;
import ngo2024.LaggTillAnstalldFrame;
import ngo2024.LaggTillProjektFrame;
import ngo2024.SeUppgifterOmEttProjektFrame;
import ngo2024.TaBortAnstalldFrame;
import ngo2024.TaBortProjektFrame;
import oru.inf.InfDB;
//import oru.inf.InfException;

/**
 *
 * @author sheny
 */
public class AdministratorMeny extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form AdministratorMeny
     */
    public AdministratorMeny(InfDB idb) {
        this.idb = idb;
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbValdAnstalld = new javax.swing.JComboBox<>();
        cbValdProjekt = new javax.swing.JComboBox<>();
        cbValdAvdelning = new javax.swing.JComboBox<>();
        cbValdPartner = new javax.swing.JComboBox<>();
        cbValdLand = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Detta är administrator menyn");

        jLabel1.setText("Anställda");

        jLabel2.setText("Projekt");

        jLabel3.setText("Avdelning");

        jLabel4.setText("Partner");

        jLabel5.setText("Land");

        cbValdAnstalld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lägg till anställd/Generera lösenord för ny anställd", "Ta bort anställd", " " }));
        cbValdAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValdAnstalldActionPerformed(evt);
            }
        });

        cbValdProjekt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lägg till projekt", "Ta bort projekt", "Ändra uppgifter om ett projekt", "Se uppgifter om projektansvarig" }));
        cbValdProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValdProjektActionPerformed(evt);
            }
        });

        cbValdAvdelning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lägg till avdelning", "Ändra uppgifter om en avdelning" }));

        cbValdPartner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lägg till/Ta bort partner", "Ändra uppgifter om en partner" }));

        cbValdLand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lägg till land", "Ändra uppgifter för ett land" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbValdAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(cbValdProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cbValdAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(cbValdPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbValdLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbValdAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbValdProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbValdAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbValdPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbValdLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbValdAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValdAnstalldActionPerformed

        String detValdaAlternativet = (String)cbValdAnstalld.getSelectedItem();
        
        if (detValdaAlternativet.equals("Lägg till anställd/Generera lösenord för ny anställd" + "")) {
            new LaggTillAnstalldFrame(idb).setVisible(true);
        }

        if (detValdaAlternativet.equals("Ta bort anställd" + "")) {
            new TaBortAnstalldFrame(idb).setVisible(true);

        }
        
        
    }//GEN-LAST:event_cbValdAnstalldActionPerformed

    private void cbValdProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValdProjektActionPerformed
        String detValdaAlternativet = (String) cbValdProjekt.getSelectedItem();
        if (detValdaAlternativet.equals("Lägg till projekt" + "")) {
            new LaggTillProjektFrame(idb).setVisible(true);
        } else if (detValdaAlternativet.equals("Ta bort projekt" +"")){
            new TaBortProjektFrame(idb).setVisible(true);
        } else if (detValdaAlternativet.equals("Ändra uppgifter om ett projekt" + "")) {
            new AndraUppgifterProjektSelect(idb).setVisible(true);
        } else if (detValdaAlternativet.equals("Se uppgifter om projektansvarig" + "")) {
            new SeUppgifterOmEttProjektFrame().setVisible(true);
        }

    }//GEN-LAST:event_cbValdProjektActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdministratorMeny().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbValdAnstalld;
    private javax.swing.JComboBox<String> cbValdAvdelning;
    private javax.swing.JComboBox<String> cbValdLand;
    private javax.swing.JComboBox<String> cbValdPartner;
    private javax.swing.JComboBox<String> cbValdProjekt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
