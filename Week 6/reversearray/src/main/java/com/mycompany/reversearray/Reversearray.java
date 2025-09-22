/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversearray;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Reversearray {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = scan.nextInt();
            
            int[] arr = new int[n];
            
            System.out.printf("Enter %d elements: ", n);
            for (int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }
            System.out.println("Orignal array:");
            for (int num : arr){
                System.out.print(num+ " ");
            }
            for (int i=0; i<n; i++) {
            if (n>1){
                int temp = arr[i];
                arr[i] = arr[n-1-i];
                arr[n-1-i] = temp;
                if (arr[i] == arr[n-1-i])
                    break;
            }
        }
            System.out.println("\nAfter swapping the first and last elements: ");
            for (int num : arr){
                System.out.print(num+ " ");
            }
        }
    }
}