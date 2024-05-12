/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author mikni
 */
public class ProjektMenyAnstalld extends javax.swing.JFrame {
    
    private InfDB idb;
    private String aid;
    

    /** Creates new form ProjektMenyAnstalld */
    public ProjektMenyAnstalld(InfDB idb, String aid) {
        this.idb = idb;
        this.aid = aid;
        initComponents();
        listener();
    }
    
    /**
     * En metod som använder en sql-fråga för att hämta alla projekt som är
     * kopplade till en viss aid i ans_proj tabellen.
     */
    public void hamtaAllaProjekt() {
        try {
            //Hämtar pid och namn på projekt som en viss anställd tillhör
            String sqlFraga = "select projekt.pid, projekt.projektnamn from projekt join ans_proj on projekt.pid = ans_proj.pid where ans_proj.aid =" + aid;

            //Skapar en ArrayList av HashMap av Strings med alla hämtade pid och namn
            ArrayList<HashMap<String, String>> resultatLista = idb.fetchRows(sqlFraga);

            //Skapar en ny HashMap för pid och projektnamn
            HashMap<String, String> projektLista = new HashMap<>();

            //Fyller HashMapen projektLista med de hämtade pid som nycklar och projektnamnen som värden
            for (HashMap<String, String> rad : resultatLista) {
                String pid = rad.get("pid");
                String projektNamn = rad.get("projektnamn");
                projektLista.put(pid, projektNamn);
            }

            //Skapar ett objekt av DefaultListModel som gör att man kan lägga till saker i JListan
            DefaultListModel<String> lista = new DefaultListModel<>();

            //Itererar igenom HashMapens alla pid
            for (String pid : projektLista.keySet()) {

                //Hämtar projektnamn för en viss pid
                String namn = projektLista.get(pid);

                //Lägger till varje projektnamn och pid i listan för att lättare identifiera varje projekt även om de skulle ha samma namn
                lista.addElement(namn + " ID: " + pid);
            }

            //Sätter listan ovan till modellen för listaProjekt, vilket ändrar dess innehåll
            listaProjekt.setModel(lista);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
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

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaProjekt = new javax.swing.JList<>();
        lblProjekt = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaProjekt.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(listaProjekt);

        lblProjekt.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        lblProjekt.setText("Mina Projekt:");

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
            java.util.logging.Logger.getLogger(ProjektMenyAnstalld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjektMenyAnstalld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjektMenyAnstalld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjektMenyAnstalld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ProjektMenyAnstalld().setVisible(true);
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
