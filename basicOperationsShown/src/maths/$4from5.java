/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class $4from5 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long sum=0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            sum+=arr[arr_i];
        }
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.print(sum-min+" ");
        System.out.println(sum-max);
//        Arrays.sort(arr);
//        System.out.println(arr[0] + arr[1] + arr[2] + arr[3] + " " + (arr[1] + arr[2] + arr[3] + arr[4]));


//
//Arrays.sort(arr);
//for(int i = 0; i<n-1;i++){
// min += arr[i];
// max += arr[i+1];
//}
//
//or
//
//	Arrays.sort(arr);
//        
//        for(int j=0;j<n-1;j++)
//           min +=arr[j];
//        
//        for(int i=1;i<n;i++)
//           max +=arr[i];
//        
//        System.out.printf(min+" "+max);

    }  
}
