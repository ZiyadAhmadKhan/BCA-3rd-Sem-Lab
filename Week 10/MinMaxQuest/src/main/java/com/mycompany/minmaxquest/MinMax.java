/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minmaxquest;

/**
 *
 * @author HP
 */
public class MinMax {
    
    //integers
    public void minMaxAdd(int num1, int num2){
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        int sum = num1 + num2;
        System.out.println("Max: " +max+ ", Min: " +min+ ", Sum: " +sum);
        System.out.println();
    }
    
    //floating numbers
    public void minMaxAdd(double num1, double num2){
        double max = Math.max(num1, num2);
        double min = Math.min(num1, num2);
        double sum = num1 + num2;
        System.out.println("Max: " +max+ ", Min: " +min+ ", Sum: " +sum);
        System.out.println();
    }
    
    //characters
    public void minMaxAdd(char a, char b){
        char max = (a > b) ? a : b;
        char min = (a < b) ? a : b;
        int sum = a + b;
        System.out.println("Max: " +max+ ", Min: " +min+ ", Sum (ASCII): " +sum);
        System.out.println();
    }
}
