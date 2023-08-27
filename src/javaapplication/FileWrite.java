/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HUDA
 */
public class FileWrite {
    public static void main(String[] args){
    try{
    FileOutputStream fws=new FileOutputStream("pinfo.ser");
    ObjectOutputStream oos=new ObjectOutputStream(fws);
    
    Product p1=new Product("Pen",100);
    Product p2=new Product("Pencil",10);
    oos.writeObject(p1);
     oos.writeObject(p2);
    System.out.println("Saved successfully");
    oos.close();
    fws.close();
}       catch (FileNotFoundException ex) {    
            Logger.getLogger(FileWrite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileWrite.class.getName()).log(Level.SEVERE, null, ex);
        }    
    
    
}
}
