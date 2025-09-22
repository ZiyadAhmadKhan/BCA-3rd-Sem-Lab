/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anagrams;

/**
 *
 * @author HP
 */
import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter first string: ");
            String str1 = scan.nextLine();
            System.out.println("Enter second string: ");
            String str2 = scan.nextLine();
            
            str1 = str1.replaceAll("\\s+", "").toLowerCase();
            str2 = str2.replaceAll("\\s+", "").toLowerCase();
            
            if (str1.length() != str2.length()){
                System.out.print("Not anagrams");
            }
            else {
                char[] arr1 = str1.toCharArray();
                char[] arr2 = str2.toCharArray();
                
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                
                if (Arrays.equals(arr1, arr2)){
                    System.out.println("Anagrams");
                }
                else
                    System.out.println("Not anagrams");
            }
        }
    }
}
