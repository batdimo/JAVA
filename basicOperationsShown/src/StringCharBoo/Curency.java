/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringCharBoo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class Curency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));

        String us = usFormat.format(payment);
        String india = inFormat.format(payment);
        String france = frFormat.format(payment);
        String china = cnFormat.format(payment);
//      String us = "$"+Double.toString(payment);
//        // Write your code here.
//        
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
    }
}

