/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialfunc;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Factorialfunc {
    
    public static long factorial(int n) {
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Enter number: ");
            int num = scan.nextInt();
            
            long calcfact = factorial(num);
            System.out.printf("the factorial: %d", calcfact);
        }
    }
}
