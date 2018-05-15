/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author DIMO
 */
public class MainPL {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Player p1 = new Player(13, "back", "Ivan", 33);
        Player p2 = new Player(133, "def", "Zoro", 36);
        Player p3 = new Player(133, "def", "Zoro", 36);
        ArrayList<Player> play = new ArrayList<Player>();
        play.add(p1);
        play.add(p2);
        play.add(p3);
//        for (Player player : play) {
//            System.out.println(player);
//        }
       ObjectOutputStream pl= new ObjectOutputStream( new FileOutputStream("zoro.kkm"));
        for (Player player : play) {
            pl.writeObject(player);
        }
      ObjectInputStream in = new ObjectInputStream( new FileInputStream("zoro.kkm"));
        for (int i = 0; i < 3; i++) {       
        Player pts = (Player)in.readObject();
        System.out.println(pts);
        }
    }
}
