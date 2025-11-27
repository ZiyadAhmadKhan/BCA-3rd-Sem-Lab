/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accabstract;

/**
 *
 * @author HP
 */
public class Current extends Account {
    double balance;
    double maxWithdraw;
    
    Current(int id, String accHolder, String address, double balance, double maxWithdraw){
        super(id, accHolder, address);
        this.balance = balance;
        this.maxWithdraw = maxWithdraw;
    }
    
    @Override
    public void deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println(amount+ " deposited to current account");
            System.out.println();
        }
        else {
            System.out.println("Invalid input");
            System.out.println();
        }
    }
    
    @Override
    public void withdraw(double amount){
        if (amount <= maxWithdraw && amount < balance){
            balance -= amount;
            System.out.println(amount+ " withdrawn from current account");
            System.out.println();
        }
        else {
            System.out.println("Insufficient funds or amount exeeds withdraw limit");
            System.out.println();
        }
    }
    
    void details(){
        System.out.println("Current Account Details: ");
        super.display();
        System.out.println("Balance: " +balance);
        System.out.println("Max withdraw limit: " +maxWithdraw);
        System.out.println("-----------------------------------");
    }   
}
