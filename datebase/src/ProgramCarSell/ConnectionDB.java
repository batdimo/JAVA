/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramCarSell;

import java.sql.Connection;
import ProgramCarSell.ConnectionCar.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DIMO
 */
public class ConnectionDB {
    Connection con = null;
    public static Connection ConectionDB (){
    try {
        Class.forName("java.sql.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/carsell");
        JOptionPane.showMessageDialog(null,"Connection established");   
    return con;
} catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);   
        return null;
    }
    }
}
  

