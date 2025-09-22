/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divideuntillessthan10;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Divideuntillessthan10 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
             
            System.out.print("Enter number to be divided by 2: ");
            int num = scan.nextInt();
            
            while (num>=10){
                num /= 2;
                System.out.printf("Result: %d\n", num);
            }
        }
    }
}
