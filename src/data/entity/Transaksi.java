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
public class Transaksi {
    
    private final int id;
    private int id_barang;
    private int id_pengguna;
    private Timestamp dipinjam;
    private Timestamp dikembalikan;
    private String keterangan;
    
    public Transaksi(int id, int id_barang, int id_pengguna, Timestamp dipinjam, Timestamp dikembalikan, String keterangan) {
        this.id = id;
        this.id_barang = id_barang;
        this.id_pengguna = id_pengguna;
        this.dipinjam = dipinjam;
        this.dikembalikan = dikembalikan;
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
     * @return the dipinjam
     */
    public Timestamp getDipinjam() {
        return dipinjam;
    }

    /**
     * @return the dikembalikan
     */
    public Timestamp getDikembalikan() {
        return dikembalikan;
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
     * @param dipinjam the dipinjam to set
     */
    public void setDipinjam(Timestamp dipinjam) {
        this.dipinjam = dipinjam;
    }

    /**
     * @param dikembalikan the dikembalikan to set
     */
    public void setDikembalikan(Timestamp dikembalikan) {
        this.dikembalikan = dikembalikan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}