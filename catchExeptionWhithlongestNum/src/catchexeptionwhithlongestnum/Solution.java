/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catchexeptionwhithlongestnum;

import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte\n* short\n* int\n* long");
                    
                } else if (x >= -32768 && x <= 32767) {
                    System.out.println("* short\n* int\n* long");
                   
                } else if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int\n* long");
                   
                }else if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
                    System.out.println("* long");
                   
                }

                //Complete the code
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
        // TODO code application logic here
    }

}
