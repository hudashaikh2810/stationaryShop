/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUDA
 */
public class ThreadTest1 {
    public static void main(String[] args)
    {
        try {
            System.out.println("Inside main thread");
            MyThread m=new MyThread();
            Thread t=new Thread(m);
            t.start();
            t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadTest1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Back in main thread");
      
    }
    
}
