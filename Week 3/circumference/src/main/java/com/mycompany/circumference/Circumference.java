/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circumference;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Circumference {
    
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter the radius of the circle: ");
            double radius = scan.nextDouble();
            
            double area = 2 * Math.PI * radius;
            
            System.out.printf("The Circumference: %.2f", area);
        }
    }
}
