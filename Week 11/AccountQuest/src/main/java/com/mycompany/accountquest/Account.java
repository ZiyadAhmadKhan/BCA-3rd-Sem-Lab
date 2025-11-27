/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.accountquest;

/**
 *
 * @author HP
 */
interface Account {
    
    void deposit(double amount);
    void withdraw(double amount);
    
    static void aboutBank(){
        System.out.println("=== Account of Bank XYZ ===");
    }
    
    default void takeLoan(){
        System.out.println("Loan cannot be collected");
    }
}
