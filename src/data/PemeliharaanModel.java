/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.entity.Pemeliharaan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class PemeliharaanModel extends Model {
    
    public PemeliharaanModel() {
        super();
    }
    
    public ArrayList<Pemeliharaan> findAll() {
        ArrayList<Pemeliharaan> ret = new ArrayList<>();
   
        try {
            String query = "SELECT * FROM pemeliharaan";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret.add(new Pemeliharaan(rs.getInt("id"),
                                         rs.getInt("id_barang"),
                                         rs.getTimestamp("mulai"),
                                         rs.getTimestamp("selesai"),
                                         rs.getString("status")));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(PemeliharaanModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    } 
    
    public Pemeliharaan findById(int id) {
        Pemeliharaan ret = null;
        
        try {
            String query = "SELECT * FROM pemeliharaan WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret = new Pemeliharaan(rs.getInt("id"),
                                       rs.getInt("id_barang"),
                                       rs.getTimestamp("mulai"),
                                       rs.getTimestamp("selesai"),
                                       rs.getString("status"));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(PemeliharaanModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    }
}
