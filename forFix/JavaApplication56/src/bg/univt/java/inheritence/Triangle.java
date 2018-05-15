/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.univt.java.inheritence;

/**
 *
 * @author s504
 */
public class Triangle extends Figure {
    int a, ha;

    public Triangle() {
    }

    public Triangle(int a, int ha) {
        this.a = a;
        this.ha = ha;
    }

    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getHa() {
        return ha;
    }

    public void setHa(int ha) {
        this.ha = ha;
    }
    
    
    
    public double lice() {
        // ....
        return a*ha/2;
    }

    
    
    
    
}
