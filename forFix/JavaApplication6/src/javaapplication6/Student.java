package javaapplication6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author s504
 */
public class Student {

    private int age;
    private String name;
    private String fn;

    public Student() {
    }

    public Student(String name, String fn, int age ) {
        this.age = age;
        this.name = name;
        this.fn = fn;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFn() {
        return fn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getFn();
    }
    
    
    
}
