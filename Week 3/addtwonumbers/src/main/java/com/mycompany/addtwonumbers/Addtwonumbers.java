/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addtwonumbers;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Addtwonumbers {

    public static void main(String[] args) {
                try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter first number: ");
            double num1 = scan.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scan.nextDouble();
            
            double result = num1 + num2;
            
            System.out.printf("Sum of %.2f and %.2f is: %.2f", num1, num2, result);
        }
    }
}
