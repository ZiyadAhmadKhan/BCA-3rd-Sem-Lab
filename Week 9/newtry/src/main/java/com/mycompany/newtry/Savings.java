/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newtry;

/**
 *
 * @author HP
 */
class Savings implements Account {
    double balance, minBalance;
    
    Savings(double balance, double minBalance){
        this.balance = balance;
        this.minBalance = minBalance;
    }
    
    @Override
    public void deposit(double amount) throws NegativeDepositException{
        if(amount<0){
            throw new NegativeDepositException("Deposit denied! invalid amount, Balance: " +balance);
            
        }
        else{
            balance += amount;
            System.out.println(amount+ " deposited, new Balance: " +balance);
        }
    }
    
    @Override
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance || balance - amount < minBalance){
            throw new InsufficientFundsException("Insufficient balance or limit reached, Balance: " +balance);
        }
        else{
            balance -= amount;
            System.out.println(amount+ " withdrawn, new balance: " +balance);
        }
    }
    
    @Override
    public void takeLoan(){
        System.out.println("Loan can be collected at 8% interest");
    }
    
    void display(){
        System.out.println("Balance: " +balance);
    }
}
