/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author sheny
 */
public class ProjektledareMeny extends javax.swing.JFrame {
    
    private InfDB idb;
    private String aid;

    /**
     * Creates new form ProjektledareMeny
     */
    public ProjektledareMeny(InfDB idb, String aid) {
        this.idb = idb;
        this.aid = aid;
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
        bAnsProjekt = new javax.swing.JButton();
        jButton1SeAnstallda = new javax.swing.JButton();
        bSeAllaProjektAvd = new javax.swing.JButton();
        bSokEfterProjekt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Detta är projektledare menyn");

        bAnsProjekt.setText("Se mina projekt");
        bAnsProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnsProjektActionPerformed(evt);
            }
        });

        jButton1SeAnstallda.setLabel("Anställda på min avdelning");
        jButton1SeAnstallda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SeAnstalldaActionPerformed(evt);
            }
        });

        bSeAllaProjektAvd.setText("Se alla projekt på min avdelning");
        bSeAllaProjektAvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSeAllaProjektAvdActionPerformed(evt);
            }
        });

        bSokEfterProjekt.setText("Sök efter projekt på datum");
        bSokEfterProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSokEfterProjektActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bSokEfterProjekt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bSeAllaProjektAvd)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAnsProjekt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1SeAnstallda, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAnsProjekt)
                    .addComponent(jButton1SeAnstallda))
                .addGap(39, 39, 39)
                .addComponent(bSeAllaProjektAvd)
                .addGap(27, 27, 27)
                .addComponent(bSokEfterProjekt)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAnsProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnsProjektActionPerformed
        ProjektMenyAnstalld projektMeny = new ProjektMenyAnstalld(idb, aid);
        projektMeny.hamtaAllaProjekt();
        projektMeny.setVisible(true);
    }//GEN-LAST:event_bAnsProjektActionPerformed

    private void jButton1SeAnstalldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SeAnstalldaActionPerformed
    PersonalPa anstalld = new PersonalPa (idb, aid); 
    anstalld.setVisible (true);
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1SeAnstalldaActionPerformed

    private void bSeAllaProjektAvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSeAllaProjektAvdActionPerformed
        ProjektMenyAvdelning projektMenyAvdelning = new ProjektMenyAvdelning(idb, aid);
        projektMenyAvdelning.setVisible(true);
    }//GEN-LAST:event_bSeAllaProjektAvdActionPerformed

    private void bSokEfterProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSokEfterProjektActionPerformed
        DatumProjektSok projektDatumSok = new DatumProjektSok(idb, aid);
        projektDatumSok.setVisible(true);
    }//GEN-LAST:event_bSokEfterProjektActionPerformed

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
            java.util.logging.Logger.getLogger(ProjektledareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjektledareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjektledareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjektledareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ProjektledareMeny().setVisible(true);
            }
        });
    }
    private void personalPaAvdelningActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        PersonalPa anstalld = new PersonalPa (idb, aid); 
        anstalld.setVisible (true);
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnsProjekt;
    private javax.swing.JButton bSeAllaProjektAvd;
    private javax.swing.JButton bSokEfterProjekt;
    private javax.swing.JButton jButton1SeAnstallda;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
