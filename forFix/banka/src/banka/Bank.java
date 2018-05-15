/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banka;

/**
 *
 * @author s504
 */
public class Bank {

    private User users[];
    int i = 0;

    public Bank() {
        users = new User[1000];
    }

    void addUser(User u) {
        users[i] = u;
        i = i + 1;
    }
    
    double totalAmouth() {
        double total=0;
        for(int g=0; g<i; g++ ) {
            total=total + users [g].getAmouth();    
                                              }
        return total;
    }
    
}
