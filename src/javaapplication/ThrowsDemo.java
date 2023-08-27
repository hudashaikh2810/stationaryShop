/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.io.IOException;

/**
 *
 * @author HUDA
 */
public class ThrowsDemo {
    public static void show() throws IOException
    {
        System.out.println("This method may throw io exception");
        throw(new IOException());
    }
    public static void main(String[] args)
    {
        try
        {
            show();
        }
        catch(IOException io)
        {
            System.out.println(io);
            
        }
    }
    
}
