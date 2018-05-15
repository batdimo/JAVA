/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationtest;

import java.io.Serializable;

/**
 *
 * @author s504
 */
public class Student implements Serializable {
    
    private String name;
    private String fn;

    public Student() {
    }

    public Student(String name, String fn) {
        this.name = name;
        this.fn = fn;
    }

    public String toString() {
        return name + " " + fn;
    }
    
    
    
}
