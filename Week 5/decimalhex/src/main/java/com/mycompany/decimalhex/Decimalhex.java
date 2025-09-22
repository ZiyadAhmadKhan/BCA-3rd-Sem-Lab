/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decimalhex;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Decimalhex {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("1. Decimal to hexadecimal\n");
            System.out.println("2. Hexadecimal to decimal");
            System.out.print("Choose 1 or 2: ");
            String choice = scan.next().toLowerCase();
            
            switch (choice) {
                case "1", "d" -> {
                    System.out.print("Enter any decimal number: ");
                    int decimal = scan.nextInt();
                    String hex = Integer.toHexString(decimal).toUpperCase();
                    System.out.printf("Hexadecimal value of %d: %s", decimal, hex);
                }
                case "2", "h" -> {
                    System.out.print("Enter any hexadecimal number: ");
                    String hex = scan.next();
                    int decimal = Integer.parseInt(hex, 16);
                    System.out.printf("Decimal value of %s: %d", hex, decimal);
                }
                default ->
                    System.out.print("Invalid input");
            }
        }
    }
}
