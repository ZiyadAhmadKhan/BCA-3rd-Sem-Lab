/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carquestion;

/**
 *
 * @author HP
 */
public class Carquestion {

    public static void main(String[] args) {
        
        Car c1 = new Car();
        c1.setDetails("Audi R8", "White", 250000);
            
        Car c2 = new Car("Tesla Model S");
        c2.setDetails(c2.getModel(), "Red", 150000);
        
        Car c3 = new Car("Lamborghini Urus", "Black");
        c3.setDetails(c3.getModel(), c3.getColor(), 300000);
        
        c1.display();
        c2.display();
        c3.display();
    }
}
