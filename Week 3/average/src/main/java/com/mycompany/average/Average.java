/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.average;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Average {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();
            
            System.out.print("Enter third number: ");
            double num3 = scan.nextDouble();
            
            double result = (num1 + num2 + num3) / 3;
            
            System.out.printf("The Average: %.2f", result);
        }
    }
}
