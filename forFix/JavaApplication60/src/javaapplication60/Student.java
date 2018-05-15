/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication60;

/**
 *
 * @author s504
 */
public class Student {
    private int id;
    private String name;
    private String address;
    private Mark[] marks;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Mark[] getMarks() {
        return marks;
    }

    public void setMarks(Mark[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + '}';
    }
    
    
}
