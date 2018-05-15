/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdown;


import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 *
 * @author DIMO
 */
public class CountDown {

    static Thread t = new Thread();

    public static void main(String[] arg)
            throws InterruptedException {
      int Sec=8;
        for (int i = Sec; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println(i);
        }
//         SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
//    Date now = new Date();
   // String strDate = sdfDate.format();
     DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
  // dateFormatLocal.setTimeZone(timeZone);
   //java.util.Date parsedDate = dateFormatLocal.parse(date);
        System.out.println(dateFormat);
  
       // JOptionPane.showMessageDialog(null, " time zone +3 is: " + sdfDate.getTimeZone() );
      
        
       
    }
}
