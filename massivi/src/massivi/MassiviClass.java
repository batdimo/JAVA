/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massivi;

/**
 *
 * @author DIMO
 */
public class MassiviClass {
     private static void printmatrix(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print( array[i]+ " ") ;
//  !!!    vmesto gornite redove i class System.out.print(Arrays.toString(array)) ;!!!
        }
        }
    public static void main (String [] args){
        
        int [] matrix = new int [33];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i]= matrix.length-1-i;
            
        }
         printmatrix(matrix);
        
    }
}
