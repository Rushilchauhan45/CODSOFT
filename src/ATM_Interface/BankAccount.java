package ATM_Interface;

import java.util.Scanner;

//Bank Account Class For Handle Deposit, withdraw ,check balance methods
public class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }//end of constructor

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } 
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }//end of deposit method

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else if (amount > balance)
        {
            System.out.println("Insufficient balance for withdrawal.");
        } 
        else
        {
            System.out.println("Invalid withdrawal amount.");
        }
    }//end of withdraw method

    public double checkBalance() {
        return balance;
    }
}//end of main  class
