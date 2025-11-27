/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buyquest;

/**
 *
 * @author HP
 */
public class BuySomething implements Bike, Scooty {
    
    @Override
    public void details(){
        Bike.super.details();
        Scooty.super.details();
    }
    
    @Override
    public void offer(){
        System.out.println("10% discount offer");
    }
}
