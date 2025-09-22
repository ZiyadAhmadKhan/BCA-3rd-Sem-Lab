/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.smallestoutof4;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Smallestoutof4 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {            
            System.out.print("Enter any 4 numbers: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            
            int smallest = a;
            
            if (b < smallest)
                smallest = b;
            if (c < smallest)
                smallest = c;
            if (d < smallest)
                smallest = d;            
            System.out.printf("The smallest number: %d", smallest);
        }
    }
}
