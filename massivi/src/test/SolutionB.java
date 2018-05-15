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

public class SolutionB {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j) {
                    sum += a[a_i][a_j];
                }
            }

        }
        
        int sumA=0;
        int b =n;
         for (int a_i = 0; a_i < b; a_i++) {
              sumA += a[a_i][n-1];
            n--;
                   
    }
         System.out.println(Math.abs(sumA-sum));
}
         }
    
    