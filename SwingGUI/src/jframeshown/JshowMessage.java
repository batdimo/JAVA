/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jframeshown;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author s504
 */
public class JshowMessage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        String t = "show me the money";
        
        JOptionPane.showMessageDialog(null, t);
    }
}
