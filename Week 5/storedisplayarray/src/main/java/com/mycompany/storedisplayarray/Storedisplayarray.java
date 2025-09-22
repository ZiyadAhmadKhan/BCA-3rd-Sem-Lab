/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.storedisplayarray;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Storedisplayarray {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Enter the number of elements: ");
            int num = scan.nextInt();
            
        int[] arr = new int[num];
        
        for(int i=0; i < num; i++){
            arr[i] = (i+1)*10;
        }
        System.out.print("Array elements are: \n");
        for(int i=0; i < num; i++){
            System.out.printf("%d ", arr[i]);
        }
        }
    }
}
