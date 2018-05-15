/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.util.Random;

/**
 *
 * @author s504
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        int b[] = new int[5];
        
        initRandom(b);
        print(a);       
        sort(b);
        print(b);
    }

    private static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = a[i];
            System.out.println(j);
        }
    }

    private static void initRandom(int[] b) {
        Random r = new Random();

        for (int i = 0; i < b.length; i++) {
            b[i] = 10 +  r.nextInt(80);            
        }
    }
    
    private static void sort(int[] b) {

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(b[i] > b[j]) {
                    // razmenqme stojnostite
                    int a=b[i];
                    b[i]=b[j];
                    b[j]=a;
                    
                }                
            }
        }
    }
}
