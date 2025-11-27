/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountquest;

/**
 *
 * @author HP
 */
public class Current implements Account {
    
    int balance, maxWithdraw;
    
    Current(int balance, int maxWithdraw){
        this.balance = balance;
        this.maxWithdraw = maxWithdraw;
    }
    
    @Override
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println(amount+ " deposited to Current account, new Balance: " +balance);
        }
        else{
            System.out.println("Invalid input");
        }
    }
    
    @Override
    public void withdraw(double amount){
        if (amount <= balance && amount < maxWithdraw){
            balance -= amount;
            System.out.println(amount+ " withdrawn from Current Account, new Balance: " +balance);
        }
        else{
            System.out.println("Max withdrawal limit exceeded");
        }
    }
    
}
