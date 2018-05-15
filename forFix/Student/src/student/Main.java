/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
/**
 *
 * @author s504
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s = new Student();
        s.setName("Mihail");                
        s.setSurname("Stefanov");                
        s.setSpec("KN3");                
        int marks [] = {5, 4, 6};
        s.setMarks(marks);
        s.print();
        
    }
}
