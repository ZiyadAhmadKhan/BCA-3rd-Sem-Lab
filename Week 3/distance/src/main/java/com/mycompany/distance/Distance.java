/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.distance;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Distance {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter the first point: ");
            double x1 = scan.nextDouble();
            double y1 = scan.nextDouble();
            
            System.out.print("Enter the second point: ");
            double x2 = scan.nextDouble();
            double y2 = scan.nextDouble();
            
            double distance = Math.sqrt(((x1 - x2) * (x1- x2)) + ((y1 - y2) * (y1 - y2)));
            System.out.printf("Distance: %.2f", distance);
        }
    }
}
