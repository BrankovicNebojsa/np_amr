package com.amr.client.view_find;

import com.amr.client.controller.Controller;
import com.amr.client.tableModels.SearchMusterijaTableModel;
import com.amr.client.view_add.AddAutomobilForm;
import com.amr.client.view_add.AddMusterija2Form;
import com.amr.common.domain.Musterija;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Klasa koja predstavlja formu za trazenje vlasnika
 *
 * @author Nebojsa Brankovic
 */
public class FindVlasnikForm extends javax.swing.JFrame {

    /**
     * nadklasa
     */
    private AddAutomobilForm aaf;
    /**
     * klijentski kontroler
     */
    private Controller c;

    /**
     * Creates new form SearchMusterijaForm
     *
     * @param aaf nadklasa/forma
     */
    public FindVlasnikForm(AddAutomobilForm aaf) {
        initComponents();
        c = new Controller();
        this.aaf = aaf;
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

        jLabelFilter = new javax.swing.JLabel();
        jTextFieldFilter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMusterije = new javax.swing.JTable();
        jButtonNazad = new javax.swing.JButton();
        jButtonNapraviNovuMusteriju = new javax.swing.JButton();
        jButtonIzaberiMusteriju = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Musterije");

        jLabelFilter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFilter.setText("Filter");

        jTextFieldFilter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldFilter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFilterKeyReleased(evt);
            }
        });

        jTableMusterije.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableMusterije.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMusterije.setRowHeight(30);
        jScrollPane1.setViewportView(jTableMusterije);

        jButtonNazad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonNazad.setText("Nazad");
        jButtonNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNazadActionPerformed(evt);
            }
        });

        jButtonNapraviNovuMusteriju.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonNapraviNovuMusteriju.setText("Dodaj");
        jButtonNapraviNovuMusteriju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNapraviNovuMusterijuActionPerformed(evt);
            }
        });

        jButtonIzaberiMusteriju.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonIzaberiMusteriju.setText("Izaberi");
        jButtonIzaberiMusteriju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzaberiMusterijuActionPerformed(evt);
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
                        .addComponent(jLabelFilter)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButtonNazad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNapraviNovuMusteriju, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jButtonIzaberiMusteriju, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFilter)
                    .addComponent(jTextFieldFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNazad)
                    .addComponent(jButtonNapraviNovuMusteriju)
                    .addComponent(jButtonIzaberiMusteriju))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFilterKeyReleased
        String filter = jTextFieldFilter.getText();
        List<Musterija> musterije = c.getMusterijeFilter(filter);
        jTableMusterije.setModel(new SearchMusterijaTableModel(musterije));
    }//GEN-LAST:event_jTextFieldFilterKeyReleased

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        this.setVisible(false);
        aaf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonNazadActionPerformed

    private void jButtonIzaberiMusterijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzaberiMusterijuActionPerformed
        if (jTableMusterije.getSelectedRow() != -1) {
            Musterija musterija = ((SearchMusterijaTableModel) jTableMusterije.getModel()).getMusterije().get(jTableMusterije.getSelectedRow());
            this.setVisible(false);
            aaf.setVlasnik(musterija);
            aaf.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Izaberite musteriju");
        }
    }//GEN-LAST:event_jButtonIzaberiMusterijuActionPerformed

    private void jButtonNapraviNovuMusterijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNapraviNovuMusterijuActionPerformed
        AddMusterija2Form amf = new AddMusterija2Form(this);
        this.setVisible(false);
        amf.setVisible(true);
    }//GEN-LAST:event_jButtonNapraviNovuMusterijuActionPerformed

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
            java.util.logging.Logger.getLogger(FindVlasnikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindVlasnikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindVlasnikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindVlasnikForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FindVlasnikForm(new AddAutomobilForm()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIzaberiMusteriju;
    private javax.swing.JButton jButtonNapraviNovuMusteriju;
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JLabel jLabelFilter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMusterije;
    private javax.swing.JTextField jTextFieldFilter;
    // End of variables declaration//GEN-END:variables

    /**
     * Metoda za popunjavanje tabele podacima iz baze podataka
     */
    public void populateTable() {
        jTableMusterije.setModel(new SearchMusterijaTableModel(c.getMusterije()));
    }

}
