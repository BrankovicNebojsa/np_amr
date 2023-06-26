package com.amr.client.view_main;

import com.amr.client.controller.Controller;
import com.amr.common.domain.Radnik;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Nebojsa Brankovic
 */
public class LogInForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    private Controller c;

    public LogInForm() {
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

        jLabelKorisnickoIme = new javax.swing.JLabel();
        jLabelSifra = new javax.swing.JLabel();
        jTextFieldKorisnickoIme = new javax.swing.JTextField();
        jPasswordFieldSifra = new javax.swing.JPasswordField();
        jButtonPrijaviSe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelKorisnickoImeObaveza = new javax.swing.JLabel();
        jLabelSifraObaveza = new javax.swing.JLabel();
        jLabelOVDE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPozadina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Prijava korisnika");
        setPreferredSize(new java.awt.Dimension(640, 780));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabelKorisnickoIme.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelKorisnickoIme.setForeground(new java.awt.Color(255, 143, 41));
        jLabelKorisnickoIme.setText("Korisnicko ime:");

        jLabelSifra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSifra.setForeground(new java.awt.Color(255, 143, 41));
        jLabelSifra.setText("Sifra:");

        jTextFieldKorisnickoIme.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPasswordFieldSifra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButtonPrijaviSe.setBackground(new java.awt.Color(255, 143, 41));
        jButtonPrijaviSe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonPrijaviSe.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPrijaviSe.setText("Prijavi se");
        jButtonPrijaviSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrijaviSeActionPerformed(evt);
            }
        });
        jButtonPrijaviSe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonPrijaviSeKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 143, 41));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nemas nalog? Klikni");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabelKorisnickoImeObaveza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelKorisnickoImeObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelKorisnickoImeObaveza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelKorisnickoImeObaveza.setText("Obavezno polje");

        jLabelSifraObaveza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSifraObaveza.setForeground(new java.awt.Color(255, 0, 0));
        jLabelSifraObaveza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSifraObaveza.setText("Obavezno polje");

        jLabelOVDE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelOVDE.setForeground(new java.awt.Color(255, 143, 41));
        jLabelOVDE.setText("OVDE");
        jLabelOVDE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelOVDEMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 143, 41));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ako zelis da napravis nalog.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabelPozadina))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelOVDE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelKorisnickoIme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jLabelSifra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordFieldSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSifraObaveza, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelKorisnickoImeObaveza, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPrijaviSe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPozadina)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKorisnickoIme)
                    .addComponent(jTextFieldKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKorisnickoImeObaveza)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSifra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSifraObaveza)
                .addGap(38, 38, 38)
                .addComponent(jButtonPrijaviSe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 507, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelOVDE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButtonPrijaviSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrijaviSeActionPerformed
        prijaviSe();
    }//GEN-LAST:event_jButtonPrijaviSeActionPerformed

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jButtonPrijaviSeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonPrijaviSeKeyPressed
        prijaviSe();
    }//GEN-LAST:event_jButtonPrijaviSeKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    }//GEN-LAST:event_formWindowClosed

    private void jLabelOVDEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelOVDEMouseClicked
        RegisterForm rf = new RegisterForm();
        this.setVisible(false);
        this.dispose();
        rf.setVisible(true);
    }//GEN-LAST:event_jLabelOVDEMouseClicked

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
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                
                new LogInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrijaviSe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelKorisnickoIme;
    private javax.swing.JLabel jLabelKorisnickoImeObaveza;
    private javax.swing.JLabel jLabelOVDE;
    private javax.swing.JLabel jLabelPozadina;
    private javax.swing.JLabel jLabelSifra;
    private javax.swing.JLabel jLabelSifraObaveza;
    private javax.swing.JPasswordField jPasswordFieldSifra;
    private javax.swing.JTextField jTextFieldKorisnickoIme;
    // End of variables declaration//GEN-END:variables

    private void prepareForm() {
        this.getContentPane().setLayout(new BorderLayout());
        jLabelPozadina = new JLabel(new ImageIcon("src/main/java/com/amr/client/images/lambo.jpg"));
        this.getContentPane().add(jLabelPozadina, BorderLayout.CENTER);
        jLabelKorisnickoImeObaveza.setVisible(false);
        jLabelSifraObaveza.setVisible(false);
        jLabelOVDE.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jLabelOVDE.setForeground(Color.CYAN);
                jLabelOVDE.setCursor(Cursor.getPredefinedCursor(12));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jLabelOVDE.setForeground(new Color(255,143,41));
                jLabelOVDE.setCursor(Cursor.getDefaultCursor());
            }
        });
    }

    private void prijaviSe() {
        if (isDataValid()) {
            String korisnickoIme = jTextFieldKorisnickoIme.getText();
            String sifra = String.valueOf(jPasswordFieldSifra.getPassword());
            Radnik radnik = new Radnik();
            radnik.setKorisnickoIme(korisnickoIme);
            radnik.setSifra(sifra);
            if (c.logInCredentialsExist(radnik)) {
                radnik = c.getRadnik(korisnickoIme);
                c.sendRadnik(radnik);
                JOptionPane.showMessageDialog(this, "Dobrodosli " + radnik.getImeRadnika()
                        + " " + radnik.getPrezimeRadnika(), "Informacija", JOptionPane.INFORMATION_MESSAGE);
                MainMenuForm mmf = new MainMenuForm(radnik);
                this.setVisible(false);
                mmf.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Lose uneti podaci", "Greska", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private boolean isDataValid() {
        if (jTextFieldKorisnickoIme == null || jTextFieldKorisnickoIme.getText().equals("")) {
            jLabelKorisnickoImeObaveza.setVisible(true);
            return false;
        } else {
            jLabelKorisnickoImeObaveza.setVisible(false);
        }
        if (jPasswordFieldSifra == null || String.valueOf(jPasswordFieldSifra.getPassword()).equals("")) {
            jLabelSifraObaveza.setVisible(true);
            return false;
        } else {
            jLabelSifraObaveza.setVisible(false);
        }
        return true;
    }

}
