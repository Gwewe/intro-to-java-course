package com.cbfacademy.accounts;

public class Bank extends Account {

    public Bank(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /*Consider the following ideas — you may choose to implement some, all or come up with your own:

storing a internal list of accounts. Remember that accounts in the list could be instances of the Account class, the SavingsAccount class, or the CurrentAccount class.
opening a new account, given a type and balance.
getting a list of account numbers held by the bank
getting an account, given an account number
closing an account, given an account number
displaying a report of all accounts held by the bank
paying a dividend to all accounts held by the bank
applying interest to all savings accounts
contacting all current account holders if their account is in overdraft.
Update App.java to create a bank instance and then execute your bank's operations */

}
