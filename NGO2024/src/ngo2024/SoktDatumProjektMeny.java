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
 * @author mikaela nilsson
 */
public class SoktDatumProjektMeny extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;

    /**
     * Creates new form DatumProjektMeny
     */
    public SoktDatumProjektMeny(InfDB idb, String aid) {
        this.idb = idb;
        this.aid = aid;
        initComponents();
        lblIngenResultat.setVisible(false);
        listener();
    }

    public void hamtaRelevantaProjekt(String start, String slut) {
        //Skapar ett objekt av ProjektMenyAvdelning klassen och anropar dess hamtaAvdelning metod
        ProjektMenyAvdelning projektMeny = new ProjektMenyAvdelning(idb, aid);
        String avdId = projektMeny.hamtaAvdelning();

        //Skapar en ArrayList av String utifrån det som returneras från ProjektMenyAvdelning klassens metod
        ArrayList<String> listaAnstallda = projektMeny.hamtaAvdAnstallda(avdId);

        //Kör igenom ArrayListan som skapades med alla relevanta anställdas aid
        for (String anstalldId : listaAnstallda) {

            try {
                //Använder en select-sats som hämtar alla projektnamn och pid på de aktiva projekt mellan sökningens start- och slutdatum
                String sqlFraga = "select projektnamn, pid from projekt where (startdatum >= '" + start + "' and slutdatum <= '" + slut + "') and status = 'pågående'";

                //Sql frgans resultat lagras i en ArrayList av HashMap av Strings
                ArrayList<HashMap<String, String>> resultatLista = idb.fetchRows(sqlFraga);

                //En ny HashMap skapas där alla hämtade pid och projektnamn lagras från resultatLista
                HashMap<String, String> projektLista = new HashMap<>();

                //Kontrollerar om inget hämtades från databasen och visar ett meddelande till användaren om det
                if (resultatLista.isEmpty()) {
                    lblIngenResultat.setVisible(true);
                } else {

                    for (HashMap<String, String> rad : resultatLista) {
                        String projektId = rad.get("pid");
                        String projektNamn = rad.get("projektnamn");
                        projektLista.put(projektId, projektNamn);
                    }

                    DefaultListModel<String> lista = new DefaultListModel<String>();

                    //Kör igenom alla hämtade pid och lägger till de i DefaultListModel
                    for (String pid : projektLista.keySet()) {
                        lista.addElement(projektLista.get(pid) + " ID: " + pid);
                    }

                    listaProjekt.setModel(lista);
                }

            } catch (InfException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    private void listener() {
        listaProjekt.addListSelectionListener(new ListSelectionListener() {

            //När användaren har valt ett projekt i listan kommer detta att köras, tack vare valueChanged() metoden
            public void valueChanged(ListSelectionEvent e) {

                //Anropar en metod från ListSelectionEvent som returnerar true om användaren har valt något i listan
                if (!e.getValueIsAdjusting()) {
                    int valtIndex = listaProjekt.getSelectedIndex();

                    //Kontrollerar om användaren har valt ett giltigt värde i listan
                    if (valtIndex != -1) {
                        //Hämtar projektnamnet som valdes i listan
                        String valtProjekt = listaProjekt.getSelectedValue();

                        //Hämtar pid från listnamnet med hjälp av substring() metoden
                        String pid = valtProjekt.substring(valtProjekt.lastIndexOf(" ") + 1);

                        //Öppnar ett fönster med info om projektet som valts genom ProjektInfo
                        ProjektInfo projektInfo = new ProjektInfo(pid, idb);
                        projektInfo.laggTillText();
                        projektInfo.setVisible(true);

                    }

                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaProjekt = new javax.swing.JList<>();
        lblProjekt = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblIngenResultat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listaProjekt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listaProjekt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaProjekt.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(listaProjekt);

        lblProjekt.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        lblProjekt.setText("Din sökning gav följande projekt som resultat:");

        lblInfo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblInfo.setText("Välj ett projekt att läsa mer om");

        lblIngenResultat.setForeground(new java.awt.Color(255, 0, 51));
        lblIngenResultat.setText("Inga aktiva projekt hittades för det angivna datumintervallet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProjekt)
                    .addComponent(lblIngenResultat))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblProjekt)
                .addGap(18, 18, 18)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIngenResultat)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SoktDatumProjektMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoktDatumProjektMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoktDatumProjektMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoktDatumProjektMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SoktDatumProjektMeny().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblIngenResultat;
    private javax.swing.JLabel lblProjekt;
    private javax.swing.JList<String> listaProjekt;
    // End of variables declaration//GEN-END:variables

}
