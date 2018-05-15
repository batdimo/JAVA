/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carddealer2;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author s504
 */
public class Main {
 
    public static void main(String a[]) {
                
        CarsDealer2 cd = new CarsDealer2();
        
        Car opel = new Car(5, "grey", "Astra", 1000, true);
        Car opel2 = new Car(4, "blue", "Astra", 2000, true);
        
        cd.add(opel);  
        cd.add(opel2);         
        
        // cd.print();
        Vehicle r [] = cd.search(1000, "<" );
        cd.print(r);
    }
}
