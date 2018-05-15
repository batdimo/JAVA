/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
// pobitovi , filtrirasht, simvolni
//input stream outputstream  write (int) write (byte[] read() read byte[]

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s504
 */
public class File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            Fc f=new Fc("C:\\Documents and Settings\\s504.DOMAIN3\\Desktop\\greshki.doc","C:\\Documents and Settings\\s504.DOMAIN3\\Desktop\\greshkiCOPY.doc");
           
            f.copy();
                    // TODO code application logic here
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }
//        -> data.txt
//        Abc
//                12
//        def
//                66
        DataOutputStream dout=new DataOutputStream(new FileOutputStream("data.txt"));
        dout.writeUTF(" Abc");
        dout.writeInt(123);
        dout.writeUTF(" Def");
        dout.writeInt(456);
        
        DataInputStream din= new DataInputStream(new FileInputStream("data.txt"));
        System.out.println(din.readUTF());
        System.out.println(din.readInt());
        System.out.println(din.readUTF());
        System.out.println(din.readInt());
        java.io.File files= new java.io.File("C:\\Documents and Settings\\s504.DOMAIN3\\Desktop\\greshki.doc");
        System.out.println("size"+ files.length());
        System.out.println("canWrite"+files.canWrite());
        System.out.println("isDirectory" + files.isDirectory());
        //java serilization kakvo e?
    }
}
