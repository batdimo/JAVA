/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclass;

 
/**
 *
 * @author s504
 */
public class Student {
    // fields
    private String name;
    private int fn;
    
    // constructors
    public Student() {
    }
    
    public Student(String name, int fn) {
        this.name = name;
        this.fn = fn;
    }
    
    
    // methods
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setFn(int fn) {
        this.fn = fn;
    }

    public int getFn() {
        return fn;
    }

    
    public void print() {
        String st = "name: "
                + name + " fn: " + fn;
        System.out.println(st);
    }
}
