/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometryShown;
import contracts.IMesurable;
import contracts.Imoveble;
/**
 *
 * @author DIMO
 */
public abstract class Shape implements  Imoveble, IMesurable {

    private int x;
    private int y;

    public abstract double getArea();

    public Shape(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int deltaX, int deltaY) {
        this.setX(this.getX() + deltaX);
        this.setY(this.getY() + deltaY);
    }
    public String toString(){
    return String.format("c (%s , %s)", this.getX(), this.getY());
}
}
