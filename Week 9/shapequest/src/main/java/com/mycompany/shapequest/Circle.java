/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapequest;

/**
 *
 * @author HP
 */
public class Circle extends Shape {
    double radius, area;
    
    @Override
    public void area(){
        area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f", area);
    }
}
