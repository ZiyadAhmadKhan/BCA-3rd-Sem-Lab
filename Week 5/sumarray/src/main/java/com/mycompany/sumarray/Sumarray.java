/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumarray;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Sumarray {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter number of elements: ");
            int num = scan.nextInt();
            
            int[] arr = new int[num];
            
            System.out.printf("Enter %d elements: ", num);
            for (int i=0; i<num; i++){
                arr[i] = scan.nextInt();
            }
            int sum = 0;
            for (int i=0; i<num; i++){
                sum += arr[i];
            }
            System.out.printf("The sum: %d", sum);
        }
    }
}
