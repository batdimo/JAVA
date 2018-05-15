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
public class SringShown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "12";
        System.out.println(text);
        System.out.println("12" + 1);
        System.out.println(text + 10);
        //concatenaciq dolepvane na stringove
        String textA = "Dimitar ";
        String textB = "Rafailov";
        System.out.println(textA + textB);
        
        //escapvane (s \( \n-nov red, \t - tabulaciq \r return)da pokazva ' i back slash \
        String textZ = "\"1212\"\\\"";
        System.out.println(textZ );
        
        
        

        // TODO code application logic here
    }

}
