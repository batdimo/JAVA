/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mouselisteners;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author s504
 */
public class MouseListeners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Date d = new Date();   
        System.out.println(d);        
        System.out.println(d.getTime());
        
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        
        SimpleDateFormat s = new SimpleDateFormat(
                "HH/mm/ss EEE");
        System.out.println(s.format(d));
       
    }
}
