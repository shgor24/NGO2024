/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.*;
import java.util.Arrays;

public class AndraUppgifterOmEnAvdelningFrame extends javax.swing.JFrame {

    private InfDB idb;
    private String avdid;

    public AndraUppgifterOmEnAvdelningFrame(InfDB idb) {

        this.idb = idb;
        initComponents();
        fillComboBox();
        andraUppgift();
        bnsparaandringar.setText("Spara ändringar");
        bnsparaandringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnsparaandringarActionPerformed(evt);
            }
        });
    }

    private void fillComboBox() {
        try {
            List<String> avdelningar = idb.fetchColumn("SELECT avdid FROM Avdelning");
            if (avdelningar != null) {
                for (String avd : avdelningar) {
                    tfavdid.addItem(avd);
                }
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Error fetching department IDs: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        lnrubrik = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfnamn = new javax.swing.JTextField();
        tfbeskrivning = new javax.swing.JTextField();
        tfadress = new javax.swing.JTextField();
        tfepost = new javax.swing.JTextField();
        tftelefonnummer = new javax.swing.JTextField();
        tfstad = new javax.swing.JTextField();
        tfchef = new javax.swing.JTextField();
        bnsparaandringar = new javax.swing.JButton();
        tfavdid = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lnrubrik.setText("Ändra uppgifter avdelning");

        jLabel1.setText("Chef  ");

        jLabel2.setText("Välj avdelning");

        jLabel3.setText("Namn");

        jLabel4.setText("Beskrivning");

        jLabel5.setText("Adress");

        jLabel6.setText("Epost");

        jLabel7.setText("Telefonnummer");

        jLabel8.setText("Stad");

        bnsparaandringar.setText("Spara Ändringar");
        bnsparaandringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnsparaandringarActionPerformed(evt);
            }
        });

        tfavdid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfavdidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lnrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bnsparaandringar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfnamn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(tfavdid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfchef)
                            .addComponent(tfstad)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfbeskrivning, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfadress, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfepost, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tftelefonnummer, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lnrubrik))
                    .addComponent(bnsparaandringar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfavdid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfbeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfepost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tftelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfstad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfchef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//// Metod för de fält där man kan ändra värdet 

    public void andraUppgift() { //tf betyder textfield 
        try {
            avdid = (String) tfavdid.getSelectedItem();
            tfnamn.setText(idb.fetchSingle("SELECT namn FROM avdelning WHERE avdid = '" + avdid + "'"));
            tfbeskrivning.setText(idb.fetchSingle("SELECT beskrivning FROM avdelning WHERE avdid = '" + avdid + "'"));
            tfadress.setText(idb.fetchSingle("SELECT adress FROM avdelning WHERE avdid = '" + avdid + "'"));
            tfepost.setText(idb.fetchSingle("SELECT epost FROM avdelning WHERE avdid = '" + avdid + "'"));
            tftelefonnummer.setText(idb.fetchSingle("SELECT telefon FROM Avdelning WHERE avdid = '" + avdid + "'"));
            tfstad.setText(idb.fetchSingle("SELECT stad FROM Avdelning WHERE avdid = '" + avdid + "'"));
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
// validerar att fältet telefon tar in numeriska värden
    private void uppdateraUppgift() {
        String telefonVal = tftelefonnummer.getText();

        if (!isNumeric(telefonVal)) {
            JOptionPane.showMessageDialog(null, "Telefon måste vara ett numeriskt värde!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Skapa en lista med de textfält som behöver valideras
        List<JTextField> fieldsToValidate = Arrays.asList(tfnamn, tfadress, tfepost, tftelefonnummer, tfstad);

        // Validera fälten
        if (!Validering.valideraFalt(fieldsToValidate)) {
            // Om valideringen misslyckas, avbryt metodens exekvering
            return;
        }
        try {
            idb.update("UPDATE Avdelning SET namn = '" + tfnamn.getText() + "', adress = '" + tfadress.getText() + "', epost = '" + tfepost.getText() + "', telefon = '" + tftelefonnummer.getText() + "', stad = '" + tfstad.getText() + "' WHERE avdid = '" + avdid + "'");
            JOptionPane.showMessageDialog(null, "Ändringarna har sparats.");
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    // Metod som anropas när ComboBox för avdelnings-ID ändras
    private void tfavdidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfavdidActionPerformed
        andraUppgift();// Anropa metoden för att hämta och visa information om den valda avdelningen
    }//GEN-LAST:event_tfavdidActionPerformed

    private void bnsparaandringarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnsparaandringarActionPerformed
        String namn = tfnamn.getText();
        String beskrivning = tfbeskrivning.getText();
        String adress = tfadress.getText();
        String epost = tfepost.getText();
        String telefonnummer = tftelefonnummer.getText();
        String stad = tfstad.getText();

        // Kontrollera om något av fälten är tomt
        if (namn.isEmpty() || beskrivning.isEmpty() || adress.isEmpty() || epost.isEmpty() || telefonnummer.isEmpty() || stad.isEmpty()) {
            // Visa ett meddelande till användaren om att fylla i alla fält
            JOptionPane.showMessageDialog(this, "Var god fyll i alla fält.", "Tomma fält", JOptionPane.WARNING_MESSAGE);
        } else {
            // Om inga fält är tomma, uppdatera uppgifterna
            uppdateraUppgift();
        }
        
        
    }//GEN-LAST:event_bnsparaandringarActionPerformed
//metoden för validering för numeriska nummer
    private boolean isNumeric(String str) { // Metod för att kontrollera om en sträng är numerisk
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnAvdelningFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnAvdelningFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnAvdelningFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnAvdelningFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnAvdelningFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnAvdelningFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnAvdelningFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnAvdelningFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AndraUppgifterOmEnAvdelningFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnsparaandringar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lnrubrik;
    private javax.swing.JTextField tfadress;
    private javax.swing.JComboBox<String> tfavdid;
    private javax.swing.JTextField tfbeskrivning;
    private javax.swing.JTextField tfchef;
    private javax.swing.JTextField tfepost;
    private javax.swing.JTextField tfnamn;
    private javax.swing.JTextField tfstad;
    private javax.swing.JTextField tftelefonnummer;
    // End of variables declaration//GEN-END:variables
}
