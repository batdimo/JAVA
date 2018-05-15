/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carsdealer;

/**
 *
 * @author s504
 */
class Vehicle {
    protected String model;
    protected boolean hasWheels;
    protected double price;

    public Vehicle() {
    }

    public Vehicle(String model, boolean hasWheels, double price) {
        this.model = model;
        this.hasWheels = hasWheels;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return model + " " + price;
    }
    
   public void p() {
        System.out.println("Vehicle");
    }
}
