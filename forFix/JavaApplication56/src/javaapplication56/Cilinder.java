/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

/**
 *
 * @author s504
 */
public class Cilinder {
    private double h;
    
    /* this is the cylinder's radui */
    private double r;

    public Cilinder() {
    }

    public Cilinder(double h, double r) {
        this.h = h;
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double area() {        
        return 2 * Math.PI * r * h;
    }
    
}
