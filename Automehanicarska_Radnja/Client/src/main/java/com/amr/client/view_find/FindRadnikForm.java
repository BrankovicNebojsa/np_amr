package com.amr.client.view_find;

import com.amr.client.controller.Controller;
import com.amr.client.tableModels.SearchRadnikTableModel;
import com.amr.client.view_add.AddRezervacijaForm1;
import com.amr.common.domain.Radnik;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Klasa koja predstavlja formu za trazenje radnika
 *
 * @author Nebojsa Brankovic
 */
public class FindRadnikForm extends javax.swing.JFrame {

    /**
     * nadklasa
     */
    private AddRezervacijaForm1 arf;
    /**
     * klijentski kontroler
     */
    private Controller c;

    /**
     * Creates new form SearchMusterijaForm
     *
     * @param arf nadklasa/forma
     */
    public FindRadnikForm(AddRezervacijaForm1 arf) {
        initComponents();
        c = new Controller();
        this.arf = arf;
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
        jTableRadnici = new javax.swing.JTable();
        jButtonNazad = new javax.swing.JButton();
        jButtonIzaberiRadnika = new javax.swing.JButton();

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

        jTableRadnici.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableRadnici.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableRadnici.setRowHeight(30);
        jScrollPane1.setViewportView(jTableRadnici);

        jButtonNazad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonNazad.setText("Nazad");
        jButtonNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNazadActionPerformed(evt);
            }
        });

        jButtonIzaberiRadnika.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonIzaberiRadnika.setText("Izaberi");
        jButtonIzaberiRadnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIzaberiRadnikaActionPerformed(evt);
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
                .addGap(25, 25, 25)
                .addComponent(jButtonNazad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIzaberiRadnika, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButtonIzaberiRadnika))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFilterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFilterKeyReleased
        String filter = jTextFieldFilter.getText();
        List<Radnik> radnici = c.getRadniciFilter(filter);
        jTableRadnici.setModel(new SearchRadnikTableModel(radnici));
    }//GEN-LAST:event_jTextFieldFilterKeyReleased

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        this.setVisible(false);
        arf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonNazadActionPerformed

    private void jButtonIzaberiRadnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIzaberiRadnikaActionPerformed
        if (jTableRadnici.getSelectedRow() != -1) {
            Radnik radnik = ((SearchRadnikTableModel) jTableRadnici.getModel()).getRadnici().get(jTableRadnici.getSelectedRow());
            arf.setRadnik(radnik);
            this.setVisible(false);
            arf.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Izaberite radnika");
        }
    }//GEN-LAST:event_jButtonIzaberiRadnikaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIzaberiRadnika;
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JLabel jLabelFilter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRadnici;
    private javax.swing.JTextField jTextFieldFilter;
    // End of variables declaration//GEN-END:variables

    /**
     * Metoda koja popunjava tabelu iz baze podataka
     */
    public void populateTable() {
        jTableRadnici.setModel(new SearchRadnikTableModel(c.getRadnici()));
    }

}
