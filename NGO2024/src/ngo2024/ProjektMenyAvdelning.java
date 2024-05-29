/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mikaela nilsson
 */
public class ProjektMenyAvdelning extends javax.swing.JFrame {

    private InfDB idb;
    private String anstalldId;

    /**
     * Creates new form ProjektMenyAvdelning
     */
    public ProjektMenyAvdelning(InfDB idb, String anstalldId) {
        this.idb = idb;
        this.anstalldId = anstalldId;
        initComponents();
        hamtaAllaProjekt();
        listener();
    }

    public String hamtaAvdelning() {
        String avdId = "";

        try {

            String sqlFraga = "select avdelning from anstalld where aid = " + anstalldId;
            avdId = idb.fetchSingle(sqlFraga);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }

        return avdId;

    }

    public ArrayList<String> hamtaAvdAnstallda(String avdId) {
        ArrayList<String> listaAnstallda = new ArrayList<>();

        try {
            String sqlFraga = "select aid from anstalld where avdelning = " + avdId;
            listaAnstallda = idb.fetchColumn(sqlFraga);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }

        return listaAnstallda;
    }

    private void hamtaAllaProjekt() {

        //Skapar en ArrayList av alla anställda på samma avdelning som användaren 
        //med hjälp av metoderna hamtaAvdelning() och hämtaAvdAnstallda()
        ArrayList<String> listaAnstallda = hamtaAvdAnstallda(hamtaAvdelning());

        ArrayList<String> listaProjektNamn = new ArrayList<String>();
        DefaultListModel<String> lista = new DefaultListModel<String>();

        //En for-each loop som kör igenom ArrayListan som skapades med alla relevanta aid
        //I loopen skapas en lista av pid på alla projekt som en viss anställd deltar i
        for (String anstalld : listaAnstallda) {
            try {
                String sqlFraga1 = "select pid from ans_proj where aid = " + anstalld;
                ArrayList<String> allaPid = idb.fetchColumn(sqlFraga1);

                for (String pid : allaPid) {
                    String projektNamn = "";

                    try {
                        String sqlFraga2 = "select projektnamn from projekt where pid = " + pid;
                        projektNamn = idb.fetchSingle(sqlFraga2);
                        String listansNamn = projektNamn + " ID: " + pid;

                        //Kör igenom listaProjektNamn listan för att kolla om det hämtade namnet inte redan finns med
                        if (!listaProjektNamn.contains(listansNamn)) {
                            listaProjektNamn.add(listansNamn);
                            //Lägger till varje hämtad projektnamn i DefaultModelListan
                            lista.addElement(listansNamn);

                        }

                    } catch (InfException ex) {
                        System.out.println(ex.getMessage());
                    }

                }

                //Ändrar listans model till den DefaultListModel som nu fyllts med alla relevanta projektnamn
                listaProjekt.setModel(lista);

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listaProjekt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listaProjekt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listaProjekt.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(listaProjekt);

        lblProjekt.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        lblProjekt.setText("Avdelningens Projekt:");

        lblInfo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblInfo.setText("Välj ett projekt att läsa mer om");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProjekt))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblProjekt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(ProjektMenyAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjektMenyAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjektMenyAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjektMenyAvdelning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ProjektMenyAvdelning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblProjekt;
    private javax.swing.JList<String> listaProjekt;
    // End of variables declaration//GEN-END:variables

}
