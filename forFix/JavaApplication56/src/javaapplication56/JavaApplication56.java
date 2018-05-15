/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

import bg.univt.java.inheritence.Figure;
import bg.univt.java.inheritence.Rectangle;
import bg.univt.java.inheritence.Triangle;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s504
 */
public class JavaApplication56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       
        DataOutputStream dout = new DataOutputStream(
                new FileOutputStream("data.txt"));
        dout.writeInt(4);
        dout.writeChar('x');
        dout.writeInt(7);
        dout.writeUTF("ABCD");
                
        
        DataInputStream din = new DataInputStream(new FileInputStream("data.txt"));
        System.out.println(din.readInt());
        System.out.println(din.readChar());
        System.out.println(din.readInt());
        System.out.println(din.readUTF());
        
        
//
         try {
        String fileName = "c:\\...";
        String fileNameCopy = "c:\\...COPY";
        FileInputStream fin = new FileInputStream(fileName);
        FileOutputStream fout = new 
                FileOutputStream(fileName);
        
        int i = 0;
        while( (i = fin.read()) != -1) {
            fout.write(i);
        }
         } catch(IOException e) {e.printStackTrace();}
        
//        
//        
        
        
        
        
        

        if(2>1) return;
        
         Integer a[] = {4, 3, 2 ,6 , 7};
         Arrays.sort(a, new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                   return o2.compareTo(o1);
            }
         });
         
         System.out.println(Arrays.toString(a));
        
        
                    
        if(true)    return;
        
        
        
        
//        SimpleDateFormat s = 
//                new SimpleDateFormat(
//                "HH:mm:ss");
//        
//        System.out.println(s.format(new Date()));
//        
//        System.out.println(System.currentTimeMillis());
//        System.out.println(new Date());
//        
        
//        NumberThread n1 = new NumberThread(1);
//        NumberThread n2 = new NumberThread(2);
//        n1.start();
//        n2.start();
//        
//        NumberRun r1 = new NumberRun(1);
//        Thread t1 = new Thread(r1);
//        t1.start();
//        
//        Thread t2 = new Thread(
//                new NumberRun(1));
//        
//        new Thread(
//                new Runnable() {
//
//            @Override
//            public void run() {
//         
//            }
//        }
//                ).start();
//        
        
//        
//        Cilinder c = new Cilinder();
//        c.setH(1);
//        c.setR(1);
//        System.out.println(c.area());

//        System.out.println(System.currentTimeMillis());
//        System.out.println(new Date());
//      
//        PrimeThread p1 = new PrimeThread(1);
//        PrimeThread p2 = new PrimeThread(2);
//        p1.start();
//        p2.start();
//
//        Thread t1 = new Thread(new PrimeRun(1));
//        Thread t2 = new Thread(new PrimeRun(1));
//        t1.start();
//        t2.start();
//
//
//        Thread t3 = new Thread(new Runnable() {
//
//            public void run() {
//               
//            }
//        });







//
//        Figure f[] = new Figure[5];
//
//        f[0] = new Triangle(1, 1);
//        f[1] = new Rectangle(1, 1);
//
//
//        for (int i = 0; i < f.length; i++) {
//            double lice = f[i].lice();
//            String figuraName = "";
//            if (f[i] instanceof Triangle) {
//                figuraName = "Triangle";
//            } else {
//                figuraName = "Rectangle";
//            }
//
//            System.out.println("Liceto na"
//                    + figuraName + "  " + lice);
//        }

    }

    
}
