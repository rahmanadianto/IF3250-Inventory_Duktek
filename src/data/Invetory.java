/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import connector.Connector;
import java.sql.Connection;

/**
 *
 * @author Asus
 */
public class Invetory {  
  /* Connecting to Database */
  Connector db = new Connector();
  Connection conn = db.connect();
  
  
}
