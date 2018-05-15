/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package km.h;

import java.util.Arrays;

/**
 *
 * @author s504
 */
public class KMH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a[] = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = 100-i;
            System.out.println(a[i]);            
        }
        
        // sortirane
        Arrays.sort(a);
        print(a);
    }

    private static void print(int[] a) {
        // printirane
        for (int i = 0; i < a.length; i++) {
             int j = a[i];
             System.out.println(j);
         }
        
        
//        System.out.println(16 * 16 * 16 * 16);
//        System.out.println(Math.pow(16, 4));
//
//        for (int i = 1040; i < 1100; i++) {
//            System.out.println((char) i);
//        }
//        for (int i = 'a'; i < 'z'; i++) {
//            System.out.println((char) i);
//        }
//
////        30!
//        int f = 1;
//        for (int i = 1; i <= 30; i++) {
//            f = f * i;
//        }
//        System.out.println(f);
//        
//        
    }

}
