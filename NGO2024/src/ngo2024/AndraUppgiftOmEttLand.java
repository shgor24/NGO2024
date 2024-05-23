/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;


import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;

public class AndraUppgiftOmEttLand extends javax.swing.JFrame {
    
     private InfDB idb;
    private String lid;

   
    public AndraUppgiftOmEttLand(InfDB idb, String lid) {
        this.idb = idb;
        this.lid = lid;
        
        initComponents();
        andrauppgift();
        
        
        
        
        
        bnsparaandringar.setText("Spara");
        bnsparaandringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnsparaandringarActionPerformed(evt);
            }
        });
    }    
    public void andrauppgift() {
        try {
            tfLid.setText(lid);
            tfNamn.setText(idb.fetchSingle("SELECT namn FROM Land WHERE lid = '" + lid + "'"));
            tfSprak.setText(idb.fetchSingle("SELECT sprak FROM Land WHERE lid = '" + lid + "'"));
            tfValuta.setText(idb.fetchSingle("SELECT valuta FROM Land WHERE lid = '" + lid + "'"));
            tfTidzon.setText(idb.fetchSingle("SELECT tidszon FROM Land WHERE lid = '" + lid + "'"));
            tfPs.setText(idb.fetchSingle("SELECT politisk_struktur FROM Land WHERE lid = '" + lid + "'"));
            tfEkonomi.setText(idb.fetchSingle("SELECT ekonomi FROM Land WHERE lid = '" + lid + "'"));
        
        
        } catch (InfException ex) {
            
            System.out.println(ex.getMessage());
            
        }
    }
    
    private void uppdateraUppgift() { // Metod för att uppdatera landets uppgifter i databasen
        try {
            idb.update("UPDATE Land SET namn = '" + tfNamn.getText() + "', sprak = '" + tfSprak.getText() + "', valuta = '" + tfValuta.getText() + "', tidszon = '" + tfTidzon.getText() + "', politisk_struktur = '" + tfPs.getText() + "', ekonomi = '" + tfEkonomi.getText() + "' WHERE lid = '" + lid + "'");
            
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbLid = new javax.swing.JLabel();
        lbNamn = new javax.swing.JLabel();
        lbSprak = new javax.swing.JLabel();
        lbValuta = new javax.swing.JLabel();
        lbTidzon = new javax.swing.JLabel();
        lbPs = new javax.swing.JLabel();
        lbEkonomi = new javax.swing.JLabel();
        tfLid = new javax.swing.JTextField();
        tfNamn = new javax.swing.JTextField();
        tfSprak = new javax.swing.JTextField();
        tfValuta = new javax.swing.JTextField();
        tfTidzon = new javax.swing.JTextField();
        tfPs = new javax.swing.JTextField();
        tfEkonomi = new javax.swing.JTextField();
        bnsparaandringar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Uppgifter om land");

        lbLid.setText("LID");

        lbNamn.setText("Namn");

        lbSprak.setText("Språk");

        lbValuta.setText("Valuta ");

        lbTidzon.setText("Tidzon");

        lbPs.setText("Politisk struktur");

        lbEkonomi.setText("Ekonomi");

        tfLid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLidActionPerformed(evt);
            }
        });

        tfNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamnActionPerformed(evt);
            }
        });

        tfSprak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSprakActionPerformed(evt);
            }
        });

        tfValuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValutaActionPerformed(evt);
            }
        });

        tfPs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPsActionPerformed(evt);
            }
        });

        bnsparaandringar.setText("Spara");
        bnsparaandringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnsparaandringarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLid)
                            .addComponent(lbNamn)
                            .addComponent(lbSprak)
                            .addComponent(lbValuta)
                            .addComponent(lbTidzon)
                            .addComponent(lbPs)
                            .addComponent(lbEkonomi))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEkonomi)
                            .addComponent(tfPs)
                            .addComponent(tfTidzon)
                            .addComponent(tfValuta)
                            .addComponent(tfSprak)
                            .addComponent(tfNamn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfLid, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bnsparaandringar)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLid)
                    .addComponent(tfLid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNamn)
                    .addComponent(tfNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSprak)
                    .addComponent(tfSprak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValuta)
                    .addComponent(tfValuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTidzon)
                    .addComponent(tfTidzon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPs)
                    .addComponent(tfPs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEkonomi)
                    .addComponent(tfEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnsparaandringar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamnActionPerformed

    private void tfPsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPsActionPerformed

    private void tfSprakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSprakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSprakActionPerformed

    private void tfValutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValutaActionPerformed
 
// Metod som hanterar händelsen när användaren klickar på knappen för att spara ändringar
    private void bnsparaandringarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnsparaandringarActionPerformed
      
    String namn = tfNamn.getText();
    String sprak = tfSprak.getText();
    String valuta = tfValuta.getText();
    String tidzon = tfTidzon.getText();
    String politiskStruktur = tfPs.getText();
    String ekonomi = tfEkonomi.getText();

    // Kontrollera om något av fälten är tomt
    if (namn.isEmpty() || sprak.isEmpty() || valuta.isEmpty() || tidzon.isEmpty() || politiskStruktur.isEmpty() || ekonomi.isEmpty()) {
        // Visa ett meddelande till användaren om att fylla i alla fält
        JOptionPane.showMessageDialog(this, "Var god fyll i alla fält.", "Tomma fält", JOptionPane.WARNING_MESSAGE);
    } else {
        // Om inga fält är tomma, uppdatera uppgifterna
        uppdateraUppgift();
    }
        uppdateraUppgift();  
    }//GEN-LAST:event_bnsparaandringarActionPerformed

    private void tfLidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLidActionPerformed

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
            java.util.logging.Logger.getLogger(AndraUppgiftOmEttLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraUppgiftOmEttLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraUppgiftOmEttLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraUppgiftOmEttLand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new AndraUppgiftOmEttLand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnsparaandringar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbEkonomi;
    private javax.swing.JLabel lbLid;
    private javax.swing.JLabel lbNamn;
    private javax.swing.JLabel lbPs;
    private javax.swing.JLabel lbSprak;
    private javax.swing.JLabel lbTidzon;
    private javax.swing.JLabel lbValuta;
    private javax.swing.JTextField tfEkonomi;
    private javax.swing.JTextField tfLid;
    private javax.swing.JTextField tfNamn;
    private javax.swing.JTextField tfPs;
    private javax.swing.JTextField tfSprak;
    private javax.swing.JTextField tfTidzon;
    private javax.swing.JTextField tfValuta;
    // End of variables declaration//GEN-END:variables
}
