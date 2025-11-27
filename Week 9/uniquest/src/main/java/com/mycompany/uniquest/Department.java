/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uniquest;

/**
 *
 * @author HP
 */
public class Department extends Faculty {
    
    String deptName;
    String chairman;
    
    Department(String uniName, int rank, String facultName, String deptName, String chairman){
        super(uniName, rank, facultName);
        this.deptName = deptName;
        this.chairman = chairman;
    }
    
    void Details(){
        System.out.println("Department Name: " +deptName);
        System.out.println("Chairman: " +chairman);
    }
    
    void Display(){
        super.Details();
        this.Details();
        System.out.println("-------------------------");
    }
    
}
