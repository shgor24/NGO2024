/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.awt.event.ActionEvent;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.Arrays;
import javax.swing.JTextField;

public class AndraUppgifterOmEnPartner extends javax.swing.JFrame {

    private InfDB idb;
    private String pid;
    private String sid;

    /**
     * Creates new form AndraUppgifterOmEnPartner
     */
    public AndraUppgifterOmEnPartner(InfDB idb) {
        this.idb = idb;
        initComponents();
        fillComboBox1();
        fillComboBox2();
        andrauppgift();

    }
//metod för vilken partner det gäller, som man ska ändra uppgifter för
    private void fillComboBox1() {
        try {
            List<String> partner = idb.fetchColumn("SELECT pid FROM partner");
            if (partner != null) {
                for (String detValdaAlternativet : partner) {
                    ValjPartnerComboBox.addItem(detValdaAlternativet);
                }
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Error fetching department IDs: " + ex.getMessage());
        }
    }
//metod för vilken stad man ska välja i rullistan vid ändring
    private void fillComboBox2() {
        try {
            String stadID = "SELECT DISTINCT s.sid FROM ngo_2024.stad s JOIN ngo_2024.partner p ON p.stad = s.sid";
            List<String> stadid = idb.fetchColumn(stadID);
            for (String detValdaAlternativet : stadid) {
                stadComboBox.addItem(detValdaAlternativet);
            }
        } catch (InfException ex) {

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

        andraUppgifterOmPartnerText = new javax.swing.JTextField();
        lblNamn = new javax.swing.JLabel();
        namnText = new javax.swing.JTextField();
        lblKontaktperson = new javax.swing.JLabel();
        kontaktpersonText = new javax.swing.JTextField();
        lblKontaktepost = new javax.swing.JLabel();
        kontaktepostText = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        telefonText = new javax.swing.JTextField();
        lblAdress = new javax.swing.JLabel();
        lblBranch = new javax.swing.JLabel();
        adressText = new javax.swing.JTextField();
        branchText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        stadComboBox = new javax.swing.JComboBox<>();
        btnSparaAndringar = new javax.swing.JButton();
        ValjPartnerComboBox = new javax.swing.JComboBox<>();
        lblValjAvdelning = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        andraUppgifterOmPartnerText.setText("Ändra uppgifter om en partner");

        lblNamn.setText("Namn");

        lblKontaktperson.setText("Kontaktperson");

        lblKontaktepost.setText("Kontaktepost");

        lblTelefon.setText("Telefon");

        lblAdress.setText("Adress");

        lblBranch.setText("Branch");

        jLabel1.setText("Stad");

        btnSparaAndringar.setText("Spara ändringar");
        btnSparaAndringar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaAndringarActionPerformed(evt);
            }
        });

        lblValjAvdelning.setText("Välj partner");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namnText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKontaktperson, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(kontaktpersonText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKontaktepost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ValjPartnerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValjAvdelning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(telefonText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTelefon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kontaktepostText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(82, 82, 82))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(branchText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(66, 66, 66))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adressText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSparaAndringar)
                            .addComponent(lblBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(andraUppgifterOmPartnerText, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(andraUppgifterOmPartnerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(lblAdress)
                    .addComponent(lblValjAvdelning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValjPartnerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKontaktperson)
                    .addComponent(lblBranch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kontaktpersonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(branchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKontaktepost)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kontaktepostText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(lblTelefon)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btnSparaAndringar)
                        .addGap(48, 48, 48))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaAndringarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaAndringarActionPerformed
       
        uppdateraUppgift();
    }//GEN-LAST:event_btnSparaAndringarActionPerformed
    ////// Metod för de fält där man kan ändra värdet 
    public void andrauppgift() {

        try {
            pid = (String) ValjPartnerComboBox.getSelectedItem();
            sid = (String) stadComboBox.getSelectedItem();
            
            namnText.setText(idb.fetchSingle("SELECT namn FROM partner WHERE pid = '" + pid + "'"));
            kontaktpersonText.setText(idb.fetchSingle("SELECT kontaktperson FROM partner WHERE pid = '" + pid + "'"));
            kontaktepostText.setText(idb.fetchSingle("SELECT kontaktepost FROM partner WHERE pid = '" + pid + "'"));
            telefonText.setText(idb.fetchSingle("SELECT telefon FROM partner WHERE pid = '" + pid + "'"));
            adressText.setText(idb.fetchSingle("SELECT adress FROM partner WHERE pid = '" + pid + "'"));
            branchText.setText(idb.fetchSingle("SELECT branch FROM partner WHERE pid = '" + pid + "'"));

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void uppdateraUppgift() {
      String telefonVal = telefonText.getText();
      
        if (!isNumeric(telefonVal)) {
        JOptionPane.showMessageDialog(null, "Telefon måste vara ett numeriskt värde!", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }
              
        // Skapa en lista med de textfält som behöver valideras
        List<JTextField> fieldsToValidate = Arrays.asList(namnText, kontaktpersonText, kontaktepostText, telefonText, adressText, branchText);

        // Validera fälten
        if (!Validering.validerafalt(fieldsToValidate)) {
            // Om valideringen misslyckas, visa ett meddelande och avbryt metodens exekvering
            JOptionPane.showMessageDialog(null, "Vänligen fyll i alla fält.");
            return;
        }

        // Om valideringen lyckas, fortsätt med att uppdatera uppgifterna
        try {
            // Uppdatera databasen med de nya uppgifterna
            idb.update("UPDATE partner SET namn = '" + namnText.getText() + "', kontaktperson = '" + kontaktpersonText.getText() + "', kontaktepost = '" + kontaktepostText.getText() + "', telefon = '" + telefonText.getText() + "', adress = '" + adressText.getText() + "', branch = '" + branchText.getText() + "', stad= '" + stadComboBox.getSelectedItem() + "' WHERE pid = '" + pid + "'");

            // Visa ett bekräftelsemeddelande för användaren
            JOptionPane.showMessageDialog(null, "Ändringarna har sparats.");
        } catch (InfException ex) {
            // Om ett fel uppstår, visa felmeddelandet
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        

    }

    private boolean isNumeric(String str) { // Metod för att kontrollera om en sträng är numerisk
    try {
        Double.parseDouble(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
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
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AndraUppgifterOmEnPartner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AndraUppgifterOmEnPartner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ValjPartnerComboBox;
    private javax.swing.JTextField adressText;
    private javax.swing.JTextField andraUppgifterOmPartnerText;
    private javax.swing.JTextField branchText;
    private javax.swing.JButton btnSparaAndringar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField kontaktepostText;
    private javax.swing.JTextField kontaktpersonText;
    private javax.swing.JLabel lblAdress;
    private javax.swing.JLabel lblBranch;
    private javax.swing.JLabel lblKontaktepost;
    private javax.swing.JLabel lblKontaktperson;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblValjAvdelning;
    private javax.swing.JTextField namnText;
    private javax.swing.JComboBox<String> stadComboBox;
    private javax.swing.JTextField telefonText;
    // End of variables declaration//GEN-END:variables
}
