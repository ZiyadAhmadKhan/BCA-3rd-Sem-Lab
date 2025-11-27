/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeequest;

/**
 *
 * @author HP
 */
public class Employee {
    String empName;
    int empId;
    
    Employee(String empName, int empId){
        this.empName = empName;
        this.empId = empId;
    }
    
    class Salary {
        int basic, hra, pf;
        
        Salary(int basic, int hra, int pf){
            this.basic = basic;
            this.hra = hra;
            this.pf = pf;
        }
        
        void displaySalary(){
            System.out.println("Basic salary Rs. " +basic+ " where House Rent Allowence is Rs. " +hra+ " and Provided Fund Rs. " +pf);
        }
    }
    
    class JoiningDate {
        int day, month, year;
        
        JoiningDate(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        
        void displayJoiningDate(){
            System.out.println("Joined: " +day+ "/" +month+ "/" +year);
        }
    }
    
    void displayEmployee(Salary slr, JoiningDate jd){
        System.out.println("Employee Name: " +empName+ ", Id: " +empId);
        slr.displaySalary();
        jd.displayJoiningDate();
    }
}
