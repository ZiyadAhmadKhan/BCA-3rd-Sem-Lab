/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplytwonumbers;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Multiplytwonumbers {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();
            double result = num1 * num2;
            
            System.out.printf("Multiplication result of %.2f and %.2f is: %.2f", num1, num2, result);
        }
    }
}
