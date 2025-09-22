/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leapyear;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Leapyear {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter any year: ");
            int year = scan.nextInt();
            
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
                System.out.printf("%d is a leap year", year);
            else
                System.out.printf("%d is not a leap year", year);
        }
    }
}
