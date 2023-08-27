/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.io.Serializable;

/**
 *
 * @author HUDA
 */
public class Product implements Serializable{
    public String name;
    public int price;
    public Product(String a,int b)
    {
        name=a;
        price=b;
    }
    @Override
    public String toString()
    {
        return"Name="+name+"Price="+price;
    }
    
}
