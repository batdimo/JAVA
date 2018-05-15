/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramCarSell;

/**
 *
 * @author DIMO
 */
public class CarStart {
    public static void main (String [] args){
        new ConnectionCar().setVisible(true);
        
        new CarSell().setVisible(true);
    }
}
