/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package files_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author s504
 */
public class FileCopy {
    
    public void copy(String source, String
            destination) 
            throws IOException, 
            FileNotFoundException {
        
        FileInputStream fin = 
                new FileInputStream(source);
        FileOutputStream fout = 
                new FileOutputStream(destination);
        
        int c  = 0;
        while((c = fin.read())!=-1) {
            fout.write(c);
        }
    }
}
