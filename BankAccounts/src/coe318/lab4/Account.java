/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;

/**
 *
 * @author h36grewa
 */
public class Account {
    private String name;
    private double balance;
    private int number;
    
    public Account (String name, int number, double InitialBalance)
    {
        this.name = name;
        this.number = number;
        this.balance = InitialBalance;
    }
    
    // Outputs the name of the account
    public String getName()
    {
        return this.name;
    }
    
    // Outputs the balance in the account
    public double getBalance()
    {
        return this.balance;
    }
    
    // Outputs the account number
    public int getNumber()
    {
        return this.number;
    }
    
    //Allows for a deposit to be made to the account
    public boolean deposit(double amount)
    {
        if(amount <=0)
        {
            return false;
        }
        else
        {
           this.balance = this.balance + amount;
           return true;  
        }
       
    }
    
    public boolean withdraw (double amount)
    {
        
        if(this.balance < amount)
        {
            return false;
        }
        else if(amount <=0)
        {
            return false;
        }
        else
        {
            this.balance = this.balance - amount;
            return true;
        }
    }
    
    @Override
public String toString() {//DO NOT MODIFY
return "(" + getName() + ", " + getNumber() + ", " +
String.format("$%.2f", getBalance()) + ")";

       
}
   

}
