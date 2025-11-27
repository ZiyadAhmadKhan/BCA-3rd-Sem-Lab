/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newtry;

/**
 *
 * @author HP
 */
class Current implements Account {
    double balance, maxWithdraw;
    
    Current(double balance, double maxWIthdraw){
        this.balance = balance;
        this.maxWithdraw = maxWIthdraw;
    }
    
    @Override
    public void deposit(double amount) throws NegativeDepositException{
        if (amount<0){
            throw new NegativeDepositException("Invalid input, Balance: " +balance);
        }
        else {
            balance += amount;
            System.out.println(amount+ " deposited, new Balance: " +balance);
        }
    }
    
    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount>maxWithdraw || amount > balance){
            throw new InsufficientFundsException("Invalid input or Withdraw limit reached, Balance: " +balance);
        }
        else{
            balance -= amount;
            System.out.println(amount+ " withdrawn, new Balance: " +balance);
        }
    }
    void display(){
        System.out.println("Balance: " +balance);
    }
}
