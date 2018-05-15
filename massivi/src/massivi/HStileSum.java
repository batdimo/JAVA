/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massivi;

import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class HStileSum {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum =0;
        int bigsum=Integer.MIN_VALUE;
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
               
            }
        }
             for(int i=0; i < 4; i++){
               for(int j=0; j < 4; j++){
             sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                             arr[i+1][j+1]+
                   arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
             bigsum = Math.max(bigsum, sum);
            }
            }
             System.out.println(bigsum);
    }
}



//import java.util.Scanner;
//
//public class Solution {
//
//    public static void main(String [] args) {
//        Scanner scan = new Scanner(System.in);
//        int arr[][] = new int[6][6];
//        for (int row = 0; row < 6; row++) {
//            for (int col = 0; col < 6; col++) {
//                arr[row][col] = scan.nextInt();
//            }
//        }
//        scan.close();
//        
//        System.out.println(maxHourglass(arr));
//    }
//    
//    public static int maxHourglass(int [][] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int row = 0; row < 4; row++) {
//            for (int col = 0; col < 4; col++) {
//                int sum = findSum(arr, row, col);
//                max = Math.max(max, sum);
//            }
//        }
//        return max;
//    }
//    
//    private static int findSum(int [][] arr, int r, int c) {
//        int sum = arr[r+0][c+0] + arr[r+0][c+1] + arr[r+0][c+2]
//                                + arr[r+1][c+1] + 
//                  arr[r+2][c+0] + arr[r+2][c+1] + arr[r+2][c+2];
//        return sum;
//    }
//}