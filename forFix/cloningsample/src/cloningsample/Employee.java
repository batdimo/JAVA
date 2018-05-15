/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cloningsample;


public class Employee {
 
    private int empoyeeId;
    private String employeeName;
    private Department department; 

    public Employee(int empoyeeId, String employeeName, Department department) {
        this.empoyeeId = empoyeeId;
        this.employeeName = employeeName;
        this.department = department;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        return ((Employee)obj).getEmpoyeeId() 
                == empoyeeId;
    }

    public int getEmpoyeeId() {
        return empoyeeId;
    }
    
    
    
}
  class Department {
        private int id;
        private String name;
  }