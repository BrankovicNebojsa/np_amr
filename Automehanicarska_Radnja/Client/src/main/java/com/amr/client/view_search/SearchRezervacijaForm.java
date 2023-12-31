package com.amr.client.view_search;

import com.amr.client.controller.Controller;
import com.amr.client.tableModels.SearchRezervacijaTableModel;
import com.amr.common.domain.Rezervacija;
import java.util.List;

/**
 * Klasa koja predstavlja formu za pretrazivanje rezervacija
 *
 * @author Nebojsa Brankovic
 */
public class SearchRezervacijaForm extends javax.swing.JFrame {

    /**
     * Klijentski kontroler
     */
    private Controller c;

    /**
     * Creates new form SearchMusterijaForm
     */
    public SearchRezervacijaForm() {
        initComponents();
        c = new Controller();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRegistracioniBroj = new javax.swing.JLabel();
        jTextFieldRegistracioniBroj = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRezervacije = new javax.swing.JTable();
        jButtonNazad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pretraga automobila");

        jLabelRegistracioniBroj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRegistracioniBroj.setText("Registracioni broj");

        jTextFieldRegistracioniBroj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldRegistracioniBroj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldRegistracioniBrojKeyReleased(evt);
            }
        });

        jTableRezervacije.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableRezervacije.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableRezervacije.setRowHeight(30);
        jScrollPane1.setViewportView(jTableRezervacije);

        jButtonNazad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonNazad.setText("Nazad");
        jButtonNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNazadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabelRegistracioniBroj)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldRegistracioniBroj, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonNazad)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistracioniBroj)
                    .addComponent(jTextFieldRegistracioniBroj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonNazad)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRegistracioniBrojKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRegistracioniBrojKeyReleased
        String filter = jTextFieldRegistracioniBroj.getText();
        List<Rezervacija> rezervacije = c.getRezervacijeFilter(filter);
        jTableRezervacije.setModel(new SearchRezervacijaTableModel(rezervacije));
    }//GEN-LAST:event_jTextFieldRegistracioniBrojKeyReleased

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonNazadActionPerformed

    /**
     * Glavna metoda
     * 
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
            java.util.logging.Logger.getLogger(SearchRezervacijaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRezervacijaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRezervacijaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRezervacijaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRezervacijaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JLabel jLabelRegistracioniBroj;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRezervacije;
    private javax.swing.JTextField jTextFieldRegistracioniBroj;
    // End of variables declaration//GEN-END:variables

    /**
     * Metoda za popunjavanje tabele podacima iz baze podataka
     */
    private void populateTable() {
        jTableRezervacije.setModel(new SearchRezervacijaTableModel(c.getRezervacije()));
    }
}
