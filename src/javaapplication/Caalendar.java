/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.time.LocalDate;
import java.util.Calendar;

/**
 *
 * @author HUDA
 */
public class Caalendar {
    public static void main(String[] args)
    {
        LocalDate localdate=LocalDate.now();
        System.out.println(findPrevDay(localdate));
    
    }
    private static LocalDate findPrevDay(LocalDate localdate)
  {
    return localdate.minusDays(1);
  }
    
}
