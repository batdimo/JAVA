/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s504
 */
class PrimeRun implements Runnable {
         long minPrime;
         PrimeRun(long minPrime) {
             this.minPrime = minPrime;
         }

         public void run() {
            for (int i = 0; i < 10; i++) {
                 try {
                     System.out.println(minPrime);
                       Thread.sleep(500);
                 } catch (InterruptedException ex) {
                     Logger.getLogger(PrimeThread.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
             }
         }
     }
