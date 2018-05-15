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
public class Student extends People {

    private String school;

    public Student(String name, String school) {
        super(name);
        this.setSchool(school);
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return String.format("I'm %s and i study in %s", this.getName(), this.getSchool());
//To change body of generated methods, choose Tools | Templates.
    }

    public void setSchool(String school) {
        this.school = school;
    }

}
