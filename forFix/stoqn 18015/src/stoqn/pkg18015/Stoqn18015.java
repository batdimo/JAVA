/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stoqn.pkg18015;

/**
 *
 * @author s504
 */
public class Stoqn18015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student("Ivan", 23, "17639");
        System.out.println("name: " + s.getName());
        System.out.println("student: " + s);
        System.out.println("student: " + s.toString());
    }
}
