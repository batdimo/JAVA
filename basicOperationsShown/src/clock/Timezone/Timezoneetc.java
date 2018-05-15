/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock.Timezone;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class Timezoneetc {
    
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String month = in.next();
    String day = in.next();
    String year = in.next();

    int n_month = Integer.parseInt(month);
    int n_day = Integer.parseInt(day);
    int n_year = Integer.parseInt(year);


    int mon[] = {0,3,3,6,1,4,6,2,5,0,3,5};
    int ye = 6;
    int total=0;
    if(n_year > 2000 && n_year < 3000)
        {
        int new_year = n_year % 2000;
        int new_year_rem = new_year /4;

         total = mon[n_month-1] + n_day + new_year + new_year_rem + ye;
   //     System.out.print(mon[n_month-1] +"  "+  n_day +"  "+ new_year +"  "+ new_year_rem +"  "+  ye);

    }

    int ch = total % 7;

    switch(ch)
       {
        case 0:
         {
             System.out.print("SUNDAY");
            break;
         }
        case 1:
         {
             System.out.print("MONDAY");
            break;
         }
        case 2:
         {
             System.out.print("TUESDAY");
            break;
         }
        case 3:
         {
             System.out.print("WEDNESDAY");
            break;
         }
        case 4:
         {
             System.out.print("THURSDAY");
            break;
         }
        case 5:
         {
             System.out.print("FRIDAY");
            break;
         }
        case 6:
         {
             System.out.println("SATURDAY");
            break;
         }

    } 
}
}