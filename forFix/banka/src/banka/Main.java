/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author s504
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArrayList<String>  a = new ArrayList<String> ();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");
        a.add("g");
        
        Integer i [] = {new Integer (1),
            new Integer (-2), 
            new Integer (3)};
        
        Arrays.sort(i, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 == o2) return 0;
                if(o1 < o2) return -1;
                else return 1;
            }
        });
        
        for (int j = 0; j < i.length; j++) {
            int k = i[j];
            System.out.println(k);
        }
        
        
//        Collections c = new Collections();
//        
//        Iterator<String> it = a.iterator(); 
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
        
        
        
//        HashSet s = new HashSet();
////      TreeSet t = new TreeSet();
//        
//        System.out.println(s.add("a"));
//        System.out.println(s.add("a"));
//        System.out.println(s.add("a"));
        
     
//        HashMap m = new HashMap();
        
//        m.put( new Integer(55), "value1sdfasd'");
//        m.put("12", "9999549345'");
//        System.out.println(m.get("key"));
//        System.out.println(m.get("12"));
//        System.out.println(m.get("1"));
        
        
        
        
        
        if(true) return;
        
        User user1=new User("Ivan",190.18);
        User user2=new User("Plamen",52.30);
        User user3=new User("Mihail",300.10);
        
        Bank b= new Bank();
        
        b.addUser(user1);
        b.addUser(user2);
        b.addUser(user3);
        
        System.out.println(b.totalAmouth());
        
    }
}
