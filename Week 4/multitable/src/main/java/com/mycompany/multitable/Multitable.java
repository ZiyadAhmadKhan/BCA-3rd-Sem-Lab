/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multitable;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Multitable {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = scan.nextInt();
            System.out.printf("Multiplication table of %d: \n", num);
            for (int i=1; i<=10; i++) {
                System.out.printf("%d x %d = %d\n", num, i, (num*i));
            }
            
        }
    }
}
