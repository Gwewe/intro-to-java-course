package com.cbfacademy.accounts;

public class Account {
    int accountNumber;
    double balance;

    public Account(int accountNumber, double balance){
            //constructor that accepts parameters representing the new account number and starting balance
            this.accountNumber = accountNumber;
            this.balance = balance;
    } 
    
    
    
    public double getBalance(){
        //returns the current account balance
        return this.balance;
    } 
    
    
    
    public int getAccountNumber(){
        // returns the account number
        return this.accountNumber;
    }
    
    
    
    
    public double deposit(double amount){
        //deposits funds to the account and returns the new balance
        this.balance = balance + amount;
        return balance;
    }
    
    
    
    public double withdraw(double requested){
       // withdraws funds from the account and returns the requested amount or 0 if the account has an insufficient balance
       if (requested > 0 && balance > requested) {
            balance -= requested;
            return requested;
       } else {
            return 0;
        
       }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub, have to search more information on it, to understand more!
        return super.toString();
    }
}
