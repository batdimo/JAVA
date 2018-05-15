/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringCharBoo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author DIMO
 */
public class StringMap {

    public static void main(String[] args) {
        String[] str = {"yrhfsf", "ijdfvj", "jkdjhf"};
        Integer[] num = {0, 1, 2};
        Arrays.stream(str).map(name -> "molq " + name).forEach(i -> System.out.println(i));
        Arrays.stream(num).map(name -> str[name]).forEach(i -> System.out.println(i));
//        Arrays.stream(num).map(name -> switch (name) {
//            case 0:
//                return 3;
//            case 1:
//                return 4;
//            case 2:
//                return 6;
//            default:
//                throw new AssertionError();
//        }
//        ).forEach(i -> System.out.println(i));
        //nemoje str to int
        //zatova list i zadyljitelno Integer masiva a ne int!!
        List<String> strFornum = Arrays.stream(num).map(name -> str[name]).collect(Collectors.toList());
        System.out.println(strFornum);
    }

}
