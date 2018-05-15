/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Todo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * dimo
 */
public class Todoman implements  Serializable {

    ArrayList<Todo> todos = new ArrayList<Todo>();

    public Todoman() {
    }

    public ArrayList<Todo> getTodos() {
        return todos;
    }

    public void setTodos(ArrayList<Todo> todos) {
        this.todos = todos;
    }

    public void print() {
        for (Todo todo : todos) {
            System.out.println(todo);

        }
    }

    public void printMax() {
        for (Todo todo : todos) {
            if (todo.getPriority() == todo.PRIORITY_MAX) {
                System.out.println(todo);
            }

        }
    }

    public void sortByNameWhat() {
        Collections.sort(todos, new Comparator<Todo>() {

            @Override
            public int compare(Todo o1, Todo o2) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

        });
    }
    ArrayList<Todo> ti = new ArrayList<Todo>();
}
