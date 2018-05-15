/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forshown;

/**
 *
 * @author DIMO
 */
public class ForShown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0,j = 8;j<20 || i > 10;j-=3, i++) {
            //System.out.println(i+j);  
        }
        
        //2ri primer
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i +"i="+ "j=" +j);
            }
  
        }
        //3 primer 
        String[] names = {"dancho","niuk", "zod"};
        for (String name:names) {
            System.out.println(name);   
        }
        // TODO code application logic here
    }
    
}
