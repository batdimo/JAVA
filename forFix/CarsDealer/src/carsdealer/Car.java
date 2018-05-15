/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carsdealer;

/**
 *
 * @author s504
 */
public class Car extends Vehicle{

    private String mark;
    private String engine;
    private String color;
    
    public Car() {
    }

    public Car(String mark ,String engine, String color, 
            String model, boolean hasWheels,
            double price) {
        super(model, hasWheels, price);
        this.mark = mark;
        this.engine = engine;
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return mark+" "+ model + " " + price ;
    }
    
    public void p() {        
        System.out.println("Car");
    }
    
}
