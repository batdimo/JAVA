/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

/**
 *
 * @author s504
 */
public class Student extends Person{
     
    private int fn;

    public Student() {
    }
    
    public Student(int fn, char g, 
            int h, String n) {
        super(g, h, n);
        this.fn = fn;
    }
}
