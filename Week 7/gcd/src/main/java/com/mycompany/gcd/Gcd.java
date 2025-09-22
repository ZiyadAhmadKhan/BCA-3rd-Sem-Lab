/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gcd;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Gcd {
    
    public static int gcdivisor(int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter any 2 numbers: ");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            
            System.out.printf("Greatest common divisor between %d and %d: %d", num1, num2, gcdivisor(num1, num2));
        }
    }
}
