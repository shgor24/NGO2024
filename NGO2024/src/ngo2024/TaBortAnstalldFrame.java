/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author shenye
 */
public class TaBortAnstalldFrame extends javax.swing.JFrame {

    private InfDB idb;
    private DefaultListModel<String> listModel;
    int aid = -1;

    public TaBortAnstalldFrame(InfDB idb) {
        initComponents();
        this.idb = idb;
        try {
            String fetchUsersQuery = "SELECT * FROM ngo_2024.anstalld";
            ArrayList<HashMap<String, String>> resultSet = idb.fetchRows(fetchUsersQuery);

            listModel = new DefaultListModel<>();
            jList1.setModel(listModel);

            for (HashMap<String, String> result : resultSet) {
                // Loop over key-value pairs in each HashMap and print them
                StringBuilder listItem = new StringBuilder();
                for (Map.Entry<String, String> entry : result.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    listItem.append(key).append(": ").append(value).append(", ");

                    System.out.println("Key: " + key + ", Value: " + value);
                }
                listModel.addElement(listItem.toString());
            }

            getSelectedValueAndDelete();

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

        lblAnstalldAttTaBort = new javax.swing.JLabel();
        btnTaBortAnstalld = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAnstalldAttTaBort.setText("Välj anställd som ska bli borttagen");

        btnTaBortAnstalld.setText("Ta bort anställd");
        btnTaBortAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAnstalldActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnstalldAttTaBort)
                    .addComponent(btnTaBortAnstalld)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblAnstalldAttTaBort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnTaBortAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getSelectedValueAndDelete() {
        jList1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {

                    Object selectedValue = jList1.getSelectedValue();

                    if (selectedValue != null) {
                        String[] parts = selectedValue.toString().split(", ");
                        // int aid = -1; // Initialize aid to a default value
                        for (String part : parts) {
                            String[] keyValue = part.split(": ");
                            if (keyValue[0].trim().equals("aid")) {
                                aid = Integer.parseInt(keyValue[1]);
                                break; // Exit loop once aid is found
                            }
                        }
                    }
                    String sqlFraga = "DELETE FROM NGO_2024.Anstalld WHERE aid = '" + aid + "'";
                    
                    btnTaBortAnstalld.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            try {
                                idb.delete(sqlFraga);
                                JOptionPane.showMessageDialog(null, "Användare har blivit borttagen!", "Information", JOptionPane.INFORMATION_MESSAGE);

                                DefaultListModel<String> model = (DefaultListModel<String>) jList1.getModel();
                                model.removeElement(selectedValue);
                                jList1.repaint();
                            } catch (InfException ex) {
                                Logger.getLogger(TaBortAnstalldFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    });
                }
            }
        });
    }

    private void btnTaBortAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAnstalldActionPerformed

    }//GEN-LAST:event_btnTaBortAnstalldActionPerformed

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
            java.util.logging.Logger.getLogger(TaBortAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaBortAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaBortAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaBortAnstalldFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TaBortAnstalldFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBortAnstalld;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnstalldAttTaBort;
    // End of variables declaration//GEN-END:variables
}
