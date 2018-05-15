/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringshown;
   import java.io.*;
import java.util.*;


/**
 *
 * @author DIMO
 */
public class StringB {
 

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
      
        /* Enter your code here. Print output to STDOUT. */
       
     System.out.println( A.equals( new StringBuilder(A).reverse().toString()) 
    ? "Yes" : "No" );
        
    
}

}