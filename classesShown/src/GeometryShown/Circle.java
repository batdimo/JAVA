/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometryShown;

/**
 *
 * @author DIMO
 */
public class Circle extends Shape {

    private final static double Pi = Math.PI;
    private int radius;

    public Circle(int x, int y,int radius) {
        super(x, y);
        this.setRadius(radius);
    }

    @Override
    public double getArea() {
       return Pi*this.getRadius()*this.getRadius();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (!Utility.Validator.isPositive(radius)) {
             throw new IllegalArgumentException("radius can not be negative");
        }
        this.radius = radius;
    }


}
