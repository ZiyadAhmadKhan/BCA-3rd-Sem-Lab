/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fruit4;

/**
 *
 * @author HP
 */
public class Fruit4 {

    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        
        Fruit apple = new Fruit("Red");
        
        Fruit mango = new Fruit("Yellow", "Sweet");
        
        Fruit kiwi = new Fruit("Green", "Sour", 95);
        
        f1.display();
        apple.display();
        mango.display();
        kiwi.display();
    }
}
