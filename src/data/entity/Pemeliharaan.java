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
public class Pemeliharaan {
    
    private final int id;
    private int id_barang;
    private Timestamp mulai;
    private Timestamp selesai;
    private String status;
    
    public Pemeliharaan(int id, int id_barang, Timestamp mulai, Timestamp selesai, String status) {
        this.id = id;
        this.id_barang = id_barang;
        this.mulai = mulai;
        this.selesai = selesai;
        this.status = status;
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param id_barang the id_barang to set
     */
    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
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
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
