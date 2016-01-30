/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.entity.Lokasi;
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
public class LokasiModel extends Model {
    
    public LokasiModel() {
        super();
    }
    
    public ArrayList<Lokasi> findAll() {
        ArrayList<Lokasi> ret = new ArrayList<>();
   
        try {
            String query = "SELECT * FROM lokasi";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret.add(new Lokasi(rs.getInt("id"),
                                   rs.getString("nama")));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(LokasiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    } 
    
    public Lokasi findById(int id) {
        Lokasi ret = null;
        
        try {
            String query = "SELECT * FROM lokasi WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret = new Lokasi(rs.getInt("id"),
                                 rs.getString("nama"));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(LokasiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    }
}
