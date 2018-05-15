/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carselldimo;

/**
 *
 * @author s504
 */
class InvalidYearException extends Exception {

    public InvalidYearException(String impossible_year_WTF) {
        super(impossible_year_WTF);
    }
    
}
