package com.amr.client.view_main;

import com.amr.client.controller.Controller;
import com.amr.common.domain.Radnik;
import com.amr.common.domain.StrucnaSprema;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Klasa koja predstavlja formu za registrovanje na sistem
 *
 * @author Nebojsa Brankovic
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Klijentski kontroler
     */
    private Controller c;

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
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
        jLabelStrucnaSprema = new javax.swing.JLabel();
        jLabelKorisnickoIme = new javax.swing.JLabel();
        jLabelSifra = new javax.swing.JLabel();
        jLabelSifraProvera = new javax.swing.JLabel();
        jTextFieldIme = new javax.swing.JTextField();
        jTextFieldPrezime = new javax.swing.JTextField();
        jTextFieldKorisnickoIme = new javax.swing.JTextField();
        jComboBoxStrucneSpreme = new javax.swing.JComboBox<>();
        jPasswordFieldPassword1 = new javax.swing.JPasswordField();
        jPasswordFieldPasswordConfirmation = new javax.swing.JPasswordField();
        jButtonRegistrujSe = new javax.swing.JButton();
        jLabelImeObaveza = new javax.swing.JLabel();
        jLabelPrezimeObaveza = new javax.swing.JLabel();
        jLabelStrucnaSpremaObaveza = new javax.swing.JLabel();
        jLabelKorisnickoImeObaveza = new javax.swing.JLabel();
        jLabelSifraObaveza = new javax.swing.JLabel();
        jLabelSifraProveraObaveza = new javax.swing.JLabel();
        jLabelKorisnickoImePostoji = new javax.swing.JLabel();
        jButtonNazad = new javax.swing.JButton();
        jLabelPozadina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrovanje korisnika");
        setResizable(false);

        jLabelIme.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelIme.setForeground(new java.awt.Color(0, 255, 255));
        jLabelIme.setText("Ime:");

        jLabelPrezime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPrezime.setForeground(new java.awt.Color(0, 255, 255));
        jLabelPrezime.setText("Prezime:");

        jLabelStrucnaSprema.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelStrucnaSprema.setForeground(new java.awt.Color(0, 255, 255));
        jLabelStrucnaSprema.setText("Strucna sprema:");

        jLabelKorisnickoIme.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelKorisnickoIme.setForeground(new java.awt.Color(0, 255, 255));
        jLabelKorisnickoIme.setText("Korisnicko ime:");

        jLabelSifra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSifra.setForeground(new java.awt.Color(0, 255, 255));
        jLabelSifra.setText("Sifra:");

        jLabelSifraProvera.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSifraProvera.setForeground(new java.awt.Color(0, 255, 255));
        jLabelSifraProvera.setText("Sifra (provera):");

        jTextFieldIme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldPrezime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTextFieldKorisnickoIme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jComboBoxStrucneSpreme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPasswordFieldPassword1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPasswordFieldPasswordConfirmation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordFieldPasswordConfirmation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPasswordConfirmationActionPerformed(evt);
            }
        });
        jPasswordFieldPasswordConfirmation.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jPasswordFieldPasswordConfirmationPropertyChange(evt);
            }
        });
        jPasswordFieldPasswordConfirmation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordConfirmationKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordConfirmationKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldPasswordConfirmationKeyTyped(evt);
            }
        });

        jButtonRegistrujSe.setBackground(new java.awt.Color(0, 255, 255));
        jButtonRegistrujSe.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonRegistrujSe.setForeground(new java.awt.Color(51, 51, 51));
        jButtonRegistrujSe.setText("Registruj se");
        jButtonRegistrujSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrujSeActionPerformed(evt);
            }
        });

        jLabelImeObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelImeObaveza.setText("Obavezno polje");

        jLabelPrezimeObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelPrezimeObaveza.setText("Obavezno polje");

        jLabelStrucnaSpremaObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelStrucnaSpremaObaveza.setText("Obavezno polje");

        jLabelKorisnickoImeObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelKorisnickoImeObaveza.setText("Obavezno polje");

        jLabelSifraObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSifraObaveza.setText("Obavezno polje");

        jLabelSifraProveraObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSifraProveraObaveza.setText("Obavezno polje");

        jLabelKorisnickoImePostoji.setForeground(new java.awt.Color(255, 0, 0));
        jLabelKorisnickoImePostoji.setText("Korisnicko ime vec postoji!");

        jButtonNazad.setBackground(new java.awt.Color(0, 255, 255));
        jButtonNazad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonNazad.setForeground(new java.awt.Color(51, 51, 51));
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
                        .addComponent(jLabelPozadina)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonNazad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(269, 269, 269)
                                .addComponent(jButtonRegistrujSe))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelIme, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSifraProvera)
                                    .addComponent(jLabelSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelStrucnaSprema)
                                    .addComponent(jLabelKorisnickoIme))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelImeObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordFieldPassword1)
                                    .addComponent(jPasswordFieldPasswordConfirmation)
                                    .addComponent(jTextFieldKorisnickoIme)
                                    .addComponent(jComboBoxStrucneSpreme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPrezime)
                                    .addComponent(jLabelPrezimeObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelSifraProveraObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelSifraObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldIme)
                                    .addComponent(jLabelStrucnaSpremaObaveza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelKorisnickoImeObaveza, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                        .addComponent(jLabelKorisnickoImePostoji, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPozadina)
                .addGap(38, 38, 38)
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
                .addComponent(jLabelPrezimeObaveza)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStrucneSpreme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStrucnaSprema))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStrucnaSpremaObaveza)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKorisnickoIme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKorisnickoImeObaveza)
                    .addComponent(jLabelKorisnickoImePostoji))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSifra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSifraObaveza)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldPasswordConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSifraProvera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSifraProveraObaveza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrujSe)
                    .addComponent(jButtonNazad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldPasswordConfirmationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordConfirmationActionPerformed
    }//GEN-LAST:event_jPasswordFieldPasswordConfirmationActionPerformed

    private void jPasswordFieldPasswordConfirmationPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordConfirmationPropertyChange
    }//GEN-LAST:event_jPasswordFieldPasswordConfirmationPropertyChange

    private void jPasswordFieldPasswordConfirmationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordConfirmationKeyPressed
    }//GEN-LAST:event_jPasswordFieldPasswordConfirmationKeyPressed

    private void jPasswordFieldPasswordConfirmationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordConfirmationKeyTyped
    }//GEN-LAST:event_jPasswordFieldPasswordConfirmationKeyTyped

    private void jPasswordFieldPasswordConfirmationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordConfirmationKeyReleased
        isPasswordValid();
    }//GEN-LAST:event_jPasswordFieldPasswordConfirmationKeyReleased

    private void jButtonRegistrujSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrujSeActionPerformed
        if (isDataValid()) {
            Radnik noviRadnik = new Radnik();
            noviRadnik.setImeRadnika(jTextFieldIme.getText().trim());
            noviRadnik.setPrezimeRadnika(jTextFieldPrezime.getText().trim());
            noviRadnik.setStrucnaSprema((StrucnaSprema) jComboBoxStrucneSpreme.getSelectedItem());
            noviRadnik.setKorisnickoIme(jTextFieldKorisnickoIme.getText().trim());
            noviRadnik.setSifra(String.valueOf(jPasswordFieldPasswordConfirmation.getPassword()));
            if (c.saveRadnik(noviRadnik)) {
                JOptionPane.showMessageDialog(this, "Registrovan novi korisnik: " + noviRadnik.getImeRadnika()
                        + " " + noviRadnik.getPrezimeRadnika(), "Informacija", JOptionPane.INFORMATION_MESSAGE);
                LogInForm lif = new LogInForm();
                this.dispose();
                lif.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Greska pri registrovanju korisnika", "Greska", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonRegistrujSeActionPerformed

    private void jButtonNazadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNazadActionPerformed
        LogInForm lif = new LogInForm();
        this.setVisible(false);
        lif.setVisible(true);
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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNazad;
    private javax.swing.JButton jButtonRegistrujSe;
    private javax.swing.JComboBox<StrucnaSprema> jComboBoxStrucneSpreme;
    private javax.swing.JLabel jLabelIme;
    private javax.swing.JLabel jLabelImeObaveza;
    private javax.swing.JLabel jLabelKorisnickoIme;
    private javax.swing.JLabel jLabelKorisnickoImeObaveza;
    private javax.swing.JLabel jLabelKorisnickoImePostoji;
    private javax.swing.JLabel jLabelPozadina;
    private javax.swing.JLabel jLabelPrezime;
    private javax.swing.JLabel jLabelPrezimeObaveza;
    private javax.swing.JLabel jLabelSifra;
    private javax.swing.JLabel jLabelSifraObaveza;
    private javax.swing.JLabel jLabelSifraProvera;
    private javax.swing.JLabel jLabelSifraProveraObaveza;
    private javax.swing.JLabel jLabelStrucnaSprema;
    private javax.swing.JLabel jLabelStrucnaSpremaObaveza;
    private javax.swing.JPasswordField jPasswordFieldPassword1;
    private javax.swing.JPasswordField jPasswordFieldPasswordConfirmation;
    private javax.swing.JTextField jTextFieldIme;
    private javax.swing.JTextField jTextFieldKorisnickoIme;
    private javax.swing.JTextField jTextFieldPrezime;
    // End of variables declaration//GEN-END:variables

    /**
     * Priprema forme
     */
    private void prepareForm() {
        this.getContentPane().setLayout(new BorderLayout());
        jLabelPozadina = new JLabel(new ImageIcon("src/main/java/com/amr/client/images/register.jpg"));
        this.getContentPane().add(jLabelPozadina, BorderLayout.CENTER);

        jLabelImeObaveza.setVisible(false);
        jLabelPrezimeObaveza.setVisible(false);
        jLabelStrucnaSpremaObaveza.setVisible(false);
        jLabelKorisnickoImeObaveza.setVisible(false);
        jLabelSifraObaveza.setVisible(false);
        jLabelSifraProveraObaveza.setVisible(false);
        jLabelKorisnickoImePostoji.setVisible(false);

        jComboBoxStrucneSpreme.setModel(new DefaultComboBoxModel<>(StrucnaSprema.values()));
        jComboBoxStrucneSpreme.setSelectedItem(null);
    }

    /**
     * Provera validnosti unosa klijenta
     *
     * @return validnost unosa
     */
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
        if (jComboBoxStrucneSpreme == null || jComboBoxStrucneSpreme.getSelectedItem() == null) {
            jLabelStrucnaSpremaObaveza.setVisible(true);
            return false;
        } else {
            jLabelStrucnaSpremaObaveza.setVisible(false);
        }
        if (jTextFieldKorisnickoIme == null || jTextFieldKorisnickoIme.getText().equals("")) {
            jLabelKorisnickoImeObaveza.setVisible(true);
            return false;
        } else {
            jLabelKorisnickoImeObaveza.setVisible(false);
        }
        Radnik r = new Radnik();
        r.setKorisnickoIme(jTextFieldKorisnickoIme.getText());
        if (c.userNameExists(r)) {
            jLabelKorisnickoImePostoji.setVisible(true);
            return false;
        }
        if (jPasswordFieldPassword1 == null || String.valueOf(jPasswordFieldPassword1.getPassword()).equals("")) {
            jLabelSifraObaveza.setVisible(true);
            return false;
        } else {
            jLabelSifraObaveza.setVisible(false);
        }
        if (jPasswordFieldPasswordConfirmation == null || String.valueOf(jPasswordFieldPasswordConfirmation.getPassword()).equals("")
                || !isPasswordValid()) {
            jLabelSifraProveraObaveza.setVisible(true);
            return false;
        } else {
            jLabelSifraProveraObaveza.setVisible(false);
        }

        return true;
    }

    /**
     * Metoda koja proverava da li je korisnik ponovio sifru 2 puta
     *
     * @return validnost sifre
     */
    private boolean isPasswordValid() {
        String password1 = String.valueOf(jPasswordFieldPassword1.getPassword());
        String password2 = String.valueOf(jPasswordFieldPasswordConfirmation.getPassword());
        if (!password1.equals(password2)) {
            jPasswordFieldPasswordConfirmation.setBackground(Color.red);
            return false;
        } else {
            jPasswordFieldPasswordConfirmation.setBackground(jPasswordFieldPassword1.getBackground());
            return true;
        }
    }

}
