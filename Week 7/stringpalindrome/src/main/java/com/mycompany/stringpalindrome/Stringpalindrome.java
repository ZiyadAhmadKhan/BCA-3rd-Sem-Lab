/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringpalindrome;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Stringpalindrome {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = scan.nextLine();
            
            String reverse = "";
            for (int i=str.length()-1; i>=0; i--){
                reverse += str.charAt(i);
            }
            if (str.equals(reverse)){
                System.out.print(str+ " is a palindrome\n");
            }
            else
                System.out.print(str+ " is not a palindrome");
        }
    }
}
