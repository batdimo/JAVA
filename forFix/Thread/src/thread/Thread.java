/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author s504
 */
public class Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TextThread t1 = new TextThread ("aaa");
        TextThread t2 = new TextThread ("bbb");
        t1.setPriority(java.lang.Thread.MIN_PRIORITY);
        t2.setPriority(java.lang.Thread.MAX_PRIORITY);
        System.out.println(t1.toString());
             
        // TODO code application logic here
    }
}
