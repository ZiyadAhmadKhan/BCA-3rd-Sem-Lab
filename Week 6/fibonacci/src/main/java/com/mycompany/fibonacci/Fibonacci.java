/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter number of terms: ");
            int num = scan.nextInt();
            
            int first = 0, second = 1, next;
            
            System.out.println("Fibonacci series upto N terms: ");
            for (int i=1; i<=num; i++){
                System.out.print(first+ " ");
                
                next = first + second;
                first = second;
                second = next;
            }
        }
    }
}
