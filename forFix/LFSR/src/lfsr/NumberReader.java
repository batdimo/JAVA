/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lfsr;

import java.util.Scanner;

/**
 *
 * @author s504
 */
public class NumberReader {

    private int d;

    public void read() throws NegativeException {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        setD( Integer.parseInt(s.nextLine()) );
    }

    public void setD(int d) throws NegativeException {
        if(d < 0) {
            throw new NegativeException("Number is negative");
        }
        
        this.d = d;
    }

    
    
    void print() {
        System.out.println("your number is: " + d);
    }
}
