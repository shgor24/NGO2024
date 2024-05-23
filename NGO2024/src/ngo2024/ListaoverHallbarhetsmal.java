/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import oru.inf.InfDB;
import oru.inf.InfException;


public class ListaoverHallbarhetsmal extends javax.swing.JFrame {
    private InfDB idb;

    public ListaoverHallbarhetsmal(InfDB idb) {
        this.idb = idb; 
        initComponents();
        hamtalistan();
    }
    public void hamtalistan(){
    
    String sqlFraga1 = "select namn from hallbarhetsmal"; //kolla hur man hämtar nummer på målet
            
        try {  DefaultListModel<String> lista = new DefaultListModel<>();
        jList1Listan.setModel(lista);
            ArrayList<String> hallbarhetsmal = idb.fetchColumn(sqlFraga1);
            for (String namn: hallbarhetsmal) {
                lista.addElement(namn);
            }

            //Sätter listan ovan till modellen för listaProjekt, vilket ändrar dess innehåll
            
        } catch (InfException ex) {
            Logger.getLogger(ListaoverHallbarhetsmal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());}
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblrubrik = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1Listan = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblrubrik.setText("Lista Over Hallbarhetsmal");

        jScrollPane1.setViewportView(jList1Listan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblrubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblrubrik)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1Listan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblrubrik;
    // End of variables declaration//GEN-END:variables
}
