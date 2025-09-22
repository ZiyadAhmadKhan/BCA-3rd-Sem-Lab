/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelornot;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Vowelornot {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter any alphabet: ");
            char alpha = scan.next().charAt(0);
            alpha = Character.toUpperCase(alpha);
            
            if(alpha >= 'A' && alpha <= 'Z')
            {
            if (alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U')
                System.out.printf("%c is a Vowel", alpha);
            else
                System.out.printf("%c is a Consonant", alpha);
            }
            else
                System.out.print("Invalid input\nPlease enter an alphabet");
        }
    }
}
