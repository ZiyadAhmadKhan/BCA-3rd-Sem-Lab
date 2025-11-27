/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeequest;

/**
 *
 * @author HP
 */
public abstract class Employee {
    String name;
    int salary;
    
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    
    public abstract void showDetails();   
}
