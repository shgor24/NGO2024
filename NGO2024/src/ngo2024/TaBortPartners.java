/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author mursalmohammad
 */
public class TaBortPartners extends javax.swing.JFrame {
    private InfDB idb;
    private String pid;
    private String aid;
    /**
     * Creates new form TaBortPartners
     */
    public TaBortPartners(InfDB idb, String pid, String aid) {
         this.idb = idb;
        this.pid = pid;
        this.aid = aid;
        initComponents();
        hamtaPartners();
        listener();
    }
    
     private void  hamtaPartners()
    {
        try {String sqlFraga = "SELECT partner.namn, partner.kontaktperson, partner.pid " +
                  "FROM partner " +
                  "LEFT JOIN projekt_partner ON partner.pid = projekt_partner.partner_pid AND projekt_partner.pid = 1 ";
                  //"WHERE projekt_partner.partner_pid IS NULL";
//            ArrayList<HashMap<String, String>> resultatLista = idb.fetchRows(sqlFraga);
//
//            //Skapar en HashMap där alla aid lagras som nycklar och värdena blir för- och efternamn i en ArrayList
//            HashMap<String, ArrayList<String>> partnerLista = new HashMap<>();
//
//            for (HashMap<String, String> rad : resultatLista) {
//                String partnerId = rad.get("pid");
//                String namn = rad.get("namn");
//                String kontaktperson = rad.get("kontaktperson");
//
//                ArrayList<String> namnLista = new ArrayList<String>();
//                namnLista.add(namn);
//                namnLista.add(kontaktperson);
//
//                partnerLista.put(partnerId, namnLista);
//
//            }
//       DefaultListModel<String> lista = new DefaultListModel<>();
//
//            for (String partnerId : partnerLista.keySet()) {
//                ArrayList<String> partnerNamn = partnerLista.get(partnerId);
//
//                String helaNamnet = partnerNamn.get(0) + " " + partnerNamn.get(1);
//
//                lista.addElement(helaNamnet + " ID: " + partnerId);
//            }
//
//        listaPartners.setModel(lista);
    ArrayList<HashMap<String, String>> resultatLista = idb.fetchRows(sqlFraga);
        
        DefaultListModel<String> lista = new DefaultListModel<>();
        
        for (HashMap<String, String> rad : resultatLista) {
                String partnerId = rad.get("pid");
                String namn = rad.get("namn");
                String kontaktperson = rad.get("kontaktperson");
                
                String helaNamnet = namn + " " + kontaktperson;

                lista.addElement(helaNamnet + " ID: " + partnerId);
        }
        
        
        listaPartners.setModel(lista);
        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }
        private void listener() {
        listaPartners.addListSelectionListener(new ListSelectionListener() {

            //När användaren har valt ett projekt i listan kommer detta att köras, tack vare valueChanged() metoden
            public void valueChanged(ListSelectionEvent e) {

                //Anropar en metod från ListSelectionEvent som returnerar true om användaren har valt något i listan
                if (!e.getValueIsAdjusting()) {
                    int valtIndex = listaPartners.getSelectedIndex();

                    //Kontrollerar om användaren har valt ett giltigt värde i listan
                    if (valtIndex != -1) {
                        //Hämtar projektnamnet som valdes i listan
                        String valtpartner = listaPartners.getSelectedValue();

                        //Hämtar pid från listnamnet med hjälp av substring() metoden
                        String[] delar = valtpartner.split(" ID: ");

                        String helaNamnet = delar[0];
                        String partnerId = delar[1];

                        if (bekraftaVal(helaNamnet)) {
                            taBortpartner(partnerId);
                        }

                    }

                }
            }
        });
    }
     private boolean bekraftaVal(String namn) {
        int bekrafta = JOptionPane.showConfirmDialog(this, "Vänligen bekräfta att du vill ta bort " + namn + " från projektet", "Bekräfta", JOptionPane.YES_NO_OPTION);

        return bekrafta == JOptionPane.YES_OPTION;
    }
    
 private void taBortpartner(String partnerId) {
        try {
            String sqlFraga = "DELETE FROM projekt_partner WHERE pid = " + pid + " AND partner_pid = " + partnerId;
            idb.delete(sqlFraga);
            //Updaterar listan
            hamtaProjektetspartner();

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

        lblRubrik = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPartners = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        lblRubrik.setText("Välj en partner att ta bort från projektet");

        listaPartners.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaPartners);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRubrik)
                        .addContainerGap(146, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(163, 163, 163))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(TaBortPartners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortPartners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortPartners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortPartners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TaBortPartners().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JList<String> listaPartners;
    // End of variables declaration//GEN-END:variables

    private void hamtaProjektetspartner() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}