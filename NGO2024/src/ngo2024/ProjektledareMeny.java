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

        bAnsProjekt = new javax.swing.JButton();
        jButton1SeAnstallda = new javax.swing.JButton();
        bSeAllaProjektAvd = new javax.swing.JButton();
        bSokEfterProjekt = new javax.swing.JButton();
        jButton1ListaOverHalMal = new javax.swing.JButton();
        bSeProjektJagAnsvararFor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bVisaKostnad = new javax.swing.JButton();
        bAvdProj = new javax.swing.JButton();
        bnAnsUpp = new javax.swing.JButton();
        bnHandAvd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        jButton1ListaOverHalMal.setText("Lista över hållbarhetsmål");
        jButton1ListaOverHalMal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ListaOverHalMalActionPerformed(evt);
            }
        });

        bSeProjektJagAnsvararFor.setText("Se och ändra de projekt jag ansvarar för");
        bSeProjektJagAnsvararFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSeProjektJagAnsvararForActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel1.setText("Välkommen till projektledaremenyn");

        bVisaKostnad.setText("Visa kostnadsstatistik för projekt");
        bVisaKostnad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVisaKostnadActionPerformed(evt);
            }
        });

        bAvdProj.setText("Se min avdelnings projekt");
        bAvdProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAvdProjActionPerformed(evt);
            }
        });

        bnAnsUpp.setText("Mina uppgifter");
        bnAnsUpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAnsUppActionPerformed(evt);
            }
        });

        bnHandAvd.setText("Handläggare på min avdelning");
        bnHandAvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnHandAvdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSeAllaProjektAvd)
                            .addComponent(bSokEfterProjekt)
                            .addComponent(bAnsProjekt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bVisaKostnad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1ListaOverHalMal)
                            .addComponent(jButton1SeAnstallda))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bSeProjektJagAnsvararFor)
                            .addComponent(bnAnsUpp, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bnHandAvd, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAvdProj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(14, 14, 14))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAnsProjekt)
                    .addComponent(jButton1ListaOverHalMal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSokEfterProjekt)
                    .addComponent(jButton1SeAnstallda))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSeAllaProjektAvd)
                    .addComponent(bVisaKostnad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSeProjektJagAnsvararFor)
                    .addComponent(bAvdProj))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnAnsUpp)
                    .addComponent(bnHandAvd))
                .addContainerGap(53, Short.MAX_VALUE))
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

    private void jButton1ListaOverHalMalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ListaOverHalMalActionPerformed
 ListaoverHallbarhetsmal listaoverHallbarhetsmal = new ListaoverHallbarhetsmal(idb);
        listaoverHallbarhetsmal.setVisible(true);                                            
    }//GEN-LAST:event_jButton1ListaOverHalMalActionPerformed

    private void bSeProjektJagAnsvararForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSeProjektJagAnsvararForActionPerformed
        ListaProjektAnsvar listaProjekt = new ListaProjektAnsvar(idb, aid);
        listaProjekt.setVisible(true);
    }//GEN-LAST:event_bSeProjektJagAnsvararForActionPerformed

    private void bVisaKostnadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVisaKostnadActionPerformed
        KostnadsStatistik kostnad = new KostnadsStatistik(idb, aid);
        kostnad.setVisible(true);
    }//GEN-LAST:event_bVisaKostnadActionPerformed

    private void bAvdProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAvdProjActionPerformed
        Projektstatus projektstatus = new Projektstatus (idb,aid);
        projektstatus.hamtaAllaProjekt();
        projektstatus.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_bAvdProjActionPerformed

    private void bnAnsUppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAnsUppActionPerformed
        AndraMinaUppgifter andraminauppgifter = new AndraMinaUppgifter(idb, aid);
        andraminauppgifter.andraUppgift();
        andraminauppgifter.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_bnAnsUppActionPerformed

    private void bnHandAvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnHandAvdActionPerformed
        HandlaggareSokning  handlaggaresokning = new HandlaggareSokning(idb, aid);
        handlaggaresokning.setVisible(true);
    }//GEN-LAST:event_bnHandAvdActionPerformed

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
    private javax.swing.JButton bAvdProj;
    private javax.swing.JButton bSeAllaProjektAvd;
    private javax.swing.JButton bSeProjektJagAnsvararFor;
    private javax.swing.JButton bSokEfterProjekt;
    private javax.swing.JButton bVisaKostnad;
    private javax.swing.JButton bnAnsUpp;
    private javax.swing.JButton bnHandAvd;
    private javax.swing.JButton jButton1ListaOverHalMal;
    private javax.swing.JButton jButton1SeAnstallda;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
