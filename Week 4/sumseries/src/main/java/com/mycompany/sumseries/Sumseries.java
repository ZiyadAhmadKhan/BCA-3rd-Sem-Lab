/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumseries;

/**
 *
 * @author HP
 */
import java.util.Scanner; 
public class Sumseries {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the value of N (for 1+2+3+... N): ");
            int n = scan.nextInt();
            
            int sum = 0;
            
            for (int i=1; i<=n; i++){
                sum += i;
            }
            System.out.printf("The sum of series: %d", sum);
        }
    }
}
