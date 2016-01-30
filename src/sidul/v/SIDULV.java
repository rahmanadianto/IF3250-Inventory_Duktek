/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidul.v;

import connector.Connector;

/**
 *
 * @author Asus
 */
public class SIDULV {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Connector Conn = new Connector();
    Conn.connect();
    System.out.println("aaaaa");
  }
  
}
