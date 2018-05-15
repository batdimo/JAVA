/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication11;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author s504
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JFrame  frame = new JFrame();
         frame.setBounds(10, 10, 600, 600);
         frame.setTitle("ABC Design");
         
         JPanel panel = new JPanel();
         panel.setLayout(new FlowLayout());
         
         for (int i = 0; i < 10; i++) {
            JButton button = new JButton("HELLO");
             panel.add(button);
         
            if(i % 2 == 0) {
                button.setBackground(Color.yellow);
            }
            final int fi = i;
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Hello" + fi);
                }
            });
         }
         frame.getContentPane().add(panel);
         
                 
         frame.setVisible(true);
        
        
    }
    
}
