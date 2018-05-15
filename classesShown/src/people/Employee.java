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
public class Employee extends People {
    private int salary;
    private int numEmpl;

    public Employee(String name,int numEmpl ) {
        super(name,169);
           }
    

    public Employee(int numEmpl, String name, int salary) {
        super(name);
        this.setSalary(salary);
        this.setNumEmpl(numEmpl);
    }
    

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getNumEmpl() {
        return numEmpl;
    }

    public void setNumEmpl(int numEmpl) {
        this.numEmpl = numEmpl;
    }
    
    
}
