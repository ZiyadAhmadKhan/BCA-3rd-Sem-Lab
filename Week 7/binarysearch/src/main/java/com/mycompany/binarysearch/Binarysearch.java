/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarysearch;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Binarysearch {

    public static int binarySearch (int[] arr, int key){
        int low = 0, high = arr.length - 1;
        
        while (low <= high){
            int mid = (low+high)/2;
        
        if (arr[mid] == key) {
            return mid;
        }
        else if (arr[mid]<key) {
        low = mid + 1;
        }
        else {
        high = mid - 1;
        }
        }
        return -1;
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
            
            System.out.print("Enter the element to search: ");
            int key = scan.nextInt();
            
            int result = binarySearch(arr, key);
            
            if (result == -1)
                System.out.print("Element not found in array");
            else
                System.out.printf("Element found in position %d (index %d)", result+1, result);
        }
    }
}
