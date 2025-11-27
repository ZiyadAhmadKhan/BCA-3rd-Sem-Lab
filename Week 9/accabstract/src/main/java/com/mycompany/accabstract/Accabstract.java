/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accabstract;

/**
 *
 * @author HP
 */
public class Accabstract {

    public static void main(String[] args) {
        Savings s1 = new Savings(123, "ziyad", "aligarh", 10000, 5000);
        s1.withdraw(2000);
        s1.details();
        
        Current c1 = new Current(123, "ziyad", "aligarh", 10000, 5000);
        c1.withdraw(4000);
        c1.details();
    }
}
