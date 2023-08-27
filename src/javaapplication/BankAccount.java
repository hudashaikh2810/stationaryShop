/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author HUDA
 */
public class BankAccount {
    private  int balance=10000;
    public int getBalance()
    {
        return balance;
    }
    public void withdraw(int amount)
    {
        balance=balance-amount;
    }

    
    
}
