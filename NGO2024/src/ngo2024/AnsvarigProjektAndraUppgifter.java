/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AnsvarigProjektAndraUppgifter extends javax.swing.JFrame {

    private InfDB idb;
    private String pid;
    private String startdatum;
    private String slutdatum;
    private String datumFormat;

    /**
     * Creates new form AndraProjektAnsvar
     */
    public AnsvarigProjektAndraUppgifter(InfDB idb, String pid) {
        this.idb = idb;
        this.pid = pid;
        initComponents();
        fyllListaLander();
        datumFormat = "    -  -  ";

    }

    private void fyllListaLander() {
        try {
            String sqlFraga = "select namn, lid from land";
            ArrayList<HashMap<String, String>> resultatLista = idb.fetchRows(sqlFraga);

            HashMap<String, String> landLista = new HashMap<>();

            for (HashMap<String, String> rad : resultatLista) {
                String lid = rad.get("lid");
                String namn = rad.get("namn");
                landLista.put(lid, namn);
            }

            for (String lid : landLista.keySet()) {
                String namn = landLista.get(lid);
                cbLand.addItem(namn + " ID: " + lid);
            }

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //En metod som kontrollerar att det/de angivna datum har giltiga värden för dag och månad
    private Boolean kontrollDatumInput() {

        Boolean giltig = true;

        if (!startdatum.equals(datumFormat)) {
            if (!Validering.manadsValidering(startdatum)) {
                JOptionPane.showMessageDialog(this, "Felaktigt värde på månad i Startdatumet \nVänligen ange en giltig månad mellan 01 - 12");
                giltig = false;
            } else if (!Validering.dagValidering(startdatum)) {
                JOptionPane.showMessageDialog(this, "Felaktigt värde på dag i Startdatumet \nVänligen ange en giltig dag mellan 01 - 31");
                giltig = false;
            }
        }

        if (!slutdatum.equals(datumFormat)) {
            if (!Validering.manadsValidering(slutdatum)) {
                JOptionPane.showMessageDialog(this, "Felaktigt värde på månad i Slutdatumet \nVänligen ange en giltig månad mellan 01 - 12");
                giltig = false;
            } else if (!Validering.dagValidering(slutdatum)) {
                JOptionPane.showMessageDialog(this, "Felaktigt värde på dag i Slutdatumet \nVänligen ange en giltig dag mellan 01 - 31");
                giltig = false;
            }
        }

        return giltig;
    }

    //En metod som kontrollerar att startdatumet är tidigare än slutdatumet
    private Boolean kontrollDatumSpan() {
        Boolean giltig = true;

        if (!startdatum.equals(datumFormat) && !slutdatum.equals(datumFormat)) {
            if (!Validering.giltigDatumSpan(startdatum, slutdatum)) {
                JOptionPane.showMessageDialog(this, "Felaktigt datumintervall \nVänligen se till att startdatumet är innan slutdatumet");
                giltig = false;
            }
        } else if (!startdatum.equals(datumFormat)) {
            try {
                String sqlFraga = "select slutdatum from projekt where pid = " + pid;
                String hamtadDatum = idb.fetchSingle(sqlFraga);

                if (!Validering.giltigDatumSpan(startdatum, hamtadDatum)) {
                    JOptionPane.showMessageDialog(this, "Felaktigt datumintervall \nVänligen se till att det angivna startdatumet är innan projektets slutdatum: " + hamtadDatum + "\nEller ändra slutdatumet också");
                    giltig = false;
                }
            } catch (InfException ex) {
                System.out.println(ex.getMessage());
                giltig = false;
            }
        } else if (!slutdatum.equals(datumFormat)) {
            try {
                String sqlFraga = "select startdatum from projekt where pid = " + pid;
                String hamtadDatum = idb.fetchSingle(sqlFraga);

                if (!Validering.giltigDatumSpan(hamtadDatum, slutdatum)) {
                    JOptionPane.showMessageDialog(this, "Felaktigt datumintervall \nVänligen se till att det angivna slutdatumet är efter projektets startdatum: " + hamtadDatum + "\nEller ändra startdatumet också");
                    giltig = false;

                }
            } catch (InfException ex) {
                System.out.println(ex.getMessage());
                giltig = false;
            }
        }

        return giltig;
    }

    private void laggTillAndringar() {
        andraUppgift(tfProjektnamn.getText(), "projektnamn");
        andraUppgift(tfBeskrivning.getText(), "beskrivning");

        if (!startdatum.equals(datumFormat)) {
            andraUppgift(ftfStartdatum.getText(), "startdatum");
        }
        if (!slutdatum.equals(datumFormat)) {
            andraUppgift(ftfSlutdatum.getText(), "slutdatum");
        }
        if (!ftfKostnad.getText().equals("00000.00")) {
            andraUppgift(ftfKostnad.getText(), "kostnad");
        }

        andraStatus();

        andraPrioritet();
        
        andraLand();
    }

    private Boolean andraUppgift(String andradText, String kolumnNamn) {
        if (!andradText.isBlank()) {
            try {
                String sqlFraga = "update projekt set " + kolumnNamn + " = '" + andradText + "' where pid = " + pid;
                idb.update(sqlFraga);

            } catch (InfException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return true;
    }

    private void andraStatus() {
        String valdStatus = (String) cbStatus.getSelectedItem();

        if (!valdStatus.isBlank()) {

            if (valdStatus.equals("Planerat")) {
                andraUppgift("Planerat", "status");
            } else if (valdStatus.equals("Pågående")) {
                andraUppgift("Pågående", "status");
            } else if (valdStatus.equals("Avslutad")) {
                andraUppgift("Avslutad", "status");
            }
        }
    }

    private void andraPrioritet() {
        String valdPrioritet = (String) cbPrioritet.getSelectedItem();

        if (!valdPrioritet.isBlank()) {

            if (valdPrioritet.equals("Hög")) {
                andraUppgift("Hög", "prioritet");
            } else if (valdPrioritet.equals("Medel")) {
                andraUppgift("Medel", "prioritet");
            } else if (valdPrioritet.equals("Låg")) {
                andraUppgift("Låg", "prioritet");
            }
        }
    }

    private void andraLand() {
        String valtLand = (String) cbLand.getSelectedItem();

        if (!valtLand.isBlank()) {
            String[] delar = valtLand.split(" ID: ");
            String namn = delar[1];
            andraUppgift(namn, "land");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfProjektnamn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfBeskrivning = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbPrioritet = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ftfKostnad = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        cbLand = new javax.swing.JComboBox<>();
        ftfSlutdatum = new javax.swing.JFormattedTextField();
        ftfStartdatum = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel1.setText("Ändra uppgifter för det valda projektet");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 2, 12)); // NOI18N
        jLabel2.setText("Lämna tomt där du inte vill ändra ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel3.setText("Projektnamn:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel4.setText("Beskrivning:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel5.setText("Startdatum:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel6.setText("Slutdatum:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel7.setText("Kostnad:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel8.setText("Status:");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Planerat", "Pågående", "Avslutad" }));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel9.setText("Prioritet:");

        cbPrioritet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Hög", "Medel", "Låg" }));

        jButton1.setText("Spara mina ändringar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        try {
            ftfKostnad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfKostnad.setText("00000.00  ");

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel11.setText("Land:");

        cbLand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        try {
            ftfSlutdatum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftfStartdatum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(19, 19, 19)
                                                .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(ftfSlutdatum)
                                                    .addComponent(ftfKostnad, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                    .addComponent(ftfStartdatum))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPrioritet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbLand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfProjektnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfBeskrivning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbPrioritet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(cbLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfStartdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ftfSlutdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ftfKostnad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        startdatum = ftfStartdatum.getText();
        slutdatum = ftfSlutdatum.getText();

        if (kontrollDatumInput() && kontrollDatumSpan()) {
            int val = JOptionPane.showConfirmDialog(this, "Ändringarna har sparats\nVill du se det uppdaterade projektet?", "Bekräftelse", JOptionPane.OK_CANCEL_OPTION);

            laggTillAndringar();

            if (val == JOptionPane.OK_OPTION) {
                ProjektInfo projektInfo = new ProjektInfo(pid, idb);
                projektInfo.laggTillText();
                projektInfo.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AnsvarigProjektAndraUppgifter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnsvarigProjektAndraUppgifter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnsvarigProjektAndraUppgifter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnsvarigProjektAndraUppgifter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AnsvarigProjektAndraUppgifter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbLand;
    private javax.swing.JComboBox<String> cbPrioritet;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JFormattedTextField ftfKostnad;
    private javax.swing.JFormattedTextField ftfSlutdatum;
    private javax.swing.JFormattedTextField ftfStartdatum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfBeskrivning;
    private javax.swing.JTextField tfProjektnamn;
    // End of variables declaration//GEN-END:variables

}
