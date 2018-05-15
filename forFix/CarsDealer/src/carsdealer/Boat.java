/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carsdealer;

/**
 *
 * @author s504
 */
public class Boat extends Vehicle{
   // this is how much we....
    double  widht;

    public Boat() {
    }

    public Boat(double widht ,String model, double price) {
        super(model, false, price);
        this.widht=widht;
    }
    
    public void p() {
        System.out.println("Boat");
    }
}
