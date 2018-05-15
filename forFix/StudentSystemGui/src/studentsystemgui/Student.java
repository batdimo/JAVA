/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsystemgui;

import java.io.Serializable;

/**
 *
 * @author s504
 */
public class Student implements Serializable{
    private String name;
    private String fn;

    public Student(String name, String fn) {
        this.name = name;
        this.fn = fn;
    }

    Student(String stefan, int i) {
        this.name = stefan;
        fn = String.valueOf(i);
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

    @Override
    public String toString() {
        return getName() + " " + getFn();
    }
    
    
}
