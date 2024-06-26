/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class LaggTillAnstalldFrame extends javax.swing.JFrame {

    private InfDB idb;

    public LaggTillAnstalldFrame(InfDB idb) {
        this.idb = idb;
        initComponents();
        fyllPaComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFyllIUppgifterForDenNyaAnstallda = new javax.swing.JLabel();
        lblFornamn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAdress = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        lblEpost = new javax.swing.JLabel();
        adressText = new javax.swing.JTextField();
        fornamnText = new javax.swing.JTextField();
        epostText = new javax.swing.JTextField();
        efternamnText = new javax.swing.JTextField();
        lblAnstallningsdatum = new javax.swing.JLabel();
        lblAvdelning = new javax.swing.JLabel();
        lblTelefonnummer = new javax.swing.JLabel();
        anstallningsDatumText = new javax.swing.JTextField();
        telefonText = new javax.swing.JTextField();
        losenordText = new javax.swing.JTextField();
        btnLaggTill = new javax.swing.JButton();
        btnGenereraLosenord = new javax.swing.JButton();
        avdelningIdComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblFyllIUppgifterForDenNyaAnstallda.setText("Fyll i uppgifter för den nya anställda");

        lblFornamn.setText("Förnamn");

        jLabel2.setText("Efternamn");

        lblAdress.setText("Adress");

        lblLosenord.setText("Lösenord");

        lblEpost.setText("Epost");

        lblAnstallningsdatum.setText("Anställningsdatum");

        lblAvdelning.setText("Avdelning (ID)");

        lblTelefonnummer.setText("Telefonnummer");

        losenordText.setEnabled(false);

        btnLaggTill.setText("Lägg till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        btnGenereraLosenord.setText("Generera lösenord ");
        btnGenereraLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenereraLosenordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFyllIUppgifterForDenNyaAnstallda, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenereraLosenord)
                        .addGap(34, 34, 34)
                        .addComponent(btnLaggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adressText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(epostText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(efternamnText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fornamnText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anstallningsDatumText, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(telefonText, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(lblAnstallningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAvdelning, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(losenordText)
                            .addComponent(lblTelefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(avdelningIdComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblFornamn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblFyllIUppgifterForDenNyaAnstallda)
                        .addGap(30, 30, 30)
                        .addComponent(lblLosenord)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(losenordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fornamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAnstallningsdatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efternamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anstallningsDatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdress)
                    .addComponent(lblAvdelning))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avdelningIdComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEpost)
                    .addComponent(lblTelefonnummer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epostText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaggTill)
                    .addComponent(btnGenereraLosenord))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed

        try {
            // Hämtar all ifylld information om den nya användaren
            String fornamn = fornamnText.getText();
            String efternamn = efternamnText.getText();
            String adress = adressText.getText();
            String epost = epostText.getText();
            String telefon = telefonText.getText();
            String anstallningsdatum = anstallningsDatumText.getText();
            String losenord = losenordText.getText();
            String avdelning = (String) avdelningIdComboBox.getSelectedItem();
            String[] splitId = avdelning.split("-");
            String avdelningId = splitId[0];

            // Hämtar senaste aid från anställda och incrementerar med 1
            String latestAid = "SELECT AID FROM ngo_2024.anstalld ORDER BY AID DESC LIMIT 1";
            String currentAidNumber = idb.fetchSingle(latestAid);
            int intIncrement = Integer.parseInt(currentAidNumber);
            intIncrement++;

            // Validerar att alla inputfields har ett värde och är rätt datumformat
            isValidDate(anstallningsdatum);
            if (isValidDate(anstallningsdatum)) {
                if (!fornamn.equals("") && !efternamn.equals("") && !adress.equals("") && !epost.equals("") && !telefon.equals("") && !anstallningsdatum.equals("") && !losenord.equals("") && !avdelning.equals("")) {
                    // Skjuter anropet mot DB och skapar användaren, informerar användaren.
                    String insertAnstalld2 = "INSERT INTO ngo_2024.anstalld (aid, fornamn, efternamn, adress, epost, telefon, anstallningsdatum, losenord, avdelning) VALUES (" + intIncrement + ", '" + fornamn + "', '" + efternamn + "', '" + adress + "', '" + epost + "', '" + telefon + "', '" + anstallningsdatum + "', '" + losenord + "', '" + avdelningId + "')";
                    idb.insert(insertAnstalld2);
                    JOptionPane.showMessageDialog(null, "Ny användare är tillagd!", "Information", JOptionPane.INFORMATION_MESSAGE);
                    clearInputFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Du har inte fyllt i alla fällt, vänligen fyll i alla uppgifter", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnLaggTillActionPerformed
       //metod för
    private void fyllPaComboBox() {
        try {
            //Hämtar namn från avdelning
            String avdelningsNamn = "SELECT CONCAT(avdid, ' - ', namn) AS avd_info FROM ngo_2024.avdelning;";
            ArrayList<String> avdelningsnamn = idb.fetchColumn(avdelningsNamn);
            for (String detValdaAlternativet : avdelningsnamn) {
                avdelningIdComboBox.addItem(detValdaAlternativet);
            }
        } catch (InfException ex) {
            Logger.getLogger(LaggTillAnstalldFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void clearInputFields() {

        fornamnText.setText("");
        efternamnText.setText("");
        adressText.setText("");
        epostText.setText("");
        telefonText.setText("");
        anstallningsDatumText.setText("");
        losenordText.setText("");
        avdelningIdComboBox = null;
    }
      //metod som genererar ett lösenord
    private void btnGenereraLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenereraLosenordActionPerformed

        ArrayList<Character> tecken = new ArrayList<>();
        // Add letters A-Z
        for (char bokstaver = 'A'; bokstaver <= 'Z'; bokstaver++) {
            tecken.add(bokstaver);
        }
        // Add numbers 0-9
        for (int i = 0; i <= 9; i++) {
            tecken.add((char) ('0' + i));
        }
        int losenordLength = 11;
        StringBuilder losenord = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < losenordLength; i++) {
            int randomIndex = random.nextInt(tecken.size());
            losenord.append(tecken.get(randomIndex));
        }
        // Convert StringBuilder to String
        String genereratLosenord = losenord.toString();
        losenordText.setText(genereratLosenord);
    }//GEN-LAST:event_btnGenereraLosenordActionPerformed
//metod som kontrollerar att datumet skrivs i rätt format
    private boolean isValidDate(String dateString) {
        if (dateString.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Datumet är i fel format, vänligen använd YYYY-MM-DD formatet!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LaggTillAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LaggTillAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LaggTillAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LaggTillAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                // new LaggTillAnstalldFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adressText;
    private javax.swing.JTextField anstallningsDatumText;
    private javax.swing.JComboBox<String> avdelningIdComboBox;
    private javax.swing.JButton btnGenereraLosenord;
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JTextField efternamnText;
    private javax.swing.JTextField epostText;
    private javax.swing.JTextField fornamnText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblAnstallningsdatum;
    private javax.swing.JLabel lblAvdelning;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblFornamn;
    private javax.swing.JLabel lblFyllIUppgifterForDenNyaAnstallda;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JLabel lblTelefonnummer;
    private javax.swing.JTextField losenordText;
    private javax.swing.JTextField telefonText;
    // End of variables declaration//GEN-END:variables
}
