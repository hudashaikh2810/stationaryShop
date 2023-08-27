/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HUDA
 */
public class WriteFile {
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw=new FileWriter("textfile");
            fw.write("Good Evening");
            System.out.println("Data saved successfully");
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
