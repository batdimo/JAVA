/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clockgiui;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author s504
 */
public class ClockGiui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
                DataOutputStream dout = new 
                        DataOutputStream(
                        new FileOutputStream("data.txt"));
                dout.writeInt(5);
                dout.writeInt(66);
    }
}
