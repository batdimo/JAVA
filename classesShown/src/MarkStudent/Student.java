/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MarkStudent;
/**
 *
 * @author s504
 */
public class Student {
    /*Student
-id
-name
-address
set/get metodi
* */
    private int id;
    private String name;
    private String address;
    private int Mark;
    Mark marks[];
    public Student(int a, String c, String d, int f)
    {
        this.id =a;
        this.name=c;
        this.address=d;
        setMark(f);
    }
    public Student()
    {
        this.name="";
        this.address="";
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(int Mark) {
        if (Mark<2 || Mark>6)
        {
            System.out.println("ERROR");
            return;
        }
        this.Mark = Mark;
    }}


