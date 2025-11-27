/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shapequest;

/**
 *
 * @author HP
 */
public class Rectangle extends Shape {
    int length, width, area;
       
    @Override
    public void area(){
        area = length * width;
        System.out.println("Area of rectangle: " +area);
    }
}
