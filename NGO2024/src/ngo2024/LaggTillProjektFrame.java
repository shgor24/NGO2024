/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LaggTillProjektFrame extends javax.swing.JFrame {

    private InfDB idb;

    public LaggTillProjektFrame(InfDB idb) {
        this.idb = idb;
        initComponents();
        fyllPaComboBoxChef();
        fyllPaComboBoxLand();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLaggTill = new javax.swing.JButton();
        projektnamnText = new javax.swing.JTextField();
        lblProjektnamn = new javax.swing.JLabel();
        lblBeskrivning = new javax.swing.JLabel();
        beskrivningText = new javax.swing.JTextField();
        lblStartdatum = new javax.swing.JLabel();
        lblSlutdatum = new javax.swing.JLabel();
        slutdatumText = new javax.swing.JTextField();
        startdatumText = new javax.swing.JTextField();
        lblKostnader = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        kostnaderText = new javax.swing.JTextField();
        lblPrioritet = new javax.swing.JLabel();
        lblProjektchef = new javax.swing.JLabel();
        lblLand = new javax.swing.JLabel();
        lblFyllIUppgifterForDetNyaProjektet = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        prioritetComboBox = new javax.swing.JComboBox<>();
        projektchefComboBox = new javax.swing.JComboBox<>();
        landComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnLaggTill.setText("Lägg till");
        btnLaggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillActionPerformed(evt);
            }
        });

        lblProjektnamn.setText("Projektnamn");

        lblBeskrivning.setText("Beskrivning");

        lblStartdatum.setText("Startdatum");

        lblSlutdatum.setText("Slutdatum");

        lblKostnader.setText("Kostnader");

        lblStatus.setText("Status");

        lblPrioritet.setText("Prioritet");

        lblProjektchef.setText("Projektchef");

        lblLand.setText("Land");

        lblFyllIUppgifterForDetNyaProjektet.setText("Fyll i uppgifter för det nya projektet");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pågående", "Planerat", "Avslutat" }));

        prioritetComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hög", "Medel", "Låg" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLand, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projektnamnText)
                    .addComponent(beskrivningText)
                    .addComponent(startdatumText)
                    .addComponent(slutdatumText)
                    .addComponent(landComboBox, 0, 142, Short.MAX_VALUE))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projektchefComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKostnader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLaggTill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prioritetComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kostnaderText)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrioritet, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblProjektchef, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 85, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFyllIUppgifterForDetNyaProjektet, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblFyllIUppgifterForDetNyaProjektet)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(projektnamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBeskrivning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(beskrivningText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStartdatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSlutdatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slutdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(landComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblKostnader, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kostnaderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrioritet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prioritetComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblProjektchef)
                                .addGap(22, 22, 22))
                            .addComponent(projektchefComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(btnLaggTill)))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillActionPerformed
        try {
            // Hämtar all ifylld information om det nya projektet
            String projektnamn = projektnamnText.getText();
            String beskrivning = beskrivningText.getText();
            String startdatum = startdatumText.getText();
            String slutdatum = slutdatumText.getText();
            String kostnad = kostnaderText.getText();
            Object status = statusComboBox.getSelectedItem();
            Object prioritet = prioritetComboBox.getSelectedItem();

            String projektchef = (String) projektchefComboBox.getSelectedItem();
            String projektchefId = projektchef.toString().replaceAll("\\D+", "");

            String land = (String) landComboBox.getSelectedItem();
            String landId = land.toString().replaceAll("\\D+", "");

            // Hämtar senaste pid från projekt och incrementerar med 1
            String latestPid = "SELECT PID FROM ngo_2024.projekt ORDER BY PID DESC LIMIT 1";
            String currentPidNumber = idb.fetchSingle(latestPid);
            int intIncrement = Integer.parseInt(currentPidNumber);
            intIncrement++;

            // Validerar att alla inputfields har ett värde och är rätt datumformat
            isValidDate(startdatum);
            isValidDate(slutdatum);
            if (!projektnamn.equals("") && !beskrivning.equals("") && !startdatum.equals("") && !slutdatum.equals("") && !kostnad.equals("") && !status.equals("") && !prioritet.equals("") && !projektchef.equals("") && !land.equals("")) {
                String sqlFraga = "INSERT INTO ngo_2024.projekt (pid, projektnamn, beskrivning, startdatum, slutdatum, kostnad, status, prioritet, projektchef, land) VALUES (" + intIncrement + ", '" + projektnamn + "', '" + beskrivning + "', '" + startdatum + "', '" + slutdatum + "', '" + kostnad + "', '" + status + "', '" + prioritet + "', '" + projektchefId + "', '" + landId + "')";
                idb.insert(sqlFraga);
                JOptionPane.showMessageDialog(null, "Nytt projekt är tillagd!", "Information", JOptionPane.INFORMATION_MESSAGE);
                clearInputFields();
            } else {
                JOptionPane.showMessageDialog(null, "Du har inte fyllt i alla fällt, vänligen fyll i alla uppgifter", "Warning", JOptionPane.WARNING_MESSAGE);

            }

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private boolean isValidDate(String dateString) {
        if (dateString.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Datumet är i fel format, vänligen använd YYYY-MM-DD formatet!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }//GEN-LAST:event_btnLaggTillActionPerformed

    private void fyllPaComboBoxChef() { //Denna metod gör en databasfråga för att hämta chefnamn osv och fyller sedan ComboBoxen med dessa info.
        try {
            String projektchefInfo = "SELECT CONCAT(a.fornamn, ' ', a.efternamn, ' (', p.projektchef, ')') AS chef_info " + "FROM ngo_2024.projekt p " + "JOIN ngo_2024.anstalld a ON p.projektchef = a.aid;";
            // String projektchefID = "SELECT CONCAT(a.fornamn, ' ', a.efternamn) AS chef_namn " + "FROM ngo_2024.projekt p " + "JOIN ngo_2024.anstalld a ON p.projektchef = a.aid;";
            ArrayList<String> projektchefnamn = idb.fetchColumn(projektchefInfo);
            for (String detValdaAlternativet : projektchefnamn) {
                projektchefComboBox.addItem(detValdaAlternativet);
            }
        } catch (InfException ex) {
            Logger.getLogger(LaggTillProjektFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void fyllPaComboBoxLand() {//Denna metod gör en databasfråga för att hämta landsnamn och fyller sedan ComboBoxen med dessa namn.
        try {
            String landID = "SELECT DISTINCT l.namn AS land_namn FROM ngo_2024.projekt p JOIN ngo_2024.anstalld a ON p.projektchef = a.aid JOIN ngo_2024.land l ON p.land = l.lid;";
            ArrayList<String> landid = idb.fetchColumn(landID);
            for (String detValdaAlternativet : landid) {
                landComboBox.addItem(detValdaAlternativet);
            }
        } catch (InfException ex) {
            Logger.getLogger(LaggTillProjektFrame.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    private void clearInputFields() {
        projektnamnText.setText("");
        beskrivningText.setText("");
        startdatumText.setText("");
        slutdatumText.setText("");
        kostnaderText.setText("");
        statusComboBox = null;
        prioritetComboBox = null;
        projektchefComboBox = null;
        landComboBox = null;
    }

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
            java.util.logging.Logger.getLogger(LaggTillAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new LaggTillProjektFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beskrivningText;
    private javax.swing.JButton btnLaggTill;
    private javax.swing.JTextField kostnaderText;
    private javax.swing.JComboBox<String> landComboBox;
    private javax.swing.JLabel lblBeskrivning;
    private javax.swing.JLabel lblFyllIUppgifterForDetNyaProjektet;
    private javax.swing.JLabel lblKostnader;
    private javax.swing.JLabel lblLand;
    private javax.swing.JLabel lblPrioritet;
    private javax.swing.JLabel lblProjektchef;
    private javax.swing.JLabel lblProjektnamn;
    private javax.swing.JLabel lblSlutdatum;
    private javax.swing.JLabel lblStartdatum;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JComboBox<String> prioritetComboBox;
    private javax.swing.JComboBox<String> projektchefComboBox;
    private javax.swing.JTextField projektnamnText;
    private javax.swing.JTextField slutdatumText;
    private javax.swing.JTextField startdatumText;
    private javax.swing.JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables
}
