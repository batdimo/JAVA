/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Properties;

/**
 *
 * @author s504
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println(p.getProperty(
                "java.vendor"));
        
    }
}
