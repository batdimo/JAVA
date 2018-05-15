/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author DIMO
 */
public class PatternSyntaxChecker {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());
        for (int i = 0; i < testCases; i++) {
            try {
                String pattern = in.nextLine();
                Pattern.compile(pattern);
//                System.out.println(Pattern.compile(pattern));
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
                //Write your code
            }

        }
    }

}
