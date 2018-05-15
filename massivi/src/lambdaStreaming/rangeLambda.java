/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaStreaming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author DIMO
 */
public class rangeLambda {

    static int[] getRange(int From, int To) {
        int[] range = new int[To - From];
        for (int offset = 0; offset < range.length; offset++) {
            range[offset] = From + offset;
        }
        return range;
    }

    static boolean isPrime(int Number) {
        int Divider = (int) Math.sqrt(Number);
        for (int i = 2; i <= Divider; i++) {
            if (Number % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void printNumber (int number){
        System.out.println(number);
    }

    public static void main(String[] args) {
         
        int[] A = getRange(10000, 100000);
        for (int a : A) {
            System.out.println(a);
        }
        int sum = Arrays.stream(A).sum();
//        int sum= Arrays.stream(A).max().getAsInt();
   System.out.println(sum);
   ArrayList<Integer> Prime = new ArrayList<>();
// Arrays.stream(A).filter(rangeLambda::isPrime).forEach(Number->System.out.println(Number));
Arrays.stream(A).filter(rangeLambda::isPrime).forEach(number -> Prime.add(number));
        System.out.print(Prime); 
 }
  

       
}
