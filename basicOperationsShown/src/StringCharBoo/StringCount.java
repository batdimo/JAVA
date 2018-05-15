/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringCharBoo;

import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class StringCount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.length()<=40000) {
            
       
//        String[] p0 = s.split("[!,?._'@ ]+");
//       [] v slagame ako sa pove4e ot 1
  String[] p0 = s.split("[!,?._'@ ]+", 5);
        System.out.println(p0.length);
        for (int i = 0; i < p0.length; i++) {
            System.out.println(p0[i]);
        }
        }

        // Write your code here.
        scan.close();
    }

}
