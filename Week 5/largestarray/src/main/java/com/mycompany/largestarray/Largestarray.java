/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.largestarray;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Largestarray {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int num = scan.nextInt();
            int[] arr = new int[num];
            
            System.out.printf("Enter %d elements: ", num);
            for(int i=0; i<num; i++){
            arr[i] = scan.nextInt();
            }
            int largest = arr[0];
            
            for (int i=1; i<num; i++){
                if (arr[i]>largest)
                    largest = arr[i];
            }
            System.out.printf("Largest: %d", largest);
        }
    }
}
