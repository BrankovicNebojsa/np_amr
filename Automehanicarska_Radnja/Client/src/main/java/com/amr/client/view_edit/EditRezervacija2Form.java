package com.amr.client.view_edit;

import com.amr.client.controller.Controller;
import com.amr.common.domain.Rezervacija;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Nebojsa Brankovic
 */
public class EditRezervacija2Form extends javax.swing.JFrame {

    /**
     * Creates new form AddAutomobilForm
     */
    private Rezervacija rezervacija;
    private EditRezervacijaForm erf;
    private Controller c;

    public EditRezervacija2Form(EditRezervacijaForm erf, Rezervacija rezervacija) {
        initComponents();
        c = new Controller();
        this.rezervacija = rezervacija;
        this.erf = erf;
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

        jLabelDatumRezervacije = new javax.swing.JLabel();
        jTextFieldDatumRezervacije = new javax.swing.JTextField();
        jLabelDatumRezervacijaObaveza = new javax.swing.JLabel();
        jLabelRadnikObaveza = new javax.swing.JLabel();
        jLabelAutomobil = new javax.swing.JLabel();
        jTextFieldRadnik = new javax.swing.JTextField();
        jLabelAutomobilObaveza = new javax.swing.JLabel();
        jLabelTrajanjeServisaObaveza = new javax.swing.JLabel();
        jLabelRadnik = new javax.swing.JLabel();
        jLabelTrajanjeServisa = new javax.swing.JLabel();
        jButtonZapamti = new javax.swing.JButton();
        jButtonNazad = new javax.swing.JButton();
        jTextFieldTrajanjeServisa = new javax.swing.JTextField();
        jTextFieldAutomobil = new javax.swing.JTextField();
        jLabelTrajanjeServisaLosUnos = new javax.swing.JLabel();
        jLabelDatumRezervacijeLosUnos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dodavanje rezervacije");

        jLabelDatumRezervacije.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDatumRezervacije.setText("Datum rezervacije (2023-03-24 15:30:00)");

        jTextFieldDatumRezervacije.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldDatumRezervacije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDatumRezervacijeActionPerformed(evt);
            }
        });

        jLabelDatumRezervacijaObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelDatumRezervacijaObaveza.setText("Obavezno polje!");

        jLabelRadnikObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelRadnikObaveza.setText("Obavezno polje!");

        jLabelAutomobil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelAutomobil.setText("Automobil");

        jTextFieldRadnik.setEditable(false);
        jTextFieldRadnik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelAutomobilObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAutomobilObaveza.setText("Obavezno polje!");

        jLabelTrajanjeServisaObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTrajanjeServisaObaveza.setText("Obavezno polje!");

        jLabelRadnik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelRadnik.setText("Radnik");

        jLabelTrajanjeServisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTrajanjeServisa.setText("Trajanje servisa (u minutama)");

        jButtonZapamti.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonZapamti.setText("Zapamti");
        jButtonZapamti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZapamtiActionPerformed(evt);
            }
        });

        jButtonNazad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonNazad.setText("Nazad");
        jButtonNazad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNazadActionPerformed(evt);
            }
        });

        jTextFieldTrajanjeServisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldAutomobil.setEditable(false);
        jTextFieldAutomobil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabelTrajanjeServisaLosUnos.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTrajanjeServisaLosUnos.setText("Los unos!");

        jLabelDatumRezervacijeLosUnos.setForeground(new java.awt.Color(255, 0, 0));
        jLabelDatumRezervacijeLosUnos.setText("Los unos!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAutomobil, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelDatumRezervacije, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTrajanjeServisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRadnikObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelTrajanjeServisaObaveza)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelTrajanjeServisaLosUnos))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabelDatumRezervacijaObaveza)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelDatumRezervacijeLosUnos))
                                        .addComponent(jTextFieldDatumRezervacije, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldTrajanjeServisa, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldAutomobil, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAutomobilObaveza, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNazad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonZapamti, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(665, 665, 665))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDatumRezervacije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDatumRezervacije))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDatumRezervacijaObaveza)
                    .addComponent(jLabelDatumRezervacijeLosUnos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTrajanjeServisa)
                    .addComponent(jTextFieldTrajanjeServisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTrajanjeServisaObaveza)
                    .addComponent(jLabelTrajanjeServisaLosUnos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAutomobil)
                    .addComponent(jTextFieldAutomobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAutomobilObaveza)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRadnik)
                    .addComponent(jTextFieldRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRadnikObaveza)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonZapamti)
                    .addComponent(jButtonNazad))
                .addContainerGap(307, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDatumRezervacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDatumRezervacijeActionPerformed
    }//GEN-LAST:event_jTextFieldDatumRezervacijeActionPerformed

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButtonNazadActionPerformed

    private void jButtonZapamtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZapamtiActionPerformed
        if (isDataValid()) {
            rezervacija.setTrajanjeServisa(Integer.parseInt(jTextFieldTrajanjeServisa.getText()));
            String datumRezervacijeString = jTextFieldDatumRezervacije.getText().trim();

            try {
                Date datumRezervacije = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(datumRezervacijeString);
                rezervacija.setPocetakServisa(datumRezervacije);
            } catch (ParseException ex) {
                System.out.println("Greska pri parsiranju kod jButtonZapamti u EditRezervacija2Form");
                JOptionPane.showMessageDialog(this, "Lose unet datum!", "Greska", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (c.updateRezervacija(rezervacija)) {
                JOptionPane.showMessageDialog(this, "Uspesno izmenjena rezervacija: " + datumRezervacijeString);
                erf.populateTable();
                erf.setVisible(true);
                this.setVisible(false);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Greska pri izmeni rezervacije");
            }
        }
    }//GEN-LAST:event_jButtonZapamtiActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EditRezervacija2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditRezervacija2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditRezervacija2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditRezervacija2Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditRezervacija2Form().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JButton jButtonZapamti;
    private javax.swing.JLabel jLabelAutomobil;
    private javax.swing.JLabel jLabelAutomobilObaveza;
    private javax.swing.JLabel jLabelDatumRezervacijaObaveza;
    private javax.swing.JLabel jLabelDatumRezervacije;
    private javax.swing.JLabel jLabelDatumRezervacijeLosUnos;
    private javax.swing.JLabel jLabelRadnik;
    private javax.swing.JLabel jLabelRadnikObaveza;
    private javax.swing.JLabel jLabelTrajanjeServisa;
    private javax.swing.JLabel jLabelTrajanjeServisaLosUnos;
    private javax.swing.JLabel jLabelTrajanjeServisaObaveza;
    private javax.swing.JTextField jTextFieldAutomobil;
    private javax.swing.JTextField jTextFieldDatumRezervacije;
    private javax.swing.JTextField jTextFieldRadnik;
    private javax.swing.JTextField jTextFieldTrajanjeServisa;
    // End of variables declaration//GEN-END:variables

    private void prepareForm() {
        jLabelDatumRezervacijaObaveza.setVisible(false);
        jLabelTrajanjeServisaObaveza.setVisible(false);
        jLabelAutomobilObaveza.setVisible(false);
        jLabelRadnikObaveza.setVisible(false);
        jLabelDatumRezervacijeLosUnos.setVisible(false);
        jLabelTrajanjeServisaLosUnos.setVisible(false);

        String datum = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(rezervacija.getPocetakServisa());
        jTextFieldDatumRezervacije.setText(datum);
        jTextFieldTrajanjeServisa.setText(Integer.toString(rezervacija.getTrajanjeServisa()));
        jTextFieldAutomobil.setText(rezervacija.getAutomobil().getRegistracioniBroj());
        jTextFieldRadnik.setText(rezervacija.getRadnik().getImeRadnika() + " " + rezervacija.getRadnik().getPrezimeRadnika());
    }

    private boolean isDataValid() {
        if (jTextFieldDatumRezervacije == null || jTextFieldDatumRezervacije.getText().equals("")) {
            jLabelDatumRezervacijaObaveza.setVisible(true);
            return false;
        } else {
            jLabelDatumRezervacijaObaveza.setVisible(false);
        }
        if (!isOk2(jTextFieldDatumRezervacije)) {
            jLabelDatumRezervacijeLosUnos.setVisible(true);
            return false;
        } else {
            jLabelDatumRezervacijeLosUnos.setVisible(false);
        }
        if (jTextFieldTrajanjeServisa == null || jTextFieldTrajanjeServisa.getText().equals("")) {
            jLabelTrajanjeServisaObaveza.setVisible(true);
            return false;
        } else {
            jLabelTrajanjeServisaObaveza.setVisible(false);
        }
        if (!isOk(jTextFieldTrajanjeServisa)) {
            jLabelTrajanjeServisaLosUnos.setVisible(true);
            return false;
        } else {
            jLabelTrajanjeServisaLosUnos.setVisible(false);
        }
        return true;
    }

    public boolean isOk(JTextField jtf) {
        char[] znakovi = new char[]{'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'g', 'G',
            'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'u', 'U', 'v', 'V', 'w', 'W',
            'x', 'X', 'y', 'Y', 'z', 'Z', '-', '_', '+', '=', ',', '.', '<', '>', '/', '?', '"', '\\', '\'', '|', ':', ';', '[', '{', '}', ']',
            '!', '~', '`', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
        char[] unos = jtf.getText().toCharArray();
        for (int i = 0; i < unos.length; i++) {
            for (int j = 0; j < znakovi.length; j++) {
                if (unos[i] == znakovi[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isOk2(JTextField jtf) {
        char[] znakovi = new char[]{'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'g', 'G',
            'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'u', 'U', 'v', 'V', 'w', 'W',
            'x', 'X', 'y', 'Y', 'z', 'Z', '_', '+', '=', ',', '.', '<', '>', '/', '?', '"', '\\', '\'', '|', ';', '[', '{', '}', ']',
            '!', '~', '`', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
        char[] unos = jtf.getText().toCharArray();
        for (int i = 0; i < unos.length; i++) {
            for (int j = 0; j < znakovi.length; j++) {
                if (unos[i] == znakovi[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}