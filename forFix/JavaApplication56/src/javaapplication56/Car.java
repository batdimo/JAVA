/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

/**
 *
 * @author s504
 */
public class Car {
    private String name;
    private String regDate;
    private double price;

    public Car() {
    }

    public Car(String name, String regDate, double price) throws NumberException {
        this.name = name;
        this.regDate = regDate;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price)
            throws NumberException {
        
        if(price < 0) throw 
                new NumberException("Pr  < 0");
      
        this.price = price;
    }

    @Override
    public String toString() {
        //return String.format("%10s, %6s, %10f", 
          //      getName(), getRegDate(), getPrice());
        return name + " " + price;
    }
    
    
}
