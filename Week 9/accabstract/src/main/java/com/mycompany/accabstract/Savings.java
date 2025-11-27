/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accabstract;

/**
 *
 * @author HP
 */
public class Savings extends Account {
    double balance;
    double minBalance;
    
    Savings(int id, String accHolder, String address, double balance, double minBalance){
        super(id, accHolder, address);
        this.balance = balance;
        this.minBalance = minBalance;
    }
    
    @Override
    public void deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println(amount+ " deposited from Savings account");
            System.out.println();
        }
        else {
            System.out.println("Invalid amount");
            System.out.println();
        }
    }
    
    @Override
    public void withdraw(double amount){
        if (balance - amount > minBalance){
            balance -= amount;
            System.out.println("Withdrawn " +amount+ " from Savings account");
            System.out.println();
        }
        else {
            System.out.println("Insufficient Balance or Min balance requirement not met");
            System.out.println();
        }
    }
    
    void details(){
        System.out.println("Savings Account Details");
        super.display();
        System.out.println("Balance: " +balance);
        System.out.println("Min Balance " +minBalance);
        System.out.println("-------------------------------------");
    }
}
