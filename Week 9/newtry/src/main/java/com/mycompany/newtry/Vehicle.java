/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newtry;

/**
 *
 * @author HP
 */
public class Vehicle {
    void run(){
        System.out.println("Vehicles running at top speed");
    }
}
    
    class Bike extends Vehicle{
        
        @Override
        void run(){
            System.out.println("Bikes run on land");
        }  
    }
    class Car extends Vehicle{
        
        @Override
        void run(){
            System.out.println("Cars run on land");
        }
    }
    

