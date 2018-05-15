/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframeshown;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author DIMO
 */
public class JframeShown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Map Panel Test");
        //frame.getContentPane().add(new JButton("BOMBA"));
        frame.setVisible(true);
        frame.setBounds(550, 450, 100, 100);
        JPanel Panel = new JPanel();
        Panel.setLayout(new FlowLayout());
        for (int i = 0; i < 10; i++) {
            final int f = i + 1;
            final JButton a = new JButton("FAT");
            a.addActionListener(new ActionListener() {
                String fo = " " + f;
                public void actionPerformed(ActionEvent e) {
                    a.setName(fo);
                }
               
            });
            Panel.add(a);
            if (i % 2 != 0) {
                a.setBackground(Color.yellow);
            }
        }

        frame.getContentPane().add(Panel);
    

    }
}
