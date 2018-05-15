/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import GeometryShown.*;
import contracts.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author DIMO
 */
public class ShapeStartup {

    public static void main(String[] arg) {

        Circle c1 = new Circle(0, 0, 10);
        System.out.println(c1.getArea());
        Rectangle r1 = new Rectangle(0, 0, 5, 3);
        System.out.println(r1.getArea());
        Square S1 = new Square(0,0,5.1);
        System.out.println(S1.getArea());
        SquareEx S2 = new SquareEx(0,0,5);  // ex !!!
        System.out.println(S2.getArea());
        c1.move(10, 9);
        System.out.println(String.format("c (%s , %s)", c1.getX(), c1.getY())) ;
        System.out.println(c1);
        List<Integer> list = new ArrayList<>();
       S2.changeColor();
       //IMesurable instead object
       Object [] shapes =  {new Circle(0, 0, 10),
                                new Rectangle(0, 0, 10, 15),
                                new Square(10, 10, 20),
                                new Circle(0, 0, 20)};
        for (Object shape : shapes) {
            System.out.println(shape.toString());
            //System.out.println("all shapes calculate their area: "+shape.getArea());
            
        }
    }
}
