/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hieudx
 */
public class Connector {
    
    public Connector() {
        
    }
    public java.sql.Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/QLDT_db";
        String username = "root";
        String password = "b18dcdt073";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
            
}
