/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;

import java.util.Scanner;


/**
 *
 * @author s504
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Eter your name buddy!!!");
        
        Scanner s = new Scanner(System.in);

//        String name = s.nextLine();
//        System.out.println("Hello Mr. " + name);
        
        System.out.println("Enter a number");
        int a = s.nextInt();
        System.out.println("Enter a number");
        int b = s.nextInt();
        System.out.println("sum = " +(a+b));
       
        
        
    }
    
}
