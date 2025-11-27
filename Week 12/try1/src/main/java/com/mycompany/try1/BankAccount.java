/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.try1;

/**
 *
 * @author HP
 */
public class BankAccount {
    private double balance;
    
    BankAccount(double balance){
        this.balance = balance;
    }
    
    public void deposit(double amount) throws NegativeDepositException{
        if (amount<0){
            throw new NegativeDepositException("Deposit of negative value not allowed");
        }
        else{
            balance += amount;
            System.out.println(amount+ " deposited");
        }
    }
    
    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount>balance){
            throw new InsufficientFundsException("Withdrawal failed! Not enough balance");
        }
        else{
            balance -= amount;
            System.out.println(amount+ " withdrawn");
        }
    }

    public double getBalance() {
        return balance;
    }


    
}
