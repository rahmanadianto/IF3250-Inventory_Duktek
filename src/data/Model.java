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
 * @author User
 */
public class Model {
    
    protected Connection conn;
    
    public Model() {
        Connector connector = new Connector();
        this.conn = connector.connect();
    }
}