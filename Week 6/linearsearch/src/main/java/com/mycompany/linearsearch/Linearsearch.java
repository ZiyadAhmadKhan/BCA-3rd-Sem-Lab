/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linearsearch;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Linearsearch {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = scan.nextInt();
            
            int[] arr = new int[n];
            
            System.out.printf("Enter %d elements: ", n);
            for (int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }
            System.out.print("Enter the element to search: ");
            int key = scan.nextInt();
            
            int position = -1;
            for (int i=0; i<n; i++){
                if (arr[i] == key){
                    position = i;
                    break;
                }
            }
            
            if (position == -1)
                System.out.print("Element not found in array");
            else
                System.out.printf("Element found at position %d (index %d)", (position+1), position);
        }
    }
}
