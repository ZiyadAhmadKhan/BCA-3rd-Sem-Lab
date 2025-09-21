/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swapusingtemp;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Swapusingtemp {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter the first number: ");
            int a = scan.nextInt();
            
            System.out.print("Enter the second number: ");
            int b = scan.nextInt();
            
            System.out.printf("Before swapping a = %d and b = %d\n", a, b);
            
            int temp = a;
            a = b;
            b = temp;
            
            System.out.printf("After swapping a = %d and b = %d", a, b);
        }
    }
}
