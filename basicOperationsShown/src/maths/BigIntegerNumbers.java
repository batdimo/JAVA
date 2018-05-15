/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class BigIntegerNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        BigInteger mul = a.multiply(b);
        BigInteger sum = a.add(b);
        System.out.println(sum);
        System.out.println(mul);
    }

}
