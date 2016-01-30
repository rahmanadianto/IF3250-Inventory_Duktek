/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.entity;

/**
 *
 * @author User
 */
public class Peminjam {
    
    private final int id;
    private String nomor_induk;
    private String nama;
    private String telepon;
    private String pekerjaan;
    
    public Peminjam(int id, String nomor_induk, String nama, String telepon, String pekerjaan) {
        this.id = id;
        this.nomor_induk = nomor_induk;
        this.telepon = telepon;
        this.nama = nama;
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nomor_induk
     */
    public String getNomor_induk() {
        return nomor_induk;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the telepon
     */
    public String getTelepon() {
        return telepon;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param nomor_induk the nomor_induk to set
     */
    public void setNomor_induk(String nomor_induk) {
        this.nomor_induk = nomor_induk;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param telepon the telepon to set
     */
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}