/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import static java.util.stream.IntStream.rangeClosed;

/**
 *
 * @author DIMO
 */
 class MyCalculator implements IAdvancedArithmetic{

    @Override
    public int divisor_sum(int n) {
       
 return rangeClosed(1,n).filter(e -> n % e == 0).sum();
        
          
        
    }
  
}
