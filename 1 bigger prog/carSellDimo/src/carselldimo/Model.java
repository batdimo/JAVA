/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carselldimo;

/**
 *
 * @author DIMO
 */
public class Model {
     car[] cars = new car[100];
    public int position = 0;
    int updatePosition = -1;

   public void setUpdatePosition(int updatePosition)
   {
       this.updatePosition = updatePosition;
   }
   public int getUpdatePosition()
   {
       return getUpdatePosition();
   }
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    public car[] getCars() {
        return cars;
    }

    public void setCars(car[] cars) {
        this.cars = cars;
    }
    
    public void add(car car) {
        cars[position] = car;
        position++;
    }
    
    
    public car[] searchByName(String nameboy) {
        car[] result = new car [position];
        int resultIndex=0;
            for (int i=0;i<position;i++)
            {
                car currentCar = getCars()[i];
                if (currentCar.getMake().equals(nameboy))
                 {
                    result[resultIndex++]=currentCar;
                 } 
            }
            return result;
    }

    void sort() {
        // TODO make
    }

//    public car[] edit(int editCar) {
//        car currentCar = getCars()[editCar];
//        return currentCar[];
//        // TODO make
//    }
    
}
