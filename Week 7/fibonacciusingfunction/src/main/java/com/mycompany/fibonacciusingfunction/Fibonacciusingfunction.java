/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacciusingfunction;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Fibonacciusingfunction {
    
    public static void fibonacci(int n){
        int first = 0, second = 1;
        for (int i=1; i<=n; i++){
            System.out.print(first+ " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int n = scan.nextInt();
            
            fibonacci(n);
        }
    }
}
