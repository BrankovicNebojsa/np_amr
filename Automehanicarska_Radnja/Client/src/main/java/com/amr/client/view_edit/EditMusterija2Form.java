package com.amr.client.view_edit;

import com.amr.client.controller.Controller;
import com.amr.common.domain.Musterija;
import javax.swing.JOptionPane;

/**
 * Klasa koja predstavlja formu za izmenu musterija
 *
 * @author Nebojsa Brankovic
 */
public class EditMusterija2Form extends javax.swing.JFrame {

    /**
     * Musterija koja se izmenjuje
     */
    private Musterija musterija;
    /**
     * Klijentski kontroler
     */
    private Controller c;

    /**
     * Creates new form EditMusterija2Form
     */
    public EditMusterija2Form(Musterija musterija) {
        initComponents();
        c = new Controller();
        this.musterija = musterija;
        prepareForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIme = new javax.swing.JLabel();
        jTextFieldIme = new javax.swing.JTextField();
        jLabelPrezime = new javax.swing.JLabel();
        jTextFieldPrezime = new javax.swing.JTextField();
        jLabelMail = new javax.swing.JLabel();
        jTextFieldMail = new javax.swing.JTextField();
        jLabelTelefon = new javax.swing.JLabel();
        jTextFieldBrojTelefona = new javax.swing.JTextField();
        jLabelImeObaveza = new javax.swing.JLabel();
        jLabelPrezimeObaveza = new javax.swing.JLabel();
        jLabelMailObaveza = new javax.swing.JLabel();
        jLabelBrojTelefonaObaveza = new javax.swing.JLabel();
        jButtonZapamti = new javax.swing.JButton();
        jButtonNazad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Izmena musterije");

        jLabelIme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelIme.setText("Ime");

        jTextFieldIme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelPrezime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPrezime.setText("Prezime");

        jTextFieldPrezime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelMail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelMail.setText("Mail");

        jTextFieldMail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelTelefon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTelefon.setText("Broj telefona");

        jTextFieldBrojTelefona.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelImeObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelImeObaveza.setText("Obavezno polje!");

        jLabelPrezimeObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelPrezimeObaveza.setText("Obavezno polje!");

        jLabelMailObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMailObaveza.setText("Obavezno polje!");

        jLabelBrojTelefonaObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelBrojTelefonaObaveza.setText("Obavezno polje!");

        jButtonZapamti.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonZapamti.setText("Zapamti");
        jButtonZapamti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZapamtiActionPerformed(evt);
            }
        });

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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNazad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(jButtonZapamti))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelIme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPrezime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBrojTelefonaObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelMailObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelPrezimeObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelImeObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldIme)
                            .addComponent(jTextFieldPrezime)
                            .addComponent(jTextFieldMail)
                            .addComponent(jTextFieldBrojTelefona))))
                .addGap(809, 809, 809))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIme)
                    .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImeObaveza)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrezime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPrezimeObaveza)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMailObaveza)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBrojTelefonaObaveza)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNazad)
                    .addComponent(jButtonZapamti))
                .addContainerGap(316, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        EditMusterijaForm emf = new EditMusterijaForm();
        this.setVisible(false);
        emf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonNazadActionPerformed

    private void jButtonZapamtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZapamtiActionPerformed
        if (isDataValid()) {
            if (c.updateMusterija(musterija)) {
                JOptionPane.showMessageDialog(this, "Uspesno izmenjena musterija");
                EditMusterijaForm emf = new EditMusterijaForm();
                emf.setVisible(true);
                this.setVisible(false);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Greska u izmeni musterije");
            }
        }
    }//GEN-LAST:event_jButtonZapamtiActionPerformed

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
            java.util.logging.Logger.getLogger(EditMusterija2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMusterija2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMusterija2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMusterija2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMusterija2Form(new Musterija()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JButton jButtonZapamti;
    private javax.swing.JLabel jLabelBrojTelefonaObaveza;
    private javax.swing.JLabel jLabelIme;
    private javax.swing.JLabel jLabelImeObaveza;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelMailObaveza;
    private javax.swing.JLabel jLabelPrezime;
    private javax.swing.JLabel jLabelPrezimeObaveza;
    private javax.swing.JLabel jLabelTelefon;
    private javax.swing.JTextField jTextFieldBrojTelefona;
    private javax.swing.JTextField jTextFieldIme;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldPrezime;
    // End of variables declaration//GEN-END:variables

    /**
     * Metoda koja priprema formu
     */
    private void prepareForm() {
        jLabelImeObaveza.setVisible(false);
        jLabelPrezimeObaveza.setVisible(false);
        jLabelMailObaveza.setVisible(false);
        jLabelBrojTelefonaObaveza.setVisible(false);
        jTextFieldIme.setText(musterija.getImeMusterije());
        jTextFieldPrezime.setText(musterija.getPrezimeMusterije());
        jTextFieldMail.setText(musterija.getMailMusterije());
        jTextFieldBrojTelefona.setText(musterija.getTelefonMusterije());
    }

    /**
     * Metoda koja ispituje validnost unosa
     *
     * @return validnost unosa
     */
    private boolean isDataValid() {
        if (jTextFieldIme == null || jTextFieldIme.getText().equals("")) {
            jLabelImeObaveza.setVisible(true);
            return false;
        } else {
            musterija.setImeMusterije(jTextFieldIme.getText());
            jLabelImeObaveza.setVisible(false);

        }
        if (jTextFieldPrezime == null || jTextFieldPrezime.getText().equals("")) {
            jLabelPrezimeObaveza.setVisible(true);
            return false;
        } else {
            musterija.setPrezimeMusterije(jTextFieldPrezime.getText());
            jLabelPrezimeObaveza.setVisible(false);
        }
        if (jTextFieldMail == null || jTextFieldMail.getText().equals("")) {
            jLabelMailObaveza.setVisible(true);
            return false;
        } else {
            musterija.setMailMusterije(jTextFieldMail.getText());
            jLabelMailObaveza.setVisible(false);
        }
        if (jTextFieldBrojTelefona == null || jTextFieldBrojTelefona.getText().equals("")) {
            jLabelBrojTelefonaObaveza.setVisible(true);
            return false;
        } else {
            musterija.setTelefonMusterije(jTextFieldBrojTelefona.getText());
            jLabelBrojTelefonaObaveza.setVisible(false);
        }
        return true;
    }
}
