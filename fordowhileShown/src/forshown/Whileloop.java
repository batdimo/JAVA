/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forshown;

import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class Whileloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int endNum=10;
        int beginNum=0;
        while(endNum>beginNum){
            System.out.println(beginNum++);
        }
        //refactor rename all in the project
        Scanner scan= new Scanner(System.in);  
        System.out.print("Enter beginng of sum: " );
        int beginNumA = scan.nextInt();
         System.out.print("Enter end of sum: " );
        int endNumB = scan.nextInt();
        int sum =0;
        while(endNumB>=beginNumA){
             sum += beginNumA;
            beginNumA++;
        }
        System.out.println(sum);
        // TODO code application logic here
    }
  
                   
}
