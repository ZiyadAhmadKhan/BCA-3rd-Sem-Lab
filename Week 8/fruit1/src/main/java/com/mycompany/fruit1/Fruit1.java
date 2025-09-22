/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fruit1;

/**
 *
 * @author HP
 */
public class Fruit1 {

    public static void main(String[] args) {
        Fruit apple = new Fruit();
            apple.color = "Red";
            apple.taste = "Sweet";
            apple.price = 110;
            apple.display();
            
        Fruit mango = new Fruit();
            mango.color = "Yellow";
            mango.taste = "Sweet";
            mango.price = 90;
            mango.display();
            
        Fruit kiwi = new Fruit();
            kiwi.color = "Green";
            kiwi.taste = "Sour";
            kiwi.price = 70;
            kiwi.display();
    }
}
