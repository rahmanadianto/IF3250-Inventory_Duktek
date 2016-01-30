/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.entity.Booking;
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
public class BookingModel extends Model {
    
    public BookingModel() {
        super();
    }
    
    public ArrayList<Booking> findAll() {
        ArrayList<Booking> ret = new ArrayList<>();
   
        try {
            String query = "SELECT * FROM booking";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret.add(new Booking(rs.getInt("id"),
                                    rs.getInt("id_barang"),
                                    rs.getInt("id_penggunga"),
                                    rs.getTimestamp("mulai"),
                                    rs.getTimestamp("selesai"),
                                    rs.getString("keterangan")));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(BookingModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    } 
    
    public Booking findById(int id) {
        Booking ret = null;
        
        try {
            String query = "SELECT * FROM booking WHERE id=?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery(); 
            while (rs.next()) {
                ret = new Booking(rs.getInt("id"),
                                  rs.getInt("id_barang"),
                                  rs.getInt("id_penggunga"),
                                  rs.getTimestamp("mulai"),
                                  rs.getTimestamp("selesai"),
                                  rs.getString("keterangan"));
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(BookingModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ret;
    }
}