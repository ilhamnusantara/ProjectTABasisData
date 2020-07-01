/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author ilham-07010
 */
public class jenis_surat {
    private Integer id_jenis_surat;
    private  Integer id_surat;
    private Integer nomor_surat;
    private Date tanggal_surat;

    public Integer getId_jenis_surat() {
        return id_jenis_surat;
    }

    public void setId_jenis_surat(Integer id_jenis_surat) {
        this.id_jenis_surat = id_jenis_surat;
    }

    public Integer getId_surat() {
        return id_surat;
    }

    public void setId_surat(Integer id_surat) {
        this.id_surat = id_surat;
    }

    public Integer getNomor_surat() {
        return nomor_surat;
    }

    public void setNomor_surat(Integer nomor_surat) {
        this.nomor_surat = nomor_surat;
    }

    public Date getTanggal_surat() {
        return tanggal_surat;
    }

    public void setTanggal_surat(Date tanggal_surat) {
        this.tanggal_surat = tanggal_surat;
    }    
}
