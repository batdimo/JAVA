/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point3d;

/**
 *
 * @author DIMO
 */
public class Point3d {
    public double x;
    public double y;
    public double z;

    public Point3d(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

 
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public double calcDistance(Point3d p) {
        return Math.sqrt(Math.pow(Math.sqrt(this.getX() - p.getX())*(this.getX() - p.getX()) +
        (this.getY() - p.getY())*(this.getY() - p.getY()),2)+ 
        (this.getZ() - p.getZ())*(this.getZ() - p.getZ()));
        
    }
    
    
}