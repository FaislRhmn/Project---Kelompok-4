
package Interface;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Koneksi_K4.Koneksi;
import java.sql.Connection;
import javax.swing.JFrame;

public class Log_In extends javax.swing.JFrame {
 private Connection conn = new Koneksi().connect();
    public Log_In() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUN = new javax.swing.JTextField();
        btnLogIn = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRegis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Log In");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        btnLogIn.setBackground(new java.awt.Color(153, 153, 255));
        btnLogIn.setText("Login");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 102, 102));
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 8)); // NOI18N
        jLabel3.setText("© Shafa, Diba, Della, Faisal, Fauzi 2021");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setText("LOGIN");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/icons8-user-24.png"))); // NOI18N
        jLabel7.setText("Username");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/Security-Key-Security-icon.png"))); // NOI18N
        jLabel8.setText("Password");

        btnRegis.setBackground(new java.awt.Color(153, 153, 153));
        btnRegis.setText("Daftar");
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(250, 250, 250))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(btnLogIn)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnRegis)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();       
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
     
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited

    }//GEN-LAST:event_btnCancelMouseExited

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
       try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM "
                + "`tb_login` where "+ "Username='" + txtUN.getText()+"'");
            if (result.next()){
                if(txtPass.getText().equals(result.getString("Password"))){
                    Menu_Utama mn = new Menu_Utama ();
                    mn.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    mn.setVisible(true);
                    this.dispose();
                } else{
                    JOptionPane.showMessageDialog(rootPane, "Password Salah");
                    txtPass.setText("");
                    txtUN.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "User Tidak Ditemukan");
                txtUN.setText("");
                txtPass.setText("");
                txtUN.requestFocus();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Gagal" + e);
        } // TODO add your handling code here:
    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        // TODO add your handling code here:
        form_registrasi fb = new form_registrasi();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisActionPerformed

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
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_In().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnRegis;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUN;
    // End of variables declaration//GEN-END:variables
}
