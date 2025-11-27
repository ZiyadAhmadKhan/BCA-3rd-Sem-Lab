/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personquest;

/**
 *
 * @author HP
 */
public class PersonQuest {

    public static void main(String[] args) {
        Person p = new Person("ziyad", "72174 08218");
        Person.Address address = p.new Address("448", "Dodhpur", "Aligarh", "U.P");
        Person.DateOfBirth dob = p.new DateOfBirth(3, 5, 2004);
        
        p.Display(address, dob);
    }
}
