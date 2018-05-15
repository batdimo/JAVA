///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Sorting;
//
//import com.sun.org.apache.bcel.internal.generic.SWAP;
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// *
// * @author DIMO
// */
//public class SorthingShown {
//     static String[] bigSorting(String[] arr) {
//         for (int j = 0; j < arr.length-1; j++) { 
//           for (int i = 1; i < arr.length-1; i++) {
//            if (arr[i-1]. > arr[i].length){
//             String temp = arr[i-1];
//             arr[i-1]=arr[i];
//             arr[i] = temp;
//         }
//         }
//// Complete this function
//    }
//          return arr;
//     }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String[] arr = new String[n];
//        for(int arr_i = 0; arr_i < n; arr_i++){
//            arr[arr_i] = in.next();
//        }
//        String[] result = bigSorting(arr);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
//        }
//        System.out.println("");
//
//
//        in.close();
//    }
//    }
//
