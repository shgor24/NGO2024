/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;

public class KostnadsStatistik extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;

    /**
     * Creates new form KostnadsStatistik
     */
    public KostnadsStatistik(InfDB idb, String aid) {
        this.idb = idb;
        this.aid = aid;
        initComponents();
        hamtaAllaProjektKostnad();
    }

    private void hamtaAllaProjektKostnad() {
        try {
            String sqlFraga = "select pid, projektnamn, kostnad from projekt where projektchef = " + aid;
            ArrayList<HashMap<String, String>> projektLista = idb.fetchRows(sqlFraga);

            //Skapar en UneditableTableModel med tre kolumner
            UneditableTableModel tabell = new UneditableTableModel(new Object[]{"ID", "Projektnamn", "Kostnad"}, 0);

            //En for-each loop som kör igenom projektListan med den hämtade datan
            for (HashMap<String, String> rad : projektLista) {
                String pid = rad.get("pid");
                String projektnamn = rad.get("projektnamn");
                String kostnad = rad.get("kostnad");

                //Lägger till en rad i tabellen med det som hämtades i en Object Array
                tabell.addRow(new Object[]{pid, projektnamn, kostnad});
            }

            kostnadsTabell.setModel(tabell);

        } catch (InfException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //Deklarerar en UneditableTableModel klass som gör att man inte ska kunna ändra i tabellens celler
    //"extends" gör att denna klass ärver alla DefaultTableModel klassens funktioner
    private class UneditableTableModel extends DefaultTableModel {

        //Här är konstruktorn till nya klassen, som tar emot en Array av Object för alla kolumnnamn och en int för antalet rader
        public UneditableTableModel(Object[] kolumnNamn, int antalRader) {

            //"super" anropar DefaultTableModel klassen 
            super(kolumnNamn, antalRader);
        }

        @Override
        public boolean isCellEditable(int rad, int kolumn) {
            return false;
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
        kostnadsTabell = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 2, 12)); // NOI18N
        jLabel1.setText("Kostnadsstatistik för alla mina projekt: ");

        kostnadsTabell.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        kostnadsTabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(kostnadsTabell);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(KostnadsStatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KostnadsStatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KostnadsStatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KostnadsStatistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new KostnadsStatistik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kostnadsTabell;
    // End of variables declaration//GEN-END:variables

}
