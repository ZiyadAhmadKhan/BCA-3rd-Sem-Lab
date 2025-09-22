/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fruit5;

/**
 *
 * @author HP
 */
public class Fruit {
    
    String color;
    String taste;
    int price;
    
    
    //previous constructor
    Fruit(String c, String t, int p){
        this.color = c;
        this.taste = t;
        this.price = p;
    }
    
    //default constructor
    Fruit(){
        this("Unknown", "Unknown", 0);
    }
    
    //one argument
    Fruit(String c){
        this(c,"Unknown" , 0);
    }
    
    //two argument
    Fruit(String c, String t){
        this(c, t, 0);
    }
    
    void display(){
        System.out.println("Color: " +color);
        System.out.println("Taste: " +taste);
        System.out.println("Price per Kg: " +price);
        System.out.println("-----------------------");
    }
}
