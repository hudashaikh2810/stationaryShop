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
public class Product implements Comparable<Product>{
    private String id;
    private String name;
    private int prize;
    public Product(String id,String name,int prize)
    {
        this.id=id;
        this.name=name;
        this.prize=prize;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPrize(int prize)
    {
        this.prize=prize;
    }
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getPrize()
    {
        return prize;
    }
    @Override
    public String toString()
    {
        return "\tid= "+id+"\tname= "+name+"\tprize= "+prize;
    }
    @Override
    public int compareTo(Product pu)
    {
        return this.name.compareTo(pu.name);
    }
    
}
