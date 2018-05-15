/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author DIMO
 */
public class People {

    private String name;
    private int age;
    private char gender;

    public People(String name) {
        this(name, 0);// kazva mu da preizpolzva dolniq konstruktor
    }

    public People(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null) {
            throw new IllegalArgumentException("name can not be null");
        }

        if (name.length() <= 2) {
            throw new IllegalArgumentException("name must be longer than 2 letters");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age can not be negative");

        }
        this.age = age;
    }

}
