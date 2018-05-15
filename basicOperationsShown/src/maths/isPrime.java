/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class isPrime {
    
    static boolean isPrime( long Number){
        int Divine = (int)Math.sqrt(Number);
        for (int i = 2; i <= Divine; i++) {
            if (Number%i==0) {
                return false;                
            }            
        }
        return true;
    }
    public static void main( String [] args){
       
//        Scanner scan = new Scanner(System.in);
//        int A = scan.nextInt();
for (long i = 1000000; i < 10000001; i++) {
                
         System.out.print(i);   
        System.out.println(isPrime(i));
    }
}
}