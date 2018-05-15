/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boyana;

import java.util.Scanner;

 class Human{
      public  String FName;
      public String LName;
      
  }
  
  

  class Student extends Human{
      public double Mark;

      
      public Student() {
        }
      
      
      public Student(String FName, String LName,double Mark) {
            this.FName=FName;
            this.LName=LName;
            this.Mark = Mark;
        }

    @Override
    public String toString() {
        return FName + " " + LName; 
    }
      
      
  }

/**
 *
 * @author s504
 */
public class Boyana {

 
  
  
 /*   public static void main(String[] args) {
       
        Student [] arr =new Student [10];
         
        for (int i=0; i<=9; i++)
        {  arr[i]= new Student("Ivan"+i,"Ivanov",2+i*0.5);
        }
        
        
        for (int i=0; i <= 9; i++ )
        {for(int j=i+1; j <=9  ; j++)
            {    if(arr[i].Mark<arr[j].Mark)
		{double k = arr[i].Mark;
		  arr[i].Mark = arr[j].Mark;
		  arr[j].Mark = k; 
		}
            }
        }
         
        for(int i=0; i<=9; i++)
        {System.out.println(arr[i].FName+" "+arr[i].LName+" "+arr[i].Mark);
        }

    
    
    
    
    
    }*/
}
    
    
    
    
