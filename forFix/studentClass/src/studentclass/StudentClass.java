/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentclass;

/**
 *
 * @author s504
 */
public class StudentClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Student s  = new Student();
        s.setName("Ivannas");
        s.setFn(2345);
        s.print();
        
        Student s2  = new Student("Pesho",
                1235345);
        s2.print();
        
        
        
        
        
        
        
        
//        Student s[] = new Student[5];        
//        s[0] = new Student("a1", 324);
//        s[1] = new Student("a2", 345);
//        s[2] = new Student("a3", 56);
//        s[3] = new Student("a4", 678);
//        s[4] = new Student("a5", 76);
//        
//        for (int i = 0; i < s.length; i++) {
//            for (int j = 0; j < s.length; j++) {
//                if(s[i].getFn() > s[j].getFn()) {
//                    // swap
//                    Student temp = s[i];
//                    s[i] = s[j];
//                    s[j] =temp;
//                }
//            }
//        }
//        
//        System.out.println(s);
//        
//        for (int i = 0; i < s.length; i++) {
//            Student student = s[i];
//            System.out.println(student);
//        }
    }
}
