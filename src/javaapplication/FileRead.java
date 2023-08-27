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
public class FileRead {
    public static void main(String[] args){
        try
        {
            FileInputStream fis=new FileInputStream("pinfo.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Product x=(Product)ois.readObject();
            System.out.println(x);
              Product y=(Product)ois.readObject();
            System.out.println(y);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileRead.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(FileRead.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
