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
public class Smallerone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner (System.in);
        System.out.print("enter first num: ");
        int firstNum = scann.nextInt();
        System.out.print("enter second num: ");
        int secondNum = scann.nextInt();
        System.out.print("enter third num: ");
        int thirdNum = scann.nextInt();
        System.out.print("smallest is: ");
        if (firstNum > secondNum){
            System.out.print(secondNum);
        }
        else System.out.println(firstNum);
        System.out.println(Integer.min(firstNum, firstNum));
        System.out.println(Integer.max(thirdNum, secondNum));
        // TODO code application logic here
    }
    
}
