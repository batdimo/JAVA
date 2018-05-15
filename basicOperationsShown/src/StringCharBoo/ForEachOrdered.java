/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringCharBoo;

import java.util.stream.Stream;

/**
 *
 * @author DIMO
 */
public class ForEachOrdered {
    public static void main(String [] args){
        System.out.println("forEach Demo");
Stream.of("CCC","AAA","BBB").forEach(s->System.out.println("Output:"+s));
System.out.println("forEachOrdered Demo");
Stream.of("BBB","AAA","CCC").forEachOrdered(s->System.out.println("Output:"+s));




        System.out.println("Using forEach()");
        String str = "Yashwant Chavan";
        str.chars().forEach(n -> System.out.print((char) n));
 
        System.out.println("\n\nUsing parallel() + forEach()");
        str.chars().parallel().forEach(n -> System.out.print((char) n));
 
        System.out.println("\n\nUsing parallel() + forEachOrdered()");
        str.chars().parallel().forEachOrdered(n -> System.out.print((char) n));
    }
}
