/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stoqn.pkg18015;

/**
 *
 * @author s504
 */
public class Student {

    private String name;
    private int age;
    private String fn;

    public Student() {
    }

    public Student(String name, int age, String fn) {
        this.name = name;
        this.age = age;
        this.fn = fn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    @Override
    public String toString() {
           return getName() + 
                 " " + getAge() +  
                 " " + getFn();  
    }

    
    
    
}
