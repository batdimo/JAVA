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
public class BasicOperationsShown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ANum = 6;
        int BNum = 7;
        int CNum = 8;
        System.out.println(ANum == BNum);
        System.out.println(ANum != BNum);
        System.out.println(ANum >= BNum);
        System.out.println(ANum != BNum--);
        System.out.println(CNum += 6);
        System.out.println(CNum ^= 6);
        System.out.println(CNum |= 6);
        System.out.println(CNum <<= 6);
        System.out.println(Integer.max(ANum, CNum));
        Integer num = new Integer(5);
        num.byteValue();
        System.out.println(num.byteValue());
        // castvane ot po-golqm tip v pomalyk ima zaguba na danni
        long D = 99999999999999L;
        int c = (int) D;
        System.out.println(c);
        double g = 32.323;
        int f = (int) g;
        System.out.println(f);
        int h = 5;
        //zaguba
        double v = h / 2;
        System.out.println(v);
        double k = h / 2.0;
        System.out.println(k);
        double b = h % 2;
        System.out.println(b);
        // ?: ako e vqrno pyrvoto se izpylnqva ako ne 2roto
        System.out.println((b > v) ? "dali e" : "ïli ne e");

        // TODO code application logic here
    }

}
