/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accountquest;

/**
 *
 * @author HP
 */
public class AccountQuest {

    public static void main(String[] args) {
        
        Account.aboutBank();
        
        Savings s = new Savings(5000, 3000);
        Current c = new Current(7500, 500);
        
        System.out.println("Transactions for Savings: ");
        s.deposit(300);
        s.withdraw(2400);
        s.takeLoan();
        System.out.println();
        
        System.out.println("Transactions for Current Account: ");
        c.deposit(1000);
        c.withdraw(600);
        c.takeLoan();
        System.out.println();
    }
}
