/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ediblequest;

/**
 *
 * @author HP
 */
public class Edible {
    
    static class Fruit {
        static void fruitDetails(){
            System.out.println("Fruit: Mango");
            System.out.println("Color: Yellow");
        }
        
        void fruitPackaging(){
            System.out.println("Packed in carboard with foam sheets");           
        }
    }
    
    static class Vegetable {
        static void vegDetails(){
            System.out.println("Vegetable: Cucumber");
            System.out.println("Color: Green");
        }
        
        void vegPackaging(){
            System.out.println("Packed in plastic bags");
        }
    }
}
