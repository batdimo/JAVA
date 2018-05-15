/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperationsshown;

import static java.lang.System.out;
import java.math.BigDecimal;

/**
 *
 * @author DIMO
 */
public class BigDecimalShown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float VNum = 1.667f;
       double WNum= 1.333;
        System.out.println(VNum);
        System.out.println(WNum);
        System.out.println(VNum + WNum);
        //show what is differnce
        float bNum = 0.667f;
        double CNum= 0.333;
        System.out.println(bNum);
        System.out.println(CNum);
        System.out.println(bNum + CNum);
     
        
        BigDecimal fNum = BigDecimal.valueOf(0.667);
        BigDecimal DNum = BigDecimal.valueOf(0.333);
        System.out.println(fNum);
        System.out.println(DNum);
       out.print(fNum.add(DNum) );
        int Znum = 5;
        System.out.println(Znum=Znum++);
        System.out.println(Znum);
  int s=46;
  long m =1L*s;
        System.out.println(s%5);
        // TODO code application logic here
    }

}
