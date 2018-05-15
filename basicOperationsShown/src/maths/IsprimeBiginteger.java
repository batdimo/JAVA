/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class IsprimeBiginteger {
      static boolean isPrime(int Number) {
        int Divider = (int) Math.sqrt(Number);
        for (int i = 2; i <= Divider; i++) {
            if (Number % i == 0) {
                return false;
            }
        }
        return true;
    }
      public static void main(String[] args) {
//      Scanner in = new Scanner(System.in);
//      BigInteger n = in.nextBigInteger();
//      in.close();
          for (int i = 2; i < 10; i++) {   
               
          System.out.println();
          }
      // Write your code here.
           
          }
   }
    

