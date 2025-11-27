/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uniquest;

/**
 *
 * @author HP
 */
public class University {
    
    String uniName;
    int rank;
    
    University(String uniName, int rank){
        this.uniName = uniName;
        this.rank = rank;
    }
    
    void showRanking(){
        System.out.println("Rank: " +rank);
    } 
}
