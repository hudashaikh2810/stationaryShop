/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author HUDA
 */
public class HelloTester {
    public static void main(String[] args){
        
    HelloThread h=new HelloThread();
    Thread t=new Thread(h);
    t.start();
    
}
}
