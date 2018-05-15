/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massivi;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class Massivi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter number of series: ");
        int s = scan.nextInt();
        if (s >= 0 & s <= 500) {
            for (int i = 1; i <= s; i++) {              
                System.out.print("enter number for a: ");
                int a = scan.nextInt();
                System.out.print("enter number for b: ");
                int b = scan.nextInt();
                System.out.print("enter number for n: ");
                int n = scan.nextInt();
                if (a <= 50 & a >= 0 & b <= 50 & b >= 0 & n <= 15 & n >= 1) {
                    int[] matrix = new int[n];
                    int old = 0;
                    for (int j = 1; j <= n; j++) {
                        matrix[j - 1] = (int) (a + (Math.pow(2, j - 1)) * b) + old;
                        old = matrix[j - 1] - a;
                        System.out.print(matrix[j - 1] + " ");
                    }
                      System.out.println();
                }
            }
        } else {
            System.out.println("not in range ");
        }

//int c=9;
//double b =Math.pow(2, c);
//        System.out.println(b);
    }

}
