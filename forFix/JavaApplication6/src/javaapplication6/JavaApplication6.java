/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication6;

/**
 *
 * @author s504
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student ivan = new Student();        
        ivan.setName("Ivan");
        
        System.out.println(ivan);
        
        int a[] = new int [5];
        
        Student s[] = new Student[5];
        
        s[0]= new Student("S0", "MI", 22);
        s[1]= new Student("S1", "MI", 20);
        s[2]= new Student("S2", "MI", 23);
        s[3]= new Student("S3", "MI", 30);
        s[4]= new Student("S4", "MI", 22);
        
        for (int i = 0; i < s.length; i++) {
            if(s[i].getAge() < 23) {
                System.out.println(s[i]);
            }
        }
        
    }
    
}
