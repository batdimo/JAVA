/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperationsshown;

import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class ScannerShown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Scanner scand = new Scanner(System.in);
        double d = scand.nextDouble();
        Scanner textscan = new Scanner(System.in);
        String s = textscan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
         int b = 0;
        while (scan.hasNext()) {
            
            b++;
            String star = scan.nextLine();
            System.out.println(b + " " + star);

        }
    }
        // TODO code application logic here
    }
    

