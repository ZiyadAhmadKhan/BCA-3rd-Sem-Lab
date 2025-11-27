/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.machinequest;

/**
 *
 * @author HP
 */
public interface Printer {
    void connect();
    
    default void details(){
        System.out.println("Printer: Prints documents on papers with ink");
    }
}
