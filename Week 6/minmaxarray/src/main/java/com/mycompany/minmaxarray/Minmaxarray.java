/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minmaxarray;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Minmaxarray {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = scan.nextInt();
            
            int[] arr = new int[n];
            
            System.out.printf("Enter %d elements: ", n);
            for (int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }
            
            int max = arr[0];
            int min = arr[0];
            
            for (int i=0; i<n; i++){
                if (arr[i] > max){
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.printf("Maximum element: %d\n", max);
            System.out.printf("Minimum element: %d", min);
        }
    }
}
