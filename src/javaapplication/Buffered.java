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
public class Buffered {
    public static void main(String[] args)
    {
         
        try
        {InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Enter your numbers");    
     String x=br.readLine();    
    String y=br.readLine();
   int sum=Integer.parseInt(x)+Integer.parseInt(y);
   
    System.out.println("Sum="+sum);  
    }
        catch(IOException io)
        {
            System.out.println(io);
        }
    }
    
}
