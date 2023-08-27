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
public class Output {
    public static void main(String[] args)
    {
        try
        {
            FileReader fr=new FileReader("textfile");
            BufferedReader br=new BufferedReader(fr);
            System.out.println("Contents="+br.read());
            
            
        }
         catch(FileNotFoundException fnfe)
        {
            System.out.println(fnfe);
            
        }
        catch(IOException ioe)
        {
            System.out.println(ioe);
        }
    }
    
}
