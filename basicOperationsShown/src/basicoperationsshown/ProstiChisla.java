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
public class ProstiChisla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // da q zaciklime
        while (true){    
        System.out.print("Enter faivorit number for check is it prime: ");
        int inputNum = scan.nextInt();
        int currentNum = 2;
        boolean isPrime = true;
        int maxdivider=(int) Math.sqrt(inputNum);
       while (maxdivider >= currentNum) {
            if (inputNum % currentNum == 0) {
                isPrime = false;
                for (String arg : args) {
                    
                }
            }
           
            currentNum++;
        }
        System.out.println(isPrime ? inputNum + "is  prime" : inputNum + "is not prime");
// TODO code application logic here
    }
    }
}
