/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_02_04;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ex_02_04 {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(
                "Enter your name: ");
        
     JOptionPane.showMessageDialog(null, "Hello  "  + name);
    }
}
