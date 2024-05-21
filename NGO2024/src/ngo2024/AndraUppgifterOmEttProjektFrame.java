/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;
import java.util.ArrayList;
import oru.inf.InfDB;
import javax.swing.JOptionPane;
import oru.inf.InfException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sheny
 */
public class AndraUppgifterOmEttProjektFrame extends javax.swing.JFrame {
    private InfDB idb;

    /**
     * Creates new form AndraUppgifterOmEttProjekt
     */
    public AndraUppgifterOmEttProjektFrame(InfDB idb) {
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
        projektchefComboBox = new javax.swing.JComboBox<>();
        landComboBox = new javax.swing.JComboBox<>();

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

        btnSparaAndringar.setText("Spara ändringar");
        btnSparaAndringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaAndringarActionPerformed(evt);
            }
        });

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pågående", "Planerat", "Avslutat" }));

        prioritetComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hög", "Medel", "Låg" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBeskrivning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startdatumText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStartdatum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slutdatumText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beskrivningText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSparaAndringar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(331, 331, 331))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProjektchef, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKostnader, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kostnaderText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrioritet, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prioritetComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(projektchefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(249, 249, 249))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(landComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projektnamnText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLand, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
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
                    .addComponent(beskrivningText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(lblStartdatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(startdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrioritet))
                        .addGap(14, 14, 14)
                        .addComponent(lblSlutdatum))
                    .addComponent(prioritetComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(slutdatumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblLand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(landComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProjektchef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(projektchefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)))
                .addComponent(btnSparaAndringar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaAndringarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaAndringarActionPerformed
    
        try {
            String projektnamn = projektnamnText.getText();
            String beskrivning = beskrivningText.getText();
            String startdatum = startdatumText.getText();
            String slutdatum = slutdatumText.getText();
            String kostnad = kostnaderText.getText();
            Object status = statusComboBox.getSelectedItem();
            Object prioritet = prioritetComboBox.getSelectedItem();
            Object projektchef = projektchefComboBox.getSelectedItem();
            Object land = landComboBox.getSelectedItem();
            
            String projektchefId = projektchef.toString().replaceAll("\\D+", "");

            
            
            isValidDate(startdatum);
            isValidDate(slutdatum);
            if (!projektnamn.equals("") && !beskrivning.equals("") && !startdatum.equals("") && !slutdatum.equals("") && !kostnad.equals("") && !status.equals("") && !prioritet.equals("") && !projektchef.equals("") && !land.equals("")) {
                String sqlFraga1 = "UPDATE ngo_2024.projekt SET projektnamn = '" + projektnamn + "', beskrivning = '" + beskrivning + "', startdatum = '" + startdatum + "', slutdatum = '" + slutdatum + "', kostnad = '" + kostnad + "', status = '" + status + "', prioritet = '" + prioritet + "', projektchef = '" + projektchefId + "', land = '" + land + "' WHERE pid = " + projektchefId;
                
                idb.update(sqlFraga1);
                JOptionPane.showMessageDialog(null, "Projektinformation är uppdaterad!", "Information", JOptionPane.INFORMATION_MESSAGE);
                clearInputFields();
          
          } else {
                JOptionPane.showMessageDialog(null, "Du har inte fyllt i alla fält, vänligen fyll i alla uppgifter", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
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
     
     private void fyllPaComboBoxChef() {
         try {
             String projektchefInfo = "SELECT CONCAT(a.fornamn, ' ', a.efternamn, ' (', p.projektchef, ')') AS chef_info " + "FROM ngo_2024.projekt p " + "JOIN ngo_2024.anstalld a ON p.projektchef = a.aid;";
             ArrayList<String> projektchefnamn = idb.fetchColumn(projektchefInfo);
            for (String detValdaAlternativet : projektchefnamn) {
                projektchefComboBox.addItem(detValdaAlternativet);
          }
        } catch (InfException ex) {
            Logger.getLogger(AndraUppgifterOmEttProjektFrame.class.getName()).log(Level.SEVERE, null, ex);
     }
     }
     
      private void fyllPaComboBoxLand() {
          try {
            String landID = "SELECT l.namn AS land_namn FROM ngo_2024.projekt p JOIN ngo_2024.anstalld a ON p.projektchef = a.aid JOIN ngo_2024.land l ON p.land = l.lid;";
            ArrayList<String> landid = idb.fetchColumn(landID);
            for (String detValdaAlternativet : landid) {
                landComboBox.addItem(detValdaAlternativet);
          }
        } catch (InfException ex) {
             Logger.getLogger(AndraUppgifterOmEttProjektFrame.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox<String> landComboBox;
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
    private javax.swing.JComboBox<String> projektchefComboBox;
    private javax.swing.JTextField projektnamnText;
    private javax.swing.JTextField slutdatumText;
    private javax.swing.JTextField startdatumText;
    private javax.swing.JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables
}
