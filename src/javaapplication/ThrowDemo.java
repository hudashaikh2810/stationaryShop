/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author HUDA
 */
public class ThrowDemo {
    public static void show(){
        System.out.println("This method will throw a null pointer exception manually");
        try
        {
            NullPointerException npe=new NullPointerException();
            throw(npe);
        }
        catch(NullPointerException np)
        {
            System.out.println("Exception"+np+"CaughtInside show method");
           // throw(np);
        }
    
}
    
}
