/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentarraylisst;

/**
 *
 * @author s504
 */
public class Student {
    private String name;
    private String fn;

    public Student() {
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
        return "Student{" + "name=" + name + ", fn=" + fn + '}';
    }

    
    
}
