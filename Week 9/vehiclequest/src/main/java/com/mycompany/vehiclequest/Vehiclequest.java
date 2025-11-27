/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiclequest;

/**
 *
 * @author HP
 */
public class Vehiclequest {

    public static void main(String[] args) {
        Bus b1 = new Bus();
        b1.cost = 1500000;
        b1.cost();
        b1.display();
        
        Train t1 = new Train();
        t1.cost = 250000;
        t1.cost();
        t1.display();        
    }
}
