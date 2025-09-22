/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fruit2;


public class Fruit {
    private String color;
    private String taste;
    private int price;

    
    void setColor(String color){
        this.color = color;
    }
    
    void setTaste(String taste){
        this.taste = taste;
    }
    void setPrice(int price){
        this.price = price;
    }
    
    void display()
    {
        System.out.println("Color: " +color);
        System.out.println("Taste: " +taste);
        System.out.println("Price per kg: " +price);
    }
    
}
