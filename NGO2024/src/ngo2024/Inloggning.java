/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author sheny
 */
public class Inloggning extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form Inloggning
     */
    public Inloggning(InfDB idb) {
        this.idb = idb;
        initComponents();
        lblFelmeddelande.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEPost = new javax.swing.JLabel();
        lblLosenord = new javax.swing.JLabel();
        tfEPost = new javax.swing.JTextField();
        tfLosenord = new javax.swing.JTextField();
        lblFelmeddelande = new javax.swing.JLabel();
        btnLoggaIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEPost.setText("E-Post");

        lblLosenord.setText("Lösenord");

        tfEPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEPostActionPerformed(evt);
            }
        });

        lblFelmeddelande.setForeground(new java.awt.Color(255, 0, 0));
        lblFelmeddelande.setText("Felaktig epost eller lösenord");

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFelmeddelande, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoggaIn, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEPost, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfEPost, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(tfLosenord))))
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEPost)
                    .addComponent(tfEPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosenord)
                    .addComponent(tfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFelmeddelande)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoggaIn)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        try {
            // Hämta input values
            String ePost = tfEPost.getText();
            String losen = tfLosenord.getText();
            
            // Definiera frågor mot databasen för respektive roller
            String sqlFraga1 = "SELECT losenord FROM anstalld WHERE epost= '" + ePost + "'";
            String sqlFraga2 = "SELECT anstalld.epost, anstalld.losenord, anstalld.aid FROM anstalld JOIN handlaggare ON anstalld.aid = handlaggare.aid and anstalld.epost= '" + ePost + "'";
            String sqlFraga3 = "SELECT anstalld.epost, anstalld.losenord, anstalld.aid FROM anstalld JOIN admin ON anstalld.aid = admin.aid and anstalld.epost = '" + ePost + "'";
            String sqlFraga4 = "SELECT DISTINCT projekt.projektchef, projekt.projektnamn, projekt.pid, anstalld.epost, anstalld.losenord FROM projekt JOIN handlaggare ON projekt.projektchef = handlaggare.mentor JOIN anstalld ON projekt.pid = anstalld.aid and anstalld.ePost = '" + ePost + "'";
            String sqlFraga5 = "SELECT aid from anstalld where epost = '" + ePost + "'";
            
            // Utför anropen mot databasen, returnera värden i variablerna
            String userLosen = idb.fetchSingle(sqlFraga1);
            String isHandlaggare = idb.fetchSingle(sqlFraga2);
            String isAdminstrator = idb.fetchSingle(sqlFraga3);
            String isProjektChef = idb.fetchSingle(sqlFraga4);
            
            // Loggar in som ProjektChef/Ledare (Högst behörighet)
            if (losen.equals(userLosen) && isProjektChef != null) {
                setVisible(false);
                String aid = idb.fetchSingle(sqlFraga5);
                new ProjektledareMeny(idb, aid).setVisible(true);
                return;
            }
            //Loggar in som handläggare
            if (losen.equals(userLosen) && isHandlaggare != null) {
                setVisible(false);
                String aid = idb.fetchSingle(sqlFraga5);
                new HandläggareMeny(aid, idb).setVisible(true);
                return;
            }
            // Loggar in som administratör
            if (losen.equals(userLosen) && isAdminstrator != null) {
                setVisible(false);
                new AdministratorMeny().setVisible(true);
            }
            else {
                lblFelmeddelande.setVisible(true);
            }
        } catch (InfException ex) {
            System.out.println(ex.getMessage());

        }
    }//GEN-LAST:event_btnLoggaInActionPerformed

    private void tfEPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEPostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEPostActionPerformed

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
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inloggning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Inloggning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JLabel lblEPost;
    private javax.swing.JLabel lblFelmeddelande;
    private javax.swing.JLabel lblLosenord;
    private javax.swing.JTextField tfEPost;
    private javax.swing.JTextField tfLosenord;
    // End of variables declaration//GEN-END:variables
}
