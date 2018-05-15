/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsystemgui;

import java.util.Scanner;

/**
 *
 * @author s504
 */
public class NumberReader1 {
    
    int readNumber() 
            throws NegativeException{
        int value = 0;
        // >>> 
        System.out.println("Enter a number");
        value = new Scanner(System.in).
                nextInt();
        if(value < 0) {
            throw  new NegativeException();
        }
        
        return value;
    }
}
