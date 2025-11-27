/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objectorientedquest;

/**
 *
 * @author HP
 */
public class ObjectOrientedQuest {

    public static void main(String[] args) {
        
        System.out.println("=== Java Language Object ===");
        JavaLanguage j = new JavaLanguage();
        j.abstraction();
        j.polymorphism();
        j.inheritance();
        j.persistence();
        j.interfaces();
        
        System.out.println();
        
        System.out.println("=== C++ Object ===");
        Cpp c = new Cpp();
        c.abstraction();
        c.polymorphism();
        c.inheritance();
        c.template();
        c.friendFunction();
        
    }
}
