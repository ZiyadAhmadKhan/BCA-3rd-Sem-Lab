/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.seriesto1byn;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Seriesto1byn {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter the value of n for the series: " );
            int n = scan.nextInt();
            double sum = 0.0;
            
            for (int i=1; i<=n; i++){
                sum += 1.0/i;
            }
            System.out.printf("The sum of the series: %.3f", sum);
        }
    }
}
