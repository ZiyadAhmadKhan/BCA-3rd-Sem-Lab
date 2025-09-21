/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.remainderquotient;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Remainderquotient {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter the dividend: ");
            int a = scan.nextInt();
            System.out.print("Enter the divisor: ");
            int b = scan.nextInt();
            
            double quotient = a / b;
            double remainder = a % b;
            
            System.out.printf("Quotient: %.2f\n", quotient);
            System.out.printf("Remainder: %.2f", remainder);
        }
    }
}
