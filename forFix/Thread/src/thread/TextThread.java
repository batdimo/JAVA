/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s504
 */
public class TextThread extends java.lang.Thread {

    String text;

    public TextThread(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {
            System.out.println("df" + text);
            try {
                java.lang.Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(TextThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    
           
   
           
           
           
           
           
    }}