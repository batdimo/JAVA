/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdata02;

/**
 *
 * @author s504
 */
public class Studentdata02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     StudentData data = new StudentData();
     data.add(new Student("aaa", "bbb"));
     data.add(new Student("unufri", "ert"));
     data.add(new Student("django", "murdjov"));
     data.add(new Student("ddd", "sss"));
     data.list();
        // TODO code application logic here
    }
}
