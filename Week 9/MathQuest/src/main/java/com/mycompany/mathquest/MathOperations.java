/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mathquest;

/**
 *
 * @author HP
 */
public class MathOperations {
    
    public static int findGcd(int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static int findLcm(int a, int b){
        return (a*b) / findGcd(a, b);
    }
}
