/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsystemgui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger; 

/**
 *
 * @author s504
 */
public class Main {

    public static void main(String a[]) 
        throws Exception {
        
            ObjectOutputStream out = 
                    new ObjectOutputStream(
                    new FileOutputStream("data.txt"));
        out.writeObject(new Integer(55));
        
        ObjectInputStream in = new ObjectInputStream
        (new FileInputStream("data.txt"));
        Integer i = (Integer) in.readObject(); 
        System.out.println("i: " + i);
        
         URL u = new URL("http://yahoo.com");
         URLConnection con = u.openConnection();
         con.setDoInput(true);
         InputStream is = con.getInputStream();
         FileOutputStream fout = 
                 new FileOutputStream("test.jpg");
         int c = 0;
         while((c = is.read())!=-1) {
             fout.write(c);
             System.out.print((char) c);
         }
    }
}
