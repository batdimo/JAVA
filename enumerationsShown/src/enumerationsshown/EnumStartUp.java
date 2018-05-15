/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerationsshown;

import static enumerationsshown.EnumerationsShown.FRIDAY;
import java.time.DayOfWeek;

/**
 *
 * @author DIMO
 */
public class EnumStartUp {
    public static void main (String [] arg){
        DayOfWeek NotMy = DayOfWeek.MONDAY;
        EnumerationsShown My = EnumerationsShown.SATURDAY;
        My= EnumerationsShown.valueOf("FRIDAY");
        System.out.println(NotMy);
         System.out.println(My);
         switch (My){
             case FRIDAY: break;
         }
                
    }
    
}
