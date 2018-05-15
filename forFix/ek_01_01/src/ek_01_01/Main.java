/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ek_01_01;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author s504
 */
public class Main {

    public static void main(String a[]) {
//        Student  s = new Student();
//        s.setName("Ivan");
//        s.setFn("18307");
//        s.setMark(66);
        Student s1 = new Student("Ivan1", "18307", 6.0);
        Student s2 = new Student("Ivan2", "18317", 5.0);
        Student s3 = new Student("Ivan3", "18327", 3.0);
        Student s4 = new Student("Ivan4", "18337", 4.0);
        Student s5 = new Student("Ivan5", "18357", 2.0);

        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student);
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                if (students[i].getMark()
                        < students[j].getMark()) {
                    Student t = students[i];
                    students[i] = students[j];
                    students[j] = t;
                }

            }

        }


    }
}
