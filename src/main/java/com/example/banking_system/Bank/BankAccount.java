package com.example.banking_system.Bank;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BankAccount {
    @Id
    private String accNo;
    private String name;
    private double balance;

    public BankAccount(){} //Empty constructor for Spring + JPA input
    
    public BankAccount(String accNo, String name){
    this.accNo = accNo;
    this.name = name;
    this.balance = 0.0;
}
    //Getters
    public String getName(){
        return name;
    }
    public String getAccNo(){
        return accNo;
    }
    //Setters
    public void setAccNo(String accNo){
        this.accNo = accNo;
    }
    public void setName(String name){
        this.name = name;
    }

    // Logic
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount>0){
            this.balance += amount;
        }
    }
    // Unnecessary at this point
    // public void setBalance(double balance){
    //     this.balance = balance;
    // }
}


