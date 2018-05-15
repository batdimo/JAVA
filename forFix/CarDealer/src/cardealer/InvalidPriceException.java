/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cardealer;

/**
 *
 * @author s504
 */
class InvalidPriceException extends Exception {

    public InvalidPriceException() {
    }
    public InvalidPriceException(String message) {
        super(message);
    }
    
}
