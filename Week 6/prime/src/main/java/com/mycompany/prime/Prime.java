/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prime;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Prime {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter any number: ");
            int num = scan.nextInt();
            
            if (num%2==0)
                System.out.print(num+" is prime");
            else
                System.out.print(num+ " is not prime");
        }
    }
}
