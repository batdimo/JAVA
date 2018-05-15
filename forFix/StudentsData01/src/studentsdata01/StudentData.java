/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsdata01;

/**
 *
 * @author s504
 */
public class StudentData {

    final static int MAX_STUDENTS
            = 100;
    private Student students[]
            = new Student[MAX_STUDENTS];
    int index = 0;

    public StudentData() {
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void add(Student s) {
        students[index] = s;
        index++;
    }

    public void list() {
        for (int i = 0; i < index; i++) {
            System.out.println(students[i]);

        }

    }

}
