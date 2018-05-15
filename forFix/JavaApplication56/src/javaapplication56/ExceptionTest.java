/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

/**
 *
 * @author s504
 */
public class ExceptionTest {
    
    
    public static void main(String args[]) {
        int a[] = {1,2,3,4,5};
        
        try {
            a[66] = 666;
        } catch (Exception e) {            
            System.err.println("Nevaliden index");
        }
       
    }
}
