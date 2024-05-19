/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author mikaela nilsson
 */
public class LaggTillHandlaggare extends javax.swing.JFrame {

    private InfDB idb;
    private String pid;
    private String aid;

    /**
     * Creates new form LaggTillHandlaggare
     */
    public LaggTillHandlaggare(InfDB idb, String pid, String aid) {
        this.idb = idb;
        this.pid = pid;
        this.aid = aid;
        initComponents();
        hamtaAllaHandlaggare();
        listener();
    }

    private void hamtaAllaHandlaggare() {
        try {
            //En sql-fråga som hämtar aid samt för- och efternamn på de handläggare som inte redan tillhör det valda projektet och som inte är användaren själv
            String sqlFraga = "select anstalld.fornamn, anstalld.efternamn, anstalld.aid from anstalld join handlaggare on anstalld.aid = handlaggare.aid where anstalld.aid not in (select aid from ans_proj where pid = " + pid + ") and anstalld.aid != " + aid;

            ArrayList<HashMap<String, String>> resultatLista = idb.fetchRows(sqlFraga);

            //Skapar en HashMap där alla aid lagras som nycklar och värdena blir för- och efternamn i en ArrayList
            HashMap<String, ArrayList<String>> handlaggareLista = new HashMap<>();

            for (HashMap<String, String> rad : resultatLista) {
                String anstalldId = rad.get("aid");
                String fornamn = rad.get("fornamn");
                String efternamn = rad.get("efternamn");

                //Här skapas ArrayListan som lagrar för- och efternamn för varje hämtad anställd
                ArrayList<String> namnLista = new ArrayList<String>();
                namnLista.add(fornamn);
                namnLista.add(efternamn);

                handlaggareLista.put(anstalldId, namnLista);

            }

            DefaultListModel<String> lista = new DefaultListModel<>();

            for (String anstalldId : handlaggareLista.keySet()) {
                ArrayList<String> handlaggareNamn = handlaggareLista.get(anstalldId);

                String helaNamnet = handlaggareNamn.get(0) + " " + handlaggareNamn.get(1);

                lista.addElement(helaNamnet + " ID: " + anstalldId);
            }

            listaHandlaggare.setModel(lista);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void listener() {
        listaHandlaggare.addListSelectionListener(new ListSelectionListener() {

            //När användaren har valt ett projekt i listan kommer detta att köras, tack vare valueChanged() metoden
            public void valueChanged(ListSelectionEvent e) {

                //Anropar en metod från ListSelectionEvent som returnerar true om användaren har valt något i listan
                if (!e.getValueIsAdjusting()) {
                    int valtIndex = listaHandlaggare.getSelectedIndex();

                    //Kontrollerar om användaren har valt ett giltigt värde i listan
                    if (valtIndex != -1) {
                        //Hämtar projektnamnet som valdes i listan
                        String valtHandlaggare = listaHandlaggare.getSelectedValue();

                        //Hämtar pid från listnamnet med hjälp av substring() metoden
                        String[] delar = valtHandlaggare.split(" ID: ");

                        String helaNamnet = delar[0];
                        String anstalldId = delar[1];

                        if (bekraftaVal(helaNamnet)) {
                            laggTillHandlaggare(anstalldId);
                        }

                    }

                }
            }
        });
    }

    private boolean bekraftaVal(String namn) {
        int bekrafta = JOptionPane.showConfirmDialog(this, "Vänligen bekräfta att du vill lägga till " + namn + " till projektet", "Bekräfta", JOptionPane.YES_NO_OPTION);

        return bekrafta == JOptionPane.YES_OPTION;
    }

    private void laggTillHandlaggare(String anstalldId) {
        try {
            String sqlFraga = "insert into ans_proj (pid, aid) values (" + pid + "," + anstalldId + ")";
            idb.insert(sqlFraga);
            //Updaterar listan
            hamtaAllaHandlaggare();

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        listaHandlaggare = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel1.setText("Välj en handläggare att lägga till på det valda projektet:");

        listaHandlaggare.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaHandlaggare);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(84, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(163, 163, 163))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(LaggTillHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillHandlaggare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LaggTillHandlaggare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaHandlaggare;
    // End of variables declaration//GEN-END:variables

}
