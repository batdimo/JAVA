/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringshown;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */

        // Complete the function
    
public class StringToArray {
    static boolean isAnagram(String a, String b) {
        
       if (a.length() != b.length()) return false;
        
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char [] temp = new char [Character.MAX_VALUE]; 
	//sry, too lazy to calculate ASCII idx of a-z rel. i :)
       
        int summ = 0;

        for (int i = 0; i < a.length(); i++){
            summ += ++temp [a.charAt(i)] <= 0 ? -1 : 1;
            summ += --temp [b.charAt(i)] >= 0 ? -1 : 1;
        }

        return summ == 0;
        
         
        
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
//     for(int i =0; i<256; i++)
//        {
//            System.out.println( i + ". " + (char)i);
//        }
     
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        
        
    }
}


