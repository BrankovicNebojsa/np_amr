package com.amr.client.view_add;

import com.amr.client.controller.Controller;
import com.amr.client.tableModels.AddMusterijaTableModel;
import com.amr.common.domain.Musterija;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nebojsa Brankovic
 */
public class AddMusterijaForm extends javax.swing.JFrame {

    /**
     * Creates new form AddMusterijaForm
     */
    private Controller c;

    public AddMusterijaForm() {
        initComponents();
        c = new Controller();
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
        jLabelPrezime = new javax.swing.JLabel();
        jLabelMail = new javax.swing.JLabel();
        jLabelBrojTelefona = new javax.swing.JLabel();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldBrojTelefona = new javax.swing.JTextField();
        jTextFieldPrezime = new javax.swing.JTextField();
        jTextFieldIme = new javax.swing.JTextField();
        jButtonZapamti = new javax.swing.JButton();
        jButtonNazad = new javax.swing.JButton();
        jLabelImeObaveza = new javax.swing.JLabel();
        jLabelPrezimeObaveza = new javax.swing.JLabel();
        jLabelMailObaveza = new javax.swing.JLabel();
        jLabelBrojTelefonaObaveza = new javax.swing.JLabel();
        jTextFieldBrojTelefonaPrefiks = new javax.swing.JTextField();
        jLabelBrojTelefonaZnakovi = new javax.swing.JLabel();
        jButtonDodaj = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMusterije = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dodavanje musterije");

        jLabelIme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelIme.setText("Ime");

        jLabelPrezime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPrezime.setText("Prezime");

        jLabelMail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelMail.setText("Mail");

        jLabelBrojTelefona.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelBrojTelefona.setText("Broj telefona");

        jTextFieldMail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldMail.setText("@gmail.com");

        jTextFieldBrojTelefona.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldPrezime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldIme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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

        jLabelImeObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelImeObaveza.setText("Obavezno polje!");

        jLabelPrezimeObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelPrezimeObaveza.setText("Obavezno polje!");

        jLabelMailObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMailObaveza.setText("Obavezno polje!");

        jLabelBrojTelefonaObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelBrojTelefonaObaveza.setText("Obavezno polje!");

        jTextFieldBrojTelefonaPrefiks.setEditable(false);
        jTextFieldBrojTelefonaPrefiks.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldBrojTelefonaPrefiks.setText("+381");

        jLabelBrojTelefonaZnakovi.setForeground(new java.awt.Color(255, 0, 0));
        jLabelBrojTelefonaZnakovi.setText("Dozvoljen unos iskljucivo brojeva!");

        jButtonDodaj.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonDodaj.setText("Dodaj");
        jButtonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDodajActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIme)
                    .addComponent(jLabelPrezime))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelImeObaveza, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrezimeObaveza, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIme)
                    .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelBrojTelefona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMailObaveza, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMail)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextFieldBrojTelefonaPrefiks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBrojTelefonaObaveza)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelBrojTelefonaZnakovi, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jButtonDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButtonNazad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonZapamti)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelMailObaveza)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBrojTelefona)
                                    .addComponent(jTextFieldBrojTelefonaPrefiks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonDodaj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBrojTelefonaObaveza)
                            .addComponent(jLabelBrojTelefonaZnakovi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIme))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelImeObaveza)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrezime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPrezimeObaveza)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonZapamti)
                    .addComponent(jButtonNazad))
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonNazadActionPerformed

    private void jButtonZapamtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZapamtiActionPerformed
        if (!((AddMusterijaTableModel) jTableMusterije.getModel()).getMusterije().isEmpty()) {
            List<Musterija> musterije = ((AddMusterijaTableModel) jTableMusterije.getModel()).getMusterije();
            if (!c.saveMusterije(musterije)) {
                JOptionPane.showMessageDialog(this, "Greska u pamcenju musterija.", "Greska", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Unete musterije su zapamcene.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Niste dodali nijednu musteriju.", "Greska", JOptionPane.ERROR_MESSAGE);
        }
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_jButtonZapamtiActionPerformed

    private void jButtonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDodajActionPerformed
        if (isDataValid()) {
            Musterija musterija = new Musterija();
            musterija.setImeMusterije(jTextFieldIme.getText());
            musterija.setPrezimeMusterije(jTextFieldPrezime.getText());
            musterija.setMailMusterije(jTextFieldMail.getText());
            musterija.setTelefonMusterije("+381" + jTextFieldBrojTelefona.getText());
            ((AddMusterijaTableModel) jTableMusterije.getModel()).addMusterija(musterija);
        }

    }//GEN-LAST:event_jButtonDodajActionPerformed

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
            java.util.logging.Logger.getLogger(AddMusterijaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMusterijaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMusterijaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMusterijaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMusterijaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDodaj;
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JButton jButtonZapamti;
    private javax.swing.JLabel jLabelBrojTelefona;
    private javax.swing.JLabel jLabelBrojTelefonaObaveza;
    private javax.swing.JLabel jLabelBrojTelefonaZnakovi;
    private javax.swing.JLabel jLabelIme;
    private javax.swing.JLabel jLabelImeObaveza;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelMailObaveza;
    private javax.swing.JLabel jLabelPrezime;
    private javax.swing.JLabel jLabelPrezimeObaveza;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMusterije;
    private javax.swing.JTextField jTextFieldBrojTelefona;
    private javax.swing.JTextField jTextFieldBrojTelefonaPrefiks;
    private javax.swing.JTextField jTextFieldIme;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldPrezime;
    // End of variables declaration//GEN-END:variables

    private void prepareForm() {
        resetData();
        jTableMusterije.setModel(new AddMusterijaTableModel());

    }

    private boolean isDataValid() {
        if (jTextFieldIme == null || jTextFieldIme.getText().equals("")) {
            jLabelImeObaveza.setVisible(true);
            return false;
        } else {
            jLabelImeObaveza.setVisible(false);
        }
        if (jTextFieldPrezime == null || jTextFieldPrezime.getText().equals("")) {
            jLabelPrezimeObaveza.setVisible(true);
            return false;
        } else {
            jLabelPrezimeObaveza.setVisible(false);
        }
        if (jTextFieldMail == null || jTextFieldMail.getText().equals("") || jTextFieldMail.getText().equals("@gmail.com")) {
            jLabelMailObaveza.setVisible(true);
            return false;
        } else {
            jLabelMailObaveza.setVisible(false);
        }
        if (jTextFieldBrojTelefona == null || jTextFieldBrojTelefona.getText().equals("")) {
            jLabelBrojTelefonaObaveza.setVisible(true);
            return false;
        } else {
            jLabelBrojTelefonaObaveza.setVisible(false);
        }
        if (!isOk()) {
            jLabelBrojTelefonaZnakovi.setVisible(true);
            return false;
        } else {
            jLabelBrojTelefonaZnakovi.setVisible(false);
        }
        return true;
    }

    private boolean isOk() {
        char[] znakovi = new char[]{'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'g', 'G',
            'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'u', 'U', 'v', 'V', 'w', 'W',
            'x', 'X', 'y', 'Y', 'z', 'Z', '-', '_', '+', '=', ',', '.', '<', '>', '/', '?', '"', '\\', '\'', '|', ':', ';', '[', '{', '}', ']',
            '!', '~', '`', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
        char[] unos = jTextFieldBrojTelefona.getText().toCharArray();
        for (int i = 0; i < unos.length; i++) {
            for (int j = 0; j < znakovi.length; j++) {
                if (unos[i] == znakovi[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetData() {
        jLabelImeObaveza.setVisible(false);
        jLabelPrezimeObaveza.setVisible(false);
        jLabelMailObaveza.setVisible(false);
        jLabelBrojTelefonaObaveza.setVisible(false);
        jLabelBrojTelefonaZnakovi.setVisible(false);

        jTextFieldIme.setText("");
        jTextFieldPrezime.setText("");
        jTextFieldMail.setText("@gmail.com");
        jTextFieldBrojTelefona.setText("");
    }
}
