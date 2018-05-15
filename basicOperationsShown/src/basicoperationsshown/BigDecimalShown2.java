/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperationsshown;

import java.math.BigDecimal;
import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DIMO
 */
public class BigDecimalShown2 {
    
      public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        Arrays.sort(s,0,n, Collections.reverseOrder((a1,a2)->new BigDecimal(a1).compareTo(new BigDecimal(a2))));
          
//        Arrays.sort(s);
        
        
        
       for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }


}