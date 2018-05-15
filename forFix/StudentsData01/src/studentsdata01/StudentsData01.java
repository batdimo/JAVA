/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsdata01;

/**
 *
 * @author s504
 */
public class StudentsData01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StudentData s=new StudentData();
        s.add(new Student("3", "89"));
        s.add(new Student("4", "90"));
        s.list(); 
    }
}
