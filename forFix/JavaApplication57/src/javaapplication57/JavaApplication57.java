/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

import java.util.Scanner;

/**
 *
 * @author s504
 */
public class JavaApplication57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a[];
        int b[] = new int[6665];
        int c[] = {5, 2, 1, 4, 3};

        for (int i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                if (c[i] > c[j]) {
                    int u = c[i];
                    c[i] = c[j];
                    c[j] = u;
                }
            }
        }
        print(c);
    }

    private static void print(int[] c) {
        for (int i = 0; i < c.length; i++) {
            int j = c[i];
            System.out.println(j);
        }
    }
}
