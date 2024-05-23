/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;


class AnstalldPaMinAdelning extends javax.swing.JFrame {
    private final InfDB idb;
    private final String aid;
   
    
    public AnstalldPaMinAdelning(InfDB idb, String aid) {
        this.aid=aid;
        this.idb =idb;
        initComponents();
        hamtanamnpapersonalen();
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
        jList1_listaoverpersonal = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setText("Personal på min avdelning");

        jList1_listaoverpersonal.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1_listaoverpersonal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    //Metod för att hämta namn på personalen på avdelningen och fylla i listan.
     public void hamtanamnpapersonalen() {
    try {// Hämta avdelningen för den aktuella användaren
        String sqlFraga1 = "SELECT avdelning from anstalld where aid =  " +aid ;
        String Avdelning = idb.fetchSingle(sqlFraga1);
        
        String sqlFraga2 = "SELECT fornamn, efternamn FROM anstalld WHERE avdelning = " +Avdelning;  // Hämta förnamn och efternamn för alla anställda på avdelningen

        // Det här antar att fetchRows returnerar en lista av HashMap där varje HashMap representerar en rad i resultatet.
        ArrayList<HashMap<String, String>> personalList = idb.fetchRows(sqlFraga2);
        DefaultListModel<String> lista = new DefaultListModel<>();

        if (personalList !=null){
        for (HashMap<String, String> rad : personalList) {
            String namn = rad.get("fornamn") + " " + rad.get("efternamn");
            lista.addElement(namn);
        }
        }
        else {
            System.out.println("Ingen personal hittades för avdelningen"+ Avdelning);
            
        }
    jList1_listaoverpersonal.setModel(lista);
}catch (InfException ex) {
        System.out.println("Ett fel inträffade:" +ex.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1_listaoverpersonal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}
