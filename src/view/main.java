/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.koneksi;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author ilham-07010
 */
public class main {
//    static koneksi koneksi = new koneksi();
    
    public static void main(String[] args) throws SQLException, ParseException{
        surat surat = new surat();
        surat.setVisible(true);
//        master master = new master();
//        master.setVisible(true);
    } 
}
