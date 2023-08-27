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
public class HashMaps {
    public static void main(String[] args)
    {
        HashMap<String,Student>hm=new HashMap<>();
        
        Student s=new Student("Raj","cs2",700237920);
        hm.put("0808cs201091", s);
        hm.put("0808cs201092", new Student("Rohit","cs2",700023792));
        hm.put("0808cs201093", new Student("Rahul","cs1",98987632));
        
        Set<Map.Entry<String,Student>>se=hm.entrySet();

        for(Map.Entry<String,Student>i:se)
        {
            System.out.print("Enrollment no="+i.getKey()+"\t");
            System.out.println("Student details="+i.getValue()+"\t");
        }
        
        
    }
    
}
