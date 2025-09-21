/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ctoftemperature;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Ctoftemperature {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scan.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            
            System.out.printf("%.2f°C = %.2f°F", celsius, fahrenheit);
        }
    }
}
