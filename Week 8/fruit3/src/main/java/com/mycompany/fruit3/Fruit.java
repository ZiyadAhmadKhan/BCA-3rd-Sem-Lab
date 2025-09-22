/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fruit3;

/**
 *
 * @author HP
 */
public class Fruit {
    String color;
    String taste;
    int price;
    
    Fruit(String c, String t, int p){
        color = c;
        taste = t;
        price = p;
    }
    
    void display(){
        System.out.println("Color: " +color);
        System.out.println("Taste: " +taste);
        System.out.println("Price per Kg: " +price);
        System.out.println("-----------------------");
    }
    
}
