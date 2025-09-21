/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.extra1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Extra1 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.println("Choose which unit to convert from:");
            System.out.println("1. Celsius (C or c)");
            System.out.println("2. Fahrenheit (F or f)");
            System.out.print("Choose (1/C or 2/F): ");
            String choice = scan.next().toLowerCase();
            
            switch (choice) {
                case "1", "c" -> {
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scan.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.printf("%.2f°C = %.2f°F", celsius, fahrenheit);
                }
                
                case "2", "f" -> {
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = scan.nextDouble();
                    double celsius = (fahrenheit - 32) * 5/9;
                    System.out.printf("%.2f°C = %.2f°F", fahrenheit, celsius);
                }
                default -> System.out.println("Invalid input. Please enter either 1, 2, C or F");
            }
        }
    }
}
