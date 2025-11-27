/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accabstract;

/**
 *
 * @author HP
 */
public abstract class Account {
    int id;
    String accHolder, address;
    
    Account(int id, String accHolder, String address){
        this.id = id;
        this.accHolder = accHolder;
        this.address = address;       
    }
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    
    void display(){
        System.out.println("ID: " +id);
        System.out.println("Account holder name: " +accHolder);
        System.out.println("Address: " +address);
    }   
}
