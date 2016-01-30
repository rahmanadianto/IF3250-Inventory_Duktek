/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.entity;

import java.sql.Timestamp;

/**
 *
 * @author User
 */
public class Booking {
    
    private final int id;
    private int id_barang;
    private int id_pengguna;
    private Timestamp mulai;
    private Timestamp selesai;
    private String keterangan;
    
    public Booking(int id, int id_barang, int id_pengguna, Timestamp mulai, Timestamp selesai, String keterangan) {
        this.id = id;
        this.id_barang = id_barang;
        this.id_pengguna = id_pengguna;
        this.mulai = mulai;
        this.selesai = selesai;
        this.keterangan = keterangan;
    } 

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the id_barang
     */
    public int getId_barang() {
        return id_barang;
    }

    /**
     * @return the id_pengguna
     */
    public int getId_pengguna() {
        return id_pengguna;
    }

    /**
     * @return the mulai
     */
    public Timestamp getMulai() {
        return mulai;
    }

    /**
     * @return the selesai
     */
    public Timestamp getSelesai() {
        return selesai;
    }

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param id_barang the id_barang to set
     */
    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    /**
     * @param id_pengguna the id_pengguna to set
     */
    public void setId_pengguna(int id_pengguna) {
        this.id_pengguna = id_pengguna;
    }

    /**
     * @param mulai the mulai to set
     */
    public void setMulai(Timestamp mulai) {
        this.mulai = mulai;
    }

    /**
     * @param selesai the selesai to set
     */
    public void setSelesai(Timestamp selesai) {
        this.selesai = selesai;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}
