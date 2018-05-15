/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figuraex01;

/**
 *
 * @author s504
 */
public class Rectangle extends Figura {

    private double a;
    private double b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
    
    @Override
    protected double surface() {
        return a * b;
    }
    
}
