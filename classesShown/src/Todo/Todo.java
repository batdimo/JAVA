/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Todo;

/**
 *
 * @author DIMO
 */
public class Todo {
    public static int PRIORITY_MIN = 1; 
    public static int PRIORITY_MAX = 2; 
    public static int PRIORITY_NOR = 3; 
    private String name;
    private String what;    
    private int Priority;

    public Todo(String name, String what, int Priority) {
        this.name = name;
        this.what = what;
        this.Priority = Priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }

    @Override
    public String toString() {
        return this.name + this.what + this.Priority;
    }

    
  
    
    
}
