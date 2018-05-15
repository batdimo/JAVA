/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author s504
 */
public class Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FileCopy fc = new FileCopy();
//        fc.setPath("C:\\Documents and Settings\\s504.DOMAIN3\\Desktop\\TEST.txt");
//        fc.setDestination("C:\\Documents and Settings\\s504.DOMAIN3\\Desktop\\TEST_COPY.txt");
        fc.copy();
        System.out.println("file copied");
        
        try {
        DataOutputStream dout = new 
                DataOutputStream(
                new FileOutputStream("data.txt"));
        
        dout.writeInt(23);
        dout.writeUTF("Stefan");
        dout.writeInt(25);
        dout.writeUTF("Miro");
        
        
        
        
        
        
        
        
        
        DataInputStream din = new 
                DataInputStream(
                new FileInputStream("data.txt"));
        
            System.out.println(din.readInt());
            System.out.println(din.readUTF());
            System.out.println(din.readInt());
            System.out.println(din.readUTF());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }        
        
    }
}
