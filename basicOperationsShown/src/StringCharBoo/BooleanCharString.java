/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringCharBoo;

/**
 *
 * @author DIMO
 */
public class BooleanCharString {
    public static void main(String[] arg){ 
        int X=5; 
        int Y=4;
        boolean Istrue = X==Y;
        System.out.println(Istrue);
        
        int a = (int) '0';
        System.out.println(a);
       // for (int i = 0; i < Character.MAX_VALUE; i++) {
         //   System.out.println(i+" "+(char)i);
            
        //}
        
        String tre =   "kofbi";
        tre+=" hrist";
        tre+='!';
        System.out.println(tre.charAt(3));
        System.out.println(tre);
      
        System.out.println(tre.substring(4, 8));
    }
    
}
