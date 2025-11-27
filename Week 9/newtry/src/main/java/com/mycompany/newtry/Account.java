/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.newtry;

/**
 *
 * @author HP
 */
interface Account {
    
    void deposit(double amount) throws NegativeDepositException;
    void withdraw(double amount) throws InsufficientFundsException;
    
    static void aboutBank(){
        System.out.println("=== Account of XYZ bank ===");
    }
    
    default void takeLoan(){
        System.out.println("loan cannot be collected");
    }
}
