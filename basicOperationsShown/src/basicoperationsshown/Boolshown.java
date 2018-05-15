/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperationsshown;

/**
 *
 * @author DIMO
 */
public class Boolshown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean isTrue = true;
        System.out.println(isTrue);
        boolean isTrueA = 1 == 2;
        System.out.println(isTrueA);
        // znak ! e obratnoto
        boolean isTrueAB = true;
        System.out.println(!isTrueAB);
        // pobitovo ~ obratniq bit
        int first = ~0b0000;
        System.out.println(~first);
        int firstA = 0b0001;
        int firstB = 0b0101;
        System.out.println(firstA & firstB);
        System.out.println(firstA | firstB);
        System.out.println(firstB ^ firstA);

        // pobitovo izmestvane 7<<2 na 7 (111) dobavq 2 00 i stava 11100
        int firstDD = 0b0001;
        System.out.println(firstDD << 10);
        boolean bigOne = new boolean();
 bigOne = (firstA>firstB)||((3==6) ^^(firstB=8));
        // TODO code application logic here
    }

}
