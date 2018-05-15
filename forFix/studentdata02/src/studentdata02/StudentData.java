/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdata02;

/**
 *
 * @author s504
 */
public class StudentData {

    private Student students[] = new Student[100];
    int index = 0;

    public StudentData() {
    }

    public void add(Student s) {
        // s is going to students []
        students[index] = s;
        index++;
    }

    public void list() {
        for (int i = 0; i < index; i++) {
            System.out.println(students[i]);
        }
    } 

    public Student[] getStudents() {
        return students;
    }
}
