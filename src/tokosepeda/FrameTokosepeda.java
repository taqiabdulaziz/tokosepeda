/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tokosepeda;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author taqi
 */
public class FrameTokosepeda extends javax.swing.JFrame {
    Database db;
    ArrayList<SepedaEntity> sepedaEntities;
    /**
     * Creates new form FrameTokosepeda
     */
    public FrameTokosepeda() {
        db = new Database();
        initComponents();
        jTabbedPane1.setSelectedIndex(3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        tambahSepedaBtn = new javax.swing.JButton();
        lihatStockSepedaBtn = new javax.swing.JButton();
        penjualanSepedaBtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ts_ukuranComboBox = new javax.swing.JComboBox<>();
        ts_namaSepedaField = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        ts_stokSepedaField = new javax.swing.JFormattedTextField();
        ts_simpanBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lss_tableSepeda = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ps_penjualanTable = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ps_sepedaIdField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        exitBtn.setText("Keluar");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        tambahSepedaBtn.setText("Tambah Sepeda");
        tambahSepedaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahSepedaBtnActionPerformed(evt);
            }
        });

        lihatStockSepedaBtn.setText("Lihat Stok Sepeda");
        lihatStockSepedaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatStockSepedaBtnActionPerformed(evt);
            }
        });

        penjualanSepedaBtn.setText("Penjualan Sepeda");
        penjualanSepedaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penjualanSepedaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lihatStockSepedaBtn)
                    .addComponent(penjualanSepedaBtn)
                    .addComponent(exitBtn)
                    .addComponent(tambahSepedaBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(tambahSepedaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lihatStockSepedaBtn)
                .addGap(5, 5, 5)
                .addComponent(penjualanSepedaBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setText("Nama Sepeda");

        jLabel2.setText("Ukuran");

        ts_ukuranComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kecil", "Sedang", "Besar" }));
        ts_ukuranComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_ukuranComboBoxActionPerformed(evt);
            }
        });

        ts_namaSepedaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ts_namaSepedaFieldActionPerformed(evt);
            }
        });
        ts_namaSepedaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ts_namaSepedaFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Stok Sepeda");

        ts_stokSepedaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ts_stokSepedaFieldKeyTyped(evt);
            }
        });

        ts_simpanBtn.setText("Simpan");
        ts_simpanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ts_simpanBtnMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ts_simpanBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ts_simpanBtn)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ts_namaSepedaField)
                            .addComponent(ts_ukuranComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ts_stokSepedaField))))
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ts_namaSepedaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ts_ukuranComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ts_stokSepedaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ts_simpanBtn)
                .addContainerGap(336, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 153, 204));

        lss_tableSepeda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Ukuran", "Nama", "Harga Satuan", "Stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(lss_tableSepeda);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel4);

        ps_penjualanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Ukuran", "Nama", "Harga Satuan", "Stok"
            }
        ));
        jScrollPane2.setViewportView(ps_penjualanTable);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setForeground(new java.awt.Color(204, 204, 255));

        jLabel6.setText("ID");

        ps_sepedaIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps_sepedaIdFieldActionPerformed(evt);
            }
        });
        ps_sepedaIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ps_sepedaIdFieldKeyTyped(evt);
            }
        });

        jButton2.setText("Jual!");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ps_sepedaIdField))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 97, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ps_sepedaIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel5);

        jLabel4.setText("Muhammad Taqi Abdul Aziz");

        jLabel5.setText("2301966324");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(352, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showWarning(String text) {
        JOptionPane.showMessageDialog(this, text);
    }

    private void lihatStockSepedaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatStockSepedaBtnActionPerformed
        if (jTabbedPane1.getSelectedIndex() == 1) return;
        lss_tableSepeda.setVisible(true);
        try {
            sepedaEntities = db.getAllSepeda();
            DefaultTableModel model = (DefaultTableModel) lss_tableSepeda.getModel();
            model.setRowCount(0);
            for (SepedaEntity sepedaEntity : sepedaEntities) {
                model.addRow(new Object[] {
                    sepedaEntity.getSepedaId(),
                    sepedaEntity.getUkuran(),
                    sepedaEntity.getNama(),
                    sepedaEntity.getHargaSatuan(),
                    sepedaEntity.getStok()
                });
            }

            jTabbedPane1.setSelectedIndex(1);
        } catch (SQLException ex) {
            this.showWarning("Terjadi kesalahan!");
        } catch (NoDataException ex) {
            this.showWarning("Tidak ada data");
            lss_tableSepeda.setVisible(false);
        }
    }//GEN-LAST:event_lihatStockSepedaBtnActionPerformed

    private void tambahSepedaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahSepedaBtnActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_tambahSepedaBtnActionPerformed

    private void penjualanSepedaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penjualanSepedaBtnActionPerformed
        if (jTabbedPane1.getSelectedIndex() == 2) return;
        ps_penjualanTable.setVisible(true);
        try {
            sepedaEntities = db.getAllSepeda();
            DefaultTableModel model = (DefaultTableModel) ps_penjualanTable.getModel();
            model.setRowCount(0);
            for (SepedaEntity sepedaEntity : sepedaEntities) {
                model.addRow(new Object[] {
                    sepedaEntity.getSepedaId(),
                    sepedaEntity.getUkuran(),
                    sepedaEntity.getNama(),
                    sepedaEntity.getHargaSatuan(),
                    sepedaEntity.getStok()
                });
            }

            jTabbedPane1.setSelectedIndex(2);
        } catch (SQLException ex) {
            this.showWarning("Terjadi kesalahan!");
        } catch (NoDataException ex) {
            this.showWarning("Tidak ada data");
            lss_tableSepeda.setVisible(false);
        }
        
    }//GEN-LAST:event_penjualanSepedaBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void ts_ukuranComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_ukuranComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ts_ukuranComboBoxActionPerformed

    private void ts_namaSepedaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ts_namaSepedaFieldActionPerformed
       
    }//GEN-LAST:event_ts_namaSepedaFieldActionPerformed

    private void ts_namaSepedaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ts_namaSepedaFieldKeyTyped
        
    }//GEN-LAST:event_ts_namaSepedaFieldKeyTyped

    private void ts_stokSepedaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ts_stokSepedaFieldKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
           (c == KeyEvent.VK_BACK_SPACE) ||
           (c == KeyEvent.VK_DELETE))) {
          getToolkit().beep();
          evt.consume();
        }
    }//GEN-LAST:event_ts_stokSepedaFieldKeyTyped

    private void ts_simpanBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ts_simpanBtnMouseClicked
        
    }//GEN-LAST:event_ts_simpanBtnMouseClicked

    private void ts_simpanBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ts_simpanBtnMousePressed
        if (ts_namaSepedaField.getText().isEmpty()) {
            this.showWarning("nama sepeda tidak boleh kosong ya pak/bu dosen");
        }
        
        if (ts_stokSepedaField.getText().isEmpty()) {
            this.showWarning("stok sepeda tidak boleh kosong ya pak/bu dosen");
        }
        
        SepedaEntity SepedaEntity;
        SepedaEntity = new SepedaEntity(
                ts_ukuranComboBox.getSelectedItem().toString(),
                ts_namaSepedaField.getText(),
                Integer.parseInt(ts_stokSepedaField.getText()));
        db.create(SepedaEntity);
        goToHome();
        showWarning("Berhasil menambahkan stok sepeda");
    }//GEN-LAST:event_ts_simpanBtnMousePressed

    private void ps_sepedaIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps_sepedaIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ps_sepedaIdFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ps_sepedaIdFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ps_sepedaIdFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_ps_sepedaIdFieldKeyTyped

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        if (ps_sepedaIdField.getText().equals("0")) {
            jTabbedPane1.setSelectedIndex(3);
        }
        
        try {
            SepedaEntity sepedaEntity = db.sellSepedaById(ps_sepedaIdField.getText());
            this.showWarning("Sukses menjual sepeda! dengan keterangan\n"
                    + "Nota: \n"
                    + "SepedaID: " + sepedaEntity.getSepedaId() + "\n"
                    + "Harga Jual " + sepedaEntity.getHargaSatuan());
            jTabbedPane1.setSelectedIndex(3);
        } catch (SepedaNotExistsException ex) {
            this.showWarning("Sepeda tidak ditemukan \n mohon untuk mengisi ID sepeda kembali");
        } catch (NoDataException ex) {
            this.showWarning("Sepeda tidak ditemukan \n mohon untuk mengisi ID sepeda kembali");
        } catch (SepedaNotFoundOrStockEmpty ex) {
            this.showWarning("Sepeda tidak ditemukan, kemungkinan tidak ditemukan atau stok habis");
        } catch (SQLException ex) {
            this.showWarning("Terjadi kesalahan!");
        } catch (Exception ex) {
            this.showWarning("Terjadi kesalahan!");
        }
    }//GEN-LAST:event_jButton2MousePressed

    private void goToHome() {
        jTabbedPane1.setSelectedIndex(3);
    }
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
            java.util.logging.Logger.getLogger(FrameTokosepeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTokosepeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTokosepeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTokosepeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTokosepeda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton lihatStockSepedaBtn;
    private javax.swing.JTable lss_tableSepeda;
    private javax.swing.JButton penjualanSepedaBtn;
    private javax.swing.JTable ps_penjualanTable;
    private javax.swing.JTextField ps_sepedaIdField;
    private javax.swing.JButton tambahSepedaBtn;
    private javax.swing.JFormattedTextField ts_namaSepedaField;
    private javax.swing.JButton ts_simpanBtn;
    private javax.swing.JFormattedTextField ts_stokSepedaField;
    private javax.swing.JComboBox<String> ts_ukuranComboBox;
    // End of variables declaration//GEN-END:variables
}
