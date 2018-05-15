/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ek_01_01;

/**
 *
 * @author s504
 */
public class Student {
    private String name;
    private String fn;
    private double mark;

    public Student() {
    }

    public Student(String name, String fn, double mark) {
        this.name = name;
        this.fn = fn;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {        
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + " "  +mark;
    }

    
     
    
    
}
