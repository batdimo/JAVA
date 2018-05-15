/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forshown;

import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class CaseShown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cifra bukva ili literal se pozva, s break zavyrshvat ina4e ne izliza.
        Scanner scann= new Scanner(System.in);
        System.out.print("enter week day: ");
        int day = scann.nextInt();
        switch (day) {
            case 1: System.out.println("The day is Monday"); break;
            case 2: System.out.println("The day is Thusday"); break;
            case 3: System.out.println("The day is Wensday"); break;
            case 4: System.out.println("The day is Thursday"); break;
            case 5: System.out.println("The day is Fryday"); break;
            case 6: System.out.println("The day is Satarday"); break;
            case 7: System.out.println("The day is Sunday"); break;
            default: System.out.println("no such day");
        }
        // TODO code application logic here
    }
    
}
