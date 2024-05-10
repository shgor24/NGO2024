/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package ngo2024;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mikni
 */
public class ProjektInfo extends javax.swing.JFrame {
    
    private InfDB idb;
    private String pid;

    /** Creates new form ProjektInfo */
    public ProjektInfo(String pid, InfDB idb) {
        this.idb = idb;
        this.pid = pid;
        initComponents();
        hamtaPartners();
    }
    
    /**
     * En metod som ändrar texten på alla labels med hjälp av hamtaText()
     * metoden
     */
    public void laggTillText() {
        lblProjektNamn.setText(hamtaText("projektnamn"));
        lblBeskrivning.setText(hamtaText("beskrivning"));
        lblStartdatum.setText(hamtaText("startdatum"));
        lblSlutdatum.setText(hamtaText("slutdatum"));
        lblKostnad.setText(hamtaText("kostnad"));
        lblStatus.setText(hamtaText("status"));
        lblPrioritet.setText(hamtaText("prioritet"));
        lblProjektchef.setText(hamtaProjektchef(hamtaText("projektchef")));
        lblLand.setText(hamtaLand(hamtaText("land")));
        lblHallbarhetsmal.setText(hamtaMal());
    }
    
    /**
     * En metod som hämtar värden från databasens projekttabell beroende på
     * vilken kolumn man skriver som parameter
     */
    private String hamtaText(String text) {
        String hamtadText = "";

        try {

            String sqlFraga = "select " + text + " from projekt where pid = " + pid;
            hamtadText = idb.fetchSingle(sqlFraga);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }

        return hamtadText;
    }
        
    private String hamtaProjektchef(String aid) {
        String hamtadNamn = "";

        try {
            String sqlFraga1 = "select fornamn from anstalld where aid = " + aid;
            String sqlFraga2 = "select efternamn from anstalld where aid = " + aid;
            hamtadNamn = idb.fetchSingle(sqlFraga1) + " " + idb.fetchSingle(sqlFraga2);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }

        return hamtadNamn;
    }
    
    private String hamtaLand(String lid) {
        String land = "";

        try {
            String sqlFraga = "select namn from land where lid = " + lid;
            land = idb.fetchSingle(sqlFraga);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }

        return land;
    }
    
    private String hamtaMal() {
        String mal = "";
        ArrayList<String> alla_mal = new ArrayList<String>();

        try {
            String sqlFraga = "select namn from hallbarhetsmal where hid in (select hid from proj_hallbarhet where pid = " + pid + ")";
            alla_mal = idb.fetchColumn(sqlFraga);

            //Använder join() metoden för att samla ihop alla hämtade mål med kommatecken mellan dem
            mal = String.join(", ", alla_mal);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }

        return mal;
    }
    
        private void hamtaPartners() {
        try {
            //Anropar hamtaText() metoden med pid som parametervärde för att hämta pid för projektet med ett visst projektnamn
            String projektId = hamtaText("pid");
            String sqlFraga = "select pid, namn from partner where pid in (select partner_pid from projekt_partner where pid =" + pid + ")";

            //Skapar en ArrayList av HashMap av String som lagrar alla relevanta partner id och namn
            ArrayList<HashMap<String, String>> resultatLista = idb.fetchRows(sqlFraga);

            //Skapar en ny HashMap för pid och partner namn
            HashMap<String, String> partnerLista = new HashMap<>();

            //Fyller HashMapen med alla hittade partner id och namn
            for (HashMap<String, String> rad : resultatLista) {
                String partnerId = rad.get("pid");
                String partnerNamn = rad.get("namn");
                partnerLista.put(partnerId, partnerNamn);
            }

            //Skapar en DefaultListModel som gör att man kan lägga till saker i listan
            DefaultListModel<String> lista = new DefaultListModel<>();

            for (String partnerId : partnerLista.keySet()) {
                //Lägger till partner id och namn i listan
                lista.addElement(partnerLista.get(partnerId) + " ID: " + partnerId);
            }

            listaPartners.setModel(lista);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        lblBeskrivning = new javax.swing.JLabel();
        lblStartdatum = new javax.swing.JLabel();
        lblSlutdatum = new javax.swing.JLabel();
        lblKostnad = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblPrioritet = new javax.swing.JLabel();
        lblHallbarhetsmal = new javax.swing.JLabel();
        lblLand = new javax.swing.JLabel();
        lblProjektchef = new javax.swing.JLabel();
        lblMerInfoPartners = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPartners = new javax.swing.JList<>();
        lblProjektNamn = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel8.setText("Land:");

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel9.setText("Hållbarhetsmål:");

        lblBeskrivning.setText("jLabel10");

        lblStartdatum.setText("jLabel10");

        lblSlutdatum.setText("jLabel10");

        lblKostnad.setText("jLabel10");

        lblStatus.setText("jLabel10");

        lblPrioritet.setText("jLabel10");

        lblHallbarhetsmal.setText("jLabel10");

        lblLand.setText("jLabel10");

        lblProjektchef.setText("jLabel10");

        lblMerInfoPartners.setFont(new java.awt.Font("Segoe UI Emoji", 2, 12)); // NOI18N
        lblMerInfoPartners.setText("Välj en samarbetspartner att läsa mer om:");

        listaPartners.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaPartners.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaPartnersValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaPartners);

        lblProjektNamn.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblProjektNamn.setText("jLabel1");

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setText("Beskrivning:");

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setText("Startdatum:");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("Slutdatum:");

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("Kostnad:");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setText("Status:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setText("Prioritet:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setText("Projektchef:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMerInfoPartners, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(lblHallbarhetsmal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(lblSlutdatum))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblStartdatum))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(lblBeskrivning))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(40, 40, 40)
                                .addComponent(lblProjektchef))
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(lblKostnad))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(75, 75, 75)
                                .addComponent(lblStatus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(60, 60, 60)
                                .addComponent(lblPrioritet))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(83, 83, 83)
                                .addComponent(lblLand))
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator7)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(jSeparator5))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(259, 259, 259)
                            .addComponent(lblProjektNamn)))
                    .addContainerGap(411, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStartdatum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSlutdatum)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lblMerInfoPartners)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHallbarhetsmal)
                        .addGap(7, 7, 7))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblProjektNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(lblBeskrivning))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(lblKostnad))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLand)
                        .addComponent(jLabel8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(lblStatus))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lblPrioritet))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(lblProjektchef))
                    .addGap(21, 21, 21)
                    .addComponent(jLabel9)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaPartnersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaPartnersValueChanged
        if (!evt.getValueIsAdjusting()) {
            int valtIndex = listaPartners.getSelectedIndex();

            //Kontrollerar om användaren har valt ett giltigt värde i listan
            if (valtIndex != -1) {

                //Hämtar den partner som valdes i listan
                String valtPartner = listaPartners.getSelectedValue();

                //Hämtar pid från listnamnet med hjälp av substring() metoden
                String partnerId = valtPartner.substring(valtPartner.lastIndexOf(" ") + 1);

                //Öppnar ett fönster med info om projektet som valts genom ProjektInfo
                ProjektPartnerInfo partnerInfo = new ProjektPartnerInfo(partnerId, idb);
                partnerInfo.laggTillText();
                partnerInfo.setVisible(true);

            }

        }
    }//GEN-LAST:event_listaPartnersValueChanged

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
            java.util.logging.Logger.getLogger(ProjektInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjektInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjektInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjektInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ProjektInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblBeskrivning;
    private javax.swing.JLabel lblHallbarhetsmal;
    private javax.swing.JLabel lblKostnad;
    private javax.swing.JLabel lblLand;
    private javax.swing.JLabel lblMerInfoPartners;
    private javax.swing.JLabel lblPrioritet;
    private javax.swing.JLabel lblProjektNamn;
    private javax.swing.JLabel lblProjektchef;
    private javax.swing.JLabel lblSlutdatum;
    private javax.swing.JLabel lblStartdatum;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JList<String> listaPartners;
    // End of variables declaration//GEN-END:variables

}
