/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package products.pkg21.pkg06;

/**
 *
 * @author s504
 */
public class Product {
    private  int num;
    private  String name;
    private  double price;
    
    public Product(int productNumber, String productName, double productPrice)
    {
        this.num = productNumber;
        this.name = productName;
        this.price = productPrice;
    }
    
    public void setNum(int newNumber)
    {
        this.num = newNumber;
    }
    public int getNum()
    {
        return this.num;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    public String getName()
    {
        return this.name;
    }
    
    public void setPrice(double newPrice)
    {
        this.price = newPrice;
    }
    public double getPrice()
    {
        return this.price;
    }
    
    @Override
    public String toString()
    {
        return this.num + " - " + this.name + " - " + this.price;
    }
}
