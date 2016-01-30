/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.entity.Penyimpanan;
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
public class PenyimpananModel extends Model {
    
    public PenyimpananModel() {
        super();
    }
    
    public ArrayList<Penyimpanan> findAll() {
        ArrayList<Penyimpanan> ret = new ArrayList<>();
   
        try {
            String query = "SELECT * FROM penyimpanan";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret.add(new Penyimpanan(rs.getInt("id"),
                                        rs.getInt("id_barang"),
                                        rs.getInt("id_lokasi")));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(PenyimpananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    } 
    
    public Penyimpanan findById(int id) {
        Penyimpanan ret = null;
        
        try {
            String query = "SELECT * FROM penyimpanan WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret = new Penyimpanan(rs.getInt("id"),
                                      rs.getInt("id_pengguna"),
                                      rs.getInt("id_lokasi"));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(PenyimpananModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    }
}
