/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author s504
 */
public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mark m1 = new Mark(6, "MI",
                new Date());
        Mark m2 = new Mark(4, "IN", new Date());
        Mark m3 = new Mark(6, "FF", new Date());
        
        ArrayList<Mark> list = 
                new ArrayList<Mark>();
        
        list.add(m1);
        list.add(m2);
        list.add(m3);
        
        System.out.println(list);
    }
}
