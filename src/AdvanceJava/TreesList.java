/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvanceJava;
import java.util.*;
/**
 *
 * @author HUDA
 */
public class TreesList {
    public static void main(String[] args){
      
        TreeSet<Product>t1;
        t1 = new TreeSet<>();
       t1.add(new Product("01","Phone",5000));
        t1.add(new Product("02","Laptop",100000));
        t1.add(new Product("03","Speaker",12000));
       t1.add(new Product("04","Watch",5000));
        t1.add(new Product("05","Handset",12000));
        
        System.out.println("Elements="+t1);
       
        
        
        
        
        
        
        
    }
    
}
