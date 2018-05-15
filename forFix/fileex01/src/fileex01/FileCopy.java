/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileex01;

import java.io.DataOutput;
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
public class FileCopy {

    public FileCopy() {
    }

    public void copy(String source,
            String target) {
        try {
            FileInputStream in;

            in = new FileInputStream(source);

            FileOutputStream out = new FileOutputStream(target);
            int i = 0;
            while ((i = in.read()) > -1) {
                out.write(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileCopy.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    void testDataWrite() {
        DataOutputStream out = 
                new DataOutputStream(
                    new FileOutputStream("data.txt"));
        out.writeInt(15);
        out.writeUTF("Ivan");
        out.writeInt(45);
        out.writeUTF("Stefam");
    }
}

