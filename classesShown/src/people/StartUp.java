/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author DIMO
 */
public class StartUp {
    public static void main(String[] args) {
        People pesho = new People("Pesho",34);
        System.out.println(pesho.getAge()+" "+pesho.getName());
        Student ivo = new Student("Ivo","Vasil Levski");
        System.out.println(ivo.getName()+ " "+ ivo.getSchool());
        System.out.println(ivo.toString());
        
}
    
}


