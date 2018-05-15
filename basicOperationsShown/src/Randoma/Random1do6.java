/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Randoma;

import java.util.Random;

/**
 *
 * @author DIMO
 */
public class Random1do6 {
    public static void main(String args []){
        Random ran = new Random();
        int num = ran.nextInt(6);
        int [] zod = {1,2,3,4,5,6};
        System.out.println(zod[num]);
        
    }
}
