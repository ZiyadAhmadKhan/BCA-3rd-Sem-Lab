/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.createfile;

/**
 *
 * @author HP
 */
import java.io.File;
import java.io.IOException;

public class Createfile {
    public static void main(String[] args) throws Exception {
        
            File file = new File("ee.txt");
            file.createNewFile(); 
    }
}
