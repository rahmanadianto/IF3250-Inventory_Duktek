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
public class Lokasi {
    
    private final int id;
    private String nama;
    
    public Lokasi(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
}
