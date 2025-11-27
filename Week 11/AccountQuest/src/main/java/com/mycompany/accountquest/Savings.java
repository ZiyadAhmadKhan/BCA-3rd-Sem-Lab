/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountquest;

/**
 *
 * @author HP
 */
public class Savings implements Account {
    
    int balance, minBalance;
    
    Savings(int balance, int minBalance){
        this.balance = balance;
        this.minBalance = minBalance;
    }
       
    @Override
    public void deposit(double amount){
        if (amount>0 && amount<=balance){
            balance += amount;
            System.out.println(amount+ " deposited into Savings, New Balance: " +balance);
        }
        else{
            System.out.println("Invalid input");
        }
    }
    
    @Override
    public void withdraw(double amount){
        if (amount<balance && balance - amount > minBalance){
            balance -= amount;
            System.out.println(amount+ " withdrawn from Savings, New Balance: " +balance);
        }
        else {
            System.out.println("Balance limit exceeded");
        }
    }
    
    @Override
    public void takeLoan(){
        System.out.println("Loan can be collected at 8% interest");
    }
    
}
