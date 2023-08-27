/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author HUDA
 */
public class HusbandWife implements Runnable {
  BankAccount ac=new BankAccount();
    public static void main(String[] args){
        HusbandWife hw=new HusbandWife();
        Thread one=new Thread(hw);
        Thread two=new Thread(hw);
        one.setName("Husband");
        two.setName("Wife");
        one.start();
        two.start();
        
    }
    @Override
    public void run()
    {
          makeWithDrawal();
       /* for(int i=1;i<=10;i++)
        {
            if(ac.getBalance()>0)
            {
                ac.withdraw(100);
            }
        
        else
        {
                System.out.println("Insufficient balace available for"+Thread.currentThread().getName());
                }
        
    }
*/

}
    public synchronized void makeWithDrawal()
    {
        if(ac.getBalance()>0)
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println("is able to perform transaction");
            System.out.println(Thread.currentThread().getName()+"is going to sleep");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex);
            }
            System.out.println(Thread.currentThread().getName()+"woke up");
            ac.withdraw(100);
            System.out.println(Thread.currentThread().getName()+"completes transaction");
        }
        else
        {
             System.out.println("Insufficient balace available for"+Thread.currentThread().getName());
 
        }
    }
}
