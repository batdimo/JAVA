/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationgui;

import javax.swing.JOptionPane;

/**
 *
 * @author s504
 */
public class JavaApplicationGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, 
//                "Hello Universe");
      String name =  JOptionPane.showInputDialog(
              "Enter your name:");
      JOptionPane.showMessageDialog(null, 
              "Hello "+ name);
    }
}
