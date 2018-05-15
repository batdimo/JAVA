/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studendata03;

/**
 *
 * @author s504
 */
public class StudenData03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StudentData data = new StudentData();
        data.add(new Student("a", "1"));
        data.add(new Student("b", "2"));
        data.add(new Student("c", "3"));
        data.list();
    }
}
