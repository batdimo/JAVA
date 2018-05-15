/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author s504
 */
public class Student {
            private String name;
            private String surname;
            private String spec;
            private int marsks[];

    public Student() {
    }

    public Student(String name, String surname, 
            String spec) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int[] getMarsks() {
        return marsks;
    }

    public void setMarks(int[] marsks) {
        this.marsks = marsks;
    }

    public void print() {
        System.out.println("name: " + getName());
        System.out.println("surname: " + getSurname());
        System.out.println("spec: " + getSpec());
        System.out.println("marks: ");
        for (int i : marsks) {
            System.out.println(i);
        }
    }  
            
}
