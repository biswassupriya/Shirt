package com.company.Organized;

public class Account {
    int accountNumber;
    double accountBalance;
    static double minimumBalance;

    public Account(int accountNumber , double accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public void display(){
        System.out.println("AccountNumber is : " +accountNumber + " " + "AccountBalance is : " +accountBalance);
    }
}
