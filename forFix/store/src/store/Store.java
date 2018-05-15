/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package store;

 
public class Store {

    private int quantity;
    private double price;

    public Store() {
    }

    public Store(int quantity, 
            double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double dds() {
        return price * quantity
                * 20 / 100;
    }
    
    public double smallPrice () {
        return 
                price * quantity 
                + dds();
    }
}
