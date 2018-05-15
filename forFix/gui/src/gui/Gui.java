/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author s504
 */
public class Gui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame j = new JFrame("Test");        
        j.setBounds(0, 0, 400, 400);        
        j.setVisible(true);
        
        
        
        //FlowLayout f = new FlowLayout();
        JPanel panel = new JPanel();
        
        GridLayout experimentLayout = new GridLayout(0,1);
        panel.setLayout(experimentLayout);
//        j.getContentPane().setLayout(f);
        System.out.println(panel.getLayout().toString());
        j.getContentPane().add(panel);
        
        
//        for (int i = 0; i < 50; i++) {
//            panel.add(
//                    new JButton("Button" + i));            
//        }
         panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Long-Named Button 4"));
        panel.add(new JButton("5"));
        
    }
}
