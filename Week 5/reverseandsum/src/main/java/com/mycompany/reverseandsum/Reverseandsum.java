/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reverseandsum;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Reverseandsum {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
        
            System.out.print("Enter any number: ");
            int num = scan.nextInt();
            
            int sum=0, reverse=0;
            
            while(num!=0){
                int digit = num % 10;
                sum += digit;
                reverse = reverse * 10 + digit;
                num /= 10;
            }
            System.out.printf("Sum: %d\n", sum);
            System.out.printf("Reverse: %d\n", reverse);
            }
    }
}
