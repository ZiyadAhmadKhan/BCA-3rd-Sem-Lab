/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factors;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Factors {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter any number: ");
            int num = scan.nextInt();
            System.out.printf("Factors of %d are: \n", num);
            
            for (int i=1; i<num; i++){
                if (num % i == 0)
                    System.out.printf("%d\n", i);
            }
        }
    }
}
