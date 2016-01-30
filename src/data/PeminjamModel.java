/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.entity.Peminjam;
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
public class PeminjamModel extends Model {
    
    public PeminjamModel() {
        super();
    }
    
    public ArrayList<Peminjam> findAll() {
        ArrayList<Peminjam> ret = new ArrayList<>();
   
        try {
            String query = "SELECT * FROM peminjam";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret.add(new Peminjam(rs.getInt("id"),
                                     rs.getString("nim/nip"),
                                     rs.getString("nama"),
                                     rs.getString("telepon"),
                                     rs.getString("pekerjaan")));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(PeminjamModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    } 
    
    public Peminjam findById(int id) {
        Peminjam ret = null;
        
        try {
            String query = "SELECT * FROM peminjam WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret = new Peminjam(rs.getInt("id"),
                                   rs.getString("nim/nip"),
                                   rs.getString("nama"),
                                   rs.getString("telepon"),
                                   rs.getString("pekerjaan"));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(PeminjamModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    }
}
