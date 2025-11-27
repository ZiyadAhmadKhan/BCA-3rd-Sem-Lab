/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapequest;

/**
 *
 * @author HP
 */
public class Shape {
    
    public void area(int side){
        int area = side*side;
        System.out.println("Area of Square: " +area);
    }
    
    public void area(int length, int breadth){
        int area = length * breadth;
        System.out.println("Area of Rectangle: " +area);
    }
    
    public void area(double radius){
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f", area);
    }
}
