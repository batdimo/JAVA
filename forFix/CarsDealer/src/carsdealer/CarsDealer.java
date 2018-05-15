/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carsdealer;


public class CarsDealer {
    
    private Vehicle vehicles[];
    int position=0;

    public CarsDealer() {
        vehicles = new Vehicle[100];
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
  
    void add(Vehicle c) {
        vehicles [position++]=c;        
    }
    
      
    void remove() {}
    
    /**
     * @param price Tova e cenata
     * @param criteria ">", "<", ">="
     */
    Vehicle[] search(int price, String criteria) {
        Vehicle result[] = new Vehicle[200]; 
        int p = 0;
        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            if(vehicle!= null) {
                // < price
                if(criteria.equals(">") 
                        && vehicle.getPrice() > price) {
                    // dobavqme tek kola kym resultata ...
                    result[p++] = vehicle;
                }
            }
        }
        return result;
    }
    
    void search(String mark) {
    }
    
    void print() {
        for (int i = 0; i < position; i++) {
            Vehicle vehichle = vehicles[i];
            System.out.println(vehichle);
        }
    }
    
    void print(Vehicle r[]) {
        for (int i = 0; i < r.length; i++) {
            Vehicle vehichle = r[i];
            if(vehichle!=null)
                System.out.println(vehichle);
        }
    }
}
