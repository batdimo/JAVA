/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileex01;

/**
 *
 * @author s504
 */
public class Fileex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileCopy fc = new FileCopy();
        fc.copy("C:\\Documents and Settings\\s504.DOMAIN3\\"
                + "Desktop\\text.txt", ""
                + "C:\\Documents and Settings\\"
                + "s504.DOMAIN3\\Desktop\\testCOPY.txt");
    }
}
