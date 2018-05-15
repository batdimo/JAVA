/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serializationtest;

import java.io.*;

/**
 *
 * @author s504
 */
public class SerializationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        RandomAccessFile r = new RandomAccessFile(
                "dummy.txt", "r");
        while(r.getFilePointer() < r.length()) {
            System.out.println(r.readLine());
        }
        
        Student data = new Student(
                "Pesho", "32452345");
        try {
            ObjectOutputStream out  = 
                    new ObjectOutputStream(
                        new FileOutputStream("dummy.txt"));
            out.writeObject(data);
        } catch (IOException ex) {           
        }
        
        try {
            ObjectInputStream in  = 
                    new ObjectInputStream(
                        new FileInputStream("dummy.txt"));
            String s  =  (String)in.readObject();
            System.out.println(s);
        } catch (IOException ex) {           
        } catch (ClassNotFoundException ex) {
        }
        
    }
}
