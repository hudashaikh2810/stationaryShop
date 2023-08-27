/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdvanceJava;

/**
 *
 * @author HUDA
 */
public class Student {
    private String name;
    private String classname;
    private double mobileNumber;
    Student(String n,String cn,double m)
    {
        n=name;
        cn=classname;
        m=mobileNumber;
    }
    @Override
    public String toString(){
        return "Name="+name+"\tClass name="+classname+"\tMobile no="+mobileNumber;
    }
    
    
    
}
