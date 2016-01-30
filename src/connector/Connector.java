/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Asus
 */
public class Connector {
  String url = "jdbc:mysql://localhost:3306/stackexchange";
  String username = "root";
  String password = "";

  public Connection connect() {
    Connection ret = null;
    System.out.println("Connecting database...");

    try {
      ret = DriverManager.getConnection(url, username, password);
    } catch (SQLException ex) {
    } 
    
    return ret;
  }
}
