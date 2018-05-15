/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringshown;

import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class test {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int spaceCnt =0;
        for (int i = 0; i < n; i++) {
            spaceCnt = n - (i + 1);
            
            System.out.print(new String(new char[spaceCnt]).replace("\0", " ") + new String(new char[n - spaceCnt]).replace("\0", "#") + "\n");
        }
         }
}
