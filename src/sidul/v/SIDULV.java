/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidul.v;

import data.entity.Barang;
import helper.TimeHelper;

import connector.Connector;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class SIDULV {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Connector Conn = new Connector();
    Connection conn = Conn.connect();
    Barang barang = null;
   
    try {
        String query = "SELECT * FROM barang WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setInt(1, 1);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            barang = new Barang(rs.getInt("id"),
                                rs.getString("kode"),
                                rs.getString("nama"),
                                rs.getString("deskripsi"));
        }
        
        System.out.println(TimeHelper.TimestampToString(TimeHelper.getCurrentTimeStamp()));
        System.out.println(barang.getNama());
    } 
    catch (SQLException ex) {
        Logger.getLogger(SIDULV.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
}
