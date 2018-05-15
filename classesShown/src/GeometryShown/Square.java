 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometryShown ;

/**
 *
 * @author DIMO
 */
public class Square extends Shape{
    private double side;

    public Square(int x, int y, double side) {
        super(x, y);
        this.side = side;
    }
    

    public double getSide() {
        if (!Utility.Validator.isPositive(side)) {
            throw new IllegalArgumentException("side can not be negative");        
        }
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return this.getSide()*this.getSide();
    }
    
}
