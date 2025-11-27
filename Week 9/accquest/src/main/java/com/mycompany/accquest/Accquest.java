/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accquest;

/**
 *
 * @author HP
 */
public class Accquest {

    public static void main(String[] args) {
        Account a1 = new Account (123, "Ziyad", "Dodhpur, Aligarh", 1000);
        a1.deposit(2000);
        a1.withdraw(1500);
        double ci = Account.calculateCompoundInterest(10000, 5, 2);
        double si = Account.calculateSimpleInterest(10000, 5, 2);
        System.out.println("Compound Interest: " +ci);
        System.out.println("Simple Interest: " +si);
        a1.details();
    }
}
