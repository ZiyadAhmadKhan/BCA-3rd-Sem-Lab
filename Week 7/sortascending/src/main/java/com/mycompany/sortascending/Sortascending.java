/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortascending;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Sortascending {
    
    public static void bubbleAscending (int[] arr){
        int n = arr.length;
        
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++){ 
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = scan.nextInt();
            
            int[] arr = new int[n];
            
            System.out.printf("Enter %d elements: ", n);
            for (int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }
            System.out.println("Before sorting: ");
            for (int num : arr){
                System.out.print(num+ " ");
            }
            bubbleAscending(arr);
            
            System.out.println("\nAfter sorting: ");
            for (int num : arr){
                System.out.print(num+ " ");
            }
        }
    }
}
