/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringshown;

import java.util.*;

/**
 *
 * @author DIMO
 */
public class strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int a = A.length();
        int b = B.length();
        int c = a + b;
        System.out.println(c);
        String F = A.substring(0, 1).toUpperCase() + A.substring(1);
        String G = B.substring(0, 1).toUpperCase() + B.substring(1);

        if (F.compareTo(G) <= 0) {
            System.out.println("No");
        }
        if (G.compareTo(F) < 0) {
            System.out.println("Yes");
        }

        System.out.println(F + " " + G);

        
        
//System.out.println(A.length()+B.length());
//System.out.println(A.compareTo(B)>0?"Yes":"No");
//System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));
//        /* Enter your code here. Print output to STDOUT. */
    }
}
