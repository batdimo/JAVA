/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carddealer2;

/**
 *
 * @author s504
 */
public class Vehicle {
    protected String model;
    protected double price;
    protected boolean hasWheels;

    public Vehicle() {
    }

    public Vehicle(String model, double price, boolean hasWheels) {
        this.model = model;
        this.price = price;
        this.hasWheels = hasWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    @Override
    public String toString() {
        return model + " " + price;
    }
    
    
}
