/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrome;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter any number: ");
            int num = scan.nextInt();
            int orignalnum = num;
            int reverse = 0;
            
            while(num!=0){
                int digit = num%10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }
            if (orignalnum == reverse)
                System.out.printf("%d is a Palindrome", orignalnum);
            else
                System.out.printf("%d is not a palindrome", orignalnum);
        }
    }
}
