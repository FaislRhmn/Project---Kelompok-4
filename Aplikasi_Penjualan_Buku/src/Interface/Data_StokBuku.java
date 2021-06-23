
package Interface;
import java.awt.Dialog;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import Koneksi_K4.Koneksi; 


public class Data_StokBuku extends javax.swing.JInternalFrame {
public final Connection conn = new Koneksi().connect();
    private DefaultTableModel tabmode;
    private void aktif() {
        tanggal();
        txtJudulBuku.setEnabled(true);
        txtKodeBuku.setEnabled(true);
        txtKategoriBuku.setEnabled(true);
        txtTahunTerbit.setEnabled(true);
        txtJumlahBuku.setEnabled(true);
        txtHargaBuku.setEnabled(true);
    }

    protected void kosong() {
        tanggal();
        txtJudulBuku.setText(null);
        txtKodeBuku.setText(null);
        txtKategoriBuku.setText(null);
        txtTahunTerbit.setText(null);
        txtJumlahBuku.setText(null);
        txtHargaBuku.setText(null);
    }

    public void noTable() {
        int Baris = tabmode.getRowCount();
        for (int a = 0; a < Baris; a++) {
            String nomor = String.valueOf(a + 1);
            tabmode.setValueAt(nomor + ".", a, 0);
        }
    }

    public void tanggal() {
        Date tgl = new Date();
        btnTanggal.setDate(tgl);
    }

    public void lebarKolom() {
        TableColumn kolom;
        tabelBuku.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        kolom = tabelBuku.getColumnModel().getColumn(0);
        kolom.setPreferredWidth(40);
        kolom = tabelBuku.getColumnModel().getColumn(1);
        kolom.setPreferredWidth(100);
        kolom = tabelBuku.getColumnModel().getColumn(2);
        kolom.setPreferredWidth(100);
        kolom = tabelBuku.getColumnModel().getColumn(3);
        kolom.setPreferredWidth(120);
        kolom = tabelBuku.getColumnModel().getColumn(4);
        kolom.setPreferredWidth(130);
        kolom = tabelBuku.getColumnModel().getColumn(5);
        kolom.setPreferredWidth(130);
        kolom = tabelBuku.getColumnModel().getColumn(6);
        kolom.setPreferredWidth(130);
        kolom = tabelBuku.getColumnModel().getColumn(7);
        kolom.setPreferredWidth(130);
    }

    public void dataTable() {
        Object[] Baris = {"No", "Tanggal", "Judul Buku", "Kode Buku", 
            "Kategori Buku", "Tahun Terbit", "Jumlah Buku","Harga Buku"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelBuku.setModel(tabmode);
        String sql = "select * from tb_kategori order by kode_buku asc";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String tanggal = hasil.getString("tanggal");
                String judul_buku = hasil.getString("judul_buku");
                String kode_buku = hasil.getString("kode_buku");
                String kategori_buku = hasil.getString("kategori_buku");
                String tahun_terbit = hasil.getString("tahun_terbit");
                String jumlah_buku = hasil.getString("jumlah_buku");
                String harga_buku = hasil.getString("harga_buku");
                String[] data = {"", tanggal, judul_buku, kode_buku, kategori_buku, 
                tahun_terbit, jumlah_buku, harga_buku};
                tabmode.addRow(data);
                noTable();
                lebarKolom();
            }
        } catch (Exception e) {
        }
    }

    public void pencarian(String sql) {
        Object[] Baris = {"No", "Tanggal", "Judul Buku", "Kode Buku",
            "Kategori Buku", "Tahun Terbit","Jumlah Buku", "Harga Buku"};
        tabmode = new DefaultTableModel(null, Baris);
        tabelBuku.setModel(tabmode);
        int brs = tabelBuku.getRowCount();
        for (int i = 0; 1 < brs; i++) {
            tabmode.removeRow(1);
        }
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String tanggal = hasil.getString("tanggal");
                String judul_buku = hasil.getString("judul_buku");
                String kode_buku = hasil.getString("kode_buku");
                String kategori_buku = hasil.getString("kategori_buku");
                String tahun_terbit = hasil.getString("tahun_terbit");
                String jumlah_buku = hasil.getString("jumlah_buku");
                String harga_buku = hasil.getString("harga_buku");
                String[] data = {"", tanggal, judul_buku, kode_buku, kategori_buku, 
                tahun_terbit, jumlah_buku, harga_buku};
                tabmode.addRow(data);
                noTable();
            }
        } catch (Exception e) {

        }
    }
    
    
    public Data_StokBuku() {
        initComponents();
        dataTable();
        lebarKolom();
        aktif();
        tanggal();
        txtJudulBuku.requestFocus();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ubahKategori = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtKodeBukuUbah = new javax.swing.JTextField();
        txtKategoriBukuUbah = new javax.swing.JTextField();
        txtJudulBukuUbah = new javax.swing.JTextField();
        txtTahunTerbitUbah = new javax.swing.JTextField();
        txtHargaBukuUbah = new javax.swing.JTextField();
        btnSimpanUbah = new javax.swing.JButton();
        btnBatalUbah = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtJumlahBukuUbah = new javax.swing.JTextField();
        btnTanggalUbah = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKodeBuku = new javax.swing.JTextField();
        txtKategoriBuku = new javax.swing.JTextField();
        txtHargaBuku = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtTahunTerbit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtJudulBuku = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtJumlahBuku = new javax.swing.JTextField();
        btnTanggal = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelBuku = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ubah Kategori", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 1, 14))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Tanggal");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Judul Buku");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Kode Buku");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText("Kategori Buku");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("Tahun Terbit");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText("Harga Buku");

        btnSimpanUbah.setBackground(new java.awt.Color(102, 102, 255));
        btnSimpanUbah.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSimpanUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/icons8-save-16.png"))); // NOI18N
        btnSimpanUbah.setText("Simpan");
        btnSimpanUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanUbahActionPerformed(evt);
            }
        });

        btnBatalUbah.setBackground(new java.awt.Color(255, 102, 102));
        btnBatalUbah.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnBatalUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/icons8-delete-16.png"))); // NOI18N
        btnBatalUbah.setText("Batal");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setText("Jumlah Buku");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtHargaBukuUbah)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnSimpanUbah)
                        .addGap(26, 26, 26)
                        .addComponent(btnBatalUbah))
                    .addComponent(txtKodeBukuUbah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKategoriBukuUbah)
                    .addComponent(txtJudulBukuUbah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTahunTerbitUbah)
                    .addComponent(txtJumlahBukuUbah, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTanggalUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(btnTanggalUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtJudulBukuUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtKodeBukuUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtKategoriBukuUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtTahunTerbitUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJumlahBukuUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHargaBukuUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(228, Short.MAX_VALUE)
                        .addComponent(jLabel16)))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpanUbah)
                    .addComponent(btnBatalUbah))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout ubahKategoriLayout = new javax.swing.GroupLayout(ubahKategori.getContentPane());
        ubahKategori.getContentPane().setLayout(ubahKategoriLayout);
        ubahKategoriLayout.setHorizontalGroup(
            ubahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ubahKategoriLayout.setVerticalGroup(
            ubahKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Data Stok Buku");
        setPreferredSize(new java.awt.Dimension(1365, 700));
        setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Data Stok Buku");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/book (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(500, 500, 500))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(23, 23, 23))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buku Kategori", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Tanggal");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Kode Buku");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Judul Buku");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Kategori Buku");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Tahun Terbit");

        btnTambah.setBackground(new java.awt.Color(204, 255, 153));
        btnTambah.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/icons8-plus-math-16.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnUbah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/icons8-edit-16.png"))); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnBersih.setBackground(new java.awt.Color(153, 153, 255));
        btnBersih.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnBersih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/icons8-eraser-16.png"))); // NOI18N
        btnBersih.setText("Bersih");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 153, 153));
        btnHapus.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/icons8-trash-16.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 153, 153));
        btnCancel.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/icons8-delete-16.png"))); // NOI18N
        btnCancel.setText("Batal");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Jumlah Buku");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setText("Harga Buku");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKategoriBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtJumlahBuku, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTahunTerbit)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addGap(61, 61, 61)
                                .addComponent(btnUbah)
                                .addGap(75, 75, 75)
                                .addComponent(btnBersih))
                            .addComponent(txtHargaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHapus)
                .addGap(69, 69, 69)
                .addComponent(btnCancel)
                .addGap(111, 111, 111))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btnTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKategoriBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTahunTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtJumlahBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHargaBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnBersih))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabel Buku Kategori", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 1, 18))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Pencarian");

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons_Project/icons8-search-16.png"))); // NOI18N
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCariKeyTyped(evt);
            }
        });

        tabelBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Tanggal", "Judul Buku", "Kode Buku", "Kategori Buku", "Tahun Terbit", "Harga Buku"
            }
        ));
        tabelBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelBuku);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("© Shafa, Diba, Della, Faisal, Fauzi 2021");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(175, 175, 175)
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel10)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
    // TODO add your handling code here:
    ubahKategori.setLocationRelativeTo(this);
    txtKodeBukuUbah.setEditable(false);
    ubahKategori.setSize(450,500);
    ubahKategori.setLocationRelativeTo(null);
    ubahKategori.setVisible(true);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
         int ok = JOptionPane.showConfirmDialog(null, " Apakah Anda yakin ingin "
            + "menghapus data?", "Konfirmasi Dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "delete from tb_kategori where judul_buku='" + txtJudulBuku.getText() + "'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                kosong();
                dataTable();
                lebarKolom();
                txtJudulBuku.requestFocus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus" + e);
            }
        }  // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
  
        if (txtJudulBuku.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Judul buku tidak boleh kosong");
        } else if (txtKodeBuku.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Kode buku tidak boleh kosong");
        } else if (txtKategoriBuku.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Kategori buku tidak boleh kosong");
        } else if(txtTahunTerbit.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Tahun terbit tidak boleh kosong");
        } else if (txtJumlahBuku.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Jumlah buku tidak boleh kosong");
        } else if(txtHargaBuku.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harga buku tidak boleh kosong"); 
        } else {
            String sql = "insert into tb_kategori values (?,?,?,?,?,?,?)";
            String tampilan = "dd-MM-yyyy";
            SimpleDateFormat fm = new SimpleDateFormat(tampilan);
            String tanggal = String.valueOf(fm.format(btnTanggal.getDate()));
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.setString(1, tanggal.toString());
                stat.setString(2, txtJudulBuku.getText());
                stat.setString(3, txtKodeBuku.getText());
                stat.setString(4, txtKategoriBuku.getText());
                stat.setString(5, txtTahunTerbit.getText());
                stat.setString(6, txtJumlahBuku.getText());
                stat.setString(7, txtHargaBuku.getText());
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                kosong();
                dataTable();
                lebarKolom();
                txtJudulBuku.requestFocus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Gagal Disimpan" + e);
            }
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        tanggal();
        kosong();
    }//GEN-LAST:event_btnBersihActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       dispose (); 
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyTyped
       String sqlPencarian = "select * from tb_kategori where "
        + "judul_buku like '%" + txtCari.getText() + "%' or "
        + "kode_buku like '%" + txtCari.getText() + "%' or "
        + "kategori_buku like '%" + txtCari.getText() + "%'";
        pencarian(sqlPencarian);
        lebarKolom();  // TODO add your handling code here:
    }//GEN-LAST:event_txtCariKeyTyped

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        String sqlPencarian = "select * from tb_kategori where judul_buku like '%" + txtCari.getText() + "%' or "
        + "kode_buku like '%" + txtCari.getText() + "%' or "
        + "kategori_buku like '%" + txtCari.getText() + "%'";
        pencarian(sqlPencarian);
        lebarKolom();// TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed

    private void tabelBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuMouseClicked
        // TODO add your handling code here:
        int bar = tabelBuku.getSelectedRow();
        String a = tabmode.getValueAt(bar, 0).toString();
        String b = tabmode.getValueAt(bar, 1).toString();
        String c = tabmode.getValueAt(bar, 2).toString();
        String d = tabmode.getValueAt(bar, 3).toString();
        String e = tabmode.getValueAt(bar, 4).toString();
        String f = tabmode.getValueAt(bar, 5).toString();
        String g = tabmode.getValueAt(bar, 6).toString();
        String h = tabmode.getValueAt(bar, 7).toString();

        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        Date dateValue = null;
        try {
            dateValue = date.parse((String) tabelBuku.getValueAt(bar, 1));
        } catch (ParseException ex) {
            Logger.getLogger(Data_StokBuku.class.getName()).log(Level.SEVERE, null, ex);
        }

        btnTanggal.setDate(dateValue);
        btnTanggalUbah.setDate(dateValue);
        txtJudulBuku.setText(c);
        txtJudulBukuUbah.setText(c);
        txtKodeBuku.setText(d);
        txtKodeBukuUbah.setText(d);
        txtKategoriBuku.setText(e);
        txtKategoriBukuUbah.setText(e);
        txtTahunTerbit.setText(f);
        txtTahunTerbitUbah.setText(f);
        txtJumlahBuku.setText(g);
        txtJumlahBukuUbah.setText(g);
        txtHargaBuku.setText(h);
        txtHargaBukuUbah.setText(h);
    }//GEN-LAST:event_tabelBukuMouseClicked

    private void btnSimpanUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanUbahActionPerformed
        // TODO add your handling code here:
        String sql = "update tb_kategori set tanggal=?,judul_buku=?,kode_buku=?,kategori_buku=?,tahun_terbit=?,jumlah_buku=?,harga_buku=? where kode_buku='" + txtKodeBuku.getText() + "'";
        String tampilan = "dd-MM-yyyy";
        SimpleDateFormat fm = new SimpleDateFormat(tampilan);
        String tanggal = String.valueOf(fm.format(btnTanggalUbah.getDate()));
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tanggal.toString());
            stat.setString(2, txtJudulBukuUbah.getText());
            stat.setString(3, txtKodeBukuUbah.getText());
            stat.setString(4, txtKategoriBukuUbah.getText());
            stat.setString(5, txtTahunTerbitUbah.getText());
            stat.setString(6, txtJumlahBukuUbah.getText());
            stat.setString(7, txtHargaBukuUbah.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            kosong();
            dataTable();
            lebarKolom();
            txtKodeBuku.requestFocus();
            ubahKategori.dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah" + e);
        }
    }//GEN-LAST:event_btnSimpanUbahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatalUbah;
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpanUbah;
    private javax.swing.JButton btnTambah;
    private com.toedter.calendar.JDateChooser btnTanggal;
    private com.toedter.calendar.JDateChooser btnTanggalUbah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelBuku;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHargaBuku;
    private javax.swing.JTextField txtHargaBukuUbah;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtJudulBukuUbah;
    private javax.swing.JTextField txtJumlahBuku;
    private javax.swing.JTextField txtJumlahBukuUbah;
    private javax.swing.JTextField txtKategoriBuku;
    private javax.swing.JTextField txtKategoriBukuUbah;
    private javax.swing.JTextField txtKodeBuku;
    private javax.swing.JTextField txtKodeBukuUbah;
    private javax.swing.JTextField txtTahunTerbit;
    private javax.swing.JTextField txtTahunTerbitUbah;
    private javax.swing.JDialog ubahKategori;
    // End of variables declaration//GEN-END:variables

    void setExtendedState(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
