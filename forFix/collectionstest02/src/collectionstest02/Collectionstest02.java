/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstest02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author s504
 */
public class Collectionstest02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       HashMap h = new HashMap();
       h.put("ivan", "ivan");
       h.put("miro", "miro");
       h.put("stefan", "stefan");
        System.out.println(h.get("ivan"));
    }
}
