/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

import java.util.ArrayList;

/**
 *
 * @author DIMO
 */
public class Player extends Person {

private int num;
private String pos;

    public Player(int num, String pos, String name, int age) {
        super(name, age);
        this.num = num;
        this.pos = pos;
    }

    public int getNum() {        
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return super.getName() + super.getAge()+ this.getPos()+this.getNum(); 
    }
   
        }  
    
