/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Random;

/**
 *
 * @author s504
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a[] = new int [10];
        
        Random r = new Random();
        
        for (int i = 0; i < a.length; i++) {
            a[i] = 10 + r.nextInt(90);
        }        
        print(a);
        System.out.println("avr: " + avg(a));
    }
    
    private static double avg(int a[]) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        double avr = sum / a.length;
        return avr;
    }
    
    private static void print (int a[]) {
        for (int i : a) {
            System.out.println(i);
        }
    }
    
    
}