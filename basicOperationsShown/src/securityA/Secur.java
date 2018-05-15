/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securityA;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;

/**
 *
 * @author DIMO
 */
public class Secur {
   
    public static void main(String args[]) throws Exception{
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        MessageDigest m=MessageDigest.getInstance("MD5");
        m.update(A.getBytes(),0,A.length());
        System.out.println("MD5: "+new BigInteger(1,m.digest()).toString(16));
    }
}