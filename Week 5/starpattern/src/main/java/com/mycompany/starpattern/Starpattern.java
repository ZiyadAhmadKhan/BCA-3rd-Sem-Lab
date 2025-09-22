/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.starpattern;

/**
 *
 * @author HP
 */
public class Starpattern {

    public static void main(String[] args) {
        int rows = 3;
        
        for (int i=1; i<=rows; i++){
            for (int j=i; j<rows; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i=rows-1; i>=1; i--){
            for (int j=i; j<rows; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
