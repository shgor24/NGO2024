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
public class HandläggareMeny extends javax.swing.JFrame {
    
    private InfDB idb;
    private String aid;

    /**
     * Creates new form HandläggareMeny
     */
    public HandläggareMeny(String aid, InfDB idb) {
        this.aid = aid;
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
        bAnsProjekt = new javax.swing.JButton();
        bAvdProj = new javax.swing.JButton();
        bAnsAvd = new javax.swing.JButton();
        bAnsUpp = new javax.swing.JButton();
        bSeAllaProjektAvdelning = new javax.swing.JButton();
        bSokEfterProjekt = new javax.swing.JButton();
        jButton1ListaOverHalMal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Detta är handläggare menyn");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        bAnsProjekt.setText("Se mina projekt");
        bAnsProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnsProjektActionPerformed(evt);
            }
        });

        bAvdProj.setText("Se min avdelnings projekt");
        bAvdProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAvdProjActionPerformed(evt);
            }
        });

        bAnsAvd.setText("Handläggare på min avdelning");
        bAnsAvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnsAvdActionPerformed(evt);
            }
        });

        bAnsUpp.setText("Mina uppgifter");

        bSeAllaProjektAvdelning.setText("Se alla projekt på min avdelning");
        bSeAllaProjektAvdelning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSeAllaProjektAvdelningActionPerformed(evt);
            }
        });

        bSokEfterProjekt.setText("Sök efter projekt på datum");
        bSokEfterProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSokEfterProjektActionPerformed(evt);
            }
        });

        jButton1ListaOverHalMal.setText("Lista Över Hållbarhetsmål");
        jButton1ListaOverHalMal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ListaOverHalMalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSeAllaProjektAvdelning)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1ListaOverHalMal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bAnsProjekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bAnsUpp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bAnsAvd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bAvdProj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(bSokEfterProjekt))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAnsProjekt)
                    .addComponent(bAvdProj))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAnsAvd)
                    .addComponent(bAnsUpp))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSeAllaProjektAvdelning)
                    .addComponent(jButton1ListaOverHalMal))
                .addGap(18, 18, 18)
                .addComponent(bSokEfterProjekt)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void bAnsProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnsProjektActionPerformed
        ProjektMenyAnstalld projektMeny = new ProjektMenyAnstalld(idb, aid);
        projektMeny.hamtaAllaProjekt();
        projektMeny.setVisible(true);
    }//GEN-LAST:event_bAnsProjektActionPerformed

    private void bAvdProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAvdProjActionPerformed
       Projektstatus projektstatus = new Projektstatus (idb,aid);
       projektstatus.hamtaAllaProjekt();
       projektstatus.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_bAvdProjActionPerformed

    private void personalPaAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalPaAvdelningActionPerformed
        
    }//GEN-LAST:event_personalPaAvdelningActionPerformed

    private void bAnsAvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnsAvdActionPerformed
        PersonalPa anstalld = new PersonalPa (idb, aid); 
        anstalld.setVisible (true);
    }//GEN-LAST:event_bAnsAvdActionPerformed

    private void bSeAllaProjektAvdelningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSeAllaProjektAvdelningActionPerformed
        ProjektMenyAvdelning projektMenyAvdelning = new ProjektMenyAvdelning(idb, aid);
        projektMenyAvdelning.setVisible(true);
    }//GEN-LAST:event_bSeAllaProjektAvdelningActionPerformed

    private void bSokEfterProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSokEfterProjektActionPerformed
        DatumProjektSok projektDatumSok = new DatumProjektSok(idb, aid);
        projektDatumSok.setVisible(true);
    }//GEN-LAST:event_bSokEfterProjektActionPerformed

    private void jButton1ListaOverHalMalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ListaOverHalMalActionPerformed
        ListaoverHallbarhetsmal listaoverHallbarhetsmal = new ListaoverHallbarhetsmal(idb);
        listaoverHallbarhetsmal.setVisible(true);                                            
    }//GEN-LAST:event_jButton1ListaOverHalMalActionPerformed
// DefaultListModel<String> lista = new DefaultListModel<>();
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
            java.util.logging.Logger.getLogger(HandläggareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HandläggareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HandläggareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HandläggareMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new HandläggareMeny().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnsAvd;
    private javax.swing.JButton bAnsProjekt;
    private javax.swing.JButton bAnsUpp;
    private javax.swing.JButton bAvdProj;
    private javax.swing.JButton bSeAllaProjektAvdelning;
    private javax.swing.JButton bSokEfterProjekt;
    private javax.swing.JButton jButton1ListaOverHalMal;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
