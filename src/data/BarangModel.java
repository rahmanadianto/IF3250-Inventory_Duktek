/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.entity.Barang;
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
public class BarangModel extends Model {
    
    public BarangModel() {
        super();
    }
    
    public ArrayList<Barang> findAll() {
        ArrayList<Barang> ret = new ArrayList<>();
   
        try {
            String query = "SELECT * FROM barang";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret.add(new Barang(rs.getInt("id"),
                                   rs.getString("kode"),
                                   rs.getString("nama"),
                                   rs.getString("deskripsi")));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    } 
    
    public Barang findById(int id) {
        Barang ret = null;
        
        try {
            String query = "SELECT * FROM barang WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret = new Barang(rs.getInt("id"),
                                    rs.getString("kode"),
                                    rs.getString("nama"),
                                    rs.getString("deskripsi"));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(BarangModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    }
}