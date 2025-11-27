/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.buyquest;

/**
 *
 * @author HP
 */
interface Bike {
    void offer();
    
    default void details(){
        System.out.println("Bike: Good mileage and stylish design");
    }
}
