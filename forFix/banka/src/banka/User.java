/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

/**
 *
 * @author s504
 */
public class User {
     
    private String name;
    private double amouth;

    public User() {
    }

    public User(String name, double amouth) {
        this.name = name;
        this.amouth = amouth;
    }

    public void setAmouth(double amouth) {
        this.amouth = amouth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmouth() {
        return amouth;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "user: " + getName() + " " 
                + getAmouth();
    }
    
     
}
