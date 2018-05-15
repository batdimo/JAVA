/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carddealer2;

/**
 * We'll put cars here
 * 
 * @author s504
 */
public class Car extends Vehicle {

    private String color;
    int numberDoors;
    
    public Car() {
    }

    public Car(int doors, String color,
            String model, double price, 
            boolean hasWheels) {
        super(model, price, hasWheels);
        this.color = color;
        this.numberDoors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " " + color 
                + " " + numberDoors;
    }

     
    
}
