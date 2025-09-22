/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secondlargestarray;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Secondlargestarray {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter number of elements: ");
            int n = scan.nextInt();
            
            if (n<2) {
                System.out.print("Array must have at least 2 elements.");
                return;
            }
            
            int[] arr = new int[n];
            
            System.out.println("Enter " +n+ " elements: ");
            for (int i=0; i<n; i++){
                arr[i] = scan.nextInt();
            }
            
            int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
            
            for (int num : arr){
                if (num > first){
                    second = first;
                    first = num;
                }
                else if (num > second && num!= first)
                    second = num;
            }
            if (second == Integer.MIN_VALUE)
                System.out.print("No second largest element (all elements may be equal)");
            else
                System.out.print("Second largest: " +second);
        }
    }
}
