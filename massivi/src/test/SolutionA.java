/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author DIMO
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionA {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        // Complete this function
        int[] c = {a0, a1, a2};
        int[] d = {b0, b1, b2};
        int f = 0;
        int p = 0;
        for (int i = 0; i < 3; i++) {
            if (c[i] > d[i]) {
                p++;
            }
            if (c[i] < d[i]) {
                f++;
            } else {
                
            }
        }
        int [] m={p,f};
return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
//        int  pointsAlice = ((a0>b0)?1:0)+ ((a1>b1)?1:0)+ ((a2>b2)?1:0) ;
//        int pointsBob = ((a0<b0)?1:0)+ ((a1<b1)?1:0)+ ((a2<b2)?1:0) ;
//        System.out.println(pointsAlice+" " +pointsBob);
    }
}
