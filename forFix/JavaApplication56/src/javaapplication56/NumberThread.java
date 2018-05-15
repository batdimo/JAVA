/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

/**
 *
 * @author s504
 */
public class NumberThread  extends Thread {
    private int number;

    public NumberThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println(number);
            try{
                Thread.sleep(500);
            }catch(Exception e){
            }
        }
    }
    
   
}
