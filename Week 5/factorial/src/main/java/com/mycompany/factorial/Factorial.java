/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter any number : ");
            int num = scan.nextInt();
            int factorial = 1;
            for(int i=1; i<=num; i++){
                factorial *= i;
            }
            System.out.printf("Factorial: %d", factorial);
        }
    }
}
