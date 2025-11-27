/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehiclequest;

/**
 *
 * @author HP
 */
public class VehicleQuest {

    public static void main(String[] args) {
        
        Vehicle v;
        
        v = new Bike();
        v.run();
        
        v = new Car();
        v.run();
    }
}
