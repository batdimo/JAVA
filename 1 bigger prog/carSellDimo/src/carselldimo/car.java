/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carselldimo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DIMO
 */
public class car {
    private String make, model;
    private int year;
    private double price;
     public car() {
    }

    public car(String make, String model, int year, double price) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
        this.setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (this.make==null) { 
            JOptionPane.showMessageDialog(null,"please isert car make");
        }
        this.make = make;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return make + " " + model + ", " + year + ", " + price + " лв.";
    }
    
    
}
