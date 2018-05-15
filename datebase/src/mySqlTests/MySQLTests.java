/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mySQLTests;
import static java.lang.Class.forName;
import java.sql.*;
/**
 *
 * @author DIMO
 */
public class MySQLTests{
    public static void main (String [] args){
     Connection con = null;
        try {
            String name ="root";
            String pasword ="";
            String stranica ="jdbc:mysql://localhost/dimo";
            Class.forName("com.mysql.jdbc.Driver");
//            String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
//   "databaseName=AdventureWorks;user=MyUserName;password=*****;";  
// con = DriverManager.getConnection(connectionUrl);  
            con =DriverManager.getConnection(stranica, name, pasword);
            System.out.println("uspeshno con");
        }
        catch (Exception e) {
            System.out.println("greshka"+e);
        }
    finally {
    if (con !=null) {
        try {
            con.close();
             System.out.println("uspeshno out con");
        }
        catch (Exception ex) {
            System.out.println("greshka"+ex);
        }
        }
        }
    
   
}
 
    
}
