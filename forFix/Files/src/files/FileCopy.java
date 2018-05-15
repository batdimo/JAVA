/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

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

    private String source;
    private String destination;

    public void copy() {

        try {
            FileInputStream fin = new FileInputStream(source);
            FileOutputStream fou = new FileOutputStream(destination);
            int i = fin.read();
            while ( i != -1) {
                fou.write(i);
                i = fin.read();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

 
    
    
}
