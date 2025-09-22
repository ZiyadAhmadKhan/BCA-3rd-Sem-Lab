/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oddoreven;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Oddoreven {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter any number: ");
            int a = scan.nextInt();
            
            if (a%2 == 0)
                System.out.printf( a+ " is an even number");
            
            else
                System.out.printf( a+ " is an odd number");
        }
    }
}
