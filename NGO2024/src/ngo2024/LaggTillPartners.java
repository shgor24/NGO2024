/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
//import static javax.swing.JOptionPane.showConfirmDialog;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author mursalmohammad
 */
public class LaggTillPartners extends javax.swing.JFrame {
    private InfDB idb;
    private String pid;
    private String aid;
    private DefaultListModel<String> listaModel;//ny
    /**
     * Creates new form LaggTillPartners
     */
    public LaggTillPartners(InfDB idb, String pid, String aid) { 
        this.idb = idb;
        this.pid = pid;
        this.aid = aid;
        initComponents();
        hamtaAllaPartners();
        listener();
      
    }
 
    private void hamtaAllaPartners(){
        try {
       String sqlFraga = "SELECT partner.namn, partner.kontaktperson, partner.pid " +
                       "FROM partner ";// +
                       //"WHERE partner.pid NOT IN (SELECT partner_pid FROM projekt_partner WHERE pid = 1)";

 
        ArrayList<HashMap<String, String>> resultatLista = idb.fetchRows(sqlFraga);
        
        DefaultListModel<String> lista = new DefaultListModel<>();
        
        for (HashMap<String, String> rad : resultatLista) {
                String partnerId = rad.get("pid");
                String namn = rad.get("namn");
                String kontaktperson = rad.get("kontaktperson");
                
                String helaNamnet = namn + " " + kontaktperson;

                lista.addElement(helaNamnet + " ID: " + partnerId);
        }
        
        
        listapartners.setModel(lista);
        
        
//        HashMap<String, ArrayList<String>> listapartners = new HashMap<>();
//        
//        for (HashMap<String, String> rad : resultatLista) {
//                String partnerId = rad.get("pid");
//                String namn = rad.get("namn");
//                String kontaktperson = rad.get("kontaktperson");
//
//                //Här skapas ArrayListan som lagrar för- och efternamn för varje hämtad anställd
//                ArrayList<String> namnLista = new ArrayList<String>();
//                namnLista.add(namn);
//                namnLista.add(kontaktperson);
//                listapartners.put(partnerId, namnLista);
//
//            }
//            DefaultListModel<String> lista = new DefaultListModel<>();
//
//            for (String partnerId : listapartners.keySet()) {
//            
//                ArrayList<String> partnerNamn = listapartners.get(partnerId);
//
//                String helaNamnet = partnerNamn.get(0) + " " + partnerNamn.get(1);
//
//                lista.addElement(helaNamnet + " ID: " + partnerId);
//            }

//            listaPartner.setModel(lista);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void listener() {
        listapartners.addListSelectionListener(new ListSelectionListener() {

            //När användaren har valt ett projekt i listan kommer detta att köras, tack vare valueChanged() metoden
            public void valueChanged(ListSelectionEvent e) {

                //Anropar en metod från ListSelectionEvent som returnerar true om användaren har valt något i listan
                if (!e.getValueIsAdjusting()) {
                    int valtIndex = listapartners.getSelectedIndex();

                    //Kontrollerar om användaren har valt ett giltigt värde i listan
                    if (valtIndex != -1) {
                        //Hämtar projektnamnet som valdes i listan
                        String valtPartner = listapartners.getSelectedValue();

                        //Hämtar pid från listnamnet med hjälp av substring() metoden
                        String[] delar = valtPartner.split(" ID: ");

                        String helaNamnet = delar[0];
                        String partnerId = delar[1];

                        if (bekraftaVal(helaNamnet)) {
                            laggTillPartners(partnerId);
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

    private void laggTillPartners(String partnerId) {
        try {
            String sqlFraga = "insert into projekt_partner (pid, partner_pid) values (" + pid + "," + partnerId + ")";
            idb.insert(sqlFraga);
            //Updaterar lisa
            hamtaAllaPartners();

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

        jLabel1Rubrik = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listapartners = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1Rubrik.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel1Rubrik.setText("Välj en partner att lägga till på det valda projektet:");

        listapartners.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listapartners);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1Rubrik)
                        .addContainerGap(79, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(163, 163, 163))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1Rubrik)
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
            java.util.logging.Logger.getLogger(LaggTillPartners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggTillPartners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggTillPartners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggTillPartners.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater (new Runnable() {
            public void run() {
                //new LaggTillPartners().setVisible(true);
            }
        }); }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1Rubrik;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listapartners;
    // End of variables declaration//GEN-END:variables

    private static class listaPartner {

        private static void setModel(DefaultListModel<String> lista) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public listaPartner() {
        }
    }

}