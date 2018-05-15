/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclass;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s504
 */
public class Cilinder implements Cloneable {

    private double r;
    private double h;

    public Cilinder() {
    }

    public Cilinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public double getR() {
        return r;
    }

    public double volume() {
        double v = Math.PI * r * r * h;
        return v;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException
                c) {
            c.printStackTrace();
        }
        return null;
    }

    public static void main(String ar[]) {

        Cilinder c1 = new Cilinder(123, 2345);

        Cilinder c2 = (Cilinder) c1.clone();

        if(c2 == null) {
            System.out.println("c2 == null");
        }
        
        if(c1.equals(c2)) {
            System.out.println("c1 equals c2");
        } 
        
        if(c1 == c2) {
            System.out.println("c1 == c2");
        }

        String a = new String("abcd");
        String b = new String("a");
        if(a.equals("a")) {
            System.out.println("a == b");
        } else {
            System.out.println("a != b");
        }
        
        
        System.out.println(a.indexOf("c"));
        StringBuffer sb = new StringBuffer();
        sb.append("a");
        sb.append("a");
        sb.append("a");
        sb.append("a");
        System.out.println(sb.toString());
        
    }
}
