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
  String url = "jdbc:mysql://localhost:3306/inventory";
  String username = "root";
  String password = "hahahahaha";

  public Connection connect() {
    Connection ret = null;
    System.out.println("Connecting database...");

    try {
      Class.forName("com.mysql.jdbc.Driver");
      ret = DriverManager.getConnection(url, username, password);
      System.out.println("Database connected");
    } catch (SQLException | ClassNotFoundException ex) {
        ex.printStackTrace();
    } 
    
    return ret;
  }
}
