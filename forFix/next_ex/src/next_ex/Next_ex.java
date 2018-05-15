/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package next_ex;

import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author s504
 */
public class Next_ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        URL u = new URL("http://google.com");
        InputStream is = u.openStream();
        int i = 0;
        while(( i = is.read())> -1) {
            System.out.print((char)i);
        }
    }
}
