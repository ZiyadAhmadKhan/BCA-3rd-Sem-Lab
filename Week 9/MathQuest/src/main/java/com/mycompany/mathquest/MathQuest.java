/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathquest;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class MathQuest {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter two numbers: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            
            int gcd = MathOperations.findGcd(a, b);
            int lcm = MathOperations.findLcm(a, b);
            
            System.out.println("GCD: " +gcd);
            System.out.println("LCM: " +lcm);
        }
    }
}
