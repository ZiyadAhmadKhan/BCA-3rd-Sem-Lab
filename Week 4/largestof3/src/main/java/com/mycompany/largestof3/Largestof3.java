/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.largestof3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Largestof3 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter any 3 numbers: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            
            if (a>b && a>c)
                System.out.printf("%d is the largest", a);
            else if (b>a && b>c)
                    System.out.printf("%d is the largest", b);
            else
                System.out.printf("%d is the largest", c);
        }
    }
}
