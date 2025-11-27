/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.machinequest;

/**
 *
 * @author HP
 */
public class MultiFunctionMachine implements Printer, Scanner {
    
    @Override
    public void connect(){
        System.out.println("Devices can connect either through cable or wireless connection to devices");
    }
    
    @Override
    public void details(){
        Printer.super.details();
        Scanner.super.details();
    }
}
