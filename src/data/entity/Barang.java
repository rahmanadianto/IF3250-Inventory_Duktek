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
public class Barang {
    
    private final int id;
    private String kode;
    private String nama;
    private String deskripsi;
    
    public Barang(int id, String kode, String nama, String deskripsi) {
        this.id = id;
        this.kode = kode;
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

        /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the deskripsi
     */
    public String getDeskripsi() {
        return deskripsi;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param deskripsi the deskripsi to set
     */
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
