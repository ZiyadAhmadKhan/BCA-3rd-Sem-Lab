/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversestring;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Reversestring {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a string: ");
            String str = scan.nextLine();
            
            String reverse = new StringBuilder(str).reverse().toString();
            System.out.println("Reverse of the string: " +reverse);
        }
    }
}
