/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cube;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Cube {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter the number: ");
            double num = scan.nextDouble();
            
            double result = num*num*num;
            
            System.out.printf("Cube of %.2f is: %.2f",num, result);
        }
    }
}
