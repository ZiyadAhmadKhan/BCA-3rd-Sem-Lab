/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeequest;

/**
 *
 * @author HP
 */
public class Manager extends Employee {
    String department;
    
    Manager(String name, int salary, String department){
        super(name, salary);
        this.department = department;
    }
    
    @Override
    public void showDetails(){
        System.out.println("Name: " +name);
        System.out.println("Salary: " +salary);
        System.out.println("Department: " +department);
        System.out.println("-----------------------------");
    }
}
