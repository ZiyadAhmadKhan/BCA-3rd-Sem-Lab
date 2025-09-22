/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carquestion;

/**
 *
 * @author HP
 */
public class Car {
    private String model;
    private String color;
    private int price;
    
    void setModel(String model){
        this.model = model;
    }
    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        this.price = price;
    }
    
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getPrice(){
        return price;
    }
    //base constructor
    Car(String m, String c, int p){
        this.model = m;
        this.color = c;
        this.price = p;
    }
    
    //default
    Car(){
        this("Unknown", "Unknown", 0);
    }
    
    //one argument
    Car(String m){
        this(m, "Unknown", 0);
    }
    
    //two argument
    Car(String m, String c){
        this(m, c, 0);
    }
    
    public void setDetails(String m, String c, int p){
        setModel(m);
        setColor(c);
        setPrice(p);
    }
    
    void display(){
        System.out.println("Model: " +getModel());
        System.out.println("Color: " +getColor());
        System.out.println("Price ($): " +getPrice());
        System.out.println("------------------------");
    }
    
}
