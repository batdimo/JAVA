/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsystemgui;

/**
 *
 * @author s504
 */
public class StudentsModel {
    private Student students[] 
            = new Student[100];
    private int position = 0;

    public StudentsModel() {
    }

    public Student[] getStudents() {
        return students;
    }
    
    public void add(Student s) {
        students[position] = s;
        position++;
    }
}
