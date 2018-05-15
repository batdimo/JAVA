/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperationsshown;

import java.io.*;
import java.util.*;

/**
 *
 * @author DIMO
 */
public class Umnojenie {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i >= 21) {
            System.out.println("not in range");
        } else if (i <= 1) {
            System.out.println("not in range");
        } else {
            for (int a = 1; a <= 10; a++) {
                int c = a * i;
                System.out.printf("%-1s x %-1s = %-1s", a, i, c);
                System.out.println();
            }
        }
    }
}
