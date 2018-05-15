/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cardealer;

/**
 *
 * @author s504
 */
public class Model {
    Car cars[] = new Car[100];
    int position = 0;
    int updatePosition = -1;
    
    public void add(Car newCar) {
        cars[position] = newCar;
       position ++;
    }
    
    public void list() {
//        for (int i = 0; i < cars.length; i++) {
//            ...
           
        
    }

    public int getPosition() {
        return position;
    }

    public Car[] getCars() {
        return cars;
    }

    Car[] searchByMake(String make) {
        
            Car [] results = new Car[position];
            int resultIndex = 0;
            for (int i = 0; i < position; i++) {
                if(cars[i].getMake().equals(make)) {
                       results[resultIndex++] = cars[i]; 
                }            
            }
            
            return results;
            
        }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getUpdatePosition() {
        return updatePosition;
    }

    public void setUpdatePosition(int updatePosition) {
        this.updatePosition = updatePosition;
    }
    
    
    
    
    }
    
   
