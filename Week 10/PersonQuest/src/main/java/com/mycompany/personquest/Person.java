/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personquest;

/**
 *
 * @author HP
 */
public class Person {
    String name;
    String phone;
    
    Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    
    class Address {
        String houseNo, street, city, state;
        
        Address(String houseNo, String street, String city, String state){
            this.houseNo = houseNo;
            this.street = street;
            this.city = city;
            this.state = state;
        }
        void displayAddr(){
            System.out.print("Address: ");
            System.out.printf("%s, %s, %s, %s", houseNo, street, city, state);
            System.out.println();
        }
    }
    
    class DateOfBirth {
        int day, month, year;
        
        DateOfBirth(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        
        void displayDOB(){
            System.out.println("Date of birth: " +day+ "/" +month+ "/" +year);
        }
    }
    
    void Display(Address addr, DateOfBirth dob){
        System.out.println("Name: " +name);
        System.out.println("Phone: " +phone);
        addr.displayAddr();
        dob.displayDOB();
    }
}
