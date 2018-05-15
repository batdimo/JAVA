/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massivi;

import java.util.Arrays;
import static java.util.Arrays.stream;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class BigerSameNumber { static int birthdayCakeCandles(int n, int[] ar) {
          Arrays.sort(ar);
          int sum = 0;
            for (int i = 0; i < ar.length; i++) {
                if (ar[i]==ar[ar.length-1]){
                    sum++;
                }
            }
//  Arrays.stream(ar).forEach(name->System.out.print(Integer.toString(name)));
       
      return sum;      
 // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
