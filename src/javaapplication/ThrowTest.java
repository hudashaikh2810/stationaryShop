/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author HUDA
 */
public class ThrowTest {
    public static void main(String[] args){
        try
        {
            ThrowDemo.show();
        }
        catch(NullPointerException n){
            System.out.println("Exception"+n+"Recaught inside main method");
        }
    }
}
