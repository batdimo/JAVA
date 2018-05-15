/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point3d;



 
/**
 *
 * @author DIMO
 */
public class mainPoint3d {

    public static void main(String[] args) {
        Point3d Dimo = new Point3d(1, 1, 1);
        Point3d zzzz = new Point3d(0, 0, 0);
        System.out.println(Dimo.calcDistance(zzzz));
    }

}
