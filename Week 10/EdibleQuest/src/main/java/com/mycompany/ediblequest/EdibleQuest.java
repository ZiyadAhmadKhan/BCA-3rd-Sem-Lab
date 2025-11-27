/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ediblequest;

/**
 *
 * @author HP
 */
public class EdibleQuest {

    public static void main(String[] args) {
        Edible.Fruit.fruitDetails();
        Edible.Vegetable.vegDetails();
        
        Edible.Fruit f = new Edible.Fruit();
        f.fruitPackaging();
        
        Edible.Vegetable v = new Edible.Vegetable();
        v.vegPackaging();
    }
}
