/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newtry;

/**
 *
 * @author HP
 */
public class Newtry {

    public static void main(String[] args) {
        
        Account.aboutBank();
        
        System.out.println();
        System.out.println("Transactions for Savings Account: ");
        Savings s = new Savings(7500, 5000);
        s.display();
        try {
            s.deposit(2000);
        }
        catch (NegativeDepositException e){
            System.out.println(e.getMessage());
        }
        try {
            s.withdraw(6000);
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        s.takeLoan();
        
        System.out.println();
        System.out.println("Transactions for Current Account");
        Current c = new Current(7500, 3000);
        c.display();
        try {
            c.deposit(-500);
        }
        catch (NegativeDepositException e){
            System.out.println(e.getMessage());
        }
        try {
            c.withdraw(2500);
        }
        catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}
