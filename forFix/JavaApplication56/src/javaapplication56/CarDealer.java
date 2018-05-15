/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

/**
 *
 * @author s504
 */
class CarDealer {
    Car cars [] = new Car[555];
    int position = 0;

    public CarDealer() {
    }
    
    void add(Car c){
        cars[position++] = c;
    }
    
    Car[] list() {
        Car a[] = new Car[position];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = cars[i];
        }
        
        return a;
    }
    
    
    Car[] search(String model, String year, 
            double price) {
        
        Car results[] = new Car[555];
        
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            if(car.getName().equals(model)) {
                    results[i] = car;
            }
        }
        
        return results;
    }
    
    
}
