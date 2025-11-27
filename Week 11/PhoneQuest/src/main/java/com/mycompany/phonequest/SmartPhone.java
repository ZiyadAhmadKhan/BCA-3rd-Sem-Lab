/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phonequest;

/**
 *
 * @author HP
 */
public class SmartPhone implements SmartDevice {
    
    @Override
    public void powerOn(){
        System.out.println("Device turns on");
    }
    
    @Override
    public void connectWiFi(){
        System.out.println("Smart Device connects to WiFi");
    }
}
