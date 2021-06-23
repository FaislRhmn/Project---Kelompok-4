
package Interface;
import Interface.Data_StokBuku;
import Interface.Transaksi_PenjualanBuku;
import Koneksi_K4.Koneksi;
import java.sql.Connection;
import javax.swing.JFrame;

public class Menu_Utama extends javax.swing.JFrame {
private final Connection conn = new Koneksi().connect();
private Data_StokBuku data_stokbuku;
private Transaksi_PenjualanBuku transaksi_penjualanbuku;

private void initForm() {

    data_stokbuku = new Data_StokBuku();
    transaksi_penjualanbuku = new Transaksi_PenjualanBuku();
    

}
  
    public Menu_Utama() {
        initComponents();
        initForm();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        menu_utama = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuDSB = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenu();
        menuTSB = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama");

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));
        jDesktopPane1.setForeground(new java.awt.Color(153, 153, 255));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/20210617_215151_0000.png"))); // NOI18N
        jLabel2.setVerifyInputWhenFocusTarget(false);

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1449, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        jMenu1.setText("User");
        menu_utama.add(jMenu1);

        jMenu2.setText("Master Data");

        menuDSB.setText("Data Stok Buku");
        menuDSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDSBActionPerformed(evt);
            }
        });
        jMenu2.add(menuDSB);

        menu_utama.add(jMenu2);

        menuTransaksi.setText("Transaksi");
        menuTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTransaksiMouseClicked(evt);
            }
        });
        menuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiActionPerformed(evt);
            }
        });

        menuTSB.setText("Transaksi Stok Buku");
        menuTSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTSBActionPerformed(evt);
            }
        });
        menuTransaksi.add(menuTSB);

        menu_utama.add(menuTransaksi);
        menu_utama.add(jMenu4);

        setJMenuBar(menu_utama);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuDSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDSBActionPerformed
         if (!data_stokbuku.isVisible()){
            jDesktopPane1.add(data_stokbuku);
            data_stokbuku.show();
        }// TODO add your handling code here:
    }//GEN-LAST:event_menuDSBActionPerformed

    private void menuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiActionPerformed
      
    }//GEN-LAST:event_menuTransaksiActionPerformed

    private void menuTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTransaksiMouseClicked
      
         // TODO add your handling code here:
    }//GEN-LAST:event_menuTransaksiMouseClicked

    private void menuTSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTSBActionPerformed
       if (!transaksi_penjualanbuku.isVisible()){
            jDesktopPane1.add(transaksi_penjualanbuku);
            transaksi_penjualanbuku.show(); 
       }// TODO add your handling code here:
    }//GEN-LAST:event_menuTSBActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem menuDSB;
    private javax.swing.JMenuItem menuTSB;
    private javax.swing.JMenu menuTransaksi;
    private javax.swing.JMenuBar menu_utama;
    // End of variables declaration//GEN-END:variables
}
