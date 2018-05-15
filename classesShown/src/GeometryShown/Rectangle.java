/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometryShown;
import contracts.IClickable;
/**
 *
 * @author DIMO
 */
public class Rectangle extends Shape implements IClickable {
    
    static int widht;
    static int height;

    public Rectangle(int x, int y, int widht,int height) {
        super(x, y);
        this.setWidht(widht);
        this.setHeight(height);
    }

    public static int getWidht() {
        return widht;
    }

    public static void setWidht(int widht) {
        Rectangle.widht = widht;
    }

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        Rectangle.height = height;
    }

   

    @Override
    public double getArea() {
        return this.getWidht()*this.getHeight();
    }

    @Override
    public String Clickme() {
       return "i was clicked";
    }
    
   
        
}