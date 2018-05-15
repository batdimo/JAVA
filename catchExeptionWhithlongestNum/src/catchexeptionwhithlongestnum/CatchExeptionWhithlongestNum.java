/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catchexeptionwhithlongestnum;

import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class CatchExeptionWhithlongestNum {

    /**
     * @param args the command line arguments
     */
     static String whoCanFitTheNumber(String numString)
    {
        String answer = "";
        try{
            long num = Long.parseLong(numString);
            answer = numString + " can be fitted in:\n";
            if((num<=Byte.MAX_VALUE) && (num>=Byte.MIN_VALUE)){
                answer = answer.concat("* byte\n* short\n* int\n* long");
            }else if((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
                answer = answer.concat("* short\n* int\n* long");
            }else if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
                    answer = answer.concat("* int\n* long");
            }else{
                    answer = answer.concat("* long");
            }
        }catch (NumberFormatException e){
            answer = numString+" can't be fitted anywhere.";
        }
        return answer;
}
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        int numTestCases = scan.nextInt() ;
        scan.nextLine();
        for(int i=0; i<numTestCases;i++){
            String numString = scan.nextLine();
            System.out.println(whoCanFitTheNumber(numString));
}
        // TODO code application logic here
    }
    
}
