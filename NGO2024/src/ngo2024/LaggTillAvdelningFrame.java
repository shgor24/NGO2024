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
//                                                              !!!!!skriv siffror på avdid rutan!!!!
public class LaggTillAvdelningFrame extends javax.swing.JFrame {

    private InfDB idb;

 
    public LaggTillAvdelningFrame(InfDB idb) {
        this.idb = idb;
        initComponents();
        fyllPaStadComboBox();
        fyllPaChefComboBox();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblavdid = new javax.swing.JLabel();
        lblnamn = new javax.swing.JLabel();
        lblbeskrivning = new javax.swing.JLabel();
        lbladress = new javax.swing.JLabel();
        lblepost = new javax.swing.JLabel();
        lbltelefon = new javax.swing.JLabel();
        lblstad = new javax.swing.JLabel();
        lblchef = new javax.swing.JLabel();
        lblrubrik = new javax.swing.JLabel();
        tfavdid = new javax.swing.JTextField();
        tfnamn = new javax.swing.JTextField();
        tfbeskrivning = new javax.swing.JTextField();
        tfadress = new javax.swing.JTextField();
        tfepost = new javax.swing.JTextField();
        tftelefon = new javax.swing.JTextField();
        btnlaggtill = new javax.swing.JButton();
        StadComboBox = new javax.swing.JComboBox<>();
        ChefComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblavdid.setText("Avdid");

        lblnamn.setText("Namn");

        lblbeskrivning.setText("beskrivning");

        lbladress.setText("Adress");

        lblepost.setText("Epost");

        lbltelefon.setText("Telefon");

        lblstad.setText("Stad");

        lblchef.setText("Chef");

        lblrubrik.setText("Lägg till avdelning");

        btnlaggtill.setText("Lägg Till ");
        btnlaggtill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaggtillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnlaggtill, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblavdid))
                    .addComponent(lblepost)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(lblrubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(lblnamn)
                                .addGap(67, 67, 67)
                                .addComponent(lblbeskrivning))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfepost, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tftelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfavdid, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbltelefon)
                                            .addComponent(tfnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblstad)
                                    .addComponent(tfbeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfadress, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbladress)
                            .addComponent(lblchef))))
                .addContainerGap(334, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblrubrik)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblavdid)
                    .addComponent(lblnamn)
                    .addComponent(lblbeskrivning)
                    .addComponent(lbladress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfavdid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfbeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblchef)
                    .addComponent(lblepost)
                    .addComponent(lbltelefon)
                    .addComponent(lblstad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfepost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tftelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btnlaggtill)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metod för att hantera händelsen när användaren klickar på knappen för att lägga till avdelning.
    private void btnlaggtillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaggtillActionPerformed
        // Hämta data från textfälten           
        String avdid = tfavdid.getText();
        String namn = tfnamn.getText();
        String beskrivning = tfbeskrivning.getText();
        String adress = tfadress.getText();
        String epost = tfepost.getText();
        String telefon = tftelefon.getText();
        
        String stad = (String) StadComboBox.getSelectedItem();// Hämta vald stad från komboboxen
        String stadId = stad.replaceAll("\\D+", "");
        
        String chef = (String) ChefComboBox.getSelectedItem();   // Hämta vald chef från komboboxen     
        String chefId = chef.replaceAll("\\D+", "");
         try {
            String sqlFraga = "INSERT INTO avdelning (avdid, namn, beskrivning, adress, epost, telefon, stad, chef) VALUES ('" + avdid + "', '" + namn + "', '" + beskrivning + "', '" + adress + "', '" + epost + "', '" + telefon + "', '" + stadId + "', '" + chefId + "')";
            idb.insert(sqlFraga);
            JOptionPane.showMessageDialog(null, "Ny avdelning är tillagd!", "Information", JOptionPane.INFORMATION_MESSAGE);
            clearInputFields();
        } catch (InfException ex) {
            Logger.getLogger(LaggTillAvdelningFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ett fel uppstod vid tillägg av avdelning!", "Fel", JOptionPane.ERROR_MESSAGE);
        }
    }
  
    
 private void fyllPaChefComboBox() {
        try {// SQL-fråga för att hämta namn på anställda och deras ID
            String chefInfoQuery = "SELECT CONCAT(fornamn, ' ', efternamn, ' (', aid, ')') AS chef_info FROM anstalld";
            ArrayList<String> chefInfoList = idb.fetchColumn(chefInfoQuery);
            for (String chefInfo : chefInfoList) {
                ChefComboBox.addItem(chefInfo);
            }
        } catch (InfException ex) {
            Logger.getLogger(LaggTillAvdelningFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void fyllPaStadComboBox() {
        try {// SQL-fråga för att hämta namn på städer och deras ID
            String stadQuery = "SELECT CONCAT(namn, ' (', sid, ')') AS stad_info FROM stad";
            ArrayList<String> stadList = idb.fetchColumn(stadQuery);
            for (String stad : stadList) {
                StadComboBox.addItem(stad);
            }
        } catch (InfException ex) {
            Logger.getLogger(LaggTillAvdelningFrame.class.getName()).log(Level.SEVERE, null, ex);

    }
    
    }//GEN-LAST:event_btnlaggtillActionPerformed
 private void clearInputFields() {
        tfavdid.setText("");
        tfnamn.setText("");
        tfbeskrivning.setText("");
        tfadress.setText("");
        tfepost.setText("");
        tftelefon.setText("");
        StadComboBox.setSelectedIndex(-1);
        ChefComboBox.setSelectedIndex(-1);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChefComboBox;
    private javax.swing.JComboBox<String> StadComboBox;
    private javax.swing.JButton btnlaggtill;
    private javax.swing.JLabel lbladress;
    private javax.swing.JLabel lblavdid;
    private javax.swing.JLabel lblbeskrivning;
    private javax.swing.JLabel lblchef;
    private javax.swing.JLabel lblepost;
    private javax.swing.JLabel lblnamn;
    private javax.swing.JLabel lblrubrik;
    private javax.swing.JLabel lblstad;
    private javax.swing.JLabel lbltelefon;
    private javax.swing.JTextField tfadress;
    private javax.swing.JTextField tfavdid;
    private javax.swing.JTextField tfbeskrivning;
    private javax.swing.JTextField tfepost;
    private javax.swing.JTextField tfnamn;
    private javax.swing.JTextField tftelefon;
    // End of variables declaration//GEN-END:variables


 public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InfDB idb = new InfDB("path_to_database");
                    //new LaggTillAvdelningFrame(idb).setVisible(true);
                } catch (InfException ex) {
                    Logger.getLogger(LaggTillAvdelningFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
