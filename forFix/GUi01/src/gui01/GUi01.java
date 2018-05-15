/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author s504
 */
public class GUi01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setLayout(new FlowLayout());
        j.setBounds(0, 0, 400, 400);
        j.setTitle("Test Title");
        j.setVisible(true);
        JLabel label = new JLabel("Hello world");
        label.setForeground(Color.red);
        j.getContentPane().add(label);
    }
}
