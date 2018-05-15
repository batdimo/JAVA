/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datebase.Oracle;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DIMO
 */
public class DBConection {

    private static final String JDBCDriver = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL;

    public static void main(String[] arg) {
        try {
            Class.forName(JDBCDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        Connection conn;

        DriverManager.getConnection(DB_URL, DB_URL, DB_URL);
    }

}
