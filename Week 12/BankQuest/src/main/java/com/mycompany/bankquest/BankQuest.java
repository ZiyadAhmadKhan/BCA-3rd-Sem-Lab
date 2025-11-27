/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankquest;

/**
 *
 * @author HP
 */
public class BankQuest {

    public static void main(String[] args) {
        
        BankAccount b = new BankAccount(7000);
        
        try {
            b.withdraw(6000);
            
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("---------------------");
        }
    }
}
