/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsystemgui;

import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;

/**
 *
 * @author s504
 */
public class NumberReader {
    int readNumber() throws NegativeException{
        Scanner s = 
        new Scanner(System.in);
        System.out.println(
                "Enter a number");
        int value = s.nextInt();
        if (value < 0 ) {
            throw new NegativeException();
        }
        
        return value;
    }
}
