/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.odd1to99;

/**
 *
 * @author HP
 */
public class Odd1to99 {

    public static void main(String[] args) {
        int n = 99;
        
        System.out.println("Odd numbers between the range 1-99: ");
        for (int i=1; i<=n; i++){
            if (i%2 != 0)
                System.out.printf("%d ",i);
        }
    }
}
