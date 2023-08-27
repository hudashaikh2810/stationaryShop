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
public class SingleInheritance {
    
   public static void main(String[] args)
   {
    
    ClassB a=new ClassB();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter integer value");
    int x=s.nextInt();
    a.setA(x);
       System.out.println("Enter string value");
    String y=s.next();
    a.setB(y);
       System.out.println("Enter double value");
    double d=s.nextDouble();
    a.setD(d);
    System.out.println("Value of integer value="+a.getA());
    System.out.println("Value of string value="+a.getB());
    System.out.println("Value of double value="+a.getD());
    
    
    
    
    
}
}
