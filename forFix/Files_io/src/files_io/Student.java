/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package files_io;

import java.io.Serializable;

/**
 *
 * @author s504
 */
class Student implements Serializable {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
         
    }
