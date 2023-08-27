/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author HUDA
 */
public class HelloThread implements Runnable{
    @Override
    public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("Hello");
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
    
}
