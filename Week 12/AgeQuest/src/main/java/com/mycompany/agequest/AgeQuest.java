/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agequest;

/**
 *
 * @author HP
 */
public class AgeQuest {
    
    public static void AgeCheck(int n) throws InvalidAgeException{
        if(n<18){
            throw new InvalidAgeException("Should be above 18 years old");
        }
        else{
            System.out.println("Fine");
        }
    }

    public static void main(String[] args) {
        int age = 15;
        
        try {
            AgeCheck(age);
        }
        catch (InvalidAgeException e){
            System.out.println("Exception caught: " +e.getMessage());
        }
    }
}
