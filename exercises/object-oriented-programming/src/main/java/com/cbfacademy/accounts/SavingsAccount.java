package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        //constructor that accepts parameters representing the new account number, starting balance and interest rate
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        //applies interest to the account
        this.interestRate = balance * (interestRate / 100);
        balance += interestRate;
    }



    public double getInterestRate() {
        //returns the current interest rate
        return interestRate;

    }

    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    
}
