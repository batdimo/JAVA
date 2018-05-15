/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_02_03;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author s504
 */
public class Ex_02_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        String name = JOptionPane.showInputDialog("Enter name:");
        
        JOptionPane.showMessageDialog(null, 
                "Hello " + name);
    }
}
