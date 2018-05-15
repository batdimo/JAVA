package com.company;

import javax.xml.soap.SOAPPart;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("Ivan");
//        name.add("Ivan");
//        name.add("Ivan");
        name.add("Ivan1");
        for (String names :name
             ) {
            System.out.println(name);
            System.out.println(5);

        }

        Map<String,Integer> nameAge = new HashMap<>();
        nameAge.put("Inter",24);
        nameAge.put("Inter3",224);
        nameAge.put("Inte",2);
        System.out.println(nameAge);

    }
}
