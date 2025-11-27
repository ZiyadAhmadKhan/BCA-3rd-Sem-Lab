/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uniquest;

/**
 *
 * @author HP
 */
public class Faculty extends University {
    String facultName;
    
    Faculty(String uniName, int rank, String facultName){
        super(uniName, rank);
        this.facultName = facultName;
    }
    
    void Details(){
        System.out.println("University: " +uniName);
        System.out.println("Name: " +facultName);
    }   
}
