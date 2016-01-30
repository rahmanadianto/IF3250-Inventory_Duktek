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
public class Penyimpanan {
    
    private final int id;
    private int id_barang;
    private int id_lokasi;
    
    public Penyimpanan(int id, int id_barang, int id_lokasi) {
        this.id = id; 
        this.id_barang = id_barang;
        this.id_lokasi = id_lokasi;
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
     * @return the id_lokasi
     */
    public int getId_lokasi() {
        return id_lokasi;
    }

    /**
     * @param id_barang the id_barang to set
     */
    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    /**
     * @param id_lokasi the id_lokasi to set
     */
    public void setId_lokasi(int id_lokasi) {
        this.id_lokasi = id_lokasi;
    }
}
