/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentarraylisst;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;

/**
 *
 * @author s504
 */
public class StudentsModel {
    private ArrayList<Student> 
            students= 
            new ArrayList<Student>();
  void add(Student s) {
      students.add(s);
  }

    public ArrayList<Student> getStudents() {
        return students;
    }
  
}
