/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massivi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class Massivi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        int[] Dimo = {1, 2, 3, 4, 5};
        int[] Petq = Dimo;
        int [] Zoro = Dimo.clone();
        Zoro [3]= 100;
        Petq[2]=99;
        System.out.println(Dimo);
        System.out.println(Arrays.toString(Dimo));
        System.out.println(Arrays.toString(Petq));
        System.out.println(Arrays.toString(Zoro));
        Arrays.sort(Zoro);
        System.out.println(Arrays.toString(Zoro));
        
        System.out.println(Dimo.length);
        String[] daysOfWeek = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };
        System.out.println(Arrays.toString(daysOfWeek));
Arrays.stream(Dimo).forEach(Number ->System.out.println(Number));
int [] domino = new int [100];
        for (int i = 99, j=0; i >= 1;j++, i--) {
            
              domino[i]=j;  
           
            
        }
Arrays.stream(domino).filter(i-> i%2!=0).map(i->5*i).forEachOrdered(i -> System.out.println("number : " +i));
Arrays.stream(domino).mapToObj(x->"Number : "+10000*x).forEach(System.out::println);
    }

}
// TODO code application logic here

