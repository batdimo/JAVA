/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lfsr;

/**
 *
 * @author s504
 */
public class LFSR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NumberReader nr = new NumberReader();
         while(true) {
                try {            
                        nr.read();
                        break;
                } catch (NumberFormatException n) {
                    System.err.println("Invalid Number");                        
                } catch (NegativeException e) {
                    System.err.println(e.getMessage());
                }
         }
         nr.print();
        
  
    }
}
