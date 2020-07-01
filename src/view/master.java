/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.koneksi;
import controller.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.ir.CatchNode;

/**
 *
 * @author ilham-07010
 */
public class master extends javax.swing.JFrame {
    koneksi koneksi = new koneksi();
    controller controller = new controller();
    /**
     * Creates new form master
     */
    public master() throws SQLException {
        initComponents();
        getTableMaster();
        jCAdmin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxAdmin = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kk_master = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nama_master = new javax.swing.JTextField();
        tanggalLahir_master = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nik_master = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        alamat_master = new javax.swing.JTextField();
        simpan_master = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaster = new javax.swing.JTable();
        kembali_master = new javax.swing.JButton();
        cari_master = new javax.swing.JButton();
        update_master = new javax.swing.JButton();
        delete_master = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Admin");

        jComboBoxAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAdminActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("DATA MASTER");

        jLabel3.setText("Nomor KK ");

        jLabel4.setText("Nama Lengkap");

        nama_master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_masterActionPerformed(evt);
            }
        });

        tanggalLahir_master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalLahir_masterActionPerformed(evt);
            }
        });

        jLabel5.setText("Tanggal Lahir");

        jLabel6.setText("NIK");

        jLabel7.setText("Alamat");

        simpan_master.setText("SIMPAN");
        simpan_master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_masterActionPerformed(evt);
            }
        });

        tableMaster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIK", "ID_User", "NO_KK", "Nama Lengkap", "Tanggal Lahir", "Alamat"
            }
        ));
        jScrollPane1.setViewportView(tableMaster);

        kembali_master.setText("Kembali");
        kembali_master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali_masterActionPerformed(evt);
            }
        });

        cari_master.setText("Cari");
        cari_master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_masterActionPerformed(evt);
            }
        });

        update_master.setText("UPDATE");
        update_master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_masterActionPerformed(evt);
            }
        });

        delete_master.setText("DELETE");
        delete_master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_masterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(53, 53, 53))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(simpan_master))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tanggalLahir_master)
                                    .addComponent(jComboBoxAdmin, 0, 128, Short.MAX_VALUE)
                                    .addComponent(kk_master)
                                    .addComponent(nama_master)
                                    .addComponent(nik_master)
                                    .addComponent(alamat_master))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cari_master))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(update_master)
                                .addGap(18, 18, 18)
                                .addComponent(delete_master)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kembali_master)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kembali_master)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kk_master, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nik_master, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cari_master))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nama_master, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tanggalLahir_master, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(alamat_master, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simpan_master)
                            .addComponent(update_master)
                            .addComponent(delete_master))))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nama_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_masterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_masterActionPerformed

    private void tanggalLahir_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalLahir_masterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalLahir_masterActionPerformed

    private void jComboBoxAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAdminActionPerformed

    private void simpan_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_masterActionPerformed
            
        String nik = nik_master.getText();
        String no_kk = kk_master.getText();
        String nama = nama_master.getText();
        String tanggal_lahir = tanggalLahir_master.getText();
        String alamat = alamat_master.getText();
        int id_user = 0;
        try {
            id_user = idUser(jComboBoxAdmin.getSelectedItem().toString());
        } catch (SQLException ex) {
            Logger.getLogger(master.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller.InsertMaster(nik,id_user, no_kk, nama, tanggal_lahir, alamat);
        try {
            getTableMaster();
        } catch (SQLException ex) {
            Logger.getLogger(master.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_simpan_masterActionPerformed

    private void kembali_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali_masterActionPerformed
    try {
        new surat().show();
        setVisible(false);
    } catch (SQLException ex) {
        Logger.getLogger(master.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_kembali_masterActionPerformed

    private void cari_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_masterActionPerformed
        String NIKe = nik_master.getText();
        ResultSet rs = koneksi.GetData("select NIK, NO_KARTUKELUARGA, NAMA_LENGKAP, TANGGAL_LAHIR, ALAMAT from master where NIK ='"+NIKe+"'");
        try {
            while (rs.next()){
                kk_master.setText(rs.getString("NO_KARTUKELUARGA"));
                nik_master.setText(rs.getString("NIK"));
                nama_master.setText(rs.getString("NAMA_LENGKAP"));
                tanggalLahir_master.setText(rs.getString("TANGGAL_LAHIR"));
                alamat_master.setText(rs.getString("ALAMAT"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(master.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_cari_masterActionPerformed

    private void update_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_masterActionPerformed
        String no_kk = kk_master.getText();
        String nik = nik_master.getText();
        String nama_lengkap = nama_master.getText();
        String tgl_lahir = tanggalLahir_master.getText();
        String alamat = alamat_master.getText();
        int id_user = 0;
        try {
            id_user = idUser(jComboBoxAdmin.getSelectedItem().toString());
        } catch (SQLException ex) {
            Logger.getLogger(surat.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller.UpdateMaster(nik, id_user, no_kk, nama_lengkap, tgl_lahir, alamat);
        try {
            getTableMaster();
        } catch (SQLException ex) {
            Logger.getLogger(master.class.getName()).log(Level.SEVERE, null, ex);
        }
        kk_master.setText("");
        nik_master.setText("");
        nama_master.setText("");
        tanggalLahir_master.setText("");
        alamat_master.setText("");
    }//GEN-LAST:event_update_masterActionPerformed

    private void delete_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_masterActionPerformed
    String nik = nik_master.getText();
        controller.DeleteMaster(nik);
         try {
            getTableMaster();
        } catch (SQLException ex) {
            Logger.getLogger(master.class.getName()).log(Level.SEVERE, null, ex);
        }
        kk_master.setText("");
        nik_master.setText("");
        nama_master.setText("");
        tanggalLahir_master.setText("");
        alamat_master.setText("");
    }//GEN-LAST:event_delete_masterActionPerformed

    private int idUser(String username) throws SQLException{
        int id_User = 0;
        ResultSet rs = koneksi.GetData("select id_user from admin where username = '"+username+"'");
        while(rs.next()){
            id_User = rs.getInt("id_user");
        
        }
        return id_User;
    }
    private void jCAdmin() throws SQLException{
        ResultSet rs = koneksi.GetData("select username from admin");
        int i = 1;
        jComboBoxAdmin.removeAllItems();
        while (rs.next()){
            System.out.println(rs.getString("username"));
            jComboBoxAdmin.addItem(rs.getString("USERNAME"));
        }
        jComboBoxAdmin.repaint();
        jComboBoxAdmin.revalidate();
    }
    
    private void getTableMaster() throws SQLException{ 
        String sql = "SELECT NIK, ID_USER, NO_KARTUKELUARGA, NAMA_LENGKAP, TANGGAL_LAHIR, ALAMAT from master";
        ResultSet set = koneksi.GetData(sql);
        DefaultTableModel model = (DefaultTableModel)tableMaster.getModel();
        model.setRowCount(0);
        try {
            while(set.next()){
                model.addRow(new Object[]{
                    set.getLong("NIK"),
                    set.getString("ID_USER"),
                    set.getLong("NO_KARTUKELUARGA"),
                    set.getString("NAMA_LENGKAP"),
                    set.getDate("TANGGAL_LAHIR"),
                    set.getString("ALAMAT")
                    
            });
            }
                    
        }catch(SQLException ex){
            System.out.println(ex);
        }
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
            java.util.logging.Logger.getLogger(master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new master().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(master.class.getName()).log(Level.SEVERE, null, ex);
                }
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat_master;
    private javax.swing.JButton cari_master;
    private javax.swing.JButton delete_master;
    private javax.swing.JComboBox jComboBoxAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembali_master;
    private javax.swing.JTextField kk_master;
    private javax.swing.JTextField nama_master;
    private javax.swing.JTextField nik_master;
    private javax.swing.JButton simpan_master;
    private javax.swing.JTable tableMaster;
    private javax.swing.JTextField tanggalLahir_master;
    private javax.swing.JButton update_master;
    // End of variables declaration//GEN-END:variables
}