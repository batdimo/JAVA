/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication60;

/**
 *
 * @author s504
 */
public class JavaApplication60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student s = new Student();
        s.setName("Miro");
        s.setId(66);
        s.setAddress("Veliko Tarnovo");
        
        Mark m1 = new Mark("2017/09/01", "C++", 6);
        Mark m2 = new Mark("2017/09/01", "OOP", 4);
        
        Mark []  marks = { m1, m2};
        s.setMarks(marks);
        
      
         System.out.println(s);
        
    }
}
