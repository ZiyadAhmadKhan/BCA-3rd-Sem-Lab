/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.machinequest;

/**
 *
 * @author HP
 */
public interface Scanner {
    void connect();
    
    default void details(){
        System.out.println("Scanner: Scans and stores documents to device for further use");
    }
}
