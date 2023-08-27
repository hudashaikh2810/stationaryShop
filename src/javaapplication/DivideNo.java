/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author HUDA
 */
public class DivideNo {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        double a,b,c;
        a=s.nextDouble();
        b=s.nextDouble();
        try{
            int x[]={18};
            x[3]=9;
        }
        catch(ArrayIndexOutOfBoundsException aioe)
        {
            System.out.println(aioe);
        }
        try
        {
            System.out.println("Now enter");
            c=a/b;
            System.out.println("c="+c);
           
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
            
            
        }
        
         
    
       
        System.out.println("Bye userrr");
        
        
       
       
        
    }
    
}
