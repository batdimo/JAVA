/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s504
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JavaApplication3 m = new JavaApplication3();
        try {
            // m.printHtml("http://m.yahoo.com");
            m.downloadImage("http://3.bp.blogspot.com/-4oS0DXIyIiY/T9D8F8mJmKI/AAAAAAAH2SE/Kic4o1h0yw0/s800/Ferrari-458-Italia-Kahn-Design-4.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    private void downloadImage(String imageUrl)
            throws MalformedURLException, IOException {
        
        URL u = new URL(imageUrl);
        InputStream is = u.openStream();
        FileOutputStream fOut =
                new FileOutputStream("ferrari.jpg");
        int c = 0;
        while ((c = is.read()) != -1) {
            // System.out.print((char)c);
            fOut.write(c);
        }
    }
    
    void printHtml(String site)
            throws MalformedURLException,
            IOException {
        
        URL u = new URL(site);
        InputStream is = u.openStream();
        
        int i = 0;
        while ((i = is.read()) != -1) {
            System.out.println((char) i);
        }
    }
}
