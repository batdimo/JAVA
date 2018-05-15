/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Sample Input
//
//5
//1 -2 4 -5 1
//
//Sample Output
//
//9
//
//Explanation
//
//There are nine negative subarrays of :
package massivi;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class CountNegativeCombinations {

    public static void main(String[] Args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
      
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 1; j <= n; j++) {
                int sum_b1 = 0;
                if (j > i) {
                    int[] b1 = Arrays.copyOfRange(arr, i, j);
                    for (int k = 0; k < b1.length; k++) {
                        sum_b1 += b1[k];
                    }
                    if (sum_b1 < 0) {
                        sum++;
                    }
                }            
            }
        }
        System.out.println(sum);

    }

}
