/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package outputformat;

/**
 *
 * @author s504
 */
public class OutputFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("‪‪\u250c\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510\n");
        System.out.printf("\u2502%-6s%8s\u2502\n","MPH","KMH");
        System.out.printf("------------------\n");
        for(int i=60;i<=90;i++){
            System.out.printf("| %-6d%8.1f |\n",i,i*1.609);
        }
        System.out.printf("------------------\n");
    }
    
}
