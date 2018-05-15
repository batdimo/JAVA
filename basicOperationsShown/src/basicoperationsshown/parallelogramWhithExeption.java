/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperationsshown;

import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class parallelogramWhithExeption {static int B,H;
	static boolean flag = true;
	static {
    	Scanner sc = new Scanner(System.in);
    	B = sc.nextInt();
	    H = sc.nextInt();
	    if(B<=0 || H<=0){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
		}
}
       
    public static void main(String[] arg) {
        if (flag) {
            
        
        int c = H * B;
            System.out.println(c);
        }
    }
}
