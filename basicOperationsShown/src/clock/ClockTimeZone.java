/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.time.Clock;
import java.time.ZoneId;

/**
 *
 * @author DIMO
 */
public class ClockTimeZone {
      public static void main(String[] args) {
     Clock clock = Clock.tickSeconds(ZoneId.systemDefault());
    System.out.println(clock);
    System.out.println(clock.instant());
    
}
}