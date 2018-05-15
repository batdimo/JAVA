/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massivi;

import java.util.Arrays;
import static java.util.Arrays.stream;

/**
 *
 * @author DIMO
 */
public class MinEleDvumeren {

    public static void main(String[] args) {
        int[][] Arr = {
            {1, 4, 5, 3, 2, 77},
            {34, 5, 6, -6},
            {-44, -5, 4444, 5} };
        int min = Arr [0][0];
        int max = Arr [0][0];
        for (int[] is : Arr) {
            for (int i : is) {
                min= Math.min(i, min);
                max=Math.max(i, max);
                
                
            }
        }
        System.out.println(min);
        System.out.println(max);
//       Arrays.sort(Arr);
//       Arrays.stream(Arr).forEach(Number ->System.out.println(Number));

    }
}
