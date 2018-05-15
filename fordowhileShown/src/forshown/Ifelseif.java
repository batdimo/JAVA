/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forshown;

/**
 *
 * @author DIMO
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ifelseif {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double a = 0; double b = 0; double c = 0;
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            if (arr[arr_i] > 0) {
                a++;
            }
            else if (arr[arr_i] < 0) {
                b++;
            } else {
                c++;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.format("%.06f%n%.06f%n%.06f", a/n,b/n,c/n);
      
        
            
    }
}
