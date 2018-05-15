/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massivi;

import java.lang.reflect.Array;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class Massivi3Dvumeren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrixPrint();
    }
    private static void matrixPrint() {
        Scanner scan = new Scanner(System.in);
        int[][] Dimo = new int[3][4];
        for (int row = 0; row < Dimo.length; row++) {
            for (int col = 0; col < Dimo[row].length; col++) {
                System.out.println(MessageFormat.format("enter element[{o}],[{1}]:", row, col));
                Dimo[row][col] = scan.nextInt();
                System.out.println(Arrays.toString(Dimo));
            }
        }
        //syshtat logika za 3 meren row,col dylbochina
    }

}
