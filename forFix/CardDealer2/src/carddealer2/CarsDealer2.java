/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carddealer2;

/**
 *  
 * @author s504
 */
public class CarsDealer2 {
    Vehicle vehicles[] = new Vehicle[10];
    int position = 0;
    
    void add(Vehicle c) { vehicles[position++]=c;}
    
    void remove() {}
    
    /**
     * 
     * @param price 
     * @param criteria >, <, >=, <=
     */
    Vehicle[] search(int price, String criteria){
        Vehicle results[] = new Vehicle[20];
        int p = 0;
        for (int i = 0; i < position; i++) {
            Vehicle vehicle = vehicles[i];
            if(">".equals(criteria)){
                if(vehicle.getPrice() > price){
                    results[p++] = vehicle;
                }
            } // else if ()....
        }
        return results;
    }
    
    
    
    void print() {
        for (int i = 0; i < position; i++) {
            Vehicle vehicle = vehicles[i];
            System.out.println(vehicle);
        }
    }
    
    void print(Vehicle v[]) {
        
        for (int i = 0; i < v.length; i++) {
            Vehicle vehicle = v[i];
            if(vehicle != null) {
                System.out.println(vehicle);
            }
        }
    }
}
