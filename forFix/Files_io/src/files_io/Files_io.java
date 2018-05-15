/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package files_io;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s504
 */
public class Files_io {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            new Files_io().writeStudentsS();
            new Files_io().readStudentsS();
        } catch (Exception ex) {
            Logger.getLogger(Files_io.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(true)
            return;
        FileCopy fc = new FileCopy();
        try {
            fc.copy("test.txt",
                    "copied_test.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
   
    private void writeStudentsS() throws Exception {
      
        new ObjectOutputStream(new FileOutputStream("st.txt")).
                writeObject(new Student("ivan", 25));
    }
    
    private void readStudentsS() throws Exception {
         
       Student s =(Student) 
               (new ObjectInputStream(new FileInputStream("st.txt"))).readObject();
        System.out.println(s);
    }
    
    public void writeStudents() throws FileNotFoundException, IOException {
        DataOutputStream dout = new 
                DataOutputStream(new FileOutputStream(
                "data.txt"));
        
        Student s1 = new Student("Miro", 25);
        dout.writeInt(s1.getAge());
        dout.writeUTF(s1.getName());
    }
    
    
}
