/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author HUDA
 */
public class MyThread implements Runnable{
    
    @Override
    public void run()
    {
        method1();
    }
    public void method1()
    {
        for(int i=1;i<=20;i++)
        {
          try
          {
              Thread.sleep(2000);
              
          }
          catch(InterruptedException ie)
          {
              System.out.println(ie);
          }
          System.out.println("Hello user");
        }
    }
}
