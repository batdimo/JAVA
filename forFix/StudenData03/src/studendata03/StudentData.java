/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studendata03;

/**
 *
 * @author s504
 */
public class StudentData {
    final int MAX_EL = 100;
    private Student students[] =
            new Student[MAX_EL];

    int index = 0;
    
    public StudentData() {
    }

    public Student[] getStudent() {
        return students;
    }
    
    public void add(Student s) {
            students[index] = s;
            index ++;
    }
    
    public void list() {
        for (Student student : students) {
            if(student!= null)
                System.out.println(student);
        }
    }
}
