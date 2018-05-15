/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s504
 */
public class Student implements Cloneable {
    private String name;
    public Student(){}

    public Student(String name) {
        this.name = name;
    }
    
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
       return null;
        }
    }

    @Override
    public String toString() {
        return "name: "+name;
    }
    
}
