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
public class Multiply {
     public static void main(String[] args)
    {
       
        try
        {
            InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Enter numbers you want to multiply");    
     String x=br.readLine();    
String y=br.readLine();

int x1=Integer.parseInt(x);
int y1=Integer.parseInt(y);

while(x1!=0)
{
    System.out.println ("Enter number");
    String z=br.readLine();
   int z1=Integer.parseInt(z);
   y1=y1*z1;
   x1--;
}
   System.out.println("Product="+y1);
    
    }
        catch(IOException io)
        {
            System.out.println(io);
        }
    }
    
}
