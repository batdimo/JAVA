/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Todo;

/**
 *
 * @author s504
 */
public class MainPL {
    public static void main (String [] args){
        Todo t1 = new Todo("buy milk", " today", Todo.PRIORITY_MAX);
        Todo t2 = new Todo("buy milk", " today", Todo.PRIORITY_MIN);
        Todo t3 = new Todo("sell milk", " today", Todo.PRIORITY_MIN);
        Todoman tm = new Todoman();
        tm.getTodos().add(t1);
        tm.getTodos().add(t2);
        tm.getTodos().add(t3);
        tm.print();
        tm.printMax();
        
        
       // Todo t1 = new Todo("buy milh","today", Integer.MIN_VALUE);
                
    }
}
