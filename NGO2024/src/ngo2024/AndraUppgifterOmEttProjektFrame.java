/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.HashMap;
import java.util.Map;
import oru.inf.InfDB;
import javax.swing.JOptionPane;
import oru.inf.InfException;

/**
 *
 * @author sheny
 */
public class AndraUppgifterOmEttProjektFrame extends javax.swing.JFrame {

    private InfDB idb;
    private HashMap<String, String> projektnamn;
    String value = "";

    public AndraUppgifterOmEttProjektFrame(InfDB idb, HashMap<String, String> projektnamn) {
        this.idb = idb;
        this.projektnamn = projektnamn;
        initComponents();

        for (Map.Entry<String, String> entry : projektnamn.entrySet()) {
            String key = entry.getKey();
            value = entry.getValue();
            // Now you can use the key-value pairs as needed
            System.out.println("Key: " + key + ", Value: " + value);
        }

        HashMap<String, String> data = GetData(value);

        if (data != null) {
            String valueProjektnamn = data.get("projektnamn");
            String valueBeskrivning = data.get("beskrivning");
            String valueStartdatum = data.get("startdatum");
            String valueSlutdatum = data.get("slutdatum");
            String valueNamn = data.get("namn");
            String valueKostnad = data.get("kostnad");
            String valueStatus = data.get("status");
            String valuePrioritet = data.get("prioritet");

            String fornamn = data.get("fornamn");
            String efternamn = data.get("efternamn");
            String projektchefNamn = fornamn + " " + efternamn;

            // Set the values in the input properties
            projektnamnText.setText(valueProjektnamn);
            beskrivningText.setText(valueBeskrivning);
            startdatumText.setText(valueStartdatum);
            slutdatumText.setText(valueSlutdatum);
            landText.setText(valueNamn);
            kostnaderText.setText(valueKostnad);
            statusComboBox.setSelectedItem(valueStatus);
            prioritetComboBox.setSelectedItem(valuePrioritet);
            projektChefText.setText(projektchefNamn);
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
        lblProjektnamn = new javax.swing.JLabel();
        lblBeskrivning = new javax.swing.JLabel();
        lblStartdatum = new javax.swing.JLabel();
        lblSlutdatum = new javax.swing.JLabel();
        lblLand = new javax.swing.JLabel();
        lblKostnader = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblProjektchef = new javax.swing.JLabel();
        lblPrioritet = new javax.swing.JLabel();
        btnSparaAndringar = new javax.swing.JButton();
        projektnamnText = new javax.swing.JTextField();
        beskrivningText = new javax.swing.JTextField();
        startdatumText = new javax.swing.JTextField();
        slutdatumText = new javax.swing.JTextField();
        kostnaderText = new javax.swing.JTextField();
        statusComboBox = new javax.swing.JComboBox<>();
        prioritetComboBox = new javax.swing.JComboBox<>();
        projektChefText = new javax.swing.JTextField();
        landText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ändra uppgifter om ett projekt");

        lblProjektnamn.setText("Projektnamn");

        lblBeskrivning.setText("Beskrivning");

        lblStartdatum.setText("Startdatum");

        lblSlutdatum.setText("Slutdatum");

        lblLand.setText("Land");

        lblKostnader.setText("Kostnader");

        lblStatus.setText("Status");

        lblProjektchef.setText("Projektchef");

        lblPrioritet.setText("Prioritet");

        btnSparaAndringar.setText("Uppdatera Projekt");
        btnSparaAndringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaAndringarActionPerformed(evt);
            }
        });

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pågående", "Planerat", "Avslutat" }));

        prioritetComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hög", "Medel", "Låg" }));

        projektChefText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projektChefTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLand, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beskrivningText, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(projektnamnText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                        .addComponent(startdatumText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(slutdatumText, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(landText, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prioritetComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSparaAndringar, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(kostnaderText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProjektchef, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKostnader, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrioritet, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(projektChefText))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjektnamn)
                    .addComponent(lblKostnader))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projektnamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kostnaderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBeskrivning)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beskrivningText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartdatum)
                    .addComponent(lblPrioritet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioritetComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSlutdatum)
                    .addComponent(lblProjektchef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slutdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projektChefText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(landText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnSparaAndringar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaAndringarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaAndringarActionPerformed

        HashMap<String, String> data = GetData(value);
       
        String projektVal = projektnamnText.getText();
        String beskrivningVal = beskrivningText.getText();
        String startdatumVal = startdatumText.getText();
        String slutdatumVal = slutdatumText.getText();
        String kostnaderVal = kostnaderText.getText();
        Object statusVal = statusComboBox.getSelectedItem();
        Object prioritetVal = prioritetComboBox.getSelectedItem();


         if (projektVal.isEmpty() || beskrivningVal.isEmpty() || startdatumVal.isEmpty() ||
        slutdatumVal.isEmpty() || kostnaderVal.isEmpty() || statusVal == null || prioritetVal == null) {
        JOptionPane.showMessageDialog(null, "Alla fält måste fyllas i!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }
          if (!isValidDate(startdatumVal) || !isValidDate(slutdatumVal)) {
        return;
    }

    if (!isNumeric(kostnaderVal)) {
        JOptionPane.showMessageDialog(null, "Kostnader måste vara ett numeriskt värde!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }
          String valuePid = data.get("pid");
          String projektchefVal = data.get("projektchef");
          String valueLand = data.get("land");
        
        
        String updateQuery = "UPDATE ngo_2024.projekt SET "
                + "projektnamn = '" + projektVal + "', "
                + "beskrivning = '" + beskrivningVal + "', "
                + "startdatum = '" + startdatumVal + "', "
                + "slutdatum = '" + slutdatumVal + "', "
                + "land = '" + valueLand + "', "
                + "kostnad = '" + kostnaderVal + "', "
                + "status = '" + statusVal + "', "
                + "prioritet = '" + prioritetVal + "', "
                + "projektchef = '" + projektchefVal + "' "
                + "WHERE pid = '" + valuePid + "'";

        try {
            idb.update(updateQuery);
            clearInputFields();
            JOptionPane.showMessageDialog(null, "Projekt har blivit uppdaterat!", "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnSparaAndringarActionPerformed
private boolean isValidDate(String dateString) {
    if (dateString.matches("\\d{4}-\\d{2}-\\d{2}")) {
        return true;
    } else {
        JOptionPane.showMessageDialog(null, "Datumet är i fel format, vänligen använd YYYY-MM-DD formatet!", "Warning", JOptionPane.WARNING_MESSAGE);
        return false;
    }
}

private boolean isNumeric(String str) {
    try {
        Double.parseDouble(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
    private void projektChefTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projektChefTextActionPerformed
        
    }//GEN-LAST:event_projektChefTextActionPerformed


    private void clearInputFields() {
        projektnamnText.setText("");
        beskrivningText.setText("");
        startdatumText.setText("");
        slutdatumText.setText("");
        kostnaderText.setText("");
        statusComboBox = null;
        prioritetComboBox = null;
        landText.setText("");
        projektChefText.setText("");
    }

    private HashMap GetData(String projektnamn) {
        HashMap<String, String> resultat = null;
        try {
            String sqlFraga = "SELECT p.*, " + "a.fornamn AS projektchef_fornamn, " + "a.efternamn AS projektchef_efternamn, " + "l.namn AS land_namn " + "FROM ngo_2024.projekt p " + "JOIN ngo_2024.anstalld a ON p.projektchef = a.aid " + "JOIN ngo_2024.land l ON p.land = l.lid " + "WHERE p.projektnamn = '" + projektnamn + "'";
            resultat = idb.fetchRow(sqlFraga);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
        return resultat;
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
            java.util.logging.Logger.getLogger(AndraUppgifterOmEttProjektFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEttProjektFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEttProjektFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEttProjektFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AndraUppgifterOmEttProjektFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField beskrivningText;
    private javax.swing.JButton btnSparaAndringar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField kostnaderText;
    private javax.swing.JTextField landText;
    private javax.swing.JLabel lblBeskrivning;
    private javax.swing.JLabel lblKostnader;
    private javax.swing.JLabel lblLand;
    private javax.swing.JLabel lblPrioritet;
    private javax.swing.JLabel lblProjektchef;
    private javax.swing.JLabel lblProjektnamn;
    private javax.swing.JLabel lblSlutdatum;
    private javax.swing.JLabel lblStartdatum;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JComboBox<String> prioritetComboBox;
    private javax.swing.JTextField projektChefText;
    private javax.swing.JTextField projektnamnText;
    private javax.swing.JTextField slutdatumText;
    private javax.swing.JTextField startdatumText;
    private javax.swing.JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables
}
