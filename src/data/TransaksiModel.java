/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.entity.Transaksi;
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
public class TransaksiModel extends Model {
    
    public TransaksiModel() {
        super();
    }
    
    public ArrayList<Transaksi> findAll() {
        ArrayList<Transaksi> ret = new ArrayList<>();
   
        try {
            String query = "SELECT * FROM transaksi";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret.add(new Transaksi(rs.getInt("id"),
                                      rs.getInt("id_barang"),
                                      rs.getInt("id_penggunga"),
                                      rs.getTimestamp("dipinjam"),
                                      rs.getTimestamp("dikembalikan"),
                                      rs.getString("keterangan")));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(TransaksiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    } 
    
    public Transaksi findById(int id) {
        Transaksi ret = null;
        
        try {
            String query = "SELECT * FROM transaksi WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret = new Transaksi(rs.getInt("id"),
                                  rs.getInt("id_barang"),
                                  rs.getInt("id_penggunga"),
                                  rs.getTimestamp("dipinjam"),
                                  rs.getTimestamp("dikembalikan"),
                                  rs.getString("keterangan"));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(TransaksiModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    }
}
