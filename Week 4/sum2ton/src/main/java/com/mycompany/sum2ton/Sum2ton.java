/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sum2ton;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Sum2ton {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the value of N for the series: ");
            int n = scan.nextInt();
            
            int sum = 0;
            for (int i = 2; i <= n; i += 2){
                sum += i;
            }
            System.out.printf("The sum of the even series upto %d: %d", n, sum);
        }
    }
}
