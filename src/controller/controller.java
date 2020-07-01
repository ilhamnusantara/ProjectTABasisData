/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import database.koneksi;
import model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author ilham-07010
 */
public class controller {
    koneksi koneksi = new koneksi();
    public static ArrayList<admin> arrAdmin;
    public static ArrayList<master> arrMaster;
    public static ArrayList<surat_surat> arrSurat_surat;
    public static ArrayList<jenis_surat> arrJenis_surat;
    
    public void InsertAdmin(String username, String jabatan){
        String sql = "INSERT INTO admin (ID_USER, USERNAME, JABATAN) VALUES(id_user.nextval, '"+username+"', '"+jabatan+"')";
        this.koneksi.ManipulasiData(sql);
    }
    
    public void InsertSurat(int id_user, String nik, String keterangan, String keperluan ){
            String sql = "INSERT INTO surat_surat VALUES(id_surat.nextval,"+id_user+","+nik+", '"+keterangan+"', '"+keperluan+"')";
            this.koneksi.ManipulasiData(sql);
    }
    public void UpdateSurat(String nik, String keterangan, String keperluan){
        String sql = null;
        sql = "UPDATE surat_surat set keterangan = '"+keterangan+"', keperluan = '"+keperluan+"' where NIK = "+nik;
        this.koneksi.ManipulasiData(sql);
    }
    public void DeleteSurat(String nik){
        String sql = null;
                sql = "DELETE FROM surat_surat WHERE NIK = "+nik;
          
        this.koneksi.ManipulasiData(sql);
    }
    public void InsertMaster(String nik, int id_user, String no_kk, String nama_lengkap, String tgl_lahir, String alamat ){
            String sql = "INSERT INTO MASTER VALUES('"+nik+"', '"+id_user+"', '"+no_kk+"', '"+nama_lengkap+"',to_date('"+tgl_lahir+"','dd/MM/yyyy'),'"+alamat+"')";
            this.koneksi.ManipulasiData(sql);
    }
    public void UpdateMaster(String nik, int id_user, String no_kk, String nama_lengkap, String tgl_lahir, String alamat){
        String sql = null;    
            sql = "UPDATE master set NIK = '"+nik+"', ID_USER = '"+id_user+"', NO_KARTUKELUARGA = '"+no_kk+"',NAMA_LENGKAP = '"+nama_lengkap+"',TANGGAL_LAHIR = to_date('"+tgl_lahir+"','dd/MM/yyyy'), ALAMAT = '"+alamat+"' where NIK = "+nik;
            this.koneksi.ManipulasiData(sql);
    }
    
    public void DeleteMaster(String nik){
        String sql = null;
                sql = "DELETE FROM master WHERE NIK = "+nik;
        this.koneksi.ManipulasiData(sql);
    }
      
}
