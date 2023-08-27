/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;
import java.io.*;

/**
 *
 * @author HUDA
 */
public class Addition {
    public static void main(String[] args)
    {
        try
        {
            
         FileWriter fw=new FileWriter("textfile");
         
         
       fw.write(10);
       System.out.println("Data saved");
       fw.close();
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println(fnfe);
            
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
        
    }
    
}
