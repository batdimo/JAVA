/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Output Format
//In each line, output the number located in position of line. If there is no such position, just print "ERROR!"
//
//Sample Input
//
//5
//5 41 77 74 22 44
//1 12
//4 37 34 36 52
//0
//3 20 22 33
//5
//1 3
//3 4
//3 1
//4 3
//5 5
//
//Sample Output
//
//74
//52
//37
//ERROR!
//ERROR!
//
//Explanation
//
//The diagram below explains the queries:
package massivi;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class massiviJavaArraylist {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        ArrayList[] [] arr = new ArrayList [n][n];
//        for (int i = 0; i < n; i++) {
//            int m = scan.nextInt();
//            arr[i][0]= new ArrayList();
//            for (int j = 0; j < m; j++) {
//                arr[i][j].add(scan.nextInt()); 
//
//            }
//        }
//        int b;
//        int c;
//        int d = scan.nextInt();
//        for (int j = 0; j < d; j++) {
//
//            b = scan.nextInt();
//            c = scan.nextInt();
//            
//            try{ 
//                System.out.println(arr[b - 1][c - 1]);
//            } catch (Exception e) {
//                System.out.println("ERROR!");
//            }   
//        }
//    }
//}




Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int d,q,x,y;
    ArrayList[] set = new ArrayList[n];
    for(int i=0;i<n;i++){
        d = in.nextInt();
        set[i] = new ArrayList();
        for(int j=0;j<d;j++){  
            set[i].add(in.nextInt());                
        }
    }
    q=in.nextInt();
    for(int i=0;i<q;i++){
        x=in.nextInt();
    Object h = 98;
        assert h != null : "d is null";
        y=in.nextInt();
        try{
            System.out.println(set[x-1].get(y-1));
        } catch(Exception e){
            System.out.println("ERROR!");
        }
    }
    }
}