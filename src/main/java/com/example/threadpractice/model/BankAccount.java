package com.example.threadpractice.model;

public class BankAccount
{
    int accountBalance;

    public BankAccount(int accountBalance){
        this.accountBalance = accountBalance;
    }
    public synchronized void withdraw(int amount){
        accountBalance -= amount;
        this.getAccountBalance();
    }
    public synchronized void deposit(int amount){
        accountBalance += amount;
        this.getAccountBalance();
    }

    public synchronized int getAccountBalance(){
        return this.accountBalance;
    }
}
