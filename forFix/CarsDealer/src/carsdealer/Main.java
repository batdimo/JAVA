/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carsdealer;

/**
 *
 * @author s504
 */
public class Main {
    public static void main(String sp[]){
    
        CarsDealer cd = new CarsDealer();
        
        Car opel = new Car("Opel","2.0 GSI", "Blue", "Astra ", true, 1000);
        Car AUDI = new Car("Audi","3,0 TDI", "Green", "Avant ", true, 6999);
        Boat yamahaB=new Boat (20.2,"Yamaha",12000) ;
      
        cd.add(opel);
        cd.add(AUDI);
        cd.add(yamahaB);
        
        //cd.print();
        
        Vehicle r[] = cd.search(1200, ">");
        cd.print(r);
    }
}
