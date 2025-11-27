/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.try1;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Try1 {
 
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            
            System.out.println("Enter the balance: ");
            double bal = scan.nextDouble();
            
            BankAccount b = new BankAccount(bal);
            
            System.out.println("Select whether to Depsoit or Withdraw: ");
            String choice = scan.nextLine().toLowerCase();
            
            switch(choice){
                case "1", "deposit" -> {
                    System.out.println("Enter amount to deposit: ");
                    double amount = scan.nextDouble();
                    try {
                        b.deposit(amount);
                    }
                    catch (NegativeDepositException f) {
                        System.out.println(f.getMessage());
                    }
                }
                
                case "2", "withdraw" -> {
                    System.out.println("Enter amount to withdraw: ");
                    double amount = scan.nextDouble();
                    try{
                        b.withdraw(amount);
                    }
                    catch (InsufficientFundsException e){
                        System.out.println(e.getMessage());
                    }
                }
            }
            System.out.println("Current Balance: " +b.getBalance());
        }
    }   
}
