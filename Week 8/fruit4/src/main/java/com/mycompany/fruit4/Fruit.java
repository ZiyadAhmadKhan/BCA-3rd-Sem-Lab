/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fruit4;

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
        color = c;
        taste = t;
        price = p;
    }
    
    //default constructor
    Fruit(){

    }
    
    //one argument
    Fruit(String c){
        color = c;
    }
    
    //two argument
    Fruit(String c, String t){
        color = c;
        taste = t;
    }
    
    void display(){
        System.out.println("Color: " +color);
        System.out.println("Taste: " +taste);
        System.out.println("Price per Kg: " +price);
        System.out.println("-----------------------");
    }
}
