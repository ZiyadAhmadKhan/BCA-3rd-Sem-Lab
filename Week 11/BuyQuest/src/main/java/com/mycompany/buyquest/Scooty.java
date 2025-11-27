/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.buyquest;

/**
 *
 * @author HP
 */
interface Scooty {
    void offer();
    
    default void details(){
        System.out.println("Scooty: Easy to handle and good for beginners");
    }    
}
