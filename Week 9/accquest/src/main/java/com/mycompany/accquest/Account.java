/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accquest;

/**
 *
 * @author HP
 */
public class Account {
    private int id;
    private String accHolder, address;
    private double balance;
    
    Account(int id, String accHolder, String address, double balance){
        this.id = id;
        this.accHolder = accHolder;
        this.address = address;
        this.balance = balance;
    }
    
    void deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println(amount+ " deposited");
            System.out.println("New balance: " +balance);
            System.out.println();
        }
        else {
            System.out.println("Invalid amount");
            System.out.println();
        }
    }
    
    void withdraw(double amount){
        if (amount>0 && amount<balance){
            balance -= amount;
            System.out.println(amount+ " withdrew");
            System.out.println("New balance: " +balance);
            System.out.println();
        }
        else {
            System.out.println("Insufficient balance or Invalid input");
            System.out.println();
        }
    }
    
    public static double calculateSimpleInterest(double principal, double rate, double time){
        return (principal * rate * time) /100.0;
    }
    
    public static double calculateCompoundInterest(double principal, double rate, double time){
        return principal * Math.pow((1 + rate/100.0), time);
    }
    
    void details(){
        System.out.println("ID: " +id);
        System.out.println("Account Holder Name: " +accHolder);
        System.out.println("Address: " +address);
        System.out.println("Balance: " +balance);
        System.out.println("--------------------------------------");
    }
}
