/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areaofrectangle;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Areaofrectangle {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter the length of the rectangle: ");
            double length = scan.nextDouble();
            System.out.print("Enter its breadth: ");
            double breadth = scan.nextDouble();
            
            double area = length * breadth;
            
            System.out.printf("Area of the rectangle: %.2f", area);
        }
    }
}
