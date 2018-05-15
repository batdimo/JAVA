/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package products.pkg21.pkg06;

/**
 *
 * @author s504
 */
public class Fruit extends Product {
    private String color;

    public Fruit(int productNumber, String productName, double productPrice) {
        super(productNumber, productName, productPrice);
    }

    public Fruit(String color, int productNumber, String productName, double productPrice) {
        super(productNumber, productName, productPrice);
        this.color = color;
    }

    
//    public Fruit()
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + this.color;
    }
}
