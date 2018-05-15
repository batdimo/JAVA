/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package termometer;

import java.util.Scanner;
import javax.naming.spi.DirStateFactory;
import javax.swing.JTable;

/**
 *
 * @author s504
 */
public class Termometer {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
      Scanner reader = new Scanner(System.in);
      //double tempF = reader.nextDouble();
      Termometer thermo = new Termometer();
      String DefaultTemperature = "C";

   

         System.out.print("\nVuvedete gradusi v " + DefaultTemperature + ":");
         thermo.setCelsius(reader.nextDouble());
         reader.nextLine(); 
         System.out.println("Temperatura v C " + thermo.getCelsius());
         System.out.println("Temperatura v F " + thermo.getFahrenheit());

   }

    private double degreesCelsius;


public double getCelsius()
{
return degreesCelsius;
}

public double getFahrenheit()
{
return degreesCelsius * 1.8000 + 32.000;
}

public void setCelsius(double degrees)
{
degreesCelsius = degrees;
}

public void setFahrenheit(double degrees)
{
degreesCelsius = (degrees - 32.0) * 5.0 / 9.0;
}



}

