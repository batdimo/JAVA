/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameTry;

import java.awt.Canvas;

/**
 *
 * @author DIMO
 */
public class Game extends Canvas implements Runnable {
    //    private static final long serialVersionUID=-240840600533728354L(drugo);
    public static final int WIDTH = 840, HEIGHT = WIDTH/ 12*9;
    private Thread thread;
    public Game(){
        new Window(WIDTH, HEIGHT, "lETS GO GAME", this);
    }
    public synchronized void start(){    
}
public void run(){
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Game();
       
        // TODO code application logic here
    }
    
}
