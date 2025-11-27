/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeequest;

/**
 *
 * @author HP
 */
public class EmployeeQuest {

    public static void main(String[] args) {
        
        Employee e1 = new Employee("Ziyad", 123);
        Employee.Salary slr = e1.new Salary(50000, 10000, 2000);
        Employee.JoiningDate jd = e1.new JoiningDate(3,5,2025);
        
        e1.displayEmployee(slr, jd);
        
    }
}
