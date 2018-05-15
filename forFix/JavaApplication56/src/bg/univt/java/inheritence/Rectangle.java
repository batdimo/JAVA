/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.univt.java.inheritence;

/**
 *
 * @author s504
 */
public class Rectangle extends Figure{
    int a, b;

    public Rectangle() {
    }

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    
   public double lice() {
       return a*b;
   }
}
